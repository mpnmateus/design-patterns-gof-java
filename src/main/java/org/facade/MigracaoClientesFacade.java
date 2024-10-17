package org.facade;

import org.facade.subsistema1.crm.CrmService;
import org.facade.subsistema2.cep.CepApi;

/**
 * Padrão de projeto Facade (essa será a fachada)
 *
 * Objetivo: migrar os clientes já existentes para uma nova base, buscando informações de um subsistema externo.
 * Usaremos uma API de CEP
 */

public class MigracaoClientesFacade {

    public void migrarClientes (String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
