/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  PWMVictorSPX leftVictor = null;
  PWMVictorSPX rightVictor = null;

  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    //Victor Motor Controllers
    leftVictor = new PWMVictorSPX(RobotMap.DRIVETRAIN_LEFT_VICTOR);
    rightVictor = new PWMVictorSPX(RobotMap.DRIVETRAIN_RIGHT_VICTOR);
  
    SpeedControllerGroup leftMotor = new SpeedControllerGroup(leftVictor);
    SpeedControllerGroup rightMotor = new SpeedControllerGroup(rightVictor);
    
    differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveArcade());
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed){
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }
}
