package poo.javabnb;
import java.util.Scanner;

public class Javabnb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido. Escribe 'l' para hacer login y 'r' para registrarse.");
        String response = sc.nextLine();
        if("l".equals(response)){
            System.out.println("Introduce tu nombre de usuario: ");
            String user = sc.nextLine();
            System.out.println("Introduce tu contraseña: ");
            String password = sc.nextLine();
            
            // String entry <= getUserInDataBase();
            
            /**
             * 
             * Una vez iniciado sesión y comprobado que el usuario existe, se instancia un objeto
             * Session con el Client designado
            */
            
            //Client client = getClientData(/*entry*/);
        }
        else if ("r".equals(response)){
            System.out.println("¿Cuál será el nombre de usuario?");
        }
        else {
            // Error. No implementado ya que es una solución temporal
        }
    }
}
