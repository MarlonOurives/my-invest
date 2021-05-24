package br.com.marlonourives.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marlonourives.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	
}
