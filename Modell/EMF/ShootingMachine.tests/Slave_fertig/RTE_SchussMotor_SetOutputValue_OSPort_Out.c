#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
#include "YASA_generated_variables.h"
/** @file RTE_SchussMotor_SetOutputValue_OSPort_Out.c
 *
 * Abstraktion um auf die Output-Hardware zuzugreifen. hier: Zugriff auf Motor. 
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: degree
 * Makros: RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT
 * Events: 
 * Tasks: 
 *
 * @version 1.0
 * @date 2015-06-21
 * @authors Tobias Schwindl
 *
 */
 
inline std_return RTE_SchussMotor_SetOutputValue_OSPort_Out(uint32_t* degree)
{
#define CORRECTION 11
#ifdef RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
		nxt_motor_set_count(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, 0);
		nxt_motor_set_speed(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, 35, 1);
		while ( nxt_motor_get_count(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT) < (*degree - CORRECTION) )
		{
			;
		}
		nxt_motor_set_speed(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, 0, 1);
		
#endif
return 0;
}