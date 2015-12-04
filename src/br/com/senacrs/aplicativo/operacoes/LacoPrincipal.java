package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe LacoPrincipal implements Runnable{.
 *
 * @author Leonardo Fabio
 */
public class LacoPrincipal implements Runnable{
     
    public double l2;              // Variável double l2
     public double lacoPrincipal;   // Variável double lacoPrincipal
     public double tempoInicioLP;   // Variável double tempoInicioLP
     public double tempoFinalLP;    // Variável double tempoFinalLP
     public double tempoFinalLP2;   // Variável double tempoFinalLP2
     public double pontuacao;       // Variável double pontuacao
     public double tempoCalibracao; // Variável double tempoCalibracao
     
  /**
   * Método construtor da classe LacoPrincipal
   * @param lacoPrincipal 
   */   
   public LacoPrincipal(double lacoPrincipal){
       this.lacoPrincipal = lacoPrincipal;
    }

     @Override
   public void run(){
        this.tempoInicioLP = System.currentTimeMillis();
       
        for (l2 = 0; l2 < lacoPrincipal; l2++) {
           double log = Math.log(37.71);
            double sin = Math.sin(2.46);
            double cos = Math.cos(0.27);
            double raiz = Math.sqrt(7.35);
            double divi = 2.5 / 7.77;
            double exp = Math.exp(3.95);

        }
        this.tempoFinalLP= ((System.currentTimeMillis() - tempoInicioLP) * 0.001); //tempoFinalLP= ((System.currentTimeMillis() - tempoInicioLP) * 0.001)
        this.pontuacao = lacoPrincipal/tempoFinalLP; //pontuacao = lacoPrincipal/tempoFinalLP;
        System.out.println(String.format("%.2f minutos  e %.2f segundos", this.tempoFinalLP /60, this.tempoFinalLP % 60)); //Escreve o tempoFinalLP
                      System.out.println("----------------------------------");
   }
   
}
