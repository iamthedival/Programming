package org.siliconedgerobotics.ftc.utils;
import com.qualcomm.ftcrobotcontroller.opmodes.*;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;
import com.qualcomm.robotcore.hardware.HardwareDevice;

/**
 * Created by Wei on 12/29/2015.
 */

//The salt, man! The salt is real!
public class PowerOnTestUtil {

    public PowerOnTestUtil() {

    }

    public boolean attemptHardwareMapRegistration (Object part) {
        if (part instanceof HardwareDevice) {

            try {

            } catch (Exception e) {
                //SiEdgeOpMode.
                return false;
            }

        }
        return false;
    }

}
