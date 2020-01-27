package com.emerson.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
