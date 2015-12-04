package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe TrataThread
 *
 * @author Leonardo Fabio
 */
public class TrataThread {

    public double retornaCalibracao; //Variável double retornaCalibracao
    Runtime run = Runtime.getRuntime(); //Runtime run = Runtime.getRuntime()

    /**
     * Método inteiro numeroThread
     *
     * @return
     */
    public int numeroThread() {
        return run.availableProcessors(); //Retorna run.availableProcessors()
    }

    public Calibracao threadCalibracao1; //Variável Calibracao threadCalibracao1
    public Calibracao threadCalibracao2; //Variável Calibracao threadCalibracao2
    public Calibracao threadCalibracao3; //Variável Calibracao threadCalibracao3
    public Calibracao threadCalibracao4; //Variável Calibracao threadCalibracao4
    public Calibracao threadCalibracao5; //Variável Calibracao threadCalibracao5
    public Calibracao threadCalibracao6; //Variável Calibracao threadCalibracao6
    public Calibracao threadCalibracao7; //Variável Calibracao threadCalibracao7
    public Calibracao threadCalibracao8; //Variável Calibracao threadCalibracao8
    public Calibracao threadCalibracao9; //Variável Calibracao threadCalibracao9
    public Calibracao threadCalibracao10; //VariávelCalibracao threadCalibracao10

    public LacoPrincipal threadPrincipal1;//Variável LacoPrincipal threadPrincipal1
    public LacoPrincipal threadPrincipal2;//Variável LacoPrincipal threadPrincipal2       
    public LacoPrincipal threadPrincipal3;//Variável LacoPrincipal threadPrincipal3
    public LacoPrincipal threadPrincipal4;//Variável LacoPrincipal threadPrincipal4
    public LacoPrincipal threadPrincipal5;//Variável LacoPrincipal threadPrincipal5
    public LacoPrincipal threadPrincipal6;//Variável LacoPrincipal threadPrincipal6
    public LacoPrincipal threadPrincipal7;//Variável LacoPrincipal threadPrincipal7
    public LacoPrincipal threadPrincipal8;//Variável LacoPrincipal threadPrincipal8
    public LacoPrincipal threadPrincipal9;//Variável LacoPrincipal threadPrincipal9
    public LacoPrincipal threadPrincipal10;//Variável LacoPrincipal threadPrincipal10

    public Thread c1; //Variável Thread c1
    public Thread c2; //Variável Thread c2
    public Thread c3; //Variável Thread c3
    public Thread c4; //Variável Thread c4
    public Thread c5; //Variável Thread c5
    public Thread c6; //Variável Thread c6
    public Thread c7; //Variável Thread c7
    public Thread c8; //Variável Thread c8
    public Thread c9; //Variável Thread c9
    public Thread c10; //Variável Thread c10 

    public Thread p1; //Variável Thread p1
    public Thread p2; //Variável Thread p2
    public Thread p3; //Variável Thread p3
    public Thread p4; //Variável Thread p4 
    public Thread p5; //Variável Thread p5 
    public Thread p6; //Variável Thread p6 
    public Thread p7; //Variável Thread p7
    public Thread p8; //Variável Thread p8 
    public Thread p9; //Variável Thread p9 
    public Thread p10; //Variável Thread p10 

