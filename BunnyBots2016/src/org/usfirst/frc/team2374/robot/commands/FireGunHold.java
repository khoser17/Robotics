package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FireGunHold extends Command {
	
	public FireGunHold() {
		requires(Robot.gun);
	}

	@Override
	protected void initialize() {
		Robot.gun.setFiring(true);
	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return !Robot.oi.turretButtonB.get();

	}

	@Override
	protected void end() {
		Robot.gun.setFiring(false);

	}

	@Override
	protected void interrupted() {
		end();

	}

}
