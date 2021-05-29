package br.com.marlonourives.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marlonourives.myinvest.domain.Categoria;
import br.com.marlonourives.myinvest.domain.Investimento;
import br.com.marlonourives.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listarTodas(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long categoria) {
		return categoriaRepository.findById(categoria).orElse(null);
	}
	
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long categoria) {
		categoriaRepository.deleteById(categoria);
	}
	
	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
}
