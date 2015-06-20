#ifndef YASA_API
#define YASA_API
/** @file YASA_API.h
 *
 */

///
///includes
///
#include "YASA_RTEAPI.h"

/**
 * Funktion die die SAK SchussMotor darstellt(spezialfall das Server-Client)
 *
 * @param   schuesse   anzahl der schüsse die abgegeben werden sollen
 * @param   ret_val    return Wert
 *
 * @return             0 - da kein Fehler auftreten kann
 *
 * @version 1.0
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-20
 */
#define Schussanlage_SetOrder_Client_Out(schuesse, ret_val)\
        0;\
        ret_val = 0;\
        RTE_SchussMotor_SetOutputValue_OSPort_Out(schuesse * 360);





#endif YASA_API
