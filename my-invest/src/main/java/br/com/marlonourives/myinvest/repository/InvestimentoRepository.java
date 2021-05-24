package br.com.marlonourives.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marlonourives.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
