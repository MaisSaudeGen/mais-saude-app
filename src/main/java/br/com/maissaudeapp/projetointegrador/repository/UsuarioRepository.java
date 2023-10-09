package br.com.maissaudeapp.projetointegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maissaudeapp.projetointegrador.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
