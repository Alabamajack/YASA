#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
/** @file RTE_Output_SetOutput_OSPort_Out.c
 *
 * Aufruf einer Funktion, die Ausgaben macht.
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: message 
 * Makros: 
 * Events: 
 * Tasks: 
 *
 * @version 1.0
 * @date 2015-06-21
 * @authors Tobias Schwindl
 *
 */

void print(const char* intern_message)
{
    static int y = 0;
	display_goto_xy(0,y);
	display_string(intern_message);
	display_update();
	y++;
}

#ifdef RTE_OUTPUT_SETOUTPUT_OSPORT_OUT
void RTE_Output_SetOutput_OSPort_Out(const char* message)
{
#ifdef RTE_Output_SetOutput_OSPort_Out_ONEBRICK
    print(message);
#endif
#ifdef RTE_Output_SetOutput_OSPort_Out_TWOBRICK
    /*ComService aufrufen, welche Funktion? */
#endif 
}
#endif /* RTE_OUTPUT_SETOUTPUT_OSPORT_OUT */
