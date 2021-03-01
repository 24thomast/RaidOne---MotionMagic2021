package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

public class Drive{
    private static TalonSRX talon0;
    private static TalonSRX talon1;
    private static TalonSRX talon2;
    private static TalonSRX talon3;
    private static TalonSRX talon4;
    private static TalonSRX talon5;

    public Drive(int tal0, int tal1, int tal2, int tal3, int tal4, int tal5){
        talon0 = new TalonSRX(tal0);
        talon1 = new TalonSRX(tal1);
        talon2 = new TalonSRX(tal2);
        talon3 = new TalonSRX(tal3);
        talon4 = new TalonSRX(tal4);
        talon5 = new TalonSRX(tal5);

        talon0.configFactoryDefault();
        talon1.configFactoryDefault();
        talon2.configFactoryDefault();
        talon3.configFactoryDefault();
        talon4.configFactoryDefault();
        talon5.configFactoryDefault();

        talon0.setNeutralMode(NeutralMode.Brake);
        talon1.setNeutralMode(NeutralMode.Brake);
        talon2.setNeutralMode(NeutralMode.Brake);
        talon3.setNeutralMode(NeutralMode.Brake);
        talon4.setNeutralMode(NeutralMode.Brake);
        talon5.setNeutralMode(NeutralMode.Brake);

        talon2.follow(talon0);
        talon4.follow(talon0);
        talon3.follow(talon1);
        talon5.follow(talon1);

        talon1.setInverted(true);
        talon3.setInverted(true);
        talon5.setInverted(true);
    }
}

