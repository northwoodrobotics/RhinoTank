  
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TeleDrive;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  public WPI_VictorSPX leftFront = new WPI_VictorSPX(RobotMap.drivetrainLF);
  public WPI_VictorSPX rightFront = new WPI_VictorSPX(RobotMap.drivetrainRF);
  public WPI_VictorSPX leftBack = new WPI_VictorSPX(RobotMap.drivetrainLB);
  public WPI_VictorSPX rightBack = new WPI_VictorSPX(RobotMap.drivetrainRB);

  public void tankDrive(double leftSpeed, double rightSpeed) {
    leftFront.set(leftSpeed);
    rightFront.set(rightSpeed);
    leftBack.set(leftSpeed);
    rightBack.set(rightSpeed);
  }

  public void arcadeDrive(double forward, double rotate) {
    leftFront.set(forward + rotate);
    rightFront.set(forward - rotate);
    leftBack.set(forward + rotate);
    rightBack.set(forward - rotate);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TeleDrive(this));
  }
} 