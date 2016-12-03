package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.TurretControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Turret extends Subsystem {
	
	SpeedController motor;
	
	public Turret() {
		motor = new TalonSRX(RobotMap.turretTalon);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TurretControl());
	}
	
	public void setMotor(Joystick joy) {
		motor.set(joy.getRawAxis(RobotMap.logiLeftAxisX));
	}
	
	public void setMotor(double speed) {
		motor.set(speed);
	}
	
}
