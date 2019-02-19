/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DropForks;
import frc.robot.commands.ElevatorLiftCommand;
import frc.robot.commands.Reload;
import frc.robot.commands.Shoot;


public class OI {
  public Joystick driverController = new Joystick(RobotMap.OI_DRIVER_CONTROLER);
  JoystickButton elevator = new JoystickButton(driverController, 3);
  JoystickButton launcherForward = new JoystickButton(driverController, 1);
  JoystickButton launcherBack = new JoystickButton(driverController, 2);
    JoystickButton forksDown = new JoystickButton(driverController, 4);
  
  public OI() {
    elevator.whileHeld(new ElevatorLiftCommand());
    launcherForward.whenPressed(new Shoot());
    launcherBack.whenPressed(new Reload());
    forksDown.whenPressed(new DropForks());
  }
  
  public Joystick getdriverControllerJoystick(){
    return driverController;
  }
}
