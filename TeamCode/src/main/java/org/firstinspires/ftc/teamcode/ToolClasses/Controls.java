package org.firstinspires.ftc.teamcode.ToolClasses;

/**
 * Created by max on 6/14/17.
 */

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.Gamepad;


public class Controls{

    Gamepad gamepad1 = new Gamepad();

  /*  public Controls(Gamepad g1, Gamepad g2){

        gamepad1 = g1;
        gamepad2 = g2;

    }*/
    //Pxxx = Primary xxx
    //Sxxx = Secondary xxx


    public double leftX(){
        return gamepad1.left_stick_x;
    }
    public double leftY(){
        return gamepad1.left_stick_y;
    }
    public double rightX(){
        return gamepad1.right_stick_x;
    }
}
