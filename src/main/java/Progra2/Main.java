package Progra2;

import Progra2.DTO.Estudiantes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        try{
            Estudiantes estudiante = new Estudiantes();
            estudiante.setNombre("Jorge");
            estudiante.setApellido("Hernandez");
            session.beginTransaction();
            System.out.println(estudiante.getIdestudiante());
            session.save(estudiante);
            session.getTransaction().commit();
            System.out.println("Se inicio la conexion");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}