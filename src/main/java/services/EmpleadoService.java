package services;

import daos.EmpleadoDAO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import models.Empleado;

import java.util.List;

@ApplicationScoped
public class EmpleadoService {

    @Inject
    private EmpleadoDAO dao;

    public List<Empleado> listarEmpleados() {
        return dao.obtenerTodos();
    }

    public void crearEmpleado(String nombre, String cargo) {
        Empleado emp = new Empleado(nombre, cargo);
        dao.guardar(emp);
    }
}
