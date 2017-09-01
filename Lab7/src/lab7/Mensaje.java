package lab7;

public class Mensaje {
    private int categoria;
    private String receptor;
    private String emisor;
    private String asunto;
    private String mensaje;

    public Mensaje() {
    }

    public Mensaje(int categoria, String receptor, String emisor, String mensaje) {
        this.categoria = categoria;
        this.receptor = receptor;
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return mensaje;
    }
}
