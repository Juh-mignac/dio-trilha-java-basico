package com.desafio.desafiopatterns.service;

import com.desafio.desafiopatterns.model.Invoice;


public interface InvoiceService {
	
	Iterable<Invoice> buscarTodos();

	Invoice buscarPorId(Long id);

	void inserir(Invoice invoice);

	void atualizar(Long id, Invoice invoice);

	void deletar(Long id);

}
