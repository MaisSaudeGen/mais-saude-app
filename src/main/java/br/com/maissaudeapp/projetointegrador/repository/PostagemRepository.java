package br.com.maissaudeapp.projetointegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maissaudeapp.projetointegrador.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	

}
