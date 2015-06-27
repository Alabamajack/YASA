/**
 */
package shootingmachineemfmodel.tests;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import shootingmachineemfmodel.HWExtern;
import shootingmachineemfmodel.HWIntern;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.ToplevelSystem;
//import shootingmachineemfmodel.util.ShootingmachineemfmodelResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>shootingmachineemfmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShootingmachineemfmodelExample {
    /*
     * HASHES VORBEREITEN:
     */
    static Map<String, String> RunnablesToTask = new HashMap<String, String>();
    static Map<String, String> EventPort = new HashMap<String, String>();
    static Map<String, String> PortRunnable = new HashMap<String, String>();
    static Map<String, Integer> PortToID = new HashMap<String, Integer>();
    static Map<String, Integer> TaskBrick = new HashMap<String, Integer>();
    static Map<Integer, String> IDToPort = new HashMap<Integer, String>();

    //Funktion um Runnablecode aus angegebenem Pfad einlesen und als String zurueckgeben
    public static String copyFiletoString(String input)
    {
        String runnablecode = "";
        File file = new File(input);

        if (!file.canRead() || !file.isFile())
        {
            System.out.print("Error: Datei " + input + " konnte nicht gefunden werden!!\n");
            System.exit(0);
        }

            BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(input));
            String zeile = null;
            while ((zeile = in.readLine()) != null)
            {
                runnablecode = runnablecode + zeile + "\n";
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (in != null)
                try
                {
                    in.close();
                }
                catch (IOException e)
                {

                }
        }
        System.out.print("\t\tDatei " + input + " eingelesen\n");

        return runnablecode;
    }

    //Funktion um Ordner rekursiv mit evtl. Unterordnern und Dateien zu loeschen
    public static void deleteDir(File path)
    {
        for (File files : path.listFiles())
        {
            if (files.isDirectory())
                deleteDir(files);
            files.delete();
        }
            path.delete();
    }

    public static List<String> generateOilFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {

        System.out.print("\tDatei " + Brickname + ".oil erstellt.\n");
        List<String> retlist = new ArrayList<String>();
        String oilFileBeginn = "";
        String oilFileTask = "";
        String oilFileInitHook = "";
        String oilFileBTInterface = "";
        String oilFileBTImplizit = "";
        String oilFileAlarm = "";
        String oilFileCounter = "";
        String oilFileEvent = "";
        String oilFileBTEvents = "";

        //Anfang hardcoded
        oilFileBeginn = "#include \"implementation.oil\"\n\n"
                + "CPU ATMEL_AT91SAM7S256\n"
                + "{\n"
                + "\tOS LEJOS_OSEK\n"
                + "\t{\n"
                + "\t\tSTATUS = EXTENDED;\n"
                + "\t\tSTARTUPHOOK = FALSE;\n"
                + "\t\tERRORHOOK = FALSE;\n"
                + "\t\tSHUTDOWNHOOK = FALSE;\n"
                + "\t\tPRETASKHOOK = FALSE;\n"
                + "\t\tPOSTTASKHOOK = FALSE;\n"
                + "\t\tUSEGETSERVICEID = FALSE;\n"
                + "\t\tUSEPARAMETERACCESS = FALSE;\n"
                + "\t\tUSERESSCHEDULER = FALSE;\n"
                + "\t};\n\n"
                + "\tAPPMODE LEGOSAR{};\n\n";

        //for schleife fuer Task sektion
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            shootingmachineemfmodel.Task actualTask = mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j);
            oilFileTask = "\tTASK " + actualTask.getName() + "\n"
                    + "\t{\n";
            //Wenn AUTOSTART true ist:
            if (actualTask.isAUTOSTART() == true)
            {
                oilFileTask = oilFileTask + "\t\tAUTOSTART = TRUE\n"
                        + "\t\t{\n"
                        + "\t\t\tAPPMODE = LEGOSAR;\n"
                        + "\t\t};\n";
            }
            //AUTOSTART false
            else
            {
                oilFileTask = oilFileTask + "\t\tAUTOSTART = FALSE;\n";
            }
            oilFileTask = oilFileTask + "\t\tPRIORITY = " + actualTask.getPRIORITY() + ";\n"
                    + "\t\tACIVATION = " + actualTask.getACTIVATION() + ";\n"
                    + "\t\tSCHEDULE = FULL;\n"
                    + "\t\tSTACKSIZE = 512;\n";

            System.out.print("\t\tTASK " + actualTask.getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            oilFileInitHook = "\tTASK InitHook\n"
                    +"\t{\n"
                    +"\t\tAUTOSTART = TRUE\n"
                    +"\t\t{\n"
                    +"\t\t\tAPPMODE = LEGOSAR;\n"
                    +"\t\t};\n"
                    +"\t\tPRIORITY = 10;\n"
                    +"\t\tACTIVATION = 1\n"
                    +"\t\tSCHEDULE = FULL\n"
                    +"\t\tSTACKSIZE = 512\n"
                    +"\t};\n\n";

            System.out.print("\t\tImpliziten Task InitHook hinzugefuegt.\n");

            oilFileBTInterface = "\tTASK TASK_BT_INTERFACE_READER\n"
                    + "\t{\n"
                    +"\t\tAUTOSTART = TRUE\n"
                    +"\t\t{\n"
                    +"\t\t\tAPPMODE = LEGOSAR;\n"
                    +"\t\t};\n"
                    +"\t\tPRIORITY = 7;\n"
                    +"\t\tACTIVATION = 1\n"
                    +"\t\tSCHEDULE = FULL\n"
                    +"\t\tSTACKSIZE = 512\n"
                    +"\t\tEVENT = BT_HAS_RECEIVED_PACKAGE;\n"
                    +"\t};\n\n"
                    +"\tTASK TASK_BT_INTERFACE_WRITER\n"
                    + "\t{\n"
                    +"\t\tAUTOSTART = TRUE\n"
                    +"\t\t{\n"
                    +"\t\t\tAPPMODE = LEGOSAR;\n"
                    +"\t\t};\n"
                    +"\t\tPRIORITY = 7;\n"
                    +"\t\tACTIVATION = 1\n"
                    +"\t\tSCHEDULE = FULL\n"
                    +"\t\tSTACKSIZE = 512\n"
                    +"\t};\n\n";

            System.out.print("\t\tTasks fuer Com-Service hinzugefuegt\n");

            if (mySystem.getHasBrick().get(Brickindex).isIsMaster())
            {
                oilFileBTImplizit = "\tTASK BT_IMPLIZIT_MASTER\n";
                System.out.print("\t\tBT_MASTER hinzugefuegt.\n");
            }
            else
            {
                oilFileBTImplizit = "\tTASK BT_IMPLIZIT_SLAVE\n";
                System.out.print("\t\tBT_SLAVE hinzugefuegt\n");
            }
            oilFileBTImplizit += "\t{\n"
                    +"\t\tAUTOSTART = TRUE\n"
                    +"\t\t{\n"
                    +"\t\t\tAPPMODE = LEGOSAR;\n"
                    +"\t\t};\n"
                    +"\t\tPRIORITY = 9;\n"
                    +"\t\tACTIVATION = 1\n"
                    +"\t\tSCHEDULE = FULL\n"
                    +"\t\tSTACKSIZE = 512\n"
                    +"\t\tEVENT = BT_SEND_MY_MESSAGE;\n"
                    +"\t};\n\n";


            //EVENTS die zu den TASKS gehoeren
            for(int k = 0; k < actualTask.getHasEvent().size(); k++)
            {
                oilFileTask = oilFileTask + "\t\tEVENT = " + actualTask.getHasEvent().get(k).getName() + ";\n";
            }
            oilFileTask = oilFileTask + "\t};\n\n";


            //for Schleife f r ALARME
            for(int k = 0; k < actualTask.getHasAlarm().size(); k++)
            {
                oilFileAlarm = "\tALARM " + actualTask.getHasAlarm().get(k).getName() + "\n"
                        + "\t{\n"
                        + "\t\tCOUNTER = " + actualTask.getHasAlarm().get(k).getName() + ";\n"
                        + "\t\tACTION = ACTIVATETASK\n"
                        + "\t\t{\n"
                        + "\t\t\tTASK = " + actualTask.getName() + ";\n"
                        + "\t\t};\n";
                //AUTOSTART ist true
                if(actualTask.getHasAlarm().get(k).isAUTOSTART() == true)
                {
                    oilFileAlarm = oilFileAlarm + "\t\tAUTOSTART = TRUE\n"
                            + "\t\t{\n"
                            + "\t\t\tALARMTIME = " + actualTask.getHasAlarm().get(k).getALARMTIME() + ";\n"
                            + "\t\t\tCYCLETIME = " + actualTask.getHasAlarm().get(k).getCYCLETIME() + ";\n"
                            + "\t\t\tAPPMODE = LEGOSAR;\n"
                            + "\t\t};\n";
                }
                //AUTOSTART ist false
                else
                {
                    oilFileAlarm = oilFileAlarm + "\t\tAUTOSTART = FALSE;\n";
                }
                oilFileAlarm = oilFileAlarm + "\t};\n\n";

                //pro ALARM 1 Counter erstellen
                oilFileCounter = "\tCOUNTER C_" + actualTask.getHasAlarm().get(k).getName() + "\n"
                        + "\t{\n"
                        + "\t\tMINCYCLE = " + actualTask.getHasAlarm().get(k).getMINCYCLE() + ";\n"
                        + "\t\tMAXALLOWEDVALUE = " + actualTask.getHasAlarm().get(k).getMAXALLOWEDVALUE() + ";\n"
                        + "\t\tTICKSPERBASE = " + actualTask.getHasAlarm().get(k).getTICKSPERBASE() + ";\n"
                        + "\t};\n\n";


                System.out.print("\t\tALARM " + actualTask.getHasAlarm().get(k).getName() + " und COUNTER C_"
                        + actualTask.getHasAlarm().get(k).getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");

            }


        }
        //for Schleife fuer EVENTS
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
            shootingmachineemfmodel.Event actualEvent = mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j);
            oilFileEvent = "\tEVENT " + actualEvent.getName() + "\n"
                    + "\t{\n"
                    + "\t\tMASK = AUTO;\n"
                    + "\t};\n\n";

            System.out.print("\t\tEVENT " + actualEvent.getName() + " in Datei " + Brickname +".oil hinzugefuegt\n");
        }

        //Events zu Com-Service und BT_IMPLIZIT_MASTER/SLAVE hinzufuegen
        oilFileBTEvents = "\tEVENT BT_HAS_RECEIVED_PACKAGE\n"
                +"\t{\n"
                +"\t\tMASK = AUTO;\n"
                +"\t};\n\n"
                +"\tEVENT BT_SEND_MY_MESSAGE\n"
                +"\t{\n"
                +"\t\tMASK = AUTO;\n"
                +"\t};\n\n";
        System.out.print("\t\tEvents BT_HAS_RECEIVED_PACKAGE & BT_SEND_MY_MESSAGE hinzugefuegt.\n");

        //for Schleife fuer implizite Events
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
            for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
            {
                oilFileEvent = "\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT\n"
                        + "\t{\n"
                        + "\t\tMASK = AUTO;\n"
                        + "\t};\n\n";
                System.out.print("\t\tImplizites Event " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erzeugt\n");
            }
        }


        retlist.add(oilFileBeginn);
        retlist.add(oilFileTask);
        retlist.add(oilFileInitHook);
        retlist.add(oilFileBTInterface);
        retlist.add(oilFileBTImplizit);
        retlist.add(oilFileAlarm);
        retlist.add(oilFileCounter);
        retlist.add(oilFileBTEvents);
        retlist.add(oilFileEvent);
        retlist.add("};");

        return retlist;
    }

    public static List<String> generatecFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
        System.out.print("\tDatei " + Brickname + ".c erstellt.\n");
        List<String> retlist = new ArrayList<String>();
        String cFileBeginn = "";
        String cFileDeclareInitHook = "";
        String cFileDeclareBTInterface = "";
        String cFileDeclareBTImplizit = "";
        String cFiledeclareBTEvents = "";
        String cFileDeclareTask = "";
        String cFileDeclareAlarm = "";
        String newline = "\n";
        String cFileDeclareEvent = "";
        String newline1 = "\n";
        String cFileRunnable = "";
        String cFileInitHook = "";
        String cFileBTInterface = "";
        String cFileBTImplizit = "";
        String cFileTask = "";



        cFileBeginn = "#include \"kernel.h\"\n"
                + "#include \"kernel_id.h\"\n"
                + "#include \"ecrobot_interface.h\"\n"
                + "#include \"ecrobot_bluetooth.h\"\n"
                + "#include \"YASA_generated_variables.h\"\n\n";


        cFileDeclareInitHook = "DeclareTask(InitHook);\n";
        cFileDeclareBTInterface = "DeclareTask(TASK_BT_INTERFACE_READER);\n"
                + "DeclareTask(TASK_BT_INTERFACE_WRITER);\n";

        if(mySystem.getHasBrick().get(Brickindex).isIsMaster())
        {
            cFileDeclareBTImplizit = "DeclareTask(BT_IMPLIZIT_MASTER);\n";
        }
        else
        {
            cFileDeclareBTImplizit = "DeclareTask(BT_IMPLIZIT_SLAVE);\n";
        }

        cFiledeclareBTEvents = "DeclareEvent(BT_HAS_RECEIVED_PACKAGE);\n"
                +"DeclareEvent(BT_SEND_MY_MESSAGE)\n";

        //For Schleife in welcher alle Tasks deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            cFileDeclareTask = "DeclareTask(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ");\n\n";


            //For Schleife in welcher alle Alarme mit den zugehoerigen Countern deklariert werden
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().size(); k++)
            {
                cFileDeclareAlarm = "DeclareAlarm(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n"
                        + "DeclareCounter(" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasAlarm().get(k).getName() + ");\n";
            }
        }

        //For Schleife in welcher alle Events deklariert werden
        for (int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasEventBrick().size(); j++)
        {
            cFileDeclareEvent = "DeclareEvent(" + mySystem.getHasBrick().get(Brickindex).getHasEventBrick().get(j).getName() + ");\n";
        }


        //For Schleife in welcher die Runnables deklariert werden
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
            {
                cFileRunnable = "//" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "\n"
                        + "void " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "()\n"
                        + "{\n"
                        + copyFiletoString(mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getApplicationcode())
                        + "\n}\n\n";
                System.out.print("\t\tRunnable " + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + " hinzugefuegt\n");
            }
        }

        cFileInitHook = "TASK(InitHook)\n"
                + "{\n";
        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().size(); j++)
        {
            try{
                shootingmachineemfmodel.HWIntern myinput =  (HWIntern) mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j);
                if(myinput.getType() == shootingmachineemfmodel.HWType.SONIC)
                {
                    cFileInitHook += "\tecrobot_init_sonar_sensor(NXT_PORT_S"+mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber()+");\n";
                    System.out.print("\t\tPort " + mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber() + " als Ultraschall initialisiert\n");
                }
            }catch (java.lang.ClassCastException e){

            }

            try{
                shootingmachineemfmodel.HWExtern myoutput = (HWExtern) mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j);
                cFileInitHook += "\ti2c_enable(NXT_PORT_S"+myoutput.getPinnumber()+");\n";
                System.out.print("\t\tI2C Expander an Port " + mySystem.getHasBrick().get(Brickindex).getHasHWPortsBrick().get(j).getPortnumber() + " initialisiert.\n");
            }
            catch (java.lang.ClassCastException e)
            {
            }
        }
        cFileInitHook = cFileInitHook + "}\n\n";

        //BT Tasks hinzufuegen
        cFileBTInterface = copyFiletoString("..\\..\\..\\Code\\src\\BT_INTERFACE.c") + "\n";

        System.out.print("\t\tBT_INTERFACE hinzugefuegt\n");


        if(mySystem.getHasBrick().get(Brickindex).isIsMaster())
        {
            cFileBTImplizit = copyFiletoString("..\\..\\..\\Code\\src\\BT_IMPLIZIT_MASTER.c") + "\n";
            System.out.print("\t\tBT_IMPLIZIT_MASTER hinzuegfuegt\n");
        }
        else
        {
            cFileBTImplizit = copyFiletoString("..\\..\\..\\Code\\src\\BT_IMPLIZIT_SLAVE.c") + "\n";
            System.out.print("\t\tBT_IMPLIZIT_SLAVE hinzuegfuegt\n");
        }


        for(int j = 0; j < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().size(); j++)
        {
            cFileTask = "TASK(" +  mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getName() + ")\n"
                    + "{\n"
                    + "\twhile(1)\n"
                    + "\t{\n";

            for(int k = 0; k < mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().size(); k++)
            {
                cFileTask = cFileTask + "\t\t" + mySystem.getHasBrick().get(Brickindex).getHasTaskBrick().get(j).getHasRunnable().get(k).getName() + "();\n";
            }
            cFileTask = cFileTask +  "\t}\n"
                    + "\tTerminateTask();\n"
                    + "}\n";
        }

        retlist.add(cFileBeginn);
        retlist.add(cFileDeclareInitHook);
        retlist.add(cFileDeclareBTInterface);
        retlist.add(cFileDeclareBTImplizit);
        retlist.add(cFiledeclareBTEvents);
        retlist.add(cFileDeclareTask);
        retlist.add(cFileDeclareAlarm);
        retlist.add(newline);
        retlist.add(cFileDeclareEvent);
        retlist.add(newline1);
        retlist.add(cFileRunnable);
        retlist.add(cFileInitHook);
        retlist.add(cFileBTInterface);
        retlist.add(cFileBTImplizit);
        retlist.add(cFileTask);


        return retlist;
    }

    public static List<String> generatedynamiccFile(ToplevelSystem mySystem, int Brickindex, String Brickname) throws IOException
    {
        System.out.print("\tDatei YASA_generated.c erstellt.\n");
        List <String> retlist = new ArrayList<String>();
        String genc = "";
        String mySenderrtefunc = "";
        String myReceiverrtefun = "";


        // Sender-Receiver Ports
        //Pro SenderReceiverConnection ein Event und eine globale Variable erstellen
        for (int j = 0; j < mySystem.getHasConnections().size(); j++)
        {
            for(int k = 0; k < mySystem.getHasConnections().get(j).getHasReceiverPorts().size();k++)
            {
                genc = "DeclareEvent(" + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT);\n";
                genc = genc + "U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] = {0};\n";
                System.out.print("\t\tEVENT " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_EVENT erstellt.\n");
                System.out.print("\t\tVariable U8 " + mySystem.getHasConnections().get(j).getHasReceiverPorts().get(k).getName() + "_SPEICHER[MAX_MESSAGE_LENGHT] erstellt.\n");
            }
        }

...