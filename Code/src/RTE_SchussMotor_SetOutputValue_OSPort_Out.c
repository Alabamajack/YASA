#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
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

std_return RTE_SchussMotor_SetOutputValue_OSPort_Out(U32* degree)
{
	static U8 correction = 0;
#ifdef RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
		nxt_motor_set_speed(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, 35, 1);
		if(correction == 5)
		{
			systick_wait_ms(100);
			correction = 0;
		}
		systick_wait_ms(10*(*degree/3));	
		nxt_motor_set_speed(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, 0, 1);
		correction++;
#endif
return 0;
}