package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;

public class TimedDriveCommand extends CommandBase {

    // TODO: Add member variables
    // We'll need the drivetrain subsystem at least

    public TimedDriveCommand(DrivetrainSubsystem drivetrainSubsystem, float duration_seconds, float forward_speed) {
        // TODO: Set member variables

        // TODO: Use addRequirements() to add required subsystem
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // TODO: Command the drivetrain subsystem
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // TODO: Make this function return true after a specified time
    return false;
  }
}
