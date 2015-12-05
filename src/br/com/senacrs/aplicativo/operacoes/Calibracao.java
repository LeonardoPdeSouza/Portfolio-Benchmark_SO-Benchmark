package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe Calibracao implements Runnable{.
 *
 * @author Leonardo Fabio
 */
public class Calibracao implements Runnable {

    private double l1; // Variável double l1 
    private double l2; // Variável double l2 
    private double lacoPrincipal; // Variável double lacoPrincipal 
    private double lacoCalibracao; // Variável double lacoPrincipal 
    private double tempoInicialCalibracao;// Variável double tempoIncialCalibracao
    private double tempoFinalCalibracao; // Variável double tempoFinalCalibracao 
    private double tempoFinalCalibraCao2; // Variável double tempoFinalCalibracao2
    private double t2; // Variável double  t2
    private double tempoTotal; // Variável double tempoTotal
    private double calculaTempoLacoPrincipal; // Variável double calculaTempoLacoPrincipal

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getLacoPrincipal() {
        return lacoPrincipal;
    }

    public void setLacoPrincipal(double lacoPrincipal) {
        this.lacoPrincipal = lacoPrincipal;
    }

    public double getLacoCalibracao() {
        return lacoCalibracao;
    }

    public void setLacoCalibracao(double lacoCalibracao) {
        this.lacoCalibracao = lacoCalibracao;
    }

    public double getTempoInicialCalibracao() {
        return tempoInicialCalibracao;
    }

    public void setTempoInicialCalibracao(double tempoInicialCalibracao) {
        this.tempoInicialCalibracao = tempoInicialCalibracao;
    }

    public double getTempoFinalCalibracao() {
        return tempoFinalCalibracao;
    }

    public void setTempoFinalCalibracao(double tempoFinalCalibracao) {
        this.tempoFinalCalibracao = tempoFinalCalibracao;
    }

    public double getTempoFinalCalibraCao2() {
        return tempoFinalCalibraCao2;
    }

    public void setTempoFinalCalibraCao2(double tempoFinalCalibraCao2) {
        this.tempoFinalCalibraCao2 = tempoFinalCalibraCao2;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(double tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public double getCalculaTempoLacoPrincipal() {
        return calculaTempoLacoPrincipal;
    }

    public void setCalculaTempoLacoPrincipal(double calculaTempoLacoPrincipal) {
        this.calculaTempoLacoPrincipal = calculaTempoLacoPrincipal;
    }
    

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
        System.out.println(String.format("%.2f segundos", this.tempoFinalCalibracao % 60)); //Escreve o tempoFinalCalibracao
        System.out.println("----------------------------------");

    }

    @Override
    public void run() {
        calibrar(); //Método calibrar();
    }
}
