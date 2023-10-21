package com.desafio.desafiopatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.desafiopatterns.model.Invoice;
import com.desafio.desafiopatterns.service.InvoiceService;

@RestController
@RequestMapping("invoices")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping
	public ResponseEntity<Iterable<Invoice>> buscarTodos() {
		return ResponseEntity.ok(invoiceService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Invoice> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(invoiceService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<Invoice> inserir(@RequestBody Invoice invoice) {
		invoiceService.inserir(invoice);
		return ResponseEntity.ok(invoice);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Invoice> atualizar(@PathVariable Long id, @RequestBody Invoice invoice) {
		invoiceService.atualizar(id, invoice);
		return ResponseEntity.ok(invoice);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		invoiceService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
