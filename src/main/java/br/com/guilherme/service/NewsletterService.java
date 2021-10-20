package br.com.guilherme.service;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;


import br.com.guilherme.model.Newsletter;
import br.com.guilherme.repository.NewsletterRepository;


@Service
public class NewsletterService {


	 @Autowired
	 private NewsletterRepository newsletterRepository;


	public Newsletter insert(Newsletter newsletter) {
		 return newsletterRepository.save(newsletter);
	}
	
	public Newsletter update(Newsletter newsletter) {
		 return newsletterRepository.save(newsletter);
	}
	
	


    public void remove(Integer id) {
        newsletterRepository.deleteById(id);
    }
}


   
    

    

    

