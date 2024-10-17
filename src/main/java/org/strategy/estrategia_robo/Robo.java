package org.strategy.estrategia_robo;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        if(comportamento == null)
            throw new IllegalStateException("Comportamento não definido.");
        comportamento.mover();
    }
}
