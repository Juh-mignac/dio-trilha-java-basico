package com.desafio.desafiopatterns.repository;

import org.springframework.data.repository.CrudRepository;

import com.desafio.desafiopatterns.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{

}