package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="GK-TeleOp", group="GK")
public class GKTeleOp extends GKCore {

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {

    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {

        if(gamepad1.left_stick_y >= .15 || gamepad1.left_stick_y <= -.15) {
            rFront.setPower(gamepad1.right_stick_y);
            rBack.setPower(gamepad1.right_stick_y);
        }
        if(gamepad1.left_stick_y >= .15 || gamepad1.left_stick_y <= -.15) {
            lFront.setPower(gamepad1.left_stick_y);
            lBack.setPower(gamepad1.left_stick_y);
        }

        flip.setPower(gamepad2.right_stick_y);

        if(gamepad2.right_trigger >= .15) {
            intakeR.setPower(gamepad2.right_trigger);
            intakeL.setPower(gamepad2.right_trigger);
        }
        else {
            intakeL.setPower(-gamepad2.left_trigger);
            intakeR.setPower(-gamepad2.left_trigger);
        }

    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {

    }

}
