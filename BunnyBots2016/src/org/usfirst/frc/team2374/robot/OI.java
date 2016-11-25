package org.usfirst.frc.team2374.robot;

import org.usfirst.frc.team2374.robot.commands.FireGunHold;
import org.usfirst.frc.team2374.robot.commands.FireGunOnce;
import org.usfirst.frc.team2374.robot.commands.ZeroDriveGyro;
import org.usfirst.frc.team2374.robot.commands.ZeroTurretGyro;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public Joystick driverJoy;
	public Joystick turretJoy;
	public JoystickButton driverButtonX;
	public JoystickButton turretButtonA;
	public JoystickButton turretButtonX;
	public JoystickButton turretButtonB;
	
	public OI() {
		driverJoy = new Joystick(RobotMap.driverJoy);
		turretJoy = new Joystick(RobotMap.turretJoy);
		
		driverButtonX = new JoystickButton(driverJoy, RobotMap.rsButtonX);
		
		turretButtonA = new JoystickButton(turretJoy, RobotMap.rsButtonA);
		turretButtonX = new JoystickButton(turretJoy, RobotMap.rsButtonX);
		turretButtonB = new JoystickButton(turretJoy, RobotMap.rsButtonB);
		
		driverButtonX.whenPressed(new ZeroDriveGyro());
		
		turretButtonA.whenPressed(new FireGunOnce());
		turretButtonX.whenPressed(new ZeroTurretGyro());
		turretButtonB.whenPressed(new FireGunHold());
	}
	
	public Joystick getDriverJoy() {
		return driverJoy;
	}
	
	public Joystick getTurretJoy() {
		return turretJoy;
	}
}

