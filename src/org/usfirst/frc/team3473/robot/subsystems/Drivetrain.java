package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public static void setLeft(double speed){
		RobotMap.leftFront.set(ControlMode.PercentOutput, -speed);
		RobotMap.leftBack.set(ControlMode.PercentOutput, -speed);
	}

	public static void setRight(double speed){
		RobotMap.rightFront.set(ControlMode.PercentOutput, speed);
		RobotMap.rightBack.set(ControlMode.PercentOutput, speed);
	}
	
	public static void drive(double speed, double turn){
		final double ERROR = 0.1;
		double TURN_SHARPNESS = 0.5;
		
		if(Math.abs(turn) < ERROR && Math.abs(speed) < ERROR){
			setLeft(0);
			setRight(0);
		}
		else if(Math.abs(turn) < ERROR){
			setLeft(speed);
			setRight(speed);
		}
		else if(Math.abs(speed) < ERROR){
			setLeft(-turn);
			setRight(turn);
		}
		else{
			setLeft(speed - turn * TURN_SHARPNESS);
			setRight(speed + turn * TURN_SHARPNESS);
		}
	}
}
