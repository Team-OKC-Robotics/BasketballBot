// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // TODO: Initalize all the robot subsystems

  // TODO: Initalize all the gamepads

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings.
   */
  private void configureBindings() {
    // TODO: Bind the joysticks buttons to commands
    // Hint: For now, we only need to bind one button for activating the launcher
  }

  /**
   * Use this to pass the Teleop command to the main {@link Robot} class.
   */
  public Command getTeleopCommand() {
    // TODO: Create and return a new TeleopDriveCommand
    return null;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   */
  public Command getAutonomousCommand() {
    // TODO: Call one of the Autos methods to choose which autonomous routine to use
    return null;
  }
}
