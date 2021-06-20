

package org.usfirst.frc2927.SitBot.subsystems;

//import org.usfirst.frc2927.SitBot.OI;
import org.usfirst.frc2927.SitBot.RobotMap;
import org.usfirst.frc2927.SitBot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 *
 */
public class DriveTrain extends Subsystem {
	
	//1=NOOB 2=Normal 3=WTF defaults to normal if not 1-3

    //private final SpeedController leftFornt = RobotMap.driveTrainLeftFornt;
    //private final SpeedController rightFront = RobotMap.driveTrainRightFront;
	private final DifferentialDrive robotDrive = RobotMap.driveTrainRobotDrive;



    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {


        setDefaultCommand(new DriveWithJoystick());



        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    
    public void arcadeDrive(Joystick joystick){
    	//int skill = OI.skillChecker.getSkill();
    	/*
    	if(skill==1){
    		robotDrive.arcadeDrive(-joystick.getY()/3,-joystick.getX()/3);
    	}else if(skill == 2){
    		robotDrive.arcadeDrive(-joystick.getY()/2,-joystick.getX()/2.75);
    	}else if(skill == 3){
    		robotDrive.arcadeDrive(-joystick.getY()*2,-joystick.getX()*2);
    	}else{
    		*/
    		robotDrive.arcadeDrive(-joystick.getY()/2,-joystick.getX()/2.75);
    		//robotDrive.arcadeDrive(-joystick.getY()/3,-joystick.getX()/3);
    	//}
    }
}

