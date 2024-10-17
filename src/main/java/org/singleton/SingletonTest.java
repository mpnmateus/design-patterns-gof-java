package org.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        // SingletonLazy
        // Deve ter o mesmo endereço de memória, independente de quantas intâncias houver
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(SingletonLazy.getInstance());
    }
}
