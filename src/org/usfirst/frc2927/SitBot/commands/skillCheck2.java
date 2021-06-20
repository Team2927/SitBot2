package org.usfirst.frc2927.SitBot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class skillCheck2 extends Command {
	private int active = 0;
    public skillCheck2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public int getActive(){
    	return active;
    }
    
    public int getSkill(){
    	return 2;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
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
    	active = 0;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	active = 0;
    }
}
