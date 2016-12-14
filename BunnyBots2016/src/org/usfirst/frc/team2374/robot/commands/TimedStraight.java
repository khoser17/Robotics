package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TimedStraight extends Command {

	double time, speed;

	public TimedStraight(double time, double speed) {
		requires(Robot.drivetrain);
		this.time = time;
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		setTimeout(time);
	}

	@Override
	protected void execute() {
		Robot.drivetrain.mecanumDrive(0, speed, 0);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
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
