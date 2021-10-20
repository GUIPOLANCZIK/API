package br.com.guilherme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	
public Usuarios() {
	}

public Usuarios(int id, String email, String senha) {
	this.id = id;
	this.email = email;
	Senha = senha;
}
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
@Column(length = 40, nullable= false)
private String email;
@Column(length = 30, nullable= false)
private String Senha;




public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getemail() {
	return email;
}

public void setNome(String email) {
	this.email = email;
}

public String getSenha() {
	return Senha;
}

public void setSenha(String senha) {
	Senha = senha;
}

}
