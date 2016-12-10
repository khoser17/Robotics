package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.MecanumDrive;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

public class Drivetrain extends Subsystem {

	SpeedController fLeft, fRight, bLeft, bRight;
	RobotDrive robotDrive;
	AHRS ahrs;
	boolean isCoupled;

	public Drivetrain() {
		fLeft = new TalonSRX(RobotMap.fLeftDriveTalon);
		fRight = new TalonSRX(RobotMap.fRightDriveTalon);
		bLeft = new TalonSRX(RobotMap.bLeftDriveTalon);
		bRight = new TalonSRX(RobotMap.bRightDriveTalon);
		robotDrive = new RobotDrive(fLeft, bLeft, fRight, bRight);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		LiveWindow.addActuator("Drive Motor", "fLeft",
				(LiveWindowSendable) fLeft);
		LiveWindow.addActuator("Drive Motor", "bLeft",
				(LiveWindowSendable) bLeft);
		LiveWindow.addActuator("Drive Motor", "fRight",
				(LiveWindowSendable) fRight);
		LiveWindow.addActuator("Drive Motor", "bRight",
				(LiveWindowSendable) bRight);
		ahrs = new AHRS(SPI.Port.kMXP);
		isCoupled = false;
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MecanumDrive());
	}

	public void mecanumDrive(Joystick joy) {
		double angle;
		if (isCoupled)
			angle = 0;
		else
			angle = ahrs.getAngle();
		robotDrive.mecanumDrive_Cartesian(joy.getRawAxis(RobotMap.rsLeftAxisY),
				joy.getRawAxis(RobotMap.rsRightAxisX),
				-joy.getRawAxis(RobotMap.rsLeftAxisX),
				angle);
	}

	public void mecanumDrive(double x, double y, double rotation) {
		robotDrive.mecanumDrive_Cartesian(x, y, rotation, 0);
	}

	public double[] getMotorValues() {
		double[] values = new double[4];
		values[0] = fLeft.get();
		values[1] = fRight.get();
		values[2] = bLeft.get();
		values[3] = bRight.get();
		return values;
	}
	
	public void zeroGyro() {
		ahrs.reset();
	}
	
	public void resetDisplacement() {
		ahrs.resetDisplacement();
	}
	
	public float getDisplacementX() {
		return ahrs.getDisplacementX();
	}
	
	public float getDisplacementY() {
		return ahrs.getDisplacementY();
	}
	
	public void toggleCouple() {
		isCoupled = !isCoupled;
	}

}
