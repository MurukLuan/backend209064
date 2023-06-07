package br.com.senai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
//@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 50, nullable = false)
	private String categoria;
	private int quantidade;
	private double valor;
}
