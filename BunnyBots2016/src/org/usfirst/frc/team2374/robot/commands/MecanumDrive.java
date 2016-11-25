package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MecanumDrive extends Command {
	
	public MecanumDrive() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.drivetrain.mecanumDrive(Robot.oi.driverJoy);

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.drivetrain.meanumDrive(0, 0, 0);

	}

	@Override
	protected void interrupted() {
		end();

	}

}
