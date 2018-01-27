package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final Joystick
		JOYSTICK_left = new Joystick(0),
		JOYSTICK_right = new Joystick(1),
		JOYSTICK_gamepad = new Joystick(2);
	
	public static final JoystickButton
		BUTTON_intake = new JoystickButton(JOYSTICK_gamepad, 6),
		BUTTON_outtake = new JoystickButton(JOYSTICK_gamepad, 8),
		BUTTON_actuateIntake = new JoystickButton(JOYSTICK_gamepad, 1);
}
