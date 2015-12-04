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

    private Calibracao threadCalibracao1; //Variável Calibracao threadCalibracao1
    private Calibracao threadCalibracao2; //Variável Calibracao threadCalibracao2
    private Calibracao threadCalibracao3; //Variável Calibracao threadCalibracao3
    private Calibracao threadCalibracao4; //Variável Calibracao threadCalibracao4
    private Calibracao threadCalibracao5; //Variável Calibracao threadCalibracao5
    private Calibracao threadCalibracao6; //Variável Calibracao threadCalibracao6
    private Calibracao threadCalibracao7; //Variável Calibracao threadCalibracao7
    private Calibracao threadCalibracao8; //Variável Calibracao threadCalibracao8
    private Calibracao threadCalibracao9; //Variável Calibracao threadCalibracao9
    private Calibracao threadCalibracao10; //VariávelCalibracao threadCalibracao10

    private LacoPrincipal threadPrincipal1;//Variável LacoPrincipal threadPrincipal1
    private LacoPrincipal threadPrincipal2;//Variável LacoPrincipal threadPrincipal2       
    private LacoPrincipal threadPrincipal3;//Variável LacoPrincipal threadPrincipal3
    private LacoPrincipal threadPrincipal4;//Variável LacoPrincipal threadPrincipal4
    private LacoPrincipal threadPrincipal5;//Variável LacoPrincipal threadPrincipal5
    private LacoPrincipal threadPrincipal6;//Variável LacoPrincipal threadPrincipal6

    public Calibracao getThreadCalibracao1() {
        return threadCalibracao1;
    }

    public void setThreadCalibracao1(Calibracao threadCalibracao1) {
        this.threadCalibracao1 = threadCalibracao1;
    }

    public Calibracao getThreadCalibracao2() {
        return threadCalibracao2;
    }

    public void setThreadCalibracao2(Calibracao threadCalibracao2) {
        this.threadCalibracao2 = threadCalibracao2;
    }

    public Calibracao getThreadCalibracao3() {
        return threadCalibracao3;
    }

    public void setThreadCalibracao3(Calibracao threadCalibracao3) {
        this.threadCalibracao3 = threadCalibracao3;
    }

    public Calibracao getThreadCalibracao4() {
        return threadCalibracao4;
    }

    public void setThreadCalibracao4(Calibracao threadCalibracao4) {
        this.threadCalibracao4 = threadCalibracao4;
    }

    public Calibracao getThreadCalibracao5() {
        return threadCalibracao5;
    }

    public void setThreadCalibracao5(Calibracao threadCalibracao5) {
        this.threadCalibracao5 = threadCalibracao5;
    }

    public Calibracao getThreadCalibracao6() {
        return threadCalibracao6;
    }

    public void setThreadCalibracao6(Calibracao threadCalibracao6) {
        this.threadCalibracao6 = threadCalibracao6;
    }

    public Calibracao getThreadCalibracao7() {
        return threadCalibracao7;
    }

    public void setThreadCalibracao7(Calibracao threadCalibracao7) {
        this.threadCalibracao7 = threadCalibracao7;
    }

    public Calibracao getThreadCalibracao8() {
        return threadCalibracao8;
    }

    public void setThreadCalibracao8(Calibracao threadCalibracao8) {
        this.threadCalibracao8 = threadCalibracao8;
    }

    public Calibracao getThreadCalibracao9() {
        return threadCalibracao9;
    }

    public void setThreadCalibracao9(Calibracao threadCalibracao9) {
        this.threadCalibracao9 = threadCalibracao9;
    }

    public Calibracao getThreadCalibracao10() {
        return threadCalibracao10;
    }

    public void setThreadCalibracao10(Calibracao threadCalibracao10) {
        this.threadCalibracao10 = threadCalibracao10;
    }

    public LacoPrincipal getThreadPrincipal1() {
        return threadPrincipal1;
    }

    public void setThreadPrincipal1(LacoPrincipal threadPrincipal1) {
        this.threadPrincipal1 = threadPrincipal1;
    }

    public LacoPrincipal getThreadPrincipal2() {
        return threadPrincipal2;
    }

    public void setThreadPrincipal2(LacoPrincipal threadPrincipal2) {
        this.threadPrincipal2 = threadPrincipal2;
    }

    public LacoPrincipal getThreadPrincipal3() {
        return threadPrincipal3;
    }

    public void setThreadPrincipal3(LacoPrincipal threadPrincipal3) {
        this.threadPrincipal3 = threadPrincipal3;
    }

    public LacoPrincipal getThreadPrincipal4() {
        return threadPrincipal4;
    }

    public void setThreadPrincipal4(LacoPrincipal threadPrincipal4) {
        this.threadPrincipal4 = threadPrincipal4;
    }

    public LacoPrincipal getThreadPrincipal5() {
        return threadPrincipal5;
    }

    public void setThreadPrincipal5(LacoPrincipal threadPrincipal5) {
        this.threadPrincipal5 = threadPrincipal5;
    }

    public LacoPrincipal getThreadPrincipal6() {
        return threadPrincipal6;
    }

    public void setThreadPrincipal6(LacoPrincipal threadPrincipal6) {
        this.threadPrincipal6 = threadPrincipal6;
    }

    public LacoPrincipal getThreadPrincipal7() {
        return threadPrincipal7;
    }

    public void setThreadPrincipal7(LacoPrincipal threadPrincipal7) {
        this.threadPrincipal7 = threadPrincipal7;
    }

    public LacoPrincipal getThreadPrincipal8() {
        return threadPrincipal8;
    }

    public void setThreadPrincipal8(LacoPrincipal threadPrincipal8) {
        this.threadPrincipal8 = threadPrincipal8;
    }

    public LacoPrincipal getThreadPrincipal9() {
        return threadPrincipal9;
    }

    public void setThreadPrincipal9(LacoPrincipal threadPrincipal9) {
        this.threadPrincipal9 = threadPrincipal9;
    }

    public LacoPrincipal getThreadPrincipal10() {
        return threadPrincipal10;
    }

    public void setThreadPrincipal10(LacoPrincipal threadPrincipal10) {
        this.threadPrincipal10 = threadPrincipal10;
    }

    public Thread getC1() {
        return c1;
    }

    public void setC1(Thread c1) {
        this.c1 = c1;
    }

    public Thread getC2() {
        return c2;
    }

    public void setC2(Thread c2) {
        this.c2 = c2;
    }

    public Thread getC3() {
        return c3;
    }

    public void setC3(Thread c3) {
        this.c3 = c3;
    }

    public Thread getC4() {
        return c4;
    }

    public void setC4(Thread c4) {
        this.c4 = c4;
    }

    public Thread getC5() {
        return c5;
    }

    public void setC5(Thread c5) {
        this.c5 = c5;
    }

    public Thread getC6() {
        return c6;
    }

    public void setC6(Thread c6) {
        this.c6 = c6;
    }

    public Thread getC7() {
        return c7;
    }

    public void setC7(Thread c7) {
        this.c7 = c7;
    }

    public Thread getC8() {
        return c8;
    }

    public void setC8(Thread c8) {
        this.c8 = c8;
    }

    public Thread getC9() {
        return c9;
    }

    public void setC9(Thread c9) {
        this.c9 = c9;
    }

    public Thread getC10() {
        return c10;
    }

    public void setC10(Thread c10) {
        this.c10 = c10;
    }

    public Thread getP1() {
        return getP1;
    }

    public void setP1(Thread p1) {
        this.getP1 = p1;
    }

    public Thread getP2() {
        return p2;
    }

    public void setP2(Thread p2) {
        this.p2 = p2;
    }

    public Thread getP3() {
        return p3;
    }

    public void setP3(Thread p3) {
        this.p3 = p3;
    }

    public Thread getP4() {
        return p4;
    }

    public void setP4(Thread p4) {
        this.p4 = p4;
    }

    public Thread getP5() {
        return p5;
    }

    public void setP5(Thread p5) {
        this.p5 = p5;
    }

    public Thread getP6() {
        return p6;
    }

    public void setP6(Thread p6) {
        this.p6 = p6;
    }

    public Thread getP7() {
        return p7;
    }

    public void setP7(Thread p7) {
        this.p7 = p7;
    }

    public Thread getP8() {
        return p8;
    }

    public void setP8(Thread p8) {
        this.p8 = p8;
    }

    public Thread getP9() {
        return p9;
    }

    public void setP9(Thread p9) {
        this.p9 = p9;
    }

    public Thread getP10() {
        return p10;
    }

    public void setP10(Thread p10) {
        this.p10 = p10;
    }
    private LacoPrincipal threadPrincipal7;//Variável LacoPrincipal threadPrincipal7
    private LacoPrincipal threadPrincipal8;//Variável LacoPrincipal threadPrincipal8
    private LacoPrincipal threadPrincipal9;//Variável LacoPrincipal threadPrincipal9
    private LacoPrincipal threadPrincipal10;//Variável LacoPrincipal threadPrincipal10

    private Thread c1; //Variável Thread c1
    private Thread c2; //Variável Thread c2
    private Thread c3; //Variável Thread c3
    private Thread c4; //Variável Thread c4
    private Thread c5; //Variável Thread c5
    private Thread c6; //Variável Thread c6
    private Thread c7; //Variável Thread c7
    private Thread c8; //Variável Thread c8
    private Thread c9; //Variável Thread c9
    private Thread c10; //Variável Thread c10 

    private Thread getP1; //Variável Thread getP1
    private Thread p2; //Variável Thread p2
    private Thread p3; //Variável Thread p3
    private Thread p4; //Variável Thread p4 
    private Thread p5; //Variável Thread p5 
    private Thread p6; //Variável Thread p6 
    private Thread p7; //Variável Thread p7
    private Thread p8; //Variável Thread p8 
    private Thread p9; //Variável Thread p9 
    private Thread p10; //Variável Thread p10 
    

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
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                retornaCalibracao = (tempo1) / numeroThread(); //retornaClibracao = tempo1/ numeroThread();
                break;
            case 2: // Caso 2 thread 
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal(); // tempo2 = threadCalibracao2.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2) / numeroThread(); //retornaClibracao = tempo1 + tempo2/ numeroThread();
                break;
            case 3: // Caso 3 thread
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal(); // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal(); // tempo3 = threadCalibracao3.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3/ numeroThread();
                break;
            case 4: //Caso 4 thread
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal(); // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal(); // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal(); // tempo4 = threadCalibracao4.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4/ numeroThread();
                break;
            case 5: // Caso 5 thread
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal(); // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal(); // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal(); // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal(); // tempo5 = threadCalibracao5.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5/ numeroThread();
                break;
            case 6: // Caso 6 thread
                tempo1 = threadCalibracao1.getLacoPrincipal();  // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal();  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal();  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal();  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal();  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.getLacoPrincipal();  // tempo6 = threadCalibracao6.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6) / numeroThread();  //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6/ numeroThread();
                break;
            case 7: // Caso 7 thread
                tempo1 = threadCalibracao1.getLacoPrincipal();  // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal();  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal();  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal();  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal();  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.getLacoPrincipal();  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.getLacoPrincipal();  // tempo7 = threadCalibracao7.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7/ numeroThread();
                break;
            case 8: // caso 8 thread
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal();  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal();  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal();  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal();  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.getLacoPrincipal();  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.getLacoPrincipal();  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.getLacoPrincipal();  // tempo8 = threadCalibracao8.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8/ numeroThread();
                break;
            case 9: // Caso 9 thread
                tempo1 = threadCalibracao1.getLacoPrincipal(); // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal();  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal();  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal();  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal();  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.getLacoPrincipal();  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.getLacoPrincipal();  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.getLacoPrincipal();  // tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.getLacoPrincipal();  // tempo9 = threadCalibracao9.lacoPrincipal;
                retornaCalibracao = (tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9) / numeroThread(); //retornaClibracao = tempo1 + tempo2 + tempo3 + tempo4 + tempo5 + tempo6 + tempo7 + tempo8 + tempo9/ numeroThread();
                break;
            case 10: //Caso 10 thread
                tempo1 = threadCalibracao1.getLacoPrincipal();    // tempo1 = threadCalibracao1.lacoPrincipal;
                tempo2 = threadCalibracao2.getLacoPrincipal();  // tempo2 = threadCalibracao2.lacoPrincipal;
                tempo3 = threadCalibracao3.getLacoPrincipal();  // tempo3 = threadCalibracao3.lacoPrincipal;
                tempo4 = threadCalibracao4.getLacoPrincipal();  // tempo4 = threadCalibracao4.lacoPrincipal;
                tempo5 = threadCalibracao5.getLacoPrincipal();  // tempo5 = threadCalibracao5.lacoPrincipal;
                tempo6 = threadCalibracao6.getLacoPrincipal();  // tempo6 = threadCalibracao6.lacoPrincipal;
                tempo7 = threadCalibracao7.getLacoPrincipal();  // tempo7 = threadCalibracao7.lacoPrincipal;
                tempo8 = threadCalibracao8.getLacoPrincipal();  // tempo8 = threadCalibracao8.lacoPrincipal;
                tempo9 = threadCalibracao9.getLacoPrincipal();  // tempo9 = threadCalibracao9.lacoPrincipal;
                tempo10 = threadCalibracao10.getLacoPrincipal();// tempo10 = threadCalibracao10.lacoPrincipal;
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
                break;
            case 2: // Caso 2
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                break;
            case 3: // Caso 3
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                break;
            case 4: //Caso 4
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
                p2 = new Thread(threadPrincipal2 = new LacoPrincipal(tempoCalibracao)); //p2 instacia a ThreadPrincipal2
                p2.start();
                p3 = new Thread(threadPrincipal3 = new LacoPrincipal(tempoCalibracao)); //p3 instacia a ThreadPrincipal3
                p3.start();
                p4 = new Thread(threadPrincipal4 = new LacoPrincipal(tempoCalibracao)); //p4 instacia a ThreadPrincipal4
                p4.start();
                break;
            case 5: //Caso 5 
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao));  //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                getP1 = new Thread(threadPrincipal1 = new LacoPrincipal(tempoCalibracao)); //p1 instacia a ThreadPrincipal1
                getP1.start();
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
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao = pontuacao1; //pontuacao = pontuacao1
                break;
            case 2: // Caso 2 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao = pontuacao1 + pontuacao2; //pontuacao = pontuacao1 + pontuacao2
                break;
            case 3: // Caso 3 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3
                break;
            case 4: // Caso 4 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4
                break;
            case 5: // Caso 5 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5
                break;
            case 6: // Caso 6 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.getPontuacao(); //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6
                break;
            case 7: //Caso 7 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.getPontuacao(); //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.getPontuacao(); //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7
                break;
            case 8: // Caso 8
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.getPontuacao(); //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.getPontuacao(); //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.getPontuacao(); //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8
                break;
            case 9: // Caso 9 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.getPontuacao(); //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.getPontuacao(); //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.getPontuacao(); //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.getPontuacao(); //pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9
                break;
            case 10: // Caso 10 thread
                pontuacao1 = threadPrincipal1.getPontuacao(); //pontuacao1 = threadPrincipal1.pontuacao;
                pontuacao2 = threadPrincipal2.getPontuacao(); //pontuacao2 = threadPrincipal2.pontuacao;
                pontuacao3 = threadPrincipal3.getPontuacao(); //pontuacao3 = threadPrincipal3.pontuacao;
                pontuacao4 = threadPrincipal4.getPontuacao(); //pontuacao4 = threadPrincipal4.pontuacao;
                pontuacao5 = threadPrincipal5.getPontuacao(); //pontuacao5 = threadPrincipal5.pontuacao;
                pontuacao6 = threadPrincipal6.getPontuacao(); //pontuacao6 = threadPrincipal6.pontuacao;
                pontuacao7 = threadPrincipal7.getPontuacao(); //pontuacao7 = threadPrincipal7.pontuacao;
                pontuacao8 = threadPrincipal8.getPontuacao(); //pontuacao8 = threadPrincipal8.pontuacao;
                pontuacao9 = threadPrincipal9.getPontuacao(); //pontuacao9 = threadPrincipal9.pontuacao;
                pontuacao10 = threadPrincipal10.getPontuacao(); //pontuacao10 = threadPrincipal10.pontuacao;
                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10; //pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8 + pontuacao9 + pontuacao10
                break;
        }

        pontuacaoFinal = pontuacao; // pontuacaoFinal

        return pontuacaoFinal; //retorna a pontuacaoFinal

    }
    
    public void finalizaLacoPrincipal() {
        switch (numeroThread()) {
            case 1:
                getP1.interrupt();
                break;
            case 2:
                getP1.interrupt();
                p2.interrupt();
                break;
            case 3:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                break;
            case 4:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                break;
            case 5:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                break;
            case 6:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                break;
            case 7:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                break;
            case 8:
                getP1.interrupt();
                p2.interrupt();
                p3.interrupt();
                p4.interrupt();
                p5.interrupt();
                p6.interrupt();
                p7.interrupt();
                p8.interrupt();
                break;
            case 9:
                getP1.interrupt();
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
                getP1.interrupt();
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
