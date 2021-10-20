package br.com.guilherme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newsletter")
public class Newsletter {

	public Newsletter(int id, String email, String nome) {
		this.id = id;
		this.email = email;
		this.nome = nome;
	}

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
@Column(length = 40, nullable= false)
private String email;
@Column(length = 40, nullable= false)
private String nome;




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


}