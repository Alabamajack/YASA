#ifndef YASA_GLOBAL_VARIABLES
#define YASA_GLOBAL_VARIABLES
/** @file YASA_global_variables.h
 *
 * Hier stehen alle global definierten, statischen Variablen und defines drin
 *
 * @version 1.0
 * @date 2015-06-19
 * @authors Florian Laufenböck, Phillip Eidenschink, Tobias Schwindl
 */

///
///includes
///
#include "YASA_generated_variables.h"

///
///Defines
///

/** \brief Addresse des BT-Slave: einzelne Werte müssen in hexcode und duch Kommas getrennt angegeben werden; Bsp: 0x00,0x10,0xFF... */
//SLAVE ADRRESS FUER BRICK3
#define BT_SLAVE_ADDRESS 0,22,83,23,18,139,0

/** \brief die maximale Packetlänge, die über BT übertragen werden kann(festgelegt durch uns, dadurch alles statischer) */
#define BT_PACKAGE_SIZE 127

/** \brief die maximale Länge einer Nachricht, die verschickt werden kann(ohne Overhead produziert durch die verschiedenen Schichten, also direkt nutzbar von Appliaktion)
 * @TODO muss noch ausgerechnet werden */
#define MAX_MESSAGE_LENGHT (BT_PACKAGE_SIZE - 1)

///#define __DEBUG__

///types

/** \brief Buffer-Speicher für Nachrichten, die über BT verschickt werden sollen */
//U8 BT_transmit_package[BT_PACKAGE_SIZE];
 char BT_transmit_package[BT_PACKAGE_SIZE];
/** \brief Buffer-Speicher für Nachrichten, die über BT empfangen wurden */
//U8 BT_receive_package[BT_PACKAGE_SIZE];
 char BT_receive_package[BT_PACKAGE_SIZE];
/* BT_COM_SERVICE wird in der Konfiguration angegeben */
//U8 COMSERVICE_receive_package[BT_COM_SERVICE][MAX_MESSAGE_LENGHT];
 char COMSERVICE_receive_package[BT_COM_SERVICE][MAX_MESSAGE_LENGHT];

//U8 COMSERVICE_transmit_package[BT_COM_SERVICE][MAX_MESSAGE_LENGHT];
 char COMSERVICE_transmit_package[BT_COM_SERVICE][MAX_MESSAGE_LENGHT];

/** \brief globale Variable für die Ausgabe. Quasi generiert */
//U8 Output_Message[MAX_MESSAGE_LENGHT];
 char Output_Message[MAX_MESSAGE_LENGHT];

#endif YASA_GLOBAL_VARIABLES
