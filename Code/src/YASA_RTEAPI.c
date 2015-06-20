#include "YASA_RTEAPI.h"
/** @file YASA_RTEAPI.c
 */

/**
 * \brief gehört zur Codegenerierung; macht eine Unterscheidung ob der Funktionsaufruf auf dem gleichen Brick oder auf einem
 * anderen Brick aufgerufen werden soll. Wenn der Port auf dem gleichen Brick liegt, dann wird einfach die entsprechende Funktion
 * aufgerufen, die dann arbeitet. Wenn sie auf unterschiedlichen Bricks liegt, muss an die Comschicht weitergegeben werden, dabei wird
 * das allgemeine Austauschformat benutzt.
 *
 * @param   schuesse   anzahl der schüsse
 * @param   return_val der return-wert, der wieder zurückgegeben wird
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-20
 */
inline std_return RTE_Schussanlage_SetOrder_Client_Out(const uint8_t *schuesse,  uint32_t *return_val)
{
#ifdef RTE_Schussanlage_SetOrder_Client_Out_ONEBRICK | RTE_Schussanlage_SetOrder_Client_Out_THREEBRICK
    return Schussanlage_SetOrder_Client_Out(schuesse, return_val);
#endif
#ifdef RTE_Schussanlage_SetOrder_Client_Out_TWOBRICK | RTE_Schussanlage_SetOrder_Client_Out_THREEBRICK

#endif
}
