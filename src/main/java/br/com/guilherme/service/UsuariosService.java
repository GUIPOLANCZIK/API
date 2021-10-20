package br.com.guilherme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.guilherme.repository.UsuariosRepository;
import br.com.guilherme.model.Usuarios;
@Service
public class UsuariosService {
	@Autowired
	private UsuariosRepository  usuariosRepository;

	public Usuarios insert(Usuarios usuarios) {
		return  usuariosRepository.save(usuarios);
	}
	
	public Usuarios update(Usuarios usuarios) {
		return usuariosRepository.save(usuarios);
	}
	
	
	public void remove(int id) {
		 usuariosRepository.deleteById(id);
	}

	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
