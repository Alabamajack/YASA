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


extern Output_Message;

extern COMSERVICE_transmit_package;
extern COMSERVICE_receive_package;

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
///SAK SchussMotor
///

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
///SAK Output
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
 * blockiert den Ablauf des aufrufenden Task solange, bis Event eingetroffen ist
 * @return  @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 *
 */
inline std_return RTE_Output_GetValue_Event_In();

/**
 * \brief holt sich die Nachricht, die auf dem Display angezeigt werden soll, blockiert solange den weiteren Ablauf des Task, bis die Nachricht da ist
 * @param   message    Nachricht die angezeigt werden soll, mit der maximalen Nachrichtenlänge
 * @see MAX_MESSAGE_LENGHT
 * @return             @Errorcode
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date    2015-06-08
 */
inline std_return RTE_Output_GetValue_Receiver_In(char*);


///
///SAK Trigger
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
///SWK Schussanlage
///

/**
 * \brief Wartet auf ein konfiguriertes Event
 * Funktionsaufruf ist nicht blockierend, da aus dem Komponentendiagramm hervorgeht, das dies hier nicht sinnvoll ist.
 * entspricht einem GetEvent
 * @param eventvalue 0 wenn Event nicht gesetzt, !0 wenn Event gesetzt
 *
 * @return  @Errorcode
 * @version 1.0 Initale Version
 * @author Florian Laufenböck
 * @date    2015-06-09
 */
inline std_return RTE_Schussanlage_GetValue_Event_In(uint8_t *eventvalue);

/**
 * \brief TODO
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initiale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @todo über Port nachdenken, wirklich so sinnvoll
 */
inline std_return RTE_Schussanlage_GetOrder_Server_In();

/**
 * \brief Setzt eine Nachricht für den Multicast-Betrieb. Beinhaltet bereits die gesamte Nachricht!
 *
 * @param   message    Nachricht die per aussen gesendet werden soll
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @todo Nachdenken ob Dreiecksbeziehung so richtig und sinnvoll/funtkioniert
 */
inline std_return RTE_Schussanlage_SendMessage_Sender_Out(const char*);

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
 * \brief wie viele Schüsse sollen von SchussMotor ausgeführt werden
 * stellt gleichzeitig die Funktion für die SAK SchussMotor da
 *
 * @param   schuesse   ganzzahl wie viele Schüsse abgegeben werden sollen
 * @param   return_val eigentlicher Rückgabewert der aufrufenden Funktion
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @attention da Funktionsaufruf natürlich blockierend
 */
inline std_return RTE_Schussanlage_SetOrder_Client_Out(const uint8_t *schuesse, uint32_t *return_val);


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
 *
 * @todo Nachdenken ob dieser Port überhaupt sinnvoll so ist
 */
inline std_return RTE_Trigger_SetOrder_Client_Out();

/**
 * \brief bekommt eine Nachricht, in der bestimmte Informationen über den Zustand der Schussanlage drinstehen
 *
 * @return             @Errorcode
 *
 * @version 1.0 Initale Version
 *
 * @author Florian Laufenböck
 *
 * @date    2015-06-10
 *
 * @todo Nachdenken ob diese Beziehung überhaupt sinnvoll ist
 */
inline std_return RTE_Trigger_GetValue_Receiver_In();

/**
 * \brief Status des Events abfragen, welches symbolisiert, dass der Trigger gestartet wurde
 * blockiert die weitere Ausführung solange, bis das Event eingetroffen ist
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
