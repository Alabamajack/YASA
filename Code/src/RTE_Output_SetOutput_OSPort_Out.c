#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
#include "ecrobot_interface.h"
#include <string.h>
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
	if(y == 8)
	{
		y = 0;
		display_clear(0);
	}
}

inline std_return RTE_Output_SetOutput_OSPort_Out(const char* message)
{
#ifdef RTE_Output_SetOutput_OSPort_Out_DISPLAY
    print(message);
#endif
#ifdef RTE_Output_SetOutput_OSPort_Out_LED
    /* LED ausgeben */
#endif 
#ifdef RTE_Output_SetOutput_OSPort_Out_IIC
    uint8_t data_IIC = 0; /* Idee: die message in einen Integer wandeln und dann auf die LED's legen */
    int32_t reg = 0;
	if(!IIC_Initialized) /* IIC_Initialized global ermöglichen! */
    {
        IIC_Initialized = 1;
        ecrobot_init_i2c(RTE_Output_SetOutput_OSPort_Out_PORT, LOWSPEED);
    }
    ecrobot_send_i2c(RTE_Output_SetOutput_OSPort_Out_PORT, 0x20, reg, data_IIC, 1);
#endif
    return 0;
}

