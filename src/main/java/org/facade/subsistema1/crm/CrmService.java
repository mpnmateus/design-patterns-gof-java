package org.facade.subsistema1.crm;

import java.sql.SQLOutput;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente " + nome + " salvo no CRM.");
        System.out.println("Dados do cliente: " + "\nCEP: " + cep + "\nCidade: " + cidade + "\nEstado: " + estado);
    }
}
