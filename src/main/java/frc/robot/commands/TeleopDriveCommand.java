package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.DrivetrainSubsystem;

public class TeleopDriveCommand extends CommandBase {

    // TODO: Add member variables
    // We'll need a gamepad and the drivetrain subsystem

    public TeleopDriveCommand(DrivetrainSubsystem drivetrainSubsystem, CommandJoystick commandJoystick) {
        // TODO: Set member variables

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
