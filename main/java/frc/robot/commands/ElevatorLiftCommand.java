/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/



package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorLiftCommand extends Command {
  public ElevatorLiftCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    //requires(Robot.m_elevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double speedLift = Robot.m_oi.driverController.getRawAxis(3);
    
    while(Robot.m_oi.getdriverControllerJoystick().getRawButton(3) == true){
      double d = Robot.m_oi.driverController.getRawAxis(3);
      speedLift = -(d+1)/2; // get axis, add 1 (to bring it 0->2, instead of -1->1), then scale to reduce
                           // speed
      
      Robot.m_elevator.liftElevator(speedLift);
    }
    Robot.m_elevator.stopElevator();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_elevator.stopElevator();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
