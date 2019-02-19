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

  //DriveTrain
	public static final int DRIVETRAIN_LEFT_VICTOR = 1;
  public static final int DRIVETRAIN_RIGHT_VICTOR = 0;
  
  // Joystick
  public static final int OI_DRIVER_CONTROLER = 1; //Joystick USB port
  public static final int DRIVERCONTROLLER_MOVE_AXIS = 1; // Joystick Y axis
  public static final int DRIVERCONTROLLER_ROTATE_AXIS = 0; // Joystick X axis

  //Elevator
  public static final int ELEVATOR_LIFT_VICTOR = 2;
  
  //Pneumatic Launcher 
  public static final int SHOOTER_PITCHSOLENOID_DEPLOY = 0;
  public static final int SHOOTER_PITCHSOLENOID_RETRACT = 1;

  //Forks
  public static final int FORKS_FORK_VICTOR = 3;
 

}
