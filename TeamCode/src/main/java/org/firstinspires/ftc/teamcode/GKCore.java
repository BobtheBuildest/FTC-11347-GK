package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="GK-Core", group="GK")
@Disabled
public class GKCore extends OpMode {

    public ElapsedTime runtime = new ElapsedTime();
    public DcMotor lFront;
    public DcMotor rFront;
    public DcMotor lBack;
    public DcMotor rBack;
    public DcMotor flip;
    public DcMotor intakeR;
    public DcMotor intakeL;
    public final double inchesToTicks = 288 / (Math.PI * 45 * 25.4);

    @Override
    public void init() {
        lFront = hardwareMap.get(DcMotor.class, "lFront");
        rFront = hardwareMap.get(DcMotor.class, "rFront");
        lBack = hardwareMap.get(DcMotor.class, "lBack");
        rBack = hardwareMap.get(DcMotor.class, "rBack");
        flip = hardwareMap.get(DcMotor.class, "flip");
        intakeL = hardwareMap.get(DcMotor.class, "intakeL");
        intakeR = hardwareMap.get(DcMotor.class, "intakeR");
    }

    @Override
    public void start() {
        runtime.reset();
        super.start();
    }

    @Override
    public void loop() {

    }

    @Override
    public void stop() {
        super.stop();
    }


    public void autoDrive (int dist, double power) {
        lBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        lBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        
        lBack.setTargetPosition(0);
    }

}