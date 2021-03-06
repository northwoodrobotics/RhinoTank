/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static final int drivetrainLF = 0;
  public static final int drivetrainRF = 2;
  public static final int drivetrainLB = 1;
  public static final int drivetrainRB = 3;
  public static final int LifterMotor = 4;
  public static final int IntakeMotor = 5;

  public static final boolean lfinverted = false;
  public static final boolean rfinverted = true;
  public static final boolean lbinverted = false;
  public static final boolean rbinverted = true;
  public static final boolean LIFTER_INVERTED = true;
  public static final boolean INTAKE_INVERTED = true;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}