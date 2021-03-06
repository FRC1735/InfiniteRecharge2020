/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Tube;

public class TubeUp extends CommandBase {
  Tube tube;
  /**
   * Creates a new TubeUp.
   */
  public TubeUp(Tube tube) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(tube);
    this.tube = tube;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    tube.upManual();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    tube.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
