package com.singleton;

import com.singleton.Repository.PersonaRepository;
import com.singleton.config.AppConfig;
import com.singleton.entities.Persona;
import com.singleton.utilities.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication @Slf4j
public class Actividad1SingletonApplication implements CommandLineRunner {

    @Autowired
    PersonaRepository repository;

    @Autowired
    Utils util;

    public static void main(String[] args) {
        log.info("STARTING THE APPLICATION");
        SpringApplication.run(Actividad1SingletonApplication.class, args);
        log.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Persona service1 = repository.getPersonabyIdentificacion("0930649314", context);
        int edadRandom=util.getRandomNumber(1,100);
        service1.setEdad(edadRandom);
        log.info(String.valueOf(service1.getEdad()));

        boolean update = repository.updatePersona(service1);
        log.info("Actualización exitosa: "+update);

        Persona service2 = context.getBean("Persona", Persona.class);
        log.info(String.valueOf(service2.getEdad()));
        context.close();
    }

}
