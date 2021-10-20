package br.com.guilherme.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="Camisetas")
public class Camisetas {
	


	public Camisetas(int id, String modelo, String tamanho) {
		this.id = id;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(length = 20, nullable= false)
	private String modelo;
	@Column(length =8 , nullable= false)
	private String tamanho;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
