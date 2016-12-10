package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ZeroDriveGyro extends Command {
	
	public ZeroDriveGyro() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {
		Robot.drivetrain.zeroGyro();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}

}
