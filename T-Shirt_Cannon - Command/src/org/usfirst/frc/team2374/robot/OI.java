
package org.usfirst.frc.team2374.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2374.robot.commands.FireTurret;
import org.usfirst.frc.team2374.robot.commands.PressureControl;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
    
    public Joystick joystick;
    
    public OI() {
        joystick = new Joystick(1);
        
        new DoubleButton(joystick, 5, 6).whenActive(new FireTurret());
        
        SmartDashboard.putData("FireTurret", new FireTurret());
        SmartDashboard.putData("PressureControl", new PressureControl());
    }
    
    public Joystick getJoystick() {
        return joystick;
    }

    private class DoubleButton extends Trigger {
        private Joystick joy;
        private int button1, button2;

        public DoubleButton(Joystick joy, int button1, int button2) {
            this.joy = joy;
            this.button1 = button1;
            this.button2 = button2;
        }

        public boolean get() {
            return joy.getRawButton(button1) && joy.getRawButton(button2);
        }
    }
}

