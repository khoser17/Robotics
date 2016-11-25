package org.usfirst.frc.team2374.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Gun extends Subsystem {

	SpeedController gunPWM;
	
	public Gun() {
		gunPWM = new Jaguar(0); //TEMP
	}
	
	@Override
	protected void initDefaultCommand() {

	}
	
	public void setFiring(boolean firing) {
		if (firing)
			gunPWM.set(0.5);
		else
			gunPWM.set(0);
	}

}
