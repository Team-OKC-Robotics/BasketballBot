// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {

  public static CommandBase driveForwardAuto() {
    // TODO: Add parameters to this function for the subsystems we need

    // TODO: Add commands to the sequence for a basic autonomous routine that just drives forward a set time
    return Commands.sequence();
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
