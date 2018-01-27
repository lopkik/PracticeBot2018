package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class Intakevb extends Command{

	protected void execute(){
		boolean intake = OI.BUTTON_intake.get();
		boolean outtake = OI.BUTTON_outtake.get();
		
		if((intake && outtake) || !intake || !outtake){
			Intake.intake(0);
		}
		if(intake){
			Intake.intake(1);
		}
		if(outtake){
			Intake.intake(-1);
		}
		
			
	}
	protected boolean isFinished() {
		return false;
	}

}
