package br.com.guilherme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.guilherme.model.Newsletter;

@Repository
public interface NewsletterRepository extends CrudRepository<Newsletter, Integer>{

}


