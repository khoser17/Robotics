package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GunControl extends Command {

	public GunControl() {
		requires(Robot.gun);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.gun.setRoller(Robot.oi.turretButton2.get());
		Robot.gun.setPusher(Robot.oi.turretButton2.get()
				&& Robot.oi.turretButton6.get());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.gun.setRoller(false);
		Robot.gun.setPusher(false);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
