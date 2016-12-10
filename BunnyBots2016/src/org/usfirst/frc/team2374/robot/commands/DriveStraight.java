package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command {
	
	double meters;
	double speed;
	
	public DriveStraight(double meters, double speed) {
		requires(Robot.drivetrain);
		this.meters = meters;
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		Robot.drivetrain.resetDisplacement();
	}

	@Override
	protected void execute() {
		Robot.drivetrain.mecanumDrive(speed, 0, 0);
	}

	@Override
	protected boolean isFinished() {
		return Robot.drivetrain.getDisplacementY() >= meters;
	}

	@Override
	protected void end() {
		Robot.drivetrain.mecanumDrive(0, 0, 0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
