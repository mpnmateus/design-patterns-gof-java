package org.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        // Devem ter o mesmo endereço de memória, independente de quantas intâncias houver

        // SingletonLazy
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(SingletonLazy.getInstance());

        // Singleton Eager
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        System.out.println(SingletonEager.getInstance());

        // Singleton Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        System.out.println(SingletonLazyHolder.getInstance());

    }
}
