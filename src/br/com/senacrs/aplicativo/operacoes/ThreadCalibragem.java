/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe ThreadCalibragem {
 * @author Leonardo P Souza
 */
public class ThreadCalibragem {
    

    /** Metódo static void main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Calibracao()); // Instancia a Thread t1
        Thread t2 = new Thread(new Calibracao());
        Thread t3 = new Thread(new Calibracao());
        Thread t4 = new Thread(new Calibracao());
        t1.start(); // Starta a thread t1
        t2.start();
        t3.start();
        t4.start();
    }
    
}
