package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ZeroTurretGyro extends Command {
	
	public ZeroTurretGyro() {
		requires(Robot.turret);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.turret.zeroGyro();

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
