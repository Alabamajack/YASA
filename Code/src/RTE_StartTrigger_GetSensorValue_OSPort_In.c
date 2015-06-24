#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
/** @file RTE_StartTrigger_GetSensorValue_OSPort_In.c
 *
 * Kommuniziert mit aussen und gibt an ob von aussen getriggert worden ist oder nicht. Einfachster Fall ist ein Taster, komplizierterer Fall ist z.B. ein Ultraschallsensor dessen Output aber auch auf einen diskreten Wert runtergebrochen werden muss.
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: value
 * Makros: RTE_StartTrigger_GetSensorValue_OSPort_In_PORT
 * Events: 
 * Tasks: 
 *
 * @version 1.0
 * @date 2015-06-21
 * @authors Tobias Schwindl
 *
 */

inline std_return RTE_StartTrigger_GetSensorValue_OSPort_In(uint8_t* value)
{
	static InitializedSonar = 0;
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_BUTTON
	/* als Trigger ist ein Button definiert */
	int currentStatus = ecrobot_get_touch_sensor(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT);
	static int driverButtonLastState = 0;
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
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_SONIC
	/* als Trigger ist ein Ultraschallsensor definiert */
	uint8_t measurement = 0;
	if(!InitializedSonar)
	{
		ecrobot_init_sonar(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT);
	}
	measurement = ecrobot_get_sonar_sensor(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT);
	/* ab dem gemessenen Wert 80, wird getriggert */
	if( measurement < 80 )
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
