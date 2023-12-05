package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TeleopDriveCommand extends CommandBase {

    // TODO: Add member variables
    // We'll need a gamepad and the drivetrain subsystem

    public TeleopDriveCommand() {
        // TODO: Add parameters to constructor

        // TODO: Use addRequirements() to add required subsystem
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // TODO: Command the drivetrain subsystem based on the gamepad values
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; // We always want to run this command unless interrupted
  }
}
