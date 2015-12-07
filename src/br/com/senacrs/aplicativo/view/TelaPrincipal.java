package br.com.senacrs.aplicativo.view;

import br.com.senacrs.aplicativo.operacoes.Calibracao;
import br.com.senacrs.aplicativo.operacoes.TrataThread;
import br.com.senacrs.aplicativo.operacoes.LacoPrincipal;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe TelaPrincipal extends javax.swing.JFrame
 *
 * @author Leonardo P Souza
 */
public class TelaPrincipal extends javax.swing.JFrame {

    TrataThread carrega = new TrataThread(); //  Instancia a classe TrataThread
    Calibracao calibragem = new Calibracao(); // Instancia a classe Calibracao
    LacoPrincipal lacoPrincipal; // LacoPrincipal lacoPrincipal;

    Runtime run = Runtime.getRuntime(); // run = Runtime.getRuntime()
    int numeroProcessador = run.availableProcessors(); // Variável inteira 

    /**
     * Método int numeroThread
     *
     * @return
     */
    public int numeroThread() {
        return run.availableProcessors();
    }

    /**
     * Construtor da classe TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Método void atualizaLabel() - Das thread referentes ao laço de calibração
     */
    public void atualizaLabel() {

        switch (numeroThread()) { //Enquanto numeroThread

            case 1: //Caso 1
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                break;
            case 2: //Caso 2
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                break;
            case 3: //Caso 3
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                break;
            case 4: // Caso 4
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                break;
            case 5: // Caso 5
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                break;
            case 6: // Caso 6
                jLEstadoThread1.setText("" + carrega.getC1().getState()); // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                jLEstadoThread6.setText("" + carrega.getC6().getState()); // jLEstadoThread6.setText("" + carrega.c6.getState()); 
                break;
            case 7: // Caso 7
                jLEstadoThread1.setText("" + carrega.getC1().getState());  // jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                jLEstadoThread6.setText("" + carrega.getC6().getState()); // jLEstadoThread6.setText("" + carrega.c6.getState()); 
                jLEstadoThread7.setText("" + carrega.getC7().getState()); // jLEstadoThread7.setText("" + carrega.c7.getState()); 
                break;
            case 8: // Caso 8
                jLEstadoThread1.setText("" + carrega.getC1().getState());  //jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                jLEstadoThread6.setText("" + carrega.getC6().getState()); // jLEstadoThread6.setText("" + carrega.c6.getState()); 
                jLEstadoThread7.setText("" + carrega.getC7().getState()); // jLEstadoThread7.setText("" + carrega.c7.getState()); 
                jLEstadoThread8.setText("" + carrega.getC8().getState()); // jLEstadoThread8.setText("" + carrega.c8.getState()); 
                break;
            case 9: // Caso 9
                jLEstadoThread1.setText("" + carrega.getC1().getState());  //jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                jLEstadoThread6.setText("" + carrega.getC6().getState()); // jLEstadoThread6.setText("" + carrega.c6.getState()); 
                jLEstadoThread7.setText("" + carrega.getC7().getState()); // jLEstadoThread7.setText("" + carrega.c7.getState()); 
                jLEstadoThread8.setText("" + carrega.getC8().getState()); // jLEstadoThread8.setText("" + carrega.c8.getState()); 
                jLEstadoThread9.setText("" + carrega.getC9().getState()); // jLEstadoThread9.setText("" + carrega.c9.getState()); 
                break;
            case 10: // Caso 10
                jLEstadoThread1.setText("" + carrega.getC1().getState()); //jLEstadoThread1.setText("" + carrega.c1.getState()); 
                jLEstadoThread2.setText("" + carrega.getC2().getState()); // jLEstadoThread2.setText("" + carrega.c2.getState()); 
                jLEstadoThread3.setText("" + carrega.getC3().getState()); // jLEstadoThread3.setText("" + carrega.c3.getState()); 
                jLEstadoThread4.setText("" + carrega.getC4().getState()); // jLEstadoThread4.setText("" + carrega.c4.getState()); 
                jLEstadoThread5.setText("" + carrega.getC5().getState()); // jLEstadoThread5.setText("" + carrega.c5.getState()); 
                jLEstadoThread6.setText("" + carrega.getC6().getState()); // jLEstadoThread6.setText("" + carrega.c6.getState()); 
                jLEstadoThread7.setText("" + carrega.getC7().getState()); // jLEstadoThread7.setText("" + carrega.c7.getState()); 
                jLEstadoThread8.setText("" + carrega.getC8().getState()); // jLEstadoThread8.setText("" + carrega.c8.getState()); 
                jLEstadoThread9.setText("" + carrega.getC9().getState()); // jLEstadoThread9.setText("" + carrega.c9.getState());
                jLEstadoThread10.setText("" + carrega.getC10().getState());// jLEstadoThread10.setText("" + carrega.c10.getState());
                break;
        }

    }

