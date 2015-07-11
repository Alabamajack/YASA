#include "kernel.h"
#include "kernel_id.h"
#include "ecrobot_interface.h"
#include "ecrobot_bluetooth.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
#include <string.h>
#include "YASA_generated_variables.h"
/** @file RTE_Output_SetOutput_OSPort_Out.c
 *
 * Aufruf einer Funktion, die Ausgaben macht.
 * benötigt folgende externe Abhängigkeiten:
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
	if(y == 8)
	{
		y = 0;
		display_clear(0);
	}
	display_goto_xy(0,y);
	display_string(intern_message);
	display_update();
	y++;	
}

inline std_return RTE_Output_SetOutput_OSPort_Out(const char* message)
{
#ifdef RTE_Output_SetOutput_OSPort_Out_DISPLAY
    print(message);
#endif
#ifdef RTE_Output_SetOutput_OSPort_Out_IIC
    uint8_t data_IIC = 0x5F;
	while(i2c_busy(RTE_Output_SetOutput_OSPort_Out_PORT) != 0);
    ecrobot_send_i2c(RTE_Output_SetOutput_OSPort_Out_PORT, 0x20, data_IIC, &data_IIC, 0);
#endif
    return 0;
}

