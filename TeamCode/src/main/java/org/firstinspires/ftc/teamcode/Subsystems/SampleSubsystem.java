package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

public class SampleSubsystem extends Subsystem{


        //Define Actuators as null
        private static DcMotor sampleMotor;
        private static ColorSensor cSensor;
        //Define variables

    //Constructor (put init things in here)

        public SampleSubsystem(HardwareMap ahwMap){
            //This is static
            hwMap = ahwMap;

            //Add actuators and sensors here

        }

        public synchronized void init(){



        }

        //Runs a motor at a power out of 1.  For example, if you wanted to run the
        // motor at 50% power, set the power number to .5
        public synchronized void runMotorManualStick(double power){
            sampleMotor.setPower(power);
        }

        public synchronized void runMotorManualButton(boolean up, boolean down){

            if(up){
                sampleMotor.setPower(1);
            }

            else if(down){
                sampleMotor.setPower(-1);
            }

            else{
                sampleMotor.setPower(0);
            }

        }

        //Runs to an encoder position in degrees (requires an encoder)
        public synchronized void runMotorPosition(int degreesOfRotation){
            sampleMotor.setTargetPosition(degreesOfRotation);
        }

        public synchronized void runMotorIfColor(){
            if(cSensor.blue() > 70){
                sampleMotor.setPower(1);
            }
            else{
                sampleMotor.setPower(0);
            }
        }
}
