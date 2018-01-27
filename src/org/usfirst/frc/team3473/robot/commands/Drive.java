package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	
	protected void initialize(){
		
	}

	protected void execute(){
		double speed = OI.JOYSTICK_left.getY();
		double turn = OI.JOYSTICK_right.getX();
		
		Drivetrain.drive(speed, turn);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	
}
