#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
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

void RTE_StopSensor_GetSensorValue_OSPort_In(uint8_t* value)
{
#ifdef RTE_StopSensor_GetSensorValue_OSPort_In_BUTTON
	/* als Abbruchbedingung ist ein Button definiert */
	uint8_t currentStatus = ecrobot_get_touch_sensor(RTE_StopSensor_GetSensorValue_OSPort_In_PORT);
	static uint8_t driverButtonLastState = 0;
	if ( currentStatus != driverButtonLastState && currentStatus != 0)
	{
		/* Button is gedrückt */
		*value = 1;
	}
	else
	{
		/* Button nicht gedrückt */
		*value = 0;
	}
	driverButtonLastState = currentStatus;
#endif
}

