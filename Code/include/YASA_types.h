#ifndef YASA_types
#define YASA_types
/** @file YASA_types.h
 *
 * \brief Alle Typen für das AUTOSAR - Projekt
 *
 * Enthält alle Typen, die global für das AUTOSAR-Projekt gültig sind und benötigt werden.(also typedefs, enumeration-types, structs etc.)
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck
 * @date 2015-06-08
 *
 */

 /**
  * \brief Der Standard Rueckgabetyp
  * Unser Standard Returntype. Bitte ab hier immer nur diesen verwenden!
  *
  * @version 1.0 Initale Version
  * @author Florian Laufenböck
  * @date 2015-06-08
  */
typedef uint32_t std_return;

/**
 * nur ein Dummy für den eigentlichen Nachrichtendatentyp
 *
 * @todo remove
 */
#define DUMMYMESSAGE

/**
 * \brief unser Standarddatentyp für Nachrichten
 *
 * @version 0.1 Initale Version
 * @author Florian Laufenböck
 * @date 2015-06-10
 *
 * @attention kann noch nicht verwendet werden, definiert nur einen DUMMY
 * @todo Typ richtig definieren
 */
typedef DUMMYMESSAGE YASA_message;

 #endif /* YASA_types */
