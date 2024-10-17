package org.singleton;

/**
 * Singleton apressado com classe interna detentora da instancia
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }

}