    /**
     * Método carregaCalibracao
     */
    public void carregaCalibracao() {

        switch (numeroThread()) { //Enquanto numertoThread

            case 1: //Caso igual 1 starta 1
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                break;
            case 2: //Caso igual 2 starta 2
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                break;
            case 3: //Caso igual 3 starta 3
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                break;
            case 4: //Caso igual 4 starta 4
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                break;
            case 5: //Caso igual 5 starta 5 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibraca05 = new Calibracao())
                c5.start();
                break;
            case 6: //Caso igual 6 starta 6 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibracao5 = new Calibracao())
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao()); // c6 = new Thread(threadCalibracao6 = new Calibracao())
                c6.start();
                break;
            case 7: //Caso igual 7 starta 7 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibracao5 = new Calibracao())
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao()); // c6 = new Thread(threadCalibracao6 = new Calibracao())
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao()); // c7 = new Thread(threadCalibracao7 = new Calibracao())
                c7.start();
            case 8: //Caso igual 8 starta 8 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibracao5 = new Calibracao())
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao()); // c6 = new Thread(threadCalibracao6 = new Calibracao())
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao()); // c7 = new Thread(threadCalibracao7 = new Calibracao())
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao()); // c8 = new Thread(threadCalibracao8 = new Calibracao())
                c8.start();
                break;
            case 9: //Caso igual 9 starta 9 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibracao5 = new Calibracao())
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao()); // c6 = new Thread(threadCalibracao6 = new Calibracao())
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao()); // c7 = new Thread(threadCalibracao7 = new Calibracao())
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao()); // c8 = new Thread(threadCalibracao8 = new Calibracao())
                c8.start();
                c9 = new Thread(threadCalibracao9 = new Calibracao()); // c9 = new Thread(threadCalibracao9 = new Calibracao())
                c9.start();
                break;
            case 10: //Caso igual 10 starta 10 thread
                c1 = new Thread(threadCalibracao1 = new Calibracao()); // c1 = new Thread(threadCalibracao1 = new Calibracao())
                c1.start();
                c2 = new Thread(threadCalibracao2 = new Calibracao()); // c2 = new Thread(threadCalibracao2 = new Calibracao())
                c2.start();
                c3 = new Thread(threadCalibracao3 = new Calibracao()); // c3 = new Thread(threadCalibracao3 = new Calibracao())
                c3.start();
                c4 = new Thread(threadCalibracao4 = new Calibracao()); // c4 = new Thread(threadCalibracao4 = new Calibracao())
                c4.start();
                c5 = new Thread(threadCalibracao5 = new Calibracao()); // c5 = new Thread(threadCalibracao5 = new Calibracao())
                c5.start();
                c6 = new Thread(threadCalibracao6 = new Calibracao()); // c6 = new Thread(threadCalibracao6 = new Calibracao())
                c6.start();
                c7 = new Thread(threadCalibracao7 = new Calibracao()); // c7 = new Thread(threadCalibracao7 = new Calibracao())
                c7.start();
                c8 = new Thread(threadCalibracao8 = new Calibracao()); // c8 = new Thread(threadCalibracao8 = new Calibracao())
                c8.start();
                c9 = new Thread(threadCalibracao9 = new Calibracao()); // c9 = new Thread(threadCalibracao9 = new Calibracao())
                c9.start();
                c10 = new Thread(threadCalibracao10 = new Calibracao()); // c10 = new Thread(threadCalibracao10 = new Calibracao())
                c10.start();
                break;
        }

    }

    /**
     * Método public double retornaCalibracao;
     *
     * @return a calibração.
     */
    public double retornaCalibracao() {
        double tempo1; // Variável double tempo1
        double tempo2; // Variável double tempo2
        double tempo3; // Variável double tempo3
        double tempo4; // Variável double tempo4
        double tempo5; // Variável double tempo5
        double tempo6; // Variável double tempo6
        double tempo7; // Variável double tempo7
        double tempo8; // Variável double tempo8
        double tempo9; // Variável double tempo9
        double tempo10; // Variável double tempo10

        switch (numeroThread()) { //Enquanto numeroThread
            case 1: // Caso 1 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                retornaCalibracao = (tempo1) / numeroThread(); //retornaClibracao = tempo1/ numeroThread();
                break;
            case 2: // Caso 2 thread 
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal; // tempo2 = threadCalibracao2.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2) / numeroThread(); //retornaClibracao = tempo1 + tempo2/ numeroThread();
                break;
            case 3: // Caso 3 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal; // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal; // tempo3 = threadCalibracao3.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3/ numeroThread();
                break;
            case 4: //Caso 4 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal; // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal; // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal; // tempo4 = threadCalibracao4.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4/ numeroThread();
                break;
            case 5: // Caso 5 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal; // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal; // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal; // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal; // tempo5 = threadCalibracao5.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5/ numeroThread();
                break;
            case 6: // Caso 6 thread
                tempo1 = threadCalibracao1.lacoPrincipal;  // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;  // tempo6 = threadCalibracao6.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6) / numeroThread();  //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6/ numeroThread();
                break;
            case 7: // Caso 7 thread
                tempo1 = threadCalibracao1.lacoPrincipal;  // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;  // tempo7 = threadCalibracao7.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7/ numeroThread();
                break;
            case 8: // caso 8 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;  // tempo8 = threadCalibracao8.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8/ numeroThread();
                break;
            case 9: // Caso 9 thread
                tempo1 = threadCalibracao1.lacoPrincipal; // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;  // tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.lacoPrincipal;  // tempo9 = threadCalibracao9.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9/ numeroThread();
                break;
            case 10: //Caso 10 thread
                tempo1 = threadCalibracao1.lacoPrincipal;    // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.lacoPrincipal;  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.lacoPrincipal;  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.lacoPrincipal;  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.lacoPrincipal;  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.lacoPrincipal;  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.lacoPrincipal;  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.lacoPrincipal;  // tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.lacoPrincipal;  // tempo9 = threadCalibracao9.lacoPrincipal;
                tempo10 = threadCalibracao10.lacoPrincipal;// tempo10 = threadCalibracao10.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9 + tempo10) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9 + tempo10/ numeroThread();
                break;
        }
        return retornaCalibracao; // retorna retornaCalibracao
    }

    /**
     * Método void carregaLacoPrincipal
     *
     * @param tempoCalibracao
     */
    public void carregaLacoPrincipal(double tempoCalibracao) {

        switch (numeroThread()) { //Enquanto numeroThread

            case 1: // Caso 1
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                break;
            case 2: // Caso 2
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                break;
            case 3: // Caso 3
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                break;
            case 4: //Caso 4
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                break;
            case 5: //Caso 5 
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));  //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao));  //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao));  //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                break;
            case 6: // Caso 6
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao)); //p6 instacia a ThreadPrincipal6
                p6.start();
                break;
            case 7: //Caso 7
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao)); //p6 instacia a ThreadPrincipal6
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao)); //p7 instacia a ThreadPrincipal7
                p7.start();
                break;
            case 8: // Caso 8
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao)); //p6 instacia a ThreadPrincipal6
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao)); //p7 instacia a ThreadPrincipal7
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao)); //p8 instacia a ThreadPrincipal8
                p8.start();
                break;
            case 9: // Caso 9
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao)); //p6 instacia a ThreadPrincipal6
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao)); //p7 instacia a ThreadPrincipal7
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao)); //p8 instacia a ThreadPrincipal8
                p8.start();
                p9 = new Thread(threadPrincipal9 = new LacoPrincipal(tempoCalibracao)); //p9 instacia a ThreadPrincipal9
                p9.start();
                break;
            case 10: // Caso 10
                p1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                p1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                p5 = new Thread(threadPrincipal5 = new LacoPrincipal(tempoCalibracao)); //p5 instacia a ThreadPrincipal5
                p5.start();
                p6 = new Thread(threadPrincipal6 = new LacoPrincipal(tempoCalibracao)); //p6 instacia a ThreadPrincipal6
                p6.start();
                p7 = new Thread(threadPrincipal7 = new LacoPrincipal(tempoCalibracao)); //p7 instacia a ThreadPrincipal7
                p7.start();
                p8 = new Thread(threadPrincipal8 = new LacoPrincipal(tempoCalibracao)); //p8 instacia a ThreadPrincipal8
                p8.start();
                p9 = new Thread(threadPrincipal9 = new LacoPrincipal(tempoCalibracao)); //p9 instacia a ThreadPrincipal9
                p9.start();
                p10 = new Thread(threadPrincipal10 = new LacoPrincipal(tempoCalibracao)); //p10 instacia a ThreadPrincipal10
                p10.start();
                break;
        }

    }

    /**
     * Método double pontuacao
     *
     * @return pontuacao
     */
    public double pontuacao() {

        double pontuacao = 0; // variável double pontuacao = 0 
        double pontuacao1;    // variável double pontuacao1 
        double pontuacao2;    // variável double pontuacao2
        double pontuacao3;    // variável double pontuacao3
        double pontuacao4;    // variável double pontuacao4
        double pontuacao5;    // variável double pontuacao5
        double pontuacao6;    // variável double pontuacao6
        double pontuacao7;    // variável double pontuacao7
        double pontuacao8;   // variável double pontuacao8
        double pontuacao9;   // variável double pontuacao9
        double pontuacao10;  // variável double pontuacao10
        double pontuacaoFinal; // variável double pontuacaoFinal

        switch (numeroThread()) { //Enquanto numeroThread

            case 1: // Caso 1 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao = pontuacao1; //pontuacao = pontuacao1
                break;
            case 2: // Caso 2 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao = pontuacao1 + pontuacao2; //pontuacao = pontuacao1 + pontuacao2
                break;
            case 3: // Caso 3 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3
                break;
            case 4: // Caso 4 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4
                break;
            case 5: // Caso 5 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5
                break;
            case 6: // Caso 6 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao; //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6
                break;
            case 7: //Caso 7 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao; //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao; //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7
                break;
            case 8: // Caso 8
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao; //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao; //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao; //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8
                break;
            case 9: // Caso 9 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao; //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao; //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao; //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.pontuacao; //pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9
                break;
            case 10: // Caso 10 thread
                pontuacao1 = threadPrincipal1.pontuacao; //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.pontuacao; //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.pontuacao; //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.pontuacao; //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.pontuacao; //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.pontuacao; //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.pontuacao; //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.pontuacao; //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.pontuacao; //pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao10 = threadPrincipal10.pontuacao; //pontuacao10 = threadPrincipal10.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10
                break;
        }

        pontuacaoFinal = pontuacao / 1000; // pontuacaoFinal = pontuacao/1000

        return pontuacaoFinal; //retorna a pontuacaoFinal

    }
    
    public void finalizaLacoPrincipal() {
        switch (numeroThread()) {
            case 1:
                p1.interrupt();
                break;
            case 2:
                p1.interrupt();
                p2.interrupt();
                break;
            case 3:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                break;
            case 4:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                break;
            case 5:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                break;
            case 6:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                break;
            case 7:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                break;
            case 8:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                p8.interrupt();
                break;
            case 9:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                p8.interrupt();
                p9.interrupt();
                break;
            case 10:
                p1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                p8.interrupt();
                p9.interrupt();
                p10.interrupt();
                break;
        }
    }

}
