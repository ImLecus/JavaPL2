package poo.javabnb;
import java.util.Scanner;

public class Javabnb {


    public static void main(String[] args) {
        Client defaultClient = new Client("00000000E", "Usuario", "user@user.com", "password", "666666666");
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido. Escribe 'l' para hacer login y 'r' para registrarse.");
        String response = sc.nextLine();
        if("l".equals(response)){
            System.out.println("Introduce tu correo electrónico: ");
            String user = sc.nextLine();
            System.out.println("Introduce tu contraseña: ");
            String password = sc.nextLine();
            
            //Client client = getClientData(getUserInDataBase());
            if(user.equals(defaultClient.getMail()) && password.equals(defaultClient.getPassword())){
                Session session = Session.init(defaultClient);
                System.out.println(session.ID);
            }
            else{
                System.out.println("ERROR: Usuario o contraseña erróneos");
            }
        }
        else if ("r".equals(response)){
            System.out.println("¿Cuál será el nombre de usuario?");
        }
        else {
            // Error. No implementado ya que es una solución temporal
        }
    }
}
