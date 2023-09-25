import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        // ejecutar una aplicacion
        //Runtime.getRuntime().exec("notepad.exe");

        // sacar el directorio de trabajo
        //System.out.println("homeDirectory= " + System.getProperty("user.home"));
        // sacar el sistema operativo
        //System.out.println("osname: " + System.getProperty("os.name").toLowerCase());

        try{
            // abrir navegador por defecto
            Runtime.getRuntime().exec("explorer http://localhost:8153/go");
        } catch (IOException e1){

        }






    }


}
