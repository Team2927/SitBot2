package org.usfirst.frc2927.SitBot.commands;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class skillCheck extends Command {
	private static int skill;
    public skillCheck() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }
    
    public int getSkill(){
    	return skill;
    }
    
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	if(skill < 3){
    		skill++;
    	}else{
    		skill=1;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
