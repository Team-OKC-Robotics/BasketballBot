package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LauncherSubsystem;

public class LaunchCommand extends CommandBase {

    // TODO: Add member variables
    // We'll need the launcher subystem

    public LaunchCommand(LauncherSubsystem launcherSubsystem) {
        // TODO: Set member variables

        // TODO: Use addRequirements() to add required subsystem
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // TODO: Command the launcher subsystem based on the gamepad values
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; // When will this command be finished? Should it just always run until interrupted?
  }
}
