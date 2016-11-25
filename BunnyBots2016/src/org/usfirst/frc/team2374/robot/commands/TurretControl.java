package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurretControl extends Command {
	
	public TurretControl() {
		requires(Robot.turret);
	}

	@Override
	protected void initialize() {

	}

	@Override
	protected void execute() {
		Robot.turret.setMotor(Robot.oi.turretJoy);

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.turret.setMotor(0);

	}

	@Override
	protected void interrupted() {
		end();

	}

}
