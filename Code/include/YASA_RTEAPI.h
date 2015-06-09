/** @file YASA_RTEAPI.h
 *
 * \brief In dieser Datei stehen alle Funktionsprototypen fuer den RTE. Diese sind sowohl bei der Implementierung der Funktionen als auch bei der Benutzung
 * zu verwenden. Es dürfen keine Seiteneffekte innerhalb der Funktionen auftreten. Der den Code geschrieben hat, ist dafuer verantwortlich. Es ist eine Versionierung
 * zu benutzen! siehe dazu Coding-Rules
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date 2015-06-07
 *
 * */

/**
 * includes
 */
#include "YASA_types.h"

/**
 * Funktionen für die SA-Komponente StopSensor
 */

/**
 * \brief Funktion die sich aus dem Betriebssystem den Status holt, mit dem die ganze Maschinerie gestoppt werden kann
 * @param value gibt an, ob von aussen gestoppt werden soll(im einfachsten Fall per Taster)
 * 		0 := nicht ausgelöst
 * 		!0 := ausgelöst
 *
 * @return @Errorcode
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date 2015-06-07
 */
inline std_return RTE_StopSensor_GetSensorValue_OSPort_In(uint8_t *value);


/**
 * \brief Setzt Event für SW-Komponente Schussanlage
 * Setzt ein Event wenn die Schussanlage gestoppt werden soll
 *
 * @return @Errorcode
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date 2015-06-07
 *
 * @todo: Gedanken machen wie der Name des Events konfigurierbar bleibt
 */
inline std_return RTE_StopSensor_SetValue_Event_Out();

/**
 * Funktionen für die SA-Komponente SchussMotor
 */

/**
 * \brief Receiver Port für Signale von der Schussanlage
 *
 * @param number gibt die Anzahl weiter, wie oft die Aktion ausgeführt werden soll, constant(hier: wie oft geschossen werden soll, bis abgebrochen werden kann)
 *
 * @return @Errorcode
 *
 * @attention Die restlichen Variablen die für das schiessen wichtig sind werden global definiert. Diese Definitionen sind dann zu verwenden
 * @attention Beim Funktionsaufruf ist darauf zu achten, dass die übergebene Anzahl IMMER bis zum Ende ausgeführt wird. Sollte also 5 übergeben werden, werden diese 5 Schüsse
 * 				ausgeführt, egal ob bei 1 unterbrochen werden soll!
 *
 * @todo globale Variablen für den Motor definieren
 *
 * @version 1.0
 * @author Florian Laufenböck
 * @date 2015-06-07
 */
inline std_return RTE_SchussMotor_GetOrder_Receiver_In(const uint8_t *number);


/**
 * \brief Abstraktion um auf die Output-Hardware zuzugreifen. hier: Zugriff auf Motor
 *
 * @attention noch nicht fertig.
 *
 * @todo Parameterübergabe klären -> evtl. müssen nur die wichtigsten Parameter wie Anzahl der Umdrehungen übergeben werden
 *
 * @return @Errorcode
 *
 * @version 1.0
 * @author Florian Laufenböck
 * @date 2015-06-08
 */
inline std_return RTE_SchussMotor_SetOutputValue_OSPort_Out();

/**
 * Funktionen für die SA-Komponente Output
 */

/**
 * \brief Aufruf einer Funktion, die Ausgaben macht
 * @param   message    Nachricht die auf dem Output-Kanal ausgegeben werden soll, hier ein Display(kann aber auch eine LED sein)
 * @return @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 */
inline std_return RTE_Output_SetOutput_OSPort_Out(char *message);


/**
 * \brief Wartet auf ein konfiguriertes Event
 * @return  @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 *
 * @todo Gedanken machen wie man den Namen des Events "übergibt" -> Der Name soll aber konfigurierbar sein
 */
inline std_return RTE_Output_GetValue_Event_In();


/**
 * \brief holt sich die Nachricht, die auf dem Display angezeigt werden soll
 * @param   message    Nachricht die angezeigt werden soll
 * @return             @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 */
inline std_return RTE_Output_GetValue_Server_In(const char *message);

/**
 * Funktionen für die SA-Komponente StartTrigger
 */

/**
 * \brief setzt ein Event, das symbolisiert ob gestartet werden soll
 * @return  @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 *
 * @todo Gedanken machen wie man das mit dem Namen des Events macht, das gesetzt werden soll
 */
inline std_return RTE_StartTrigger_SetValue_Event_Out();


/**
 * \brief Kommuniziert mit aussen und gibt an ob von aussen getriggert worden ist oder nicht.
 * 	Einfachster Fall ist ein Taster, komplizierterer Fall ist z.B. ein Ultraschallsensor dessen Output aber auch
 * 	auf einen diskreten Wert runtergebrochen werden muss
 * @param   value      gibt an ob getriggert worden ist oder nicht -> 0 := nicht getriggertm !0 := getriggert
 * @return             @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 */
inline std_return RTE_StartTrigger_GetSensorValue_OSPort_In(uint8_t *value);

/**
 * Funktionen für die SW-Komponente Schussanlage
 */

/**
 * \brief Wartet auf ein konfiguriertes Event
 * @return  @Errorcode
 * @version 1.0 Initale Version
 * @author Florian Laufenböck
 * @date    2015-06-09
 *
 * @todo Gedanken machen wie man den Namen des Events "übergibt" -> Der Name soll aber konfigurierbar sein
 */
inline std_return RTE_Schussanlage_GetValue_Event_In();
