package org.usfirst.frc.team3473.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class RobotMap {
	public static TalonSRX leftFront = new TalonSRX(0);
	public static TalonSRX leftBack = new TalonSRX(4);
	public static TalonSRX rightFront = new TalonSRX(5);
	public static TalonSRX rightBack = new TalonSRX(6);
	
	public static TalonSRX leftIntake = new TalonSRX(3);
	public static TalonSRX rightIntake = new TalonSRX(1);
	
	public static DoubleSolenoid pneumatic = new DoubleSolenoid(0, 1);
}
