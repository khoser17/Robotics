package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.GunControl;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
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
		setDefaultCommand(new GunControl());
	}
	
	public void setRoller(boolean setForward) {
		if (setForward)
			roller.set(Value.kForward);
		else
			roller.set(Value.kOff);
	}
		
	
	public void setPusher(boolean setForward) {
		if (setForward)
			pusher.set(Value.kForward);
		else
			pusher.set(Value.kOff);
	}

}