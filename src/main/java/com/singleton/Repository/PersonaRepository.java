package com.singleton.Repository;

import com.singleton.config.AppConfig;
import com.singleton.entities.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository @Slf4j
public class PersonaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Persona getPersonabyIdentificacion(String identificacion, AnnotationConfigApplicationContext context) {
        Persona objPer= context.getBean("Persona", Persona.class);

        try {

            Query query = entityManager.createNativeQuery("Select * from Personas where Identificacion= :identificacion");
            query.setParameter("identificacion", identificacion);
            List<Object[]>  lista= query.getResultList();

            for (Object[] obj : lista) {
                objPer.setPersonaId((Integer)obj[0]);
                objPer.setNombre((obj[1]).toString());
                objPer.setGenero((obj[2]).toString());
                objPer.setEdad((Integer)obj[3]);
                objPer.setIdentificacion((obj[4]).toString());
                objPer.setDireccion((obj[5]).toString());
                objPer.setTelefono((obj[6]).toString());
            }
            entityManager.close();
        } catch (Exception e) {
            log.error("getPersonabyIdentificacion {}", e.getMessage());
        }
        return objPer;
    }


    @Transactional
    public boolean updatePersona(Persona persona) {
        int result=0;
        try {
            Query query = entityManager.createNativeQuery("UPDATE TransactionDB.dbo.Personas SET Nombre= :nombre, Genero= :genero, Edad= :edad, Identificacion= :identificacion, Direccion= :direccion, Telefono= :telefono WHERE PersonaID= :id");
            query.setParameter("id", persona.getPersonaId());
            query.setParameter("identificacion", persona.getIdentificacion());
            query.setParameter("nombre", persona.getNombre());
            query.setParameter("genero", persona.getGenero());
            query.setParameter("edad", persona.getEdad());
            query.setParameter("direccion", persona.getDireccion());
            query.setParameter("telefono", persona.getTelefono());
            result = query.executeUpdate();
            entityManager.close();
        } catch (Exception e) {
            log.error("updatePersona {}", e.getMessage());
        }

        return result > 0 ? true : false;
    }

}
