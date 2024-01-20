package br.com.hallucinations.exerciciossb.model.repositories;

import br.com.hallucinations.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer> {

}
