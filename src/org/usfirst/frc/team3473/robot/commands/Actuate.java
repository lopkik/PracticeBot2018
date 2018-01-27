package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class Actuate extends Command{

	protected void execute(){
		boolean buttonPress = OI.BUTTON_actuateIntake.get();
		
		if(!buttonPress){
			RobotMap.pneumatic.set(DoubleSolenoid.Value.kReverse);
		}
		if(buttonPress){
			RobotMap.pneumatic.set(DoubleSolenoid.Value.kForward);
		}
	}
	protected boolean isFinished() {
		return false;
	}

}
