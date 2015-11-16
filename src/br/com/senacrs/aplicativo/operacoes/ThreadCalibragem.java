/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.aplicativo.operacoes;

/**
 *
 * @author Leonardo P Souza
 */
public class ThreadCalibragem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Calibracao());
        Thread t2 = new Thread(new Calibracao());
        Thread t3 = new Thread(new Calibracao());
        Thread t4 = new Thread(new Calibracao());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
