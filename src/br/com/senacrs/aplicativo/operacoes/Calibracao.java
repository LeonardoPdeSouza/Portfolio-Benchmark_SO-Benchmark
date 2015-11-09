/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe Calibracao
 * @author Fabio Lopes
 */
public class Calibracao extends Thread {
   static long calcularLacoDeCalibragem; // Variável estática para calcular o tempo para o laço de calibragem. 
   static long tempoInicialDeCalibracao; // Variável estática para calcular o tempo inicial. 
    
  /**    * 
   * Método void calcularCalibracao.
   */
   private void calcularCalibracao(){
   
   calcularLacoDeCalibragem= 18000000;   
   tempoInicialDeCalibracao= System.nanoTime();
   for(int i=0;i<calcularLacoDeCalibragem;i++){ //Operação for para calcular o tempo de calibragem usando as operações abaixo.  
   Math.log10(37.71);  // logaritimo decimal.
   Math.sin(2.46);     // senos.
   Math.cos(0.27);    // cosseno. 
   Math.sqrt(7.35);   // raíz quadrada.
   double pontoFlutuante = 2.57/7.77; // divisão de ponto flutuante.
    Math.exp(3.95);   // exponenciação.
    
   }
 } 
       public static void main(String args[]) {
        long tempoFinalDeCalibracao = ((System.nanoTime()- tempoInicialDeCalibracao)*240);
        System.out.println(tempoFinalDeCalibracao);
       }
}
