package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe LacoPrincipal implements Runnable{.
 *
 * @author Leonardo Fabio
 */
public class LacoPrincipal implements Runnable {

    private double l2;              // Variável double l2
    private double lacoPrincipal;   // Variável double lacoPrincipal
    private double tempoInicioLP;   // Variável double tempoInicioLP
    private double tempoFinalLP;    // Variável double tempoFinalLP
    private double tempoFinalLP2;   // Variável double tempoFinalLP2
    private double pontuacao;       // Variável double pontuacao
    private double tempoCalibracao; // Variável double tempoCalibracao

    // Métodos gets e sets  
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

    public double getTempoInicioLP() {
        return tempoInicioLP;
    }

    public void setTempoInicioLP(double tempoInicioLP) {
        this.tempoInicioLP = tempoInicioLP;
    }

    public double getTempoFinalLP() {
        return tempoFinalLP;
    }

    public void setTempoFinalLP(double tempoFinalLP) {
        this.tempoFinalLP = tempoFinalLP;
    }

    public double getTempoFinalLP2() {
        return tempoFinalLP2;
    }

    public void setTempoFinalLP2(double tempoFinalLP2) {
        this.tempoFinalLP2 = tempoFinalLP2;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public double getTempoCalibracao() {
        return tempoCalibracao;
    }

    public void setTempoCalibracao(double tempoCalibracao) {
        this.tempoCalibracao = tempoCalibracao;
    }

    /**
     * Método construtor da classe LacoPrincipal
     *
     * @param lacoPrincipal
     */
    public LacoPrincipal(double lacoPrincipal) {
        this.lacoPrincipal = lacoPrincipal;
    }

    @Override
    public void run() {
        this.tempoInicioLP = System.currentTimeMillis();

        for (l2 = 0; l2 < lacoPrincipal; l2++) {
            //Equações passadas pelo professor
            double log = Math.log(37.71);
            double sin = Math.sin(2.46);
            double cos = Math.cos(0.27);
            double raiz = Math.sqrt(7.35);
            double divi = 2.5 / 7.77;
            double exp = Math.exp(3.95);

        }
        this.tempoFinalLP = ((System.currentTimeMillis() - tempoInicioLP) * 0.001); //tempoFinalLP= ((System.currentTimeMillis() - tempoInicioLP) * 0.001)
        this.pontuacao = lacoPrincipal / tempoFinalLP; // laços por segundos
        System.out.println(String.format("%.2f minutos  e %.2f segundos", this.tempoFinalLP / 60, this.tempoFinalLP % 60)); //Escreve o tempoFinalLP
        System.out.println("----------------------------------");
    }

}
