/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Subsystems.DriveTrain;
import org.firstinspires.ftc.teamcode.Subsystems.SampleSubsystem;
import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;
import org.firstinspires.ftc.teamcode.ToolClasses.Controls;

import java.util.Map;

import static org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap.leftBack;
import static org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap.leftFront;
import static org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap.rightBack;
import static org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap.rightFront;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Tele-Op", group = "Iterative Opmode")
// @Disable

public class TeleOp extends OpMode {


    /* Declare OpMode members. */
    Robot robot = new Robot(hardwareMap);
    private Controls controls;
    private SampleSubsystem sampleSubsystem;
    private DriveTrain drive;
    private DcMotor leftFront = null;
    private DcMotor leftBack = null;
    private DcMotor rightFront = null;
    private DcMotor rightBack = null;

    public TeleOp () {}






    public void init() {
        controls = new Controls();
        sampleSubsystem = new SampleSubsystem(hardwareMap);
        drive = new DriveTrain(hardwareMap);
        telemetry.addData("Say", "Initializing");

        //Put init functions here
      //  sampleSubsystem.init();

        telemetry.addData("Say", "Initializing Complete");
        leftFront = hardwareMap.dcMotor.get("lfm");
        leftBack = hardwareMap.dcMotor.get("lbm");
        rightFront = hardwareMap.dcMotor.get("rfm");
        rightBack = hardwareMap.dcMotor.get("rbm");
;
    }


    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */

    public void start() {
        //This really doesn't serve any purpose
        telemetry.addData("Say", "Start!");
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */

    public void loop() {
        //double left = gamepad1.left_stick_y;
        //double right = gamepad1.right_stick_y;

        //leftFront.setPower(-left);
        //leftBack.setPower(-left);
        //rightFront.setPower(right);
        //rightBack.setPower(right);

        //drive.mechDrive(controls.leftY(), controls.leftX(), controls.rightX());
        drive.mechDrive(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_y);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */

    public void stop() {
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);

        telemetry.addData("Say", "Robot Stopped");

    }

}
