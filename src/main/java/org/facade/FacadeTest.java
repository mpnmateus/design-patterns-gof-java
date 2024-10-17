package org.facade;

public class FacadeTest {
    public static void main(String[] args) {
        MigracaoClientesFacade migrarClientes = new MigracaoClientesFacade();
        migrarClientes.migrarClientes("Mateus", "80250369");
    }
}
