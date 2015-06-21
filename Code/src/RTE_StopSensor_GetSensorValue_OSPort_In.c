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

#ifdef RTE_STOPSENSOR_GETSENSORVALUE_OSPORT_IN
void RTE_StopSensor_GetSensorValue_OSPort_In(uint8_t* value)
{
#ifdef RTE_StopSensor_GetSensorValue_OSPort_In_ONEBRICK
    if(*value)
    {
        SetEvent(STOPSENSORTASK, STOPEVENT);
    }
#endif

#ifdef RTE_StopSensor_GetSensorValue_OSPort_In_TWOBRICK
/*wann ComService aufrufen?*/
    if(*value)
    {
        SetEvent(STOPSENSORTASK, STOPEVENT);
    }
#endif
}
#endif /* RTE_STOPSENSOR_GETSENSORVALUE_OSPORT_IN */
