package lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin_Usuarios {

    private ArrayList<Usuarios> lista = new ArrayList();
    private File f = null;

    public Admin_Usuarios() {
    }

    public Admin_Usuarios(String ruta) throws FileNotFoundException {
        f = new File(ruta);
        CargarArchivo();
    }

    public ArrayList<Usuarios> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuarios> lista) {
        this.lista = lista;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "lista=" + lista;
    }

    public void EscribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        try {
            fw = new FileWriter(f, false);
            bw = new BufferedWriter(fw);
            for (Usuarios s : lista) {
                bw.write(s.getNombre() + ";");
                bw.write(s.getApellido() + ";");
                bw.write(s.getCorreo() + ";");
                bw.write(df.format(s.getFecha()) + ";");
                bw.write(s.getPais() + ";");
                bw.write(s.getTelefono()+ ";");
                bw.write(s.getContraseña() + ";");
                for (Mensaje noleido : s.getNoleidos()) {
                    bw.write(noleido.getCategoria() + "∙");
                    bw.write(noleido.getReceptor() + "∙");
                    bw.write(noleido.getEmisor() + "∙");
                    bw.write(noleido.getAsunto()+ "∙");
                    bw.write(noleido.getMensaje() + "∙");
                }
                for (Mensaje noleido : s.getLeidos()) {
                    bw.write(noleido.getCategoria() + "°");
                    bw.write(noleido.getReceptor() + "°");
                    bw.write(noleido.getEmisor() + "°");
                    bw.write(noleido.getAsunto()+ "°");
                    bw.write(noleido.getMensaje() + "°");
                }
                for (Mensaje noleido : s.getNodeseados()) {
                    bw.write(noleido.getCategoria() + "•");
                    bw.write(noleido.getReceptor() + "•");
                    bw.write(noleido.getEmisor() + "•");
                    bw.write(noleido.getAsunto()+ "•");
                    bw.write(noleido.getMensaje() + "•");
                }
                for (Mensaje noleido : s.getSpam()) {
                    bw.write(noleido.getCategoria() + "○");
                    bw.write(noleido.getReceptor() + "○");
                    bw.write(noleido.getEmisor() + "○");
                    bw.write(noleido.getAsunto()+ "○");
                    bw.write(noleido.getMensaje() + "○");
                }  
                for (Mensaje noleido : s.getBorradores()) {
                    bw.write(noleido.getCategoria() + "■");
                    bw.write(noleido.getReceptor() + "■");
                    bw.write(noleido.getEmisor() + "■");
                    bw.write(noleido.getAsunto()+ "■");
                    bw.write(noleido.getMensaje() + "■");
                }  
                for (Mensaje noleido : s.getEnviados()) {
                    bw.write(noleido.getCategoria() + "◘");
                    bw.write(noleido.getReceptor() + "◘");
                    bw.write(noleido.getEmisor() + "◘");
                    bw.write(noleido.getAsunto()+ "◘");
                    bw.write(noleido.getMensaje() + "◘");
                }  
                for (Mensaje noleido : s.getEliminados()) {
                    bw.write(noleido.getCategoria() + "◙");
                    bw.write(noleido.getReceptor() + "◙");
                    bw.write(noleido.getEmisor() + "◙");
                    bw.write(noleido.getAsunto()+ "◙");
                    bw.write(noleido.getMensaje() + "◙");
                }  
                for (Mensaje noleido : s.getImportantes()) {
                    bw.write(noleido.getCategoria() + "☼");
                    bw.write(noleido.getReceptor() + "☼");
                    bw.write(noleido.getEmisor() + "☼");
                    bw.write(noleido.getAsunto()+ "☼");
                    bw.write(noleido.getMensaje() + "☼");
                }  
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo() throws FileNotFoundException {
        if (f.exists()) {
            DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
            Scanner lea = null;
            lista = new ArrayList();
            try {
                lea = new Scanner(f);
                lea.useDelimiter(";");
                while (lea.hasNext()) {
                    lista.add(new Usuarios(lea.next(), lea.next(), lea.next(), df.parse(lea.next()), lea.next(), lea.next(), lea.next()));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            lea.close();
        }
    }

}
