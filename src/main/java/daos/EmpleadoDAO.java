package daos;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import models.Empleado;

import java.util.List;

@ApplicationScoped
public class EmpleadoDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("empleadosPU");
    private final EntityManager em =emf.createEntityManager();

    public List<Empleado> obtenerTodos() {
        return em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
    }

    public void guardar(Empleado empleado) {
        em.persist(empleado);
    }
}
