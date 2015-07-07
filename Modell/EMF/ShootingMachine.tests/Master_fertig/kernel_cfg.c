/*
 *  kernel_cfg.c
 *  Tue Jul 07 17:52:28 2015
 *  SG Version 2.00
 *  sg.exe Master_fertig.oil -os=ECC2 -I../../../../../../../../nxtOSEK/ecrobot/../toppers_osek/sg/impl_oil -template=../../../../../../../../nxtOSEK/ecrobot/../toppers_osek/sg/lego_nxt.sgt
 */
#include "osek_kernel.h"
#include "kernel_id.h"
#include "alarm.h"
#include "interrupt.h"
#include "resource.h"
#include "task.h"

#define __STK_UNIT VP
#define __TCOUNT_STK_UNIT(sz) (((sz) + sizeof(__STK_UNIT) - 1) / sizeof(__STK_UNIT))

#define TNUM_ALARM     1
#define TNUM_COUNTER   1
#define TNUM_ISR2      0
#define TNUM_RESOURCE  0
#define TNUM_TASK      8
#define TNUM_EXTTASK   6

const UINT8 tnum_alarm    = TNUM_ALARM;
const UINT8 tnum_counter  = TNUM_COUNTER;
const UINT8 tnum_isr2     = TNUM_ISR2;
const UINT8 tnum_resource = TNUM_RESOURCE;
const UINT8 tnum_task     = TNUM_TASK;
const UINT8 tnum_exttask  = TNUM_EXTTASK;

 /****** Object OS ******/

 /****** Object TASK ******/

const TaskType SchussanlagenTask = 0;
const TaskType Output = 1;
const TaskType TASK_BT_INTERFACE_READER = 2;
const TaskType TASK_BT_INTERFACE_WRITER = 3;
const TaskType BT_IMPLIZIT_MASTER = 4;
const TaskType BT_IMPLIZIT_MASTER2 = 5;
const TaskType StopSensor = 6;
const TaskType InitHook = 7;

extern void TASKNAME( SchussanlagenTask )( void );
extern void TASKNAME( Output )( void );
extern void TASKNAME( TASK_BT_INTERFACE_READER )( void );
extern void TASKNAME( TASK_BT_INTERFACE_WRITER )( void );
extern void TASKNAME( BT_IMPLIZIT_MASTER )( void );
extern void TASKNAME( BT_IMPLIZIT_MASTER2 )( void );
extern void TASKNAME( StopSensor )( void );
extern void TASKNAME( InitHook )( void );

