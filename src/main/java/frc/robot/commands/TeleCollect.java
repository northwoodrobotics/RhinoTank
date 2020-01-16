package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Intake;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 */
public class TeleCollect extends Command {

    private Intake intake;

	public TeleCollect(Intake intake) {
    	this.intake = intake;
    	requires(intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	intake.setSpeed(-OI.getAbutton() + OI.getBbutton());
//    	System.out.println("Running TeleLift.execute()");
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