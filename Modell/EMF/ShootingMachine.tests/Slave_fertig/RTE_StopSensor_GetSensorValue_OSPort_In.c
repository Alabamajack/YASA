#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "YASA_generated_variables.h"
/** @file RTE_StopSensor_GetSensorValue_OSPort_In.c
 *
 * Funktion die sich aus dem Betriebssystem den Status holt, mit dem die ganze Maschinerie gestoppt werden kann.
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: value
 * Makros: STOPSENSORTASK, STOPEVENT
 * Events: 
 * Tasks: 
 *
 * @version 1.0
 * @date 2015-06-21
 * @authors Tobias Schwindl
 *
 */

inline std_return RTE_StopSensor_GetSensorValue_OSPort_In(uint8_t* value)
{
    static uint8_t IIC_Initialized = 0;
#ifdef RTE_StopSensor_GetSensorValue_OSPort_In_BUTTON
	/* als Abbruchbedingung ist ein Button definiert */
	uint8_t currentStatus = ecrobot_get_touch_sensor(RTE_StopSensor_GetSensorValue_OSPort_In_PORT);
	static uint8_t driverButtonLastState = 0;
	if ( currentStatus != driverButtonLastState && currentStatus != 0)
	{
		/* Button is gedrückt */
		*value = 1;
		driverButtonLastState = currentStatus;
	}
	else
	{
		/* Button nicht gedrückt */
		*value = 0;
		driverButtonLastState = 0;
	}
#endif
#ifdef RTE_StopSensor_GetSensorValue_OSPort_In_IIC
    /* als Abbruchbedingung ist der IIC definiert */
    static uint8_t currentStatus_StopSensor = 0xFF;
    
    // if(!IIC_Initialized)
    // {
        // IIC_Initialized = 1;
        // i2c_enable(RTE_StopSensor_GetSensorValue_OSPort_In_PORT);
    // }
	ecrobot_send_i2c(RTE_StopSensor_GetSensorValue_OSPort_In_PORT, 0x20, currentStatus, &currentStatus, 0);
	while(i2c_busy(RTE_StopSensor_GetSensorValue_OSPort_In_PORT) != 0);
    ecrobot_read_i2c(RTE_StopSensor_GetSensorValue_OSPort_In_PORT, 0x20, 0xF0, &currentStatus, 1);
    if((currentStatus == 0xD0) || (currentStatus == 0xE0))
    {
        *value = 1;
    }
    else
    {
        *value = 0;
    }
#endif
return 0;
}

