package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FireGunOnce extends Command {

	public FireGunOnce() {
		requires(Robot.gun);
	}
	
	@Override
	protected void initialize() {
		Robot.gun.setFiring(true);
		setTimeout(0.25);
	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
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
