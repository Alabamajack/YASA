/*
 *  kernel_cfg.c
 *  Wed Jul 08 11:46:39 2015
 *  SG Version 2.00
 *  sg.exe Slave_AbgabeIII.oil -os=ECC2 -I../../../../../../../../nxtOSEK/ecrobot/../toppers_osek/sg/impl_oil -template=../../../../../../../../nxtOSEK/ecrobot/../toppers_osek/sg/lego_nxt.sgt
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
#define TNUM_TASK      7
#define TNUM_EXTTASK   5

const UINT8 tnum_alarm    = TNUM_ALARM;
const UINT8 tnum_counter  = TNUM_COUNTER;
const UINT8 tnum_isr2     = TNUM_ISR2;
const UINT8 tnum_resource = TNUM_RESOURCE;
const UINT8 tnum_task     = TNUM_TASK;
const UINT8 tnum_exttask  = TNUM_EXTTASK;

 /****** Object OS ******/

 /****** Object TASK ******/

const TaskType Display_Task = 0;
const TaskType TASK_BT_INTERFACE_READER = 1;
const TaskType TASK_BT_INTERFACE_WRITER = 2;
const TaskType BT_IMPLIZIT_SLAVE = 3;
const TaskType BT_IMPLIZIT_SLAVE2 = 4;
const TaskType Input = 5;
const TaskType InitHook = 6;

extern void TASKNAME( Display_Task )( void );
extern void TASKNAME( TASK_BT_INTERFACE_READER )( void );
extern void TASKNAME( TASK_BT_INTERFACE_WRITER )( void );
extern void TASKNAME( BT_IMPLIZIT_SLAVE )( void );
extern void TASKNAME( BT_IMPLIZIT_SLAVE2 )( void );
extern void TASKNAME( Input )( void );
extern void TASKNAME( InitHook )( void );

