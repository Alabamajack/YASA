#ifndef YASA_types
#define YASA_types
/** @file YASA_types.h
 *
 * \brief Alle Typen für das AUTOSAR - Projekt
 *
 * Enthält alle Typen, die global für das AUTOSAR-Projekt gültig sind und benötigt werden.(also typedefs, enumeration-types, structs etc.)
 *
 * @version 1.0 Initiale Version
 * @author Florian Laufenböck, Tobias Schwindl
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
typedef U32 std_return;
typedef U8 uint8_t;
typedef U32 uint32_t;
typedef U16 uint16_t;
typedef SINT int32_t;

 #endif /* YASA_types */
