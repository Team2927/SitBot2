package org.usfirst.frc2927.SitBot;

import org.usfirst.frc2927.SitBot.commands.*;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
//import org.usfirst.frc2927.SitBot.subsystems.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj.command.Command;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */


public class OI {
	public static int skill = 3;   
	
    public Joystick primaryJoystick;
    public JoystickButton primaryButton4;
    public JoystickButton primaryButton6;
    
    public static skillCheck skillChecker = new skillCheck();
    
    public OI() {
    	//creating joystick1
    	primaryJoystick =  new Joystick(0);
    	
    	primaryButton4  =  new JoystickButton(primaryJoystick, 4);
    	primaryButton6  =  new JoystickButton(primaryJoystick, 6);
    	
    	//once when pressed down will not run again until released and repressed
    	
    	//primaryButton4.whenPressed();
    	//primaryButton6.whenPressed());

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());        
        System.out.println(skill);
        //DriveTrain.skillz = skill;
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
        
    }

    public Joystick getPrimaryJoystick() {
        return primaryJoystick;
    }
    
}

