package sockets1;
import java.net.*;
import java.io.*;


public class Servidor {
    public static void main(String[] args) throws IOException {
        
        
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Servidor escuchando en puerto 3000...");
        Socket s = ss.accept();
        
        
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        
        String str = bf.readLine();
        System.out.println("Cliente digitó: " + str);
        
        String str1 = bf.readLine();
        System.out.println("Cliente digitó: " + str1);
        int d1 = Integer.parseInt(str);
        int d2 = Integer.parseInt(str1);
        
        System.out.println("Ejecutando Operación : " + str +" " + str1);

        
        
        
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(d1 + d2);
        System.out.println("Operación de Suma Efectuada y enviada");
        
        pr.println(d1 - d2);
        System.out.println("Operación de Resta Efectuada y enviada");
        
        pr.println(d1 * d2);
        System.out.println("Operación de Multiplicación Efectuada y enviada");

        pr.println(d1 / d2);
        System.out.println("Operación de División Efectuada y enviada");
        
        System.out.println("Cerrando Servicio...");
        pr.flush();
        
        System.out.println("Socket Apagado");
        
        
    }
    
}
