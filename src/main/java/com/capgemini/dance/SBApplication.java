package com.capgemini.dance;

import com.capgemini.dance.dj.entity.DJ;
import com.capgemini.dance.dj.repository.DJRepository;
import com.capgemini.dance.sets.entity.Sets;
import com.capgemini.dance.sets.repository.SetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SBApplication implements CommandLineRunner {

	private final SetsRepository setsRepository;
	private final DJRepository djRepository;

	@Autowired
	public SBApplication(SetsRepository setsRepository, DJRepository djRepository) {
		this.setsRepository = setsRepository;
		this.djRepository = djRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SBApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		DJ deron = new DJ(
				"Deron",
				25,
				"Electric"
		);

		DJ sanjin = new DJ(
				"Sanjin",
				25,
				"Rock"
		);

		Sets sets1 = new Sets(

		);

		Sets sets2 = new Sets();

		djRepository.saveAll(List.of(deron, sanjin));
		setsRepository.saveAll(List.of(sets1, sets2));
	}
}
