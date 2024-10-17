package org.strategy.estrategia_robo;

public class StrategyRoboTest {

    public static void main(String[] args) {
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        // Comportamento normal
        robo.setComportamento(comportamentoNormal);
        robo.mover();

        // Comportamento Defensivo
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();

        // Comportamento Agressivo
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
    }


}
