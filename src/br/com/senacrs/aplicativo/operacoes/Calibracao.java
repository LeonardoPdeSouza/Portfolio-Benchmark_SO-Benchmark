package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe Calibracao implements Runnable{.
 *
 * @author Leonardo Fabio
 */
public class Calibracao implements Runnable {

    public double l1; // Variável double l1 
    public double l2; // Variável double l2 
    public double lacoPrincipal; // Variável double lacoPrincipal 
    public double lacoCalibracao; // Variável double lacoPrincipal 
    public double tempoInicialCalibracao;// Variável double tempoIncialCalibracao
    public double tempoFinalCalibracao; // Variável double tempoFinalCalibracao 
    public double tempoFinalCalibraCao2; // Variável double tempoFinalCalibracao2
    public double t2; // Variável double  t2
    public double tempoTotal; // Variável double tempoTotal
    public double calculaTempoLacoPrincipal; // Variável double calculaTempoLacoPrincipal

    /**
     * Metodo void calibrar()
     */
    public void calibrar() {
        this.lacoCalibracao = 247000000L; // Leonardo(247000000L)
        tempoInicialCalibracao = System.currentTimeMillis(); //tempoInicialCalibracao = System.currentTimeMillis()

        for (l1 = 0; l1 < lacoCalibracao; l1++) { // laço de calibração 20s

            //Equações passados pelo professor;
            Math.log10(37.61);
            Math.sin(2.45);
            Math.cos(0.26);
            Math.sqrt(7.33);
            double pf = 2.57 / 7.77;
            Math.exp(3.95);

        }
        this.tempoFinalCalibracao = ((System.currentTimeMillis() - tempoInicialCalibracao) * 0.001); // tempoFinalCalibracao = ((System.currentTimeMillis() - tempoInicialCalibracao) * 0.001)
        System.out.println("Laço Calibraçao: " + lacoCalibracao); //Escreve o lacoCalibracao
        this.calculaTempoLacoPrincipal = (this.lacoCalibracao / this.tempoFinalCalibracao) * 240;
        this.lacoPrincipal = ((calculaTempoLacoPrincipal));
//        this.lacoPrincipal = ((lacoCalibracao * 12)); //lacoPrincipal = lacoCalibracao * 12)
        System.out.println(String.format("%.2f segundos", this.tempoFinalCalibracao % 60)); //Escreve o tempoFinalCalibracao
        
        
        System.out.println("----------------------------------");

    }

    @Override
    public void run() {
        calibrar(); //Método calibrar();
    }
}
