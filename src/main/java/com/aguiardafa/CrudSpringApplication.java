package com.aguiardafa;

import com.aguiardafa.model.Curso;
import com.aguiardafa.repository.CursoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository){
		return args -> {
			cursoRepository.deleteAll();

			Curso c = new Curso();
			c.setNome("Angular");
			c.setCategoria("Front-end");
			cursoRepository.save(c);

			Curso c2 = new Curso();
			c2.setNome("Spring");
			c2.setCategoria("Back-end");
			cursoRepository.save(c2);
		};
	}
}