static __STK_UNIT _stack_Display_Task[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_TASK_BT_INTERFACE_READER[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_TASK_BT_INTERFACE_WRITER[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_BT_IMPLIZIT_SLAVE[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_BT_IMPLIZIT_SLAVE2[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_Input[__TCOUNT_STK_UNIT(512)];
static __STK_UNIT _stack_InitHook[__TCOUNT_STK_UNIT(512)];

const Priority tinib_inipri[TNUM_TASK] = { TPRI_MINTASK + 1, TPRI_MINTASK + 7, TPRI_MINTASK + 7, TPRI_MINTASK + 9, TPRI_MINTASK + 7, TPRI_MINTASK + 3, TPRI_MINTASK + 10, };
const Priority tinib_exepri[TNUM_TASK] = { TPRI_MINTASK + 1, TPRI_MINTASK + 7, TPRI_MINTASK + 7, TPRI_MINTASK + 9, TPRI_MINTASK + 7, TPRI_MINTASK + 3, TPRI_MINTASK + 10, };
const UINT8 tinib_maxact[TNUM_TASK] = { (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, (1) - 1, };
const AppModeType tinib_autoact[TNUM_TASK] = { 0x00000001, 0x00000001, 0x00000001, 0x00000001, 0x00000001, 0x00000000, 0x00000001, };
const FP tinib_task[TNUM_TASK] = { TASKNAME( Display_Task ), TASKNAME( TASK_BT_INTERFACE_READER ), TASKNAME( TASK_BT_INTERFACE_WRITER ), TASKNAME( BT_IMPLIZIT_SLAVE ), TASKNAME( BT_IMPLIZIT_SLAVE2 ), TASKNAME( Input ), TASKNAME( InitHook ), };
const __STK_UNIT tinib_stk[TNUM_TASK] = { (__STK_UNIT)_stack_Display_Task, (__STK_UNIT)_stack_TASK_BT_INTERFACE_READER, (__STK_UNIT)_stack_TASK_BT_INTERFACE_WRITER, (__STK_UNIT)_stack_BT_IMPLIZIT_SLAVE, (__STK_UNIT)_stack_BT_IMPLIZIT_SLAVE2, (__STK_UNIT)_stack_Input, (__STK_UNIT)_stack_InitHook, };
const UINT16 tinib_stksz[TNUM_TASK] = { 512, 512, 512, 512, 512, 512, 512, };

TaskType tcb_next[TNUM_TASK];
UINT8 tcb_tstat[TNUM_TASK];
Priority tcb_curpri[TNUM_TASK];
UINT8 tcb_actcnt[TNUM_TASK];
EventMaskType tcb_curevt[TNUM_EXTTASK];
EventMaskType tcb_waievt[TNUM_EXTTASK];
ResourceType tcb_lastres[TNUM_TASK];
DEFINE_CTXB(TNUM_TASK);

 /****** Object COUNTER ******/

const CounterType C_Input_Alarm = 0;

const TickType cntinib_maxval[TNUM_COUNTER] = { 100, };
const TickType cntinib_maxval2[TNUM_COUNTER] = { 201, };
const TickType cntinib_tickbase[TNUM_COUNTER] = { 1, };
const TickType cntinib_mincyc[TNUM_COUNTER] = { 1, };

AlarmType cntcb_almque[TNUM_COUNTER];
TickType cntcb_curval[TNUM_COUNTER];

 /****** Object ALARM ******/

const AlarmType Input_Alarm = 0;

DeclareTask(Input);
static void _activate_alarm_Input_Alarm( void );
static void _activate_alarm_Input_Alarm( void )
{ (void)ActivateTask( Input ); }

const CounterType alminib_cntid[TNUM_ALARM] = { 0, };
const FP alminib_cback[TNUM_ALARM] = { _activate_alarm_Input_Alarm, };
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
const EventMaskType RTE_DisplayOutput_Manager_GetValue_Event_In_EVENT = (1UL << 2);
const EventMaskType RTE_Manager_Input_GetValue_Event_In_EVENT = (1UL << 3);
const EventMaskType BT_IMPLIZIT_SLAVE2_EVENT = (1UL << 4);

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
 *  ��L���쌠�҂́C�ȉ��� (1)�`(4) �̏������CFree Software Foundation 
 *  �ɂ���Č��\����Ă��� GNU General Public License �� Version 2 �ɋL
 *  �q����Ă�������𖞂����ꍇ�Ɍ���C�{�\�t�g�E�F�A�i�{�\�t�g�E�F�A
 *  �����ς������̂��܂ށD�ȉ������j���g�p�E�����E���ρE�Ĕz�z�i�ȉ��C
 *  ���p�ƌĂԁj���邱�Ƃ𖳏��ŋ�������D
 *  (1) �{�\�t�g�E�F�A���\�[�X�R�[�h�̌`�ŗ��p����ꍇ�ɂ́C��L�̒���
 *      ���\���C���̗��p��������щ��L�̖��ۏ؋K�肪�C���̂܂܂̌`�Ń\�[
 *      �X�R�[�h���Ɋ܂܂�Ă��邱�ƁD
 *  (2) �{�\�t�g�E�F�A���C���C�u�����`���ȂǁC���̃\�t�g�E�F�A�J���Ɏg
 *      �p�ł���`�ōĔz�z����ꍇ�ɂ́C�Ĕz�z�ɔ����h�L�������g�i���p
 *      �҃}�j���A���Ȃǁj�ɁC��L�̒��쌠�\���C���̗��p��������щ��L
 *      �̖��ۏ؋K����f�ڂ��邱�ƁD
 *  (3) �{�\�t�g�E�F�A���C�@��ɑg�ݍ��ނȂǁC���̃\�t�g�E�F�A�J���Ɏg
 *      �p�ł��Ȃ��`�ōĔz�z����ꍇ�ɂ́C���̂����ꂩ�̏����𖞂�����
 *      �ƁD
 *    (a) �Ĕz�z�ɔ����h�L�������g�i���p�҃}�j���A���Ȃǁj�ɁC��L�̒�
 *        �쌠�\���C���̗��p��������щ��L�̖��ۏ؋K����f�ڂ��邱�ƁD
 *    (b) �Ĕz�z�̌`�Ԃ��C�ʂɒ�߂���@�ɂ���āCTOPPERS�v���W�F�N�g��
 *        �񍐂��邱�ƁD
 *  (4) �{�\�t�g�E�F�A�̗��p�ɂ�蒼�ړI�܂��͊ԐړI�ɐ����邢���Ȃ鑹
 *      �Q������C��L���쌠�҂����TOPPERS�v���W�F�N�g��Ɛӂ��邱�ƁD
 * 
 *  �{�\�t�g�E�F�A�́C���ۏ؂Œ񋟂���Ă�����̂ł���D��L���쌠�҂�
 *  ���TOPPERS�v���W�F�N�g�́C�{�\�t�g�E�F�A�Ɋւ��āC���̓K�p�\����
 *  �܂߂āC�����Ȃ�ۏ؂��s��Ȃ��D�܂��C�{�\�t�g�E�F�A�̗��p�ɂ�蒼
 *  �ړI�܂��͊ԐړI�ɐ����������Ȃ鑹�Q�Ɋւ��Ă��C���̐ӔC�𕉂�Ȃ��D
 * 
 */



