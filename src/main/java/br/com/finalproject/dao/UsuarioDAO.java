package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO => Data Access Object
 * Classes que contém os métodos que irão manipular os dados
 * manipular os dados = CRUD
 * C => Create (inserir dado na tabela)
 * R => Read (consultar dado na tabela)
 * U => Update (alterar dado na tabela)
 * D => Delete (apagar dado na tabela)
 * Classe CrudRepository<1ºClasseBeans,2ºTipodeDadoPK>
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	
	public Usuario findByEmailAndSenha(String email, String senha);

}
