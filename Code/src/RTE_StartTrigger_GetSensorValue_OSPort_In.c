#include "kernel.h"
#include "kernel_id.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
#include "YASA_generated_variables.h"
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
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_BUTTON
	/* als Trigger ist ein Button definiert */
	uint8_t currentStatus = ecrobot_get_touch_sensor(StartTriggerPort_PORT);
	static uint8_t driverButtonLastState = 0;
	if ( currentStatus != driverButtonLastState && currentStatus != 0)
	{
		/* Button is gedrückt */
		value = 1;
		driverButtonLastState = currentStatus;
	}
	else
	{
		/* Button nicht gedrückt */
		value = 0;
		driverButtonLastState = 0;
	}
#endif
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_SONIC
	/* als Trigger ist ein Ultraschallsensor definiert */
	// static uint8_t InitializedSonar = 0;
	uint8_t measurement = 0;
	// if(!InitializedSonar)
	// {
        // InitializedSonar = 1;
		// ecrobot_init_sonar_sensor(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT);
	// }
	measurement = ecrobot_get_sonar_sensor(StartTriggerPort_PORT);
	/* ab dem gemessenen Wert 80, wird getriggert */
	if( measurement < 80 )
	{
		value = 1;
	}
	else
	{
		value = 0;
	}
#endif
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_IIC
    /* als Trigger ist der IIC Expander mit Taster definiert */
    static uint8_t currentStatus = 0xFF;
	// static uint8_t IIC_Initialized = 0;
    // if(!IIC_Initialized)
    // {
        // IIC_Initialized = 1;
        // i2c_enable(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT);
    // }
	ecrobot_send_i2c(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT, 0x20, currentStatus, &currentStatus, 0);
	while(i2c_busy(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT) != 0);
    ecrobot_read_i2c(RTE_StartTrigger_GetSensorValue_OSPort_In_PORT, 0x20, 0xF0, &currentStatus, 1);
	/* linker Taster und rechter Taster */
	if( (currentStatus == 0xD0)  || (currentStatus == 0xE0))
    {
        /* button gedrückt */
        value = 1;
    }
    else
    {
        value = 0;
    }
#endif
	return 0;
}
