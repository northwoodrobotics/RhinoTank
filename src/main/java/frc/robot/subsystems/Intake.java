//package org.usfirst.frc.team6300.robot.subsystems;
package frc.robot.subsystems;
import frc.robot.RobotMap;
import frc.robot.commands.TeleCollect;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	private WPI_VictorSPX m1;

	public Intake() {
        m1 = new WPI_VictorSPX(RobotMap.IntakeMotor);
		
		m1.setInverted(RobotMap.INTAKE_INVERTED);

		m1.configOpenloopRamp(0.5);

	}

	public void setSpeed(double speed) {
		m1.set(ControlMode.PercentOutput, speed);
	}

	
	public void initDefaultCommand() {
		setDefaultCommand(new TeleCollect(this));
	}
}