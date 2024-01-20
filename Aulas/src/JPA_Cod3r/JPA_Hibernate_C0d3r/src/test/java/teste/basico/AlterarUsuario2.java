package teste.basico;

import org.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,3L);
        usuario.setNome("Biancaa");
        // em.merge(usuario); // UPDATE
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
