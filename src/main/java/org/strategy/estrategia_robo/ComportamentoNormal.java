package org.strategy.estrategia_robo;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover(){
        System.out.println("Movendo-se normalmente.");
    }
}