static __STK_UNIT _stack_SchussanlagenTask[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_Output[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_TASK_BT_INTERFACE_READER[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_TASK_BT_INTERFACE_WRITER[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_BT_IMPLIZIT_MASTER[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_BT_IMPLIZIT_MASTER2[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_StopSensor[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_InitHook[__TCOUNT_STK_UNIT(512)];

const Priority tinib_inipri[TNUM_TASK] = { TPRI_MINTASK + 1, TPRI_MINTASK + 2, TPRI_MINTASK + 7, TPRI_MINTASK + 7, TPRI_MINTASK + 9, TPRI_MINTASK + 7, TPRI_MINTASK + 4, TPRI_MINTASK + 10, };
const Priority tinib_exepri[TNUM_TASK] = { TPRI_MINTASK + 1, TPRI_MINTASK + 2, TPRI_MINTASK + 7, TPRI_MINTASK + 7, TPRI_MINTASK + 9, TPRI_MINTASK + 7, TPRI_MINTASK + 4, TPRI_MINTASK + 10, };
const UINT8 tinib_maxact[TNUM_TASK] = { (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, };
const AppModeType tinib_autoact[TNUM_TASK] = { 0x00000001, 0x00000001, 0x00000001, 0x00000001, 0x00000001, 0x00000001, 0x00000000, 0x00000001, };
const FP tinib_task[TNUM_TASK] = { TASKNAME( SchussanlagenTask ), TASKNAME( Output ), TASKNAME( TASK_BT_INTERFACE_READER ), TASKNAME( TASK_BT_INTERFACE_WRITER ), TASKNAME( BT_IMPLIZIT_MASTER ), TASKNAME( BT_IMPLIZIT_MASTER2 ), TASKNAME( StopSensor ), TASKNAME( InitHook ), };
const __STK_UNIT tinib_stk[TNUM_TASK] = { (__STK_UNIT)_stack_SchussanlagenTask, (__STK_UNIT)_stack_Output, (__STK_UNIT)_stack_TASK_BT_INTERFACE_READER, (__STK_UNIT)_stack_TASK_BT_INTERFACE_WRITER, (__STK_UNIT)_stack_BT_IMPLIZIT_MASTER, (__STK_UNIT)_stack_BT_IMPLIZIT_MASTER2, (__STK_UNIT)_stack_StopSensor, (__STK_UNIT)_stack_InitHook, };
const UINT16 tinib_stksz[TNUM_TASK] = { 512, 512, 512, 512, 512, 512, 512, 512, };

TaskType tcb_next[TNUM_TASK];
UINT8 tcb_tstat[TNUM_TASK];
Priority tcb_curpri[TNUM_TASK];
UINT8 tcb_actcnt[TNUM_TASK];
EventMaskType tcb_curevt[TNUM_EXTTASK];
EventMaskType tcb_waievt[TNUM_EXTTASK];
ResourceType tcb_lastres[TNUM_TASK];
DEFINE_CTXB(TNUM_TASK);

 /****** Object COUNTER ******/

const CounterType C_StopSensorAlarm = 0;

const TickType cntinib_maxval[TNUM_COUNTER] = { 100, };
const TickType cntinib_maxval2[TNUM_COUNTER] = { 201, };
const TickType cntinib_tickbase[TNUM_COUNTER] = { 1, };
const TickType cntinib_mincyc[TNUM_COUNTER] = { 1, };

AlarmType cntcb_almque[TNUM_COUNTER];
TickType cntcb_curval[TNUM_COUNTER];

 /****** Object ALARM ******/

const AlarmType StopSensorAlarm = 0;

DeclareTask(StopSensor);
static void _activate_alarm_StopSensorAlarm( void );
static void _activate_alarm_StopSensorAlarm( void )
{ (void)ActivateTask( StopSensor ); }

const CounterType alminib_cntid[TNUM_ALARM] = { 0, };
const FP alminib_cback[TNUM_ALARM] = { _activate_alarm_StopSensorAlarm, };
const AppModeType alminib_autosta[TNUM_ALARM] = { 0x00000001, };
const TickType alminib_almval[TNUM_ALARM] = { 100, };
const TickType alminib_cycle[TNUM_ALARM] = { 100, };

AlarmType almcb_next[TNUM_ALARM];
AlarmType almcb_prev[TNUM_ALARM];
TickType almcb_almval[TNUM_ALARM];
TickType almcb_cycle[TNUM_ALARM];

 /****** Object RESOURCE ******/


const Priority resinib_ceilpri[TNUM_RESOURCE+1] = { 0};

Priority rescb_prevpri[TNUM_RESOURCE+1];
ResourceType rescb_prevres[TNUM_RESOURCE+1];

 /****** Object EVENT ******/

const EventMaskType BT_HAS_RECEIVED_PACKAGE = (1UL << 0);
const EventMaskType BT_SEND_MY_MESSAGE = (1UL << 1);
const EventMaskType RTE_Schussanlage_Trigger_GetValue_Event_In_EVENT = (1UL << 2);
const EventMaskType RTE_Schussanlage_StopSensor_GetValue_Event_In_EVENT = (1UL << 3);
const EventMaskType RTE_Output_GetValue_Receiver_In_EVENT = (1UL << 4);
const EventMaskType RTE_Trigger_GetValue_Receiver_In_EVENT = (1UL << 5);
const EventMaskType RTE_SchussMotor_GetValue_Event_In_EVENT = (1UL << 6);
const EventMaskType BT_IMPLIZIT_MASTER2_EVENT = (1UL << 7);

 /****** Object ISR ******/


#define IPL_MAXISR2 0
const IPL ipl_maxisr2 = IPL_MAXISR2;


const Priority isrinib_intpri[TNUM_ISR2+1] = { 0};
ResourceType isrcb_lastres[TNUM_ISR2+1];

 /****** Object APPMODE ******/

void object_initialize( void )
{
	alarm_initialize();
	task_initialize();
}


/*
 *  TOPPERS/OSEK Kernel
 *      Toyohashi Open Platform for Embedded Real-Time Systems/
 *      OSEK Kernel
 * 
 *  Copyright (C) 2006 by Witz Corporation, JAPAN
 * 
 *  上記著作権者は，以下の (1)～(4) の条件か，Free Software Foundation 
 *  によって公表されている GNU General Public License の Version 2 に記
 *  述されている条件を満たす場合に限り，本ソフトウェア（本ソフトウェア
 *  を改変したものを含む．以下同じ）を使用・複製・改変・再配布（以下，
 *  利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 * 
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，その適用可能性も
 *  含めて，いかなる保証も行わない．また，本ソフトウェアの利用により直
 *  接的または間接的に生じたいかなる損害に関しても，その責任を負わない．
 * 
 */




