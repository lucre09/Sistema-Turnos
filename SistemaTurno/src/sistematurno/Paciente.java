
package sistematurno;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Paciente {
    private int dni;
    private String nombre;
    private String apellido;
    private int numLegajo;
    private GregorianCalendar fechaNacimiento;
    private char sexo;
    private ObraSocial os;
    private ArrayList<Telefono> telefonos;
    private ArrayList<Direccion> direcciones;
    private ArrayList<HistoriaClinica> hc;

    public Paciente(int dni, String nombre, String apellido, int numLegajo, 
            GregorianCalendar fechaNacimiento, char sexo, ObraSocial os, 
            Telefono telefono, Direccion direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLegajo = numLegajo;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.os = os;
        this.telefonos = new ArrayList<>();
        this.direcciones = new ArrayList<>();
        this.hc = new ArrayList<>();
        this.addTelefono(telefono);
        this.addDireccion(direccion);
    }

    public void addTelefono(Telefono telefono) {
        this.telefonos.add(telefono);
    }

    public void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }
    
    public void addHistoriaClinica(HistoriaClinica hc){
        this.hc.add(hc);
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ObraSocial getOs() {
        return os;
    }

    public void setOs(ObraSocial os) {
        this.os = os;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public ArrayList<HistoriaClinica> getHc() {
        return hc;
    }

    public void setHc(ArrayList<HistoriaClinica> hc) {
        this.hc = hc;
    }
    
}
