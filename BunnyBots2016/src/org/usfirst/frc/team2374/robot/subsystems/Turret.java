package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class Turret extends Subsystem {
	
	SpeedController motor;
	Gyro gyro;
	
	public Turret() {
		motor = new TalonSRX(RobotMap.turretTalon);
		gyro = new AnalogGyro(RobotMap.turretGyro);
	}

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void setMotor(double speed) {
		motor.set(speed);
	}
	
	public double getAngel() {
		return gyro.getAngle();
	}
	
	public void zeroGyro() {
		gyro.reset();
	}
}
