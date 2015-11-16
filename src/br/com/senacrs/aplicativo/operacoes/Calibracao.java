/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.aplicativo.operacoes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Calibracao implements Runnable{
    long lacosSegundoTotal;
    long tempoFinalCalibracao;
    long lacosSendoExecutados;
    long tempoInicial;
    long tempoFinal;
    long tamanhoLacoCalibracao;
    long calcularFinal;

    public Calibracao() {
        tempoFinalCalibracao = 0;
        tempoInicial = 0;
        tempoFinal = 0;
        calcularFinal = 0;
    }

    @Override
    public void run() {

        calculoCalibracao();
    }

    /**
     * Metodo responsavel por efetuar os calculos do laço de calibração
     */
    public void calculoCalibracao() {
        // armazena o tempo antes de iniciar o laço de calibração
        tempoInicial = System.currentTimeMillis();
        tamanhoLacoCalibracao = 412000000L;   //412000000
        for (long i = 0; i < tamanhoLacoCalibracao; i++) {

            Math.log10(37.61);
            Math.sin(2.45);
            Math.cos(0.26);
            Math.sqrt(7.33);
            double pf = 2.57 / 7.77;
            Math.exp(3.95);
            
        }
        tempoFinal = System.currentTimeMillis();  
        
  
long dif = (tempoFinal - tempoInicial);

  
System.out.println(String.format("%02d segundos  e %02d milisegundos", dif/1000, dif%60)); 
//        JOptionPane.showMessageDialog(null, dif/1000);
    }
    public static void main(String args[]) {
//        Calibracao c1 = new Calibracao();
//        Calibracao c2 = new Calibracao();
////        Calibracao c3 = new Calibracao();
////        Calibracao c4 = new Calibracao();
////        Calibracao c5 = new Calibracao();
////        Calibracao c6 = new Calibracao();
////        Calibracao c7 = new Calibracao();
////        Calibracao c8 = new Calibracao();
////        Calibracao c9 = new Calibracao();
////        Calibracao c10 = new Calibracao();
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//        c5.start();
//        c6.start();
//        c7.start();
//        c8.start();
//        c9.start();
//        c10.start();
       }


    
}
