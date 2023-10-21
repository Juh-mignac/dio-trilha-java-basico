package com.desafio.desafiopatterns.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.desafiopatterns.model.Invoice;
import com.desafio.desafiopatterns.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService{

	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public Iterable<Invoice> buscarTodos() {
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice buscarPorId(Long id) {
		Optional<Invoice> invoice = invoiceRepository.findById(id);
		return invoice.get();
	}

	@Override
	public void inserir(Invoice invoice) {
		invoiceRepository.save(invoice);
		
	}

	@Override
	public void atualizar(Long id, Invoice invoice) {
		Optional<Invoice> invoicebd = invoiceRepository.findById(id);
		if (invoicebd.isPresent()) {
			invoiceRepository.save(invoice);
		}
		
	}

	@Override
	public void deletar(Long id) {
		invoiceRepository.deleteById(id);
		
	}


}
