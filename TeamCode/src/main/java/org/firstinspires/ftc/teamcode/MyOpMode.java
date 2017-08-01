package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.configuration.MotorConfigurationType;

/**
 * Created by dflor on 7/31/2017.
 */

public class MyOpMode extends OpMode {
    DcMotor myMotor;

    @Override
    public void init() {
        myMotor = hardwareMap.dcMotor.get("motor");


    }

    @Override
    public void loop() {

        myMotor.setPower(1.2);

    }
}
