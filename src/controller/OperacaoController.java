package controller;

import br.edu.fateczl.filaobj.fila;
import model.Cliente;

public class OperacaoController {
	public void caixa(fila f) throws Exception {
		
        while (!f.isEmpty()) {
            Object model = f.remove();
            double valorTotal = ((Cliente) model).getQuantidade() * ((Cliente) model).getValor();
            System.out.println("Nome: " + ((Cliente) model).getNome() + ", Valor Total da Compra: " + valorTotal);
        }
    }
}

