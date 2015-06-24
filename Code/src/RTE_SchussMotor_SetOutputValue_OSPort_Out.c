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

void RTE_SchussMotor_SetOutputValue_OSPort_Out(uint32* degree)
{
#ifdef RTE_SchussMotor_SetOutputValue_OSPort_Out_ENGINE
	nxt_motor_set_count(RTE_SchussMotor_SetOutputValue_OSPort_Out_PORT, *degree);
#endif
}
