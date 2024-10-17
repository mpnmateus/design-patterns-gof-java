package org.singleton;

/**
 *  Singleton "Apressado"
 *  Instancia no momento da carga da classe;
 *  Ao chamar a instancia, o objeto ja vai existir
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }

}
