package br.com.maissaudeapp.projetointegrador.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_usuario")


public class Usuario  {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String usuario;
	
	@Column(unique = true)
	@NotBlank(message = "O atributo nome é obrigatório!")
    @Size(min = 3, max=35, message = "O atributo nome deve conter no minimo 3 e no máximo 35 caracteres")
	private String nome;
	
	@Column(unique = true)
	@NotBlank(message = "O atributo E-mail é obrigatório!")
    @Size(min = 10, max=35, message = "O atributo E-mail deve conter no minimo 3 e no máximo 35 caracteres")
	private String email;
	
	@Column(unique = true)
	@NotBlank(message = "O atributo Senha é obrigatório!")
    @Size(min = 10, max=35, message = "O atributo Senha deve conter no minimo 3 e no máximo 35 caracteres")
	private String senha;
	
	private String foto;
	private String post;
	
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy =  "usuario", cascade = CascadeType.REMOVE) 
    @JsonIgnoreProperties("usuario")
    private List<Postagem> postagem;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public List<Postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	
}
	
