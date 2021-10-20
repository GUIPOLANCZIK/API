package br.com.guilherme.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.guilherme.model.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer> {

}
