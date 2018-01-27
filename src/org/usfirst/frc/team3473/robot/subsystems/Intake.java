package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem{

	public void initDefaultCommand(){
		
	}
	
	public static void intake(double speed){
		RobotMap.leftIntake.set(ControlMode.PercentOutput, speed);
		RobotMap.rightIntake.set(ControlMode.PercentOutput, -speed);
	}
}
