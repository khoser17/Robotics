package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gun extends Subsystem {

	Relay roller;
	Relay pusher;
	
	public Gun() {
		roller = new Relay(RobotMap.rollerRelay);
		pusher = new Relay(RobotMap.pusherRelay);
	}
	
	@Override
	protected void initDefaultCommand() {

	}
	
	public void setRoller(Value value) {
		roller.set(value);
	}
		
	
	public void setPusher(Value value) {
		pusher.set(value);
	}
	
	public Value getRollerValue() {
		return roller.get();
	}
	
	public Value getPusherValue() {
		return pusher.get();
	}

}