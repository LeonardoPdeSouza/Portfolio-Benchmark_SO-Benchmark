package br.com.senacrs.aplicativo.operacoes;

/**
 * Classe Calibracao implements Runnable{.
 *
 * @author Leonardo Fabio
 */
public class Calibracao implements Runnable {

    public double l1, l2, lacoCalibracao,
            lacoPrincipal,
            tempoFinalCalibracao,
            tempoFinalCalibracao2,
            tempoInicialCalibracao,
            t2,
            tempoTotal;

    public void calibrar() {
        this.lacoCalibracao = 247000000L; // Leonardo(247000000L)
        tempoInicialCalibracao = System.currentTimeMillis();

        for (l1 = 0; l1 < lacoCalibracao; l1++) { // laço de calibração 20s

            Math.log10(37.61);
            Math.sin(2.45);
            Math.cos(0.26);
            Math.sqrt(7.33);
            double pf = 2.57 / 7.77;
            Math.exp(3.95);

        }
        this.tempoFinalCalibracao = ((System.currentTimeMillis() - tempoInicialCalibracao) * 0.001);
        System.out.println("Laço Calibraçao: " + lacoCalibracao);
        this.lacoPrincipal = ((lacoCalibracao * 12));
        System.out.println(String.format("%.2f segundos", this.tempoFinalCalibracao % 60));
        System.out.println("----------------------------------");

    }

    @Override
    public void run() {
        calibrar();
    }
}
