package br.com.maissaudeapp.projetointegrador.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo texto éobrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 10 e no máximo 1000 caracteres")
    private String texto;

    @CreationTimestamp
    private LocalDateTime data;

    @NotBlank
    private String titulo;
    @NotBlank
    private String corpo;
    private BigInteger likes;
    private BigInteger compartilhamentos;
    private String comentarios;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Categorias categorias;

    @ManyToOne
    @JsonIgnoreProperties("usuario")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public BigInteger getLikes() {
        return likes;
    }

    public void setLikes(BigInteger likes) {
        this.likes = likes;
    }

    public BigInteger getCompartilhamentos() {
        return compartilhamentos;
    }

    public void setCompartilhamentos(BigInteger compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
