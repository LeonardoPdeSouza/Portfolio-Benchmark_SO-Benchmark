package br.com.senacrs.aplicativo.operacoes;

/**
 *
 * @author Leonardo Fabio
 */
public class TrataThread {

    public double retornaCalibracao;
    Runtime run = Runtime.getRuntime();
//    public final static String path = "c:\\scoreMuitoLouco.txt";
    public int numeroThread() {
        return run.availableProcessors();
    }

    public Calibracao threadCalibracao1,
            threadCalibracao2,
            threadCalibracao3,
            threadCalibracao4,
            threadCalibracao5,
            threadCalibracao6,
            threadCalibracao7,
            threadCalibracao8,
            threadCalibracao9,
            threadCalibracao10;

    public LacoPrincipal threadPrincipal1,
            threadPrincipal2,
            threadPrincipal3,
            threadPrincipal4,
            threadPrincipal5,
            threadPrincipal6,
            threadPrincipal7,
            threadPrincipal8,
            threadPrincipal9,
            threadPrincipal10;
    
    public Thread c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

    public Thread p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    public void carregaCalibracao() {

        switch (numeroThread()) {

            case 1:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                break;
            case 2:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                break;
            case 3:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                break;
            case 4:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                break;
            case 5:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                break;
            case 6:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao());
                c6.start();
                break;
            case 7:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao());
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao());
                c7.start();
            case 8:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao());
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao());
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao());
                c8.start();
                break;
            case 9:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao());
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao());
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao());
                c8.start();
                c9 = new Thread(threadCalibracao9 = new Calibracao());
                c9.start();
                break;
            case 10:
                c1 = new Thread(threadCalibracao1 = new Calibracao());
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao());
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao());
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao());
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao());
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao());
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao());
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao());
                c8.start();
                c9 = new Thread(threadCalibracao9 = new Calibracao());
                c9.start();
                c10 = new Thread(threadCalibracao10 = new Calibracao());
                c10.start();
                break;
        }

    }

    public double retornaCalibracao() {
        double tempo1,tempo2,tempo3,tempo4,tempo5,tempo6,tempo7,tempo8,tempo9,tempo10;

        switch (numeroThread()) {
            case 1:
                tempo1 = threadCalibracao1.lacoPrincipal;
                retornaCalibracao = (tempo1) / numeroThread();
                break;
            case 2:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2) / numeroThread();
                break;
            case 3:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3) / numeroThread();
                break;
            case 4:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4) / numeroThread();
                break;
            case 5:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5) / numeroThread();
                break;
            case 6:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6) / numeroThread();
                break;
            case 7:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7) / numeroThread();
                break;
            case 8:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8) / numeroThread();
                break;
            case 9:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9) / numeroThread();
                break;
            case 10:
                tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.lacoPrincipal;
                tempo10 = threadCalibracao10.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9 + tempo10) / numeroThread();
                break;
        }
        return retornaCalibracao;
    }

    public void carregaLacoPrincipal(double tempoCalibracao) {

        switch (numeroThread()) {
            
            case 1:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                break;
            case 2:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                break;
            case 3:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                break;
            case 4:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                break;
            case 5:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                break;
            case 6:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao));
                p6.start();
                break;
            case 7:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao));
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao));
                p7.start();
                break;
            case 8:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao));
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao));
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao));
                p8.start();
                break;
            case 9:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao));
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao));
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao));
                p8.start();
                p9 = new Thread(threadPrincipal9 = new LacoPrincipal(tempoCalibracao));
                p9.start();
                break;
            case 10:
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao));
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao));
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao));
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao));
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao));
                p8.start();
                p9 = new Thread(threadPrincipal9 = new LacoPrincipal(tempoCalibracao));
                p9.start();
                p10 = new Thread(threadPrincipal10 = new LacoPrincipal(tempoCalibracao));
                p10.start();
                break;
        }

    }
    
    public double pontuacao() {
        
        double pontuacao = 0,
                pontuacao1,
                pontuacao2,
                pontuacao3,
                pontuacao4,
                pontuacao5,
                pontuacao6,
                pontuacao7,
                pontuacao8,
                pontuacao9,
                pontuacao10,
                pontuacaoFinal;
////while(numeroThread() == run.availableProcessors()){ 
        switch (numeroThread()) {

            case 1:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao = pontuacao1;
                break;
            case 2:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao = pontuacao1 + pontuacao2;
                break;
            case 3:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3;
                break;
            case 4:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4;
                break;
            case 5:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5;
                break;
            case 6:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6;
                break;
            case 7:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7;
                break;
            case 8:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8;
                break;
            case 9:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9;
                break;
            case 10:
                pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao10 = threadPrincipal10.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10;
                break;
        }
//}///////
        pontuacaoFinal = pontuacao/1000;
//            writeRank(); //*****************************************
        return pontuacaoFinal;
        
    }

}
