/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.aplicativo.operacoes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Calibracao extends Thread {

    String status;
    static long lacosSegundoTotal;
    static long tempoFinalCalibracao;
    static long lacosSendoExecutados;
    static long tempoInicial;
    static long tamanhoLacoCalibracao;
    static long calcularFinal;

    public Calibracao(String nomeThread) {
        setName(nomeThread);
        tempoFinalCalibracao = 0;
        tempoInicial = 0;
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
        tamanhoLacoCalibracao = 20500000;   
        for (int i = 0; i < tamanhoLacoCalibracao; i++) {

            Math.log10(37.61);
            Math.sin(2.45);
            Math.cos(0.26);
            Math.sqrt(7.33);
            double pf = 2.57 / 7.77;
            Math.exp(3.95);
        }
        
        long tempFinal = System.currentTimeMillis();  
  
long dif = (tempFinal - tempoInicial);  
  
System.out.println(String.format("%02d segundos  e %02d milisegundos", dif/60, dif%60)); 
        status = "Terminado";
    }
    public static void main(String args[]) {
        Calibracao c1 = new Calibracao("thread1");
        c1.start();
       }


    public static void setLacosSegundoTotal(long lacosSegundoTotal) {
        Calibracao.lacosSegundoTotal = lacosSegundoTotal;
    }

    public static long getLacosSegundoTotal() {
        return lacosSegundoTotal;
    }

    public static long getTempoFinalCalibracao() {
        return tempoFinalCalibracao;
    }

    public static void setTempoFinalCalibracao(int tempoFinalCalibracao) {
        Calibracao.tempoFinalCalibracao = tempoFinalCalibracao;
    }

    public static long getLacosSendoExecutados() {
        return lacosSendoExecutados;
    }

    public static void setLacosSendoExecutados(long lacosSendoExecutados) {
        Calibracao.lacosSendoExecutados = lacosSendoExecutados;
    }
    public static long getTamanhoLacoCalibracao() {
        return tamanhoLacoCalibracao;
    }

    public static void setTamanhoLacoCalibracao(long tamanhoLacoCalibracao) {
        Calibracao.tamanhoLacoCalibracao = tamanhoLacoCalibracao;
    }
    public static long getCalcularFinal() {
        return calcularFinal;
    }

    public static void setCalcularFinal(long calcularFinal) {
        Calibracao.calcularFinal = calcularFinal;
    }
}
