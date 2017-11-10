package org.firstinspires.ftc.teamcode.Subsystems;


// import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;
import org.firstinspires.ftc.teamcode.ToolClasses.Controls;
// import org.firstinspires.ftc.teamcode.ToolClasses.Controls;


public class DriveTrain extends Subsystem {


    //Define Actuators as null

    DcMotor leftFront;
    DcMotor leftRear;
    DcMotor rightFront;
    DcMotor rightRear;
    // Gamepad gamepad1;


    //Define variables

    //Constructor (put init things in here)

    public DriveTrain(HardwareMap ahwMap) {
        //This is static
        hwMap = ahwMap;
        // Controls controls = new Controls();


        //Add actuators and sensors here
        leftFront = hwMap.dcMotor.get(ActuatorMap.leftFront);
        rightFront = hwMap.dcMotor.get(ActuatorMap.rightFront);
        leftRear = hwMap.dcMotor.get(ActuatorMap.leftBack);
        rightRear = hwMap.dcMotor.get(ActuatorMap.rightBack);
    }

    public synchronized void init() {


    }

    public synchronized void mechDrive(double leftY, double leftX, double rightX) {
        double r, robotAngle, v1, v2, v3, v4;
        if(leftX > .1) {
            r = Math.hypot(leftX, leftY);
            robotAngle = Math.atan2(leftY, leftX) - Math.PI / 4;
            v1 = r * Math.cos(robotAngle) + rightX;
            v2 = r * Math.sin(robotAngle) - rightX;
            v3 = r * Math.sin(robotAngle) + rightX;
            v4 = r * Math.cos(robotAngle) - rightX;

            leftFront.setPower(v1);
            rightFront.setPower(v2);
            leftRear.setPower(v3);
            rightRear.setPower(v4);


        }

        else if (leftX < -.1) {
            r = Math.hypot(leftX, leftY);
            robotAngle = Math.atan2(leftY, leftX) - Math.PI / 4;
            v1 = r * Math.cos(robotAngle) + rightX;
            v2 = r * Math.sin(robotAngle) - rightX;
            v3 = r * Math.sin(robotAngle) + rightX;
            v4 = r * Math.cos(robotAngle) - rightX;

            leftFront.setPower(v1);
            rightFront.setPower(v2);
            leftRear.setPower(v3);
            rightRear.setPower(v4);


        }else {
            r = Math.hypot(leftX, leftY);
            robotAngle = Math.atan2(leftY, leftX) - Math.PI / 4;
            v1 = r * Math.cos(robotAngle) + rightX;
            v2 = r * Math.sin(robotAngle) - rightX;
            v3 = r * Math.sin(robotAngle) + rightX;
            v4 = r * Math.cos(robotAngle) - rightX;

            leftFront.setPower(v1);
            rightFront.setPower(v2);
            leftRear.setPower(-v3);
            rightRear.setPower(-v4);
        }
    }
}