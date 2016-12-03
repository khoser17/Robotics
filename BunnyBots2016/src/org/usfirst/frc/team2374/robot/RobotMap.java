package org.usfirst.frc.team2374.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//Driver Station USB
	public static int driverJoy = 0;
	public static int turretJoy = 1;
	
	//Razer Sabertooth
	public static int rsLeftAxisX = 0;
	public static int rsLeftAxisY = 1;
	public static int rsRightAxisX = 4;
	public static int rsButtonA = 1;
	public static int rsButtonB = 2;
	public static int rsButtonX = 3;
	
	//Logitech Controller
	public static int logiLeftAxisX = 0;
	public static int logiButton2 = 2;
	public static int logiButton6 = 6;
	
	//PWN
	public static int fLeftDriveTalon = 0;
	public static int fRightDriveTalon = 1;
	public static int bLeftDriveTalon = 2;
	public static int bRightDriveTalon = 3;
	public static int turretTalon = 4;
	
	//Analog In
	public static int turretGyro = 1;
	
	//Relay
	public static int rollerRelay = 0;
	public static int pusherRelay = 1;
}
