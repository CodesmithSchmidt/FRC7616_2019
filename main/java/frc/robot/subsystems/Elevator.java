/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Elevator extends Subsystem {
  
  PWMVictorSPX liftVictor = null;
  PWMVictorSPX forksVictor = null;

  public Elevator(){
    liftVictor = new PWMVictorSPX(RobotMap.ELEVATOR_LIFT_VICTOR);
    forksVictor = new PWMVictorSPX(RobotMap.FORKS_FORK_VICTOR);
  }

  public void liftElevator(double speed){
    liftVictor.set(speed);
  }

  public void stopElevator(){
    /*
    double d = Robot.m_oi.driverController.getRawAxis(3);
    double holdLift = -(d+1)/2;
    */
    liftVictor.set(0);
  }

  public void dropForks(){
    forksVictor.set(-.5);
  }

  @Override
  public void initDefaultCommand() {
  
  }
}
