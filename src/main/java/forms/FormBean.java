package forms;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import models.Empleado;
import services.EmpleadoService;

import java.io.Serializable;
import java.util.List;

@Named("empleadoBean")
@ViewScoped
public class FormBean implements Serializable {

    @Inject
    private EmpleadoService empleadoService;

    private List<Empleado> empleados;

    @PostConstruct
    public void init() {
        empleados = empleadoService.listarEmpleados();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
