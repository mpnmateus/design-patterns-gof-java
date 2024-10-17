package org.singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author falvojr
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        // Se não houver essa verificação e instanciação, o objeto será null
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
