#include "kernel.h"
#include "kernel_id.h"
#include "YASA_global_variables.h"
#include "YASA_types.h"
/** @file RTE_StartTrigger_GetSensorValue_OSPort_In.c
 *
 * Kommuniziert mit aussen und gibt an ob von aussen getriggert worden ist oder nicht. Einfachster Fall ist ein Taster, komplizierterer Fall ist z.B. ein Ultraschallsensor dessen Output aber auch auf einen diskreten Wert runtergebrochen werden muss.
 * zusammenfassend benötigt folgende externe Abhängigkeiten:
 * Variablen: value
 * Makros: TRIGGERTASK, TRIGGEREVENT
 * Events: 
 * Tasks: 
 *
 * @version 1.0
 * @date 2015-06-21
 * @authors Tobias Schwindl
 *
 */

#ifdef RTE_STARTTRIGGER_GETSENSORVALUE_OSPORT_IN
void RTE_StartTrigger_GetSensorValue_OSPort_In(uint8_t* value)
{
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_ONEBRICK
    if(*value)
    {
        SetEvent(TRIGGERTASK, TRIGGEREVENT);
    }
#endif
#ifdef RTE_StartTrigger_GetSensorValue_OSPort_In_TWOBRICK
/*wann den ComService aufrufen?*/
    if(*value)
    {
        SetEvent(TRIGGERTASK, TRIGGEREVENT);
    }
#endif
}
#endif /* RTE_STARTTRIGGER_GETSENSORVALUE_OSPORT_IN */