    /**
     * Método void atualizaLabelPrincipal - Atualiza nome e estado das label do
     * Laço Principal
     *
     */
    public void atualizaLabelPrincipal() {
        switch (numeroThread()) { //Equanto numeroThread

            case 1: // Caso igual a 1
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                break;
            case 2: // Caso igual a 2
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                break;
            case 3: // Caso igual a 3
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                break;
            case 4: // Caso igual a 4
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                break;
            case 5: // Caso igual a 5
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                break;
            case 6: // Caso igual a 6
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                jLEstadoThreadPrincipal6.setText("" + carrega.getP6().getState()); //jLEstadoThreadStress6.setText("" + carrega.p6.getState());
                break;
            case 7: // Caso igual a 7
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                jLEstadoThreadPrincipal6.setText("" + carrega.getP6().getState()); //jLEstadoThreadStress6.setText("" + carrega.p6.getState());
                jLEstadoThreadPrincipal7.setText("" + carrega.getP7().getState()); //jLEstadoThreadStress7.setText("" + carrega.p7.getState());
                break;
            case 8: // Caso igual a 8
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                jLEstadoThreadPrincipal6.setText("" + carrega.getP6().getState()); //jLEstadoThreadStress6.setText("" + carrega.p6.getState());
                jLEstadoThreadPrincipal7.setText("" + carrega.getP7().getState()); //jLEstadoThreadStress7.setText("" + carrega.p7.getState());
                jLEstadoThreadPrincipal8.setText("" + carrega.getP8().getState()); //jLEstadoThreadStress8.setText("" + carrega.p8.getState());
                break;
            case 9: // Caso igual a 9
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                jLEstadoThreadPrincipal6.setText("" + carrega.getP6().getState()); //jLEstadoThreadStress6.setText("" + carrega.p6.getState());
                jLEstadoThreadPrincipal7.setText("" + carrega.getP7().getState()); //jLEstadoThreadStress7.setText("" + carrega.p7.getState());
                jLEstadoThreadPrincipal8.setText("" + carrega.getP8().getState()); //jLEstadoThreadStress8.setText("" + carrega.p8.getState());
                jLEstadoThreadPrincipal9.setText("" + carrega.getP9().getState()); //jLEstadoThreadStress9.setText("" + carrega.p9.getState());
                break;
            case 10: // Caso igual a 10
                jLEstadoThreadPrincipal1.setText("" + carrega.getP1().getState()); //jLEstadoThreadStress1.setText("" + carrega.p1.getState());
                jLEstadoThreadPrincipal2.setText("" + carrega.getP2().getState()); //jLEstadoThreadStress2.setText("" + carrega.p2.getState());
                jLEstadoThreadPrincipal3.setText("" + carrega.getP3().getState()); //jLEstadoThreadStress3.setText("" + carrega.p3.getState());
                jLEstadoThreadPrincipal4.setText("" + carrega.getP4().getState()); //jLEstadoThreadStress4.setText("" + carrega.p4.getState());
                jLEstadoThreadPrincipal5.setText("" + carrega.getP5().getState()); //jLEstadoThreadStress5.setText("" + carrega.p5.getState());
                jLEstadoThreadPrincipal6.setText("" + carrega.getP6().getState()); //jLEstadoThreadStress6.setText("" + carrega.p6.getState());
                jLEstadoThreadPrincipal7.setText("" + carrega.getP7().getState()); //jLEstadoThreadStress7.setText("" + carrega.p7.getState());
                jLEstadoThreadPrincipal8.setText("" + carrega.getP8().getState()); //jLEstadoThreadStress8.setText("" + carrega.p8.getState());
                jLEstadoThreadPrincipal9.setText("" + carrega.getP9().getState()); //jLEstadoThreadStress9.setText("" + carrega.p9.getState());
                jLEstadoThreadPrincipal10.setText("" + carrega.getP10().getState()); //jLEstadoThreadStress10.setText("" + carrega.p10.getState());
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLEstadoThread1 = new javax.swing.JLabel();
        jLEstadoThread2 = new javax.swing.JLabel();
        jLEstadoThread3 = new javax.swing.JLabel();
        jLEstadoThread4 = new javax.swing.JLabel();
        jLEstadoThread5 = new javax.swing.JLabel();
        jLEstadoThread6 = new javax.swing.JLabel();
        jLEstadoThread7 = new javax.swing.JLabel();
        jLEstadoThread8 = new javax.swing.JLabel();
        jLThread1 = new javax.swing.JLabel();
        jLThread2 = new javax.swing.JLabel();
        jLThread3 = new javax.swing.JLabel();
        jLThread4 = new javax.swing.JLabel();
        jLThread5 = new javax.swing.JLabel();
        jLThread6 = new javax.swing.JLabel();
        jLabelTituloCalibracao = new javax.swing.JLabel();
        jLThread7 = new javax.swing.JLabel();
        jLThread8 = new javax.swing.JLabel();
        jLThread9 = new javax.swing.JLabel();
        jLThread10 = new javax.swing.JLabel();
        jLabelTituloStress = new javax.swing.JLabel();
        lblPrincipal1 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal1 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal2 = new javax.swing.JLabel();
        lblPrincipal2 = new javax.swing.JLabel();
        lblPrincipal3 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal3 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal4 = new javax.swing.JLabel();
        lblPrincipal4 = new javax.swing.JLabel();
        lblPrincipal5 = new javax.swing.JLabel();
        lblPrincipal6 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal5 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal6 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal7 = new javax.swing.JLabel();
        lblPrincipal7 = new javax.swing.JLabel();
        lblPrincipal8 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal8 = new javax.swing.JLabel();
        jLEstadoThread9 = new javax.swing.JLabel();
        jLEstadoThread10 = new javax.swing.JLabel();
        lblPrincipal9 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal9 = new javax.swing.JLabel();
        lblPrincipal10 = new javax.swing.JLabel();
        jLEstadoThreadPrincipal10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        txtPontuacao = new javax.swing.JTextField();
        btnExecutar = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        bdpCalibragem = new javax.swing.JProgressBar();
        bdpPrincipal = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEstadoCalib = new javax.swing.JLabel();
        jLabelEstadoPrincipal = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BenchMark");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelTitulo.setText("BenchMark de Processador Multithread");

        jLEstadoThread1.setText("Parado");
        jLEstadoThread1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread2.setText("Parado");
        jLEstadoThread2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread3.setText("Parado");
        jLEstadoThread3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread4.setText("Parado");
        jLEstadoThread4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread5.setText("Parado");
        jLEstadoThread5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread6.setText("Parado");
        jLEstadoThread6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread7.setText("Parado");
        jLEstadoThread7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread8.setText("Parado");
        jLEstadoThread8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread1.setText("Thread 1:");
        jLThread1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread2.setText("Thread 2:");
        jLThread2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread3.setText("Thread 3:");
        jLThread3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread4.setText("Thread 4:");
        jLThread4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread5.setText("Thread 5:");
        jLThread5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread6.setText("Thread 6:");
        jLThread6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTituloCalibracao.setText("Estado Threads de Calibragem");
        jLabelTituloCalibracao.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread7.setText("Thread 7:");
        jLThread7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread8.setText("Thread 8:");
        jLThread8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread9.setText("Thread 9:");
        jLThread9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread10.setText("Thread 10:");
        jLThread10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTituloStress.setText("Estado Threads Laço Principal");
        jLabelTituloStress.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal1.setText("Thread 1:");
        lblPrincipal1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal1.setText("Parado");
        jLEstadoThreadPrincipal1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal2.setText("Parado");
        jLEstadoThreadPrincipal2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal2.setText("Thread 2:");
        lblPrincipal2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal3.setText("Thread 3:");
        lblPrincipal3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal3.setText("Parado");
        jLEstadoThreadPrincipal3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal4.setText("Parado");
        jLEstadoThreadPrincipal4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal4.setText("Thread 4:");
        lblPrincipal4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal5.setText("Thread 5:");
        lblPrincipal5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal6.setText("Thread 6:");
        lblPrincipal6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal5.setText("Parado");
        jLEstadoThreadPrincipal5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal6.setText("Parado");
        jLEstadoThreadPrincipal6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal7.setText("Parado");
        jLEstadoThreadPrincipal7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal7.setText("Thread 7:");
        lblPrincipal7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal8.setText("Thread 8:");
        lblPrincipal8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal8.setText("Parado");
        jLEstadoThreadPrincipal8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread9.setText("Parado");
        jLEstadoThread9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread10.setText("Parado");
        jLEstadoThread10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal9.setText("Thread 9:");
        lblPrincipal9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal9.setText("Parado");
        jLEstadoThreadPrincipal9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPrincipal10.setText("Thread 10:");
        lblPrincipal10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadPrincipal10.setText("Parado");
        jLEstadoThreadPrincipal10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloCalibracao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLThread1)
                            .addComponent(jLThread2)
                            .addComponent(jLThread3)
                            .addComponent(jLThread4)
                            .addComponent(jLThread5)
                            .addComponent(jLThread6)
                            .addComponent(jLThread7)
                            .addComponent(jLThread8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstadoThread8)
                            .addComponent(jLEstadoThread7)
                            .addComponent(jLEstadoThread6)
                            .addComponent(jLEstadoThread5)
                            .addComponent(jLEstadoThread4)
                            .addComponent(jLEstadoThread3)
                            .addComponent(jLEstadoThread2)
                            .addComponent(jLEstadoThread1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLThread9)
                            .addComponent(jLThread10))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLEstadoThread9)
                            .addComponent(jLEstadoThread10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloStress)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrincipal1)
                            .addComponent(lblPrincipal2)
                            .addComponent(lblPrincipal3)
                            .addComponent(lblPrincipal4)
                            .addComponent(lblPrincipal5)
                            .addComponent(lblPrincipal6)
                            .addComponent(lblPrincipal7)
                            .addComponent(lblPrincipal8)
                            .addComponent(lblPrincipal9)
                            .addComponent(lblPrincipal10))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstadoThreadPrincipal10)
                            .addComponent(jLEstadoThreadPrincipal9)
                            .addComponent(jLEstadoThreadPrincipal8)
                            .addComponent(jLEstadoThreadPrincipal7)
                            .addComponent(jLEstadoThreadPrincipal6)
                            .addComponent(jLEstadoThreadPrincipal5)
                            .addComponent(jLEstadoThreadPrincipal4)
                            .addComponent(jLEstadoThreadPrincipal3)
                            .addComponent(jLEstadoThreadPrincipal2)
                            .addComponent(jLEstadoThreadPrincipal1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTituloStress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal1)
                            .addComponent(jLEstadoThreadPrincipal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal2)
                            .addComponent(jLEstadoThreadPrincipal2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal3)
                            .addComponent(jLEstadoThreadPrincipal3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal4)
                            .addComponent(jLEstadoThreadPrincipal4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal5)
                            .addComponent(jLEstadoThreadPrincipal5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal6)
                            .addComponent(jLEstadoThreadPrincipal6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal7)
                            .addComponent(jLEstadoThreadPrincipal7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal8)
                            .addComponent(jLEstadoThreadPrincipal8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal9)
                            .addComponent(jLEstadoThreadPrincipal9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipal10)
                            .addComponent(jLEstadoThreadPrincipal10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTituloCalibracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread1)
                            .addComponent(jLEstadoThread1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread2)
                            .addComponent(jLEstadoThread2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread3)
                            .addComponent(jLEstadoThread3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread4)
                            .addComponent(jLEstadoThread4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread5)
                            .addComponent(jLEstadoThread5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread6)
                            .addComponent(jLEstadoThread6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread7)
                            .addComponent(jLEstadoThread7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread8)
                            .addComponent(jLEstadoThread8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread9)
                            .addComponent(jLEstadoThread9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLThread10)
                            .addComponent(jLEstadoThread10))))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        lblScore.setText("SCORE:");

        txtPontuacao.setEditable(false);
        txtPontuacao.setBackground(new java.awt.Color(255, 255, 255));
        txtPontuacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblScore)
                .addGap(18, 18, 18)
                .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScore)
                    .addComponent(btnExecutar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bdpCalibragem.setStringPainted(true);

        bdpPrincipal.setStringPainted(true);

        jLabel2.setText("Laço Principal:");

        jLabel1.setText("Laço de calibragem:");

        jLabelEstadoCalib.setText("Estado");

        jLabelEstadoPrincipal.setText("Estado");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bdpCalibragem, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEstadoCalib)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEstadoPrincipal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bdpCalibragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstadoCalib)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEstadoPrincipal))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitulo)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método btnExecutarActionPerformed(java.awt.event.ActionEvent evt) para
     * executar o BenchMark
     *
     * @param evt
     */
    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        // Inicia laço de calibração
        carrega.carregaCalibracao();

        new Thread() {

            public void run() {

                switch (numeroThread()) { //Enquanto numeroThread
                    case 1: // Caso igual a 1
                        for (int i = 0; i < (carrega.getThreadCalibracao1().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao1().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel();

                                sleep(100); // sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao1().getL1() * 100 / carrega.getThreadCalibracao1().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { //Se bdpCalibragem.getValue() < 100)
                                    jLabelEstadoCalib.setText("Carregando..."); //Seta o estado da label para Carregando
                                } else if (bdpCalibragem.getValue() == 100) { //senão se  bdpCalibragem.getValue() == 100
                                    jLabelEstadoCalib.setText("Concluido !"); //Seta o estado da label para Concluido
                                    carrega.getC1().interrupt(); // carrega.getC1().interrupt();
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao(); 
                                    carrega.carregaLacoPrincipal(tempo); // carrega.carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o método atualizaLabel();

                                    /**
                                     * For que controla barra de progresso do
                                     * Laço Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal1().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal1().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { //bdpPrincipal.getValue() <= run.availableProcessors() + 1
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); //sleep(100)

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal1().getL2() * 100 / carrega.getThreadPrincipal1().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { //Se bdpPrincipal <100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { //Se bdpPrincipal = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status para Concluido

                                                run.availableProcessors(); //run.availableProcessors();
                                                while (numeroThread() == numeroProcessador) { //Enquanto  numeroThread()==run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); //Formata a pontuaçao
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); //Seta o texto da pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel();
                                                    atualizaLabelPrincipal(); //Chama o método atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); //Chama o método finalizaLacoPrincipal
                                                    break;

                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 2: // Caso igual a 2
                        for (int i = 0; i < (carrega.getThreadCalibracao2().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao2().getL1()) {

                            try {
                                atualizaLabel(); //Chama o método atualizaLabel(); 

                                sleep(100); // sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao2().getL1() * 100 / carrega.getThreadCalibracao2().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem <100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o status da label para Carregando.
                                } else if (bdpCalibragem.getValue() == 100) {  // Senão se bdpCalibragem = 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o texto da label para Concluido
                                    carrega.getC1().interrupt(); // Interrompe a thread c1
                                    carrega.getC2().interrupt(); // Interrompe a thread c2
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao();
                                    carrega.carregaLacoPrincipal(tempo); //Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); //Chama o método atualizaLabel(); 

                                    /**
                                     * for que controla barra de prograsso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal2().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal2().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Se bdpPrincipal.getValue() <= run.availableProcessors() + 1
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); //sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal2().getL2() * 100 / carrega.getThreadPrincipal2().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100 
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando..
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100 
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); // Chama o método availableProcessors() da classe Run
//        System.out.println(""+run.availableProcessors());
                                                while (numeroThread() == numeroProcessador) { //Enquanto numeroThread() == run.availableProcessors()
//            carrega.pontuacao();
//            System.out.println(""+run.availableProcessors());

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata o nf para o formato decimal
//                                            double valor = 78945;
                                                    //System.out.println("" + nf.format(carrega.pontuacao()));
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel();
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincpal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal()
                                                    break;

                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                    case 3: //Caso igual a  3
                        for (int i = 0; i < (carrega.getThreadCalibracao3().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao3().getL1()) {

                            try {
                                atualizaLabel(); //Chama o método atualizaLabel();

                                sleep(100); //sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao3().getL1() * 100 / carrega.getThreadCalibracao3().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o status para carregando
                                } else if (bdpCalibragem.getValue() == 100) { // Senao se bdpCalibragem = 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o status para Concluido
                                    carrega.getC1().interrupt(); // Interrompe a thread c1
                                    carrega.getC2().interrupt(); // Interrompe a thread c2
                                    carrega.getC3().interrupt(); // Interrompe a thread c3
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao()
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o método  atualizaLabel();

                                    /**
                                     * For que controla barra de progresso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal3().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal3().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) {
                                            atualizaLabel(); //Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); //Chama o método atualizaLabelPrincipal();
                                            sleep(100); // sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal3().getL2() * 100 / carrega.getThreadPrincipal3().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { //Se bdpPrincipal.getValue < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); //Seta o texto do jLabelEstadoPricinpal para carregando
                                            }
                                            if (bdpPrincipal.getValue() == 100) { //Se bdpPrincipal.getValue = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); //Seta o texto do jLabelEstadoPricinpal para concluído

                                                run.availableProcessors();  //Chama o método availableProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() = run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata o nf
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); //Seta o texto do nf
                                                    atualizaLabel(); //Chama o método atualizaLabel();
                                                    atualizaLabelPrincipal(); //Chama o método  atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método  atualizaLabelPrincipal();
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 4: // Caso igual a 4
                        for (int i = 0; i < (carrega.getThreadCalibracao4().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao4().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel(); 

                                sleep(100); // sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao4().getL1() * 100 / carrega.getThreadCalibracao4().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem.getValue() < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o statua da label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { // Senao se bdpCalibragem.getValue() = 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o statua da label para Concluido!
                                    carrega.getC1().interrupt(); //Interrompe a thread c1
                                    carrega.getC2().interrupt(); //Interrompe a thread c2
                                    carrega.getC3().interrupt(); //Interrompe a thread c3
                                    carrega.getC4().interrupt(); //Interrompe a thread c4
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao()
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo); 
                                    atualizaLabel(); // Chama o método atualizaLabel();

                                    /**
                                     * For que controla barra de progresso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal4().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal4().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors()) { // Se bdpPrincipal.getValue() <= run.availableProcessors()
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); //sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal4().getL2() * 100 / carrega.getThreadPrincipal4().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { //Se bdpPrincipal.getValue() < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); // Chama o método availableProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() == run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para o formato decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel() 
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal();
                                                    break;
                                                }

                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }

                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 5: // Caso igual a 5
                        for (int i = 0; i < (carrega.getThreadCalibracao5().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao5().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel();

                                sleep(100); // sleep(100); 
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao5().getL1() * 100 / carrega.getThreadCalibracao5().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem.getValue() < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o status da label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { //Senão se bdpCalibragem.getValue() == 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o status da label para Concluido!
                                    carrega.getC1().interrupt(); //Interrompe a thread c1
                                    carrega.getC2().interrupt(); //Interrompe a thread c2
                                    carrega.getC3().interrupt(); //Interrompe a thread c3
                                    carrega.getC4().interrupt(); //Interrompe a thread c4
                                    carrega.getC5().interrupt(); //Interrompe a thread c5
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao();
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo)
                                    atualizaLabel(); // Chama o método atualizaLabel(); 

                                    /**
                                     * For que Controla barra de progresso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal5().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal5().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Faz om que ande de 1 em 1%
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); // sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal5().getL2() * 100 / carrega.getThreadPrincipal5().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluid!.

                                                run.availableProcessors(); // Chama o método availableProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() == run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel()
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal()
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal();
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 6: // Caso igual a 6
                        for (int i = 0; i < (carrega.getThreadCalibracao6().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao6().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel();

                                sleep(100); // sleep(100); 
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao6().getL1() * 100 / carrega.getThreadCalibracao6().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem.getValue() < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o status da label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { // Senão se bdpCalibragem.getValue() == 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o status da label para Concluido!
                                    carrega.getC1().interrupt(); // Interrompe a thread c1
                                    carrega.getC2().interrupt(); // Interrompe a thread c2
                                    carrega.getC3().interrupt(); // Interrompe a thread c3
                                    carrega.getC4().interrupt(); // Interrompe a thread c4
                                    carrega.getC5().interrupt(); // Interrompe a thread c5
                                    carrega.getC6().interrupt(); // Interrompe a thread c6
                                    double tempo = carrega.retornaCalibracao(); // tempo = = carrega.retornaCalibracao();
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o método atualizaLabel();

                                    /**
                                     * For que Controla barra de progresso Laço
                                     * Principal
                                     *
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal6().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal6().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Faz com que va de 1 em 1%
                                            atualizaLabel(); // Chama o método atualizaLabel(); 
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal(); 
                                            sleep(100); //sleep(100)

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal6().getL2() * 100 / carrega.getThreadPrincipal6().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido !

                                                run.availableProcessors(); // Chama o método avaibleProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() == run.availableProcessors() 

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel()
                                                    atualizaLabelPrincipal(); // Chama o método  atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método  finalizaLacoPrincipal();
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 7:  // Caso igual a 7
                        for (int i = 0; i < (carrega.getThreadCalibracao7().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao7().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel(); 

                                sleep(100); //  sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao7().getL1() * 100 / carrega.getThreadCalibracao7().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { //Se bdpCalibragem.getValue()< 100
                                    jLabelEstadoCalib.setText("Carregando..."); //Seta o status da label para carregando
                                } else if (bdpCalibragem.getValue() == 100) { // Senão se bdpCalibragem.getValue = 100
                                    jLabelEstadoCalib.setText("Concluido !"); //Seta o status da label para concluido
                                    carrega.getC1().interrupt(); //  Interrompe a thread c1
                                    carrega.getC2().interrupt(); //  Interrompe a thread c2
                                    carrega.getC3().interrupt(); //  Interrompe a thread c3
                                    carrega.getC4().interrupt(); //  Interrompe a thread c4
                                    carrega.getC5().interrupt(); //  Interrompe a thread c5
                                    carrega.getC6().interrupt(); //  Interrompe a thread c6
                                    carrega.getC7().interrupt(); //  Interrompe a thread c7
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao(); 
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o método  atualizaLabel();

                                    /**
                                     * For que controla barra de progresso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal7().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal7().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Faz com que a barra de progresso vá de 1 em 1%
                                            atualizaLabel(); // Chama o método  atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal();// Chama o método atualizaLabelPrincipal(); 
                                            sleep(100); // sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal7().getL2() * 100 / carrega.getThreadPrincipal7().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100 
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100 
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); //Chama o método avaibleProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() == run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para formato decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da Pontuação
                                                    atualizaLabel(); // Chama o método atualizaLabel(); 
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal(); 
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal();
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 8: // Caso igual a 8
                        for (int i = 0; i < (carrega.getThreadCalibracao8().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao8().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel()

                                sleep(100); //sleep(100)
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao8().getL1() * 100 / carrega.getThreadCalibracao8().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem.getValue() < 100
                                    jLabelEstadoCalib.setText("Carregando..."); //Seta o status da label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { // Senao se bdpCalibragem.getValue() = 100
                                    jLabelEstadoCalib.setText("Concluido !"); //Seta o status da label para Concluido !
                                    carrega.getC1().interrupt(); // Interrompe a thread c1
                                    carrega.getC2().interrupt(); // Interrompe a thread c2
                                    carrega.getC3().interrupt(); // Interrompe a thread c3
                                    carrega.getC4().interrupt(); // Interrompe a thread c4
                                    carrega.getC5().interrupt(); // Interrompe a thread c5
                                    carrega.getC6().interrupt(); // Interrompe a thread c6
                                    carrega.getC7().interrupt(); // Interrompe a thread c7
                                    carrega.getC8().interrupt(); // Interrompe a thread c8
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao();
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o método atualizaLabel();

                                    /**
                                     * For que controla barra de progresso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal8().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal8().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Para ir de 1 em 1% a barra
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); // sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal8().getL2() * 100 / carrega.getThreadPrincipal8().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); // Chama o método availableProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() == run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para o formato decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o txtPontuacao
                                                    atualizaLabel(); // Chama o método atualizaLabel();
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal();
//                                                    criaTxt(txtPontuacao.getText());
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 9: // Caso igual a 9
                        for (int i = 0; i < (carrega.getThreadCalibracao9().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao9().getL1()) {

                            try {
                                atualizaLabel(); //Chama o método atualizaLabel();  

                                sleep(100); // sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao9().getL1() * 100 / carrega.getThreadCalibracao9().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem.getValue() < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta o status da label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { // Senao se bdpCalibragem.getValue() = 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta o status da label para Concluido!
                                    carrega.getC1().interrupt(); // Interrompe a thread c1
                                    carrega.getC2().interrupt(); // Interrompe a thread c2
                                    carrega.getC3().interrupt(); // Interrompe a thread c3
                                    carrega.getC4().interrupt(); // Interrompe a thread c4
                                    carrega.getC5().interrupt(); // Interrompe a thread c5
                                    carrega.getC6().interrupt(); // Interrompe a thread c6
                                    carrega.getC7().interrupt(); // Interrompe a thread c7
                                    carrega.getC8().interrupt(); // Interrompe a thread c8
                                    carrega.getC9().interrupt(); // Interrompe a thread c9
                                    double tempo = carrega.retornaCalibracao(); // tempo = carrega.retornaCalibracao(); 
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama atualizaLabel();

                                    /**
                                     * For que controla barra de prograsso Laço
                                     * Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal9().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal9().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // Para ir a barra de progress de 1 em 1%
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();
                                            sleep(100); //  sleep(100); 

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal9().getL2() * 100 / carrega.getThreadPrincipal9().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100 
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando...
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() = 100 
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); //Chama o método availableProcessors()da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto numeroThread() = run.availableProcessors()

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata nf para o formato Decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o txtPontuacao
                                                    atualizaLabel(); // Chama o método atualizaLabel()
                                                    atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal()
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLabelPrincipal()
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                    case 10: // Caso igual a 10
                        for (int i = 0; i < (carrega.getThreadCalibracao10().getLacoCalibracao()); i = (int) carrega.getThreadCalibracao10().getL1()) {

                            try {
                                atualizaLabel(); // Chama o método atualizaLabel();

                                sleep(100); //sleep(100);
                                bdpCalibragem.setValue((int) (carrega.getThreadCalibracao10().getL1() * 100 / carrega.getThreadCalibracao10().getLacoCalibracao()));
                                if (bdpCalibragem.getValue() < 100) { // Se bdpCalibragem < 100
                                    jLabelEstadoCalib.setText("Carregando..."); // Seta a label para Carregando...
                                } else if (bdpCalibragem.getValue() == 100) { // Se bdpCalibragem = 100
                                    jLabelEstadoCalib.setText("Concluido !"); // Seta a label para Concluido!
                                    carrega.getC1().interrupt(); //Interrompe a thread c1
                                    carrega.getC2().interrupt(); //Interrompe a thread c2
                                    carrega.getC3().interrupt(); //Interrompe a thread c3
                                    carrega.getC4().interrupt(); //Interrompe a thread c4
                                    carrega.getC5().interrupt(); //Interrompe a thread c5
                                    carrega.getC6().interrupt(); //Interrompe a thread c6
                                    carrega.getC7().interrupt(); //Interrompe a thread c7
                                    carrega.getC8().interrupt(); //Interrompe a thread c8
                                    carrega.getC9().interrupt(); //Interrompe a thread c9
                                    carrega.getC10().interrupt(); //Interrompe a thread c10
                                    double tempo = carrega.retornaCalibracao(); // tempo = = carrega.retornaCalibracao();
                                    carrega.carregaLacoPrincipal(tempo); // Chama o método carregaLacoPrincipal(tempo);
                                    atualizaLabel(); // Chama o metodo  atualizaLabel();

                                    /**
                                     * For que controla barra de progresso do
                                     * Laço Principal
                                     *
                                     */
                                    for (int j = 0; j < carrega.getThreadPrincipal10().getLacoPrincipal(); j = (int) carrega.getThreadPrincipal10().getL2()) {

                                        if (bdpPrincipal.getValue() <= run.availableProcessors() + 1) { // if para ir de 1 em 1%
                                            atualizaLabel(); // Chama o método atualizaLabel();
                                        }
                                        try {

                                            atualizaLabelPrincipal(); // Chama o método atualizaLabelPrincipal();  
                                            sleep(100); //  sleep(100);

                                            bdpPrincipal.setValue((int) (carrega.getThreadPrincipal10().getL2() * 100 / carrega.getThreadPrincipal10().getLacoPrincipal()));
                                            if (bdpPrincipal.getValue() < 100) { // Se bdpPrincipal.getValue() < 100
                                                jLabelEstadoPrincipal.setText("Carregando..."); // Seta o status da label para Carregando..
                                            }
                                            if (bdpPrincipal.getValue() == 100) { // Se bdpPrincipal.getValue() == 100
                                                jLabelEstadoPrincipal.setText("Concluido !"); // Seta o status da label para Concluido!

                                                run.availableProcessors(); // Método availableProcessors() da classe Run
                                                while (numeroThread() == numeroProcessador) { // Enquanto  numeroThread() = run.availableProcessors() 

                                                    NumberFormat nf = new DecimalFormat("#,##0.000", new DecimalFormatSymbols(new Locale("pt", "BR"))); // Formata o numero nf para decimal
                                                    txtPontuacao.setText("" + nf.format(carrega.pontuacao())); // Seta o texto da txtPontuacao
                                                    atualizaLabel(); // Chama o metodo atualizaLabel(); 
                                                    atualizaLabelPrincipal(); // Chama o metodo atualizaLabelPrincipal();
                                                    carrega.finalizaLacoPrincipal(); // Chama o método finalizaLacoPrincipal();
                                                    break;
                                                }
//                                                criaTxt(txtPontuacao.getText());
                                            }

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                }
                if (numeroProcessador == numeroProcessador) {
                    try {
                        criarRanking(txtPontuacao.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();


    }//GEN-LAST:event_btnExecutarActionPerformed

    /**
     * Método do btnSair para sair do formulário.
     *
     * @param evt
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    /**
     * Método para criar o ranking
     *
     * @param pontuacao
     * @throws IOException
     */
    public void criarRanking(String pontuacao) throws IOException {
        String arquivo = ""; //Caminho do arquivo
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo + "ranking.txt", true));
        String usuario = InetAddress.getLocalHost().getHostName(); //Variável String usuario - Pega o nome do computador.
        String pontos = pontuacao; // Variável String pontos

        bw.append(usuario + ";" + pontos); // Adiciona o usuário e sua pontuação
        bw.newLine(); // Nova linha
        bw.close(); // Fecha o arquivo .txt
    }

    /**
     * Método estático void main.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Método público void run que serve para chamar a tela principal e
             * torná-la visível.
             */
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bdpCalibragem;
    private javax.swing.JProgressBar bdpPrincipal;
    private javax.swing.JToggleButton btnExecutar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLEstadoThread1;
    private javax.swing.JLabel jLEstadoThread10;
    private javax.swing.JLabel jLEstadoThread2;
    private javax.swing.JLabel jLEstadoThread3;
    private javax.swing.JLabel jLEstadoThread4;
    private javax.swing.JLabel jLEstadoThread5;
    private javax.swing.JLabel jLEstadoThread6;
    private javax.swing.JLabel jLEstadoThread7;
    private javax.swing.JLabel jLEstadoThread8;
    private javax.swing.JLabel jLEstadoThread9;
    private javax.swing.JLabel jLEstadoThreadPrincipal1;
    private javax.swing.JLabel jLEstadoThreadPrincipal10;
    private javax.swing.JLabel jLEstadoThreadPrincipal2;
    private javax.swing.JLabel jLEstadoThreadPrincipal3;
    private javax.swing.JLabel jLEstadoThreadPrincipal4;
    private javax.swing.JLabel jLEstadoThreadPrincipal5;
    private javax.swing.JLabel jLEstadoThreadPrincipal6;
    private javax.swing.JLabel jLEstadoThreadPrincipal7;
    private javax.swing.JLabel jLEstadoThreadPrincipal8;
    private javax.swing.JLabel jLEstadoThreadPrincipal9;
    private javax.swing.JLabel jLThread1;
    private javax.swing.JLabel jLThread10;
    private javax.swing.JLabel jLThread2;
    private javax.swing.JLabel jLThread3;
    private javax.swing.JLabel jLThread4;
    private javax.swing.JLabel jLThread5;
    private javax.swing.JLabel jLThread6;
    private javax.swing.JLabel jLThread7;
    private javax.swing.JLabel jLThread8;
    private javax.swing.JLabel jLThread9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstadoCalib;
    private javax.swing.JLabel jLabelEstadoPrincipal;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloCalibracao;
    private javax.swing.JLabel jLabelTituloStress;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblPrincipal1;
    private javax.swing.JLabel lblPrincipal10;
    private javax.swing.JLabel lblPrincipal2;
    private javax.swing.JLabel lblPrincipal3;
    private javax.swing.JLabel lblPrincipal4;
    private javax.swing.JLabel lblPrincipal5;
    private javax.swing.JLabel lblPrincipal6;
    private javax.swing.JLabel lblPrincipal7;
    private javax.swing.JLabel lblPrincipal8;
    private javax.swing.JLabel lblPrincipal9;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField txtPontuacao;
    // End of variables declaration//GEN-END:variables

}
