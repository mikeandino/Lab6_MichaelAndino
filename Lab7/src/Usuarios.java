
import java.util.ArrayList;
import java.util.Date;

public class Usuarios {

    private String nombre;
    private String apellido;
    private String correo;    
    private Date fecha;
    private String pais;
    private String telefono;
    private String contraseña;
    private ArrayList<Mensaje> noleidos = new ArrayList();
    private ArrayList<Mensaje> leidos = new ArrayList();
    private ArrayList<Mensaje> nodeseados = new ArrayList();
    private ArrayList<Mensaje> spam = new ArrayList();
    private ArrayList<Mensaje> borradores = new ArrayList();
    private ArrayList<Mensaje> enviados = new ArrayList();
    private ArrayList<Mensaje> importantes = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String correo, Date fecha, String pais, String telefono, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.telefono = telefono;
        this.contraseña = contraseña;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Mensaje> getNoleidos() {
        return noleidos;
    }

    public void setNoleidos(ArrayList<Mensaje> noleidos) {
        this.noleidos = noleidos;
    }

    public ArrayList<Mensaje> getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList<Mensaje> leidos) {
        this.leidos = leidos;
    }

    public ArrayList<Mensaje> getNodeseados() {
        return nodeseados;
    }

    public void setNodeseados(ArrayList<Mensaje> nodeseados) {
        this.nodeseados = nodeseados;
    }

    public ArrayList<Mensaje> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Mensaje> spam) {
        this.spam = spam;
    }

    public ArrayList<Mensaje> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Mensaje> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Mensaje> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<Mensaje> enviados) {
        this.enviados = enviados;
    }

    public ArrayList<Mensaje> getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList<Mensaje> importantes) {
        this.importantes = importantes;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + '}';
    }
}
