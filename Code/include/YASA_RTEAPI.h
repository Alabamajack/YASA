#ifnded YASA_RTEAPI
#define YASA_RTEAPI
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


///
///SAK StopSensor
///

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
 * Dieses "Event" ist entweder ein wirkliches Event(konfiguriert), oder aber eine Nachricht an einen anderen Brick
 *
 * @return @Errorcode
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date 2015-06-07
 */
inline std_return RTE_StopSensor_SetValue_Event_Out();


///
///Funktionen für die SA-Komponente SchussMotor
///

/**
 * \brief Receiver Port für Signale von der Schussanlage
 *
 * @param message  enhält die Anzahl, wie oft die Aktion ausgeführt werden soll, constant(hier: wie oft geschossen werden soll, bis abgebrochen werden kann)
 *
 * @return @Errorcode
 *
 * @attention Die restlichen Variablen die für das schiessen wichtig sind werden global definiert. Diese Definitionen sind dann zu verwenden
 * @attention Beim Funktionsaufruf ist darauf zu achten, dass die übergebene Anzahl IMMER bis zum Ende ausgeführt wird. Sollte also 5 übergeben werden, werden diese 5 Schüsse
 * 				ausgeführt, egal ob bei 1 unterbrochen werden soll!
 *
 * @todo globale Variablen für den Motor definieren
 *
 * @see RTE_Schussanlage_SetOrder_Sender_Out(const uint8_t *order);
 *
 * @version 1.0
 * @author Florian Laufenböck
 * @date 2015-06-07
 */
inline std_return RTE_SchussMotor_GetOrder_Receiver_In(const YASA_message *message);

/**
 * \brief Abstraktion um auf die Output-Hardware zuzugreifen. hier: Zugriff auf Motor
 *
 * @param degree Anzahl der Umdrehungen die der Motor machen soll
 *
 * @warning Die übrigen Parameter um den Motor fahren zu lassen werden global definiert
 *
 * @return @Errorcode
 *
 * @version 1.0
 * @author Florian Laufenböck
 * @date 2015-06-08
 */
inline std_return RTE_SchussMotor_SetOutputValue_OSPort_Out(const uint32_t *degree);


///
///Funktionen für die SA-Komponente Output
///

/**
 * \brief Aufruf einer Funktion, die Ausgaben macht
 * @param   message    Nachricht die Ausgegeben werden soll. Dabei ist dies keine @see YASA_message mehr, sondern nur noch die "nackte" Nachricht, die Interpretation der Nachricht
 *                     erfolt in der aufrufenden SAK Output
 * @return @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 */
inline std_return RTE_Output_SetOutput_OSPort_Out(const uint8_t *message);

/**
 * \brief Wartet auf ein konfiguriertes Event
 * @return  @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 *
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
inline std_return RTE_Output_GetValue_Server_In(YASA_message *message);


///
///Funktionen für die SA-Komponente StartTrigger
///

/**
 * \brief setzt ein Event, das symbolisiert ob gestartet werden soll
 * @return  @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
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


///
///Funktionen für die SW-Komponente Schussanlage
///

/**
 * \brief Wartet auf ein konfiguriertes Event
 * @return  @Errorcode
 * @version 1.0 Initale Version
 * @author Florian Laufenböck
 * @date    2015-06-09
 */
inline std_return RTE_Schussanlage_GetValue_Event_In();

/**
 * \brief Nimmt eine Nachricht von der SW-Komponente Trigger entgegen. Dort wird verarbeitet ob gestartet werden soll oder nicht.
 *
 *
 * @param   message    enthält ganzzahl, wobei die Interpretation noch anzugeben ist
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initiale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @todo Interpretation von order festlegen
 * @see RTE_Trigger_SetOrder_Sender_Out(const uint8_t *order);
 */
inline std_return RTE_Schussanlage_GetOrder_Receiver_In(const YASA_message *message);

/**
 * \brief Setzt eine Nachricht für den Multicast-Betrieb. Beinhaltet bereits die gesamte Nachricht!
 *
 * @param   message    Nachricht die per Multicast nach aussen gesendet werden soll
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 */
inline std_return RTE_Schussanlage_SendMessage_Client_Out(const YASA_message *message);

/**
 * \brief setzt Event um der SAK Output zu signalisieren, dass sich der interne Zustand geändert hat und jetzt was ausgegeben werden kann
 *
 * @return  @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 */
inline std_return RTE_Schussanlage_SetValue_Event_Out();

/**
 * \brief setzt einen Befehl der von SchussMotor ausgeführt werden soll
 *
 * @param   message    enthält ganzzahl die den Befehl angibt
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 */
inline std_return RTE_Schussanlage_SetOrder_Sender_Out(const YASA_message *message);


///
///SWK Trigger
///

/**
 * \brief setzt einen Befehl um die Zustand der Kommunikation mit aussen anzuzeigen
 *
 * @param   message      ganzahl die angibt wie der Zustand ist
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 */
inline std_return RTE_Trigger_SetOrder_Sender_Out(const YASA_message *message);

/**
 * \brief bekommt eine Nachricht, in der bestimmte Informationen über den Zustand der Schussanlage drinstehen
 *
 * @param   message    Nachricht
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @todo Nachrichten definieren, um Kommunikation sicherzustellen
 */
inline std_return RTE_Trigger_GetMessage_Server_In(const YASA_message *message);

/**
 * \brief Status des Events abfragen, welches symbolisiert, dass der Trigger gestartet wurde
 *
 * @return  @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 */
inline std_return RTE_Trigger_GetValue_Event_In();

#endif YASA_RTEAPI
