package sockets1;
import java.net.*;
import java.io.*;
import java.util.Scanner; 


public class Cliente {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer Número");
        int d1 = scan.nextInt();
        
        System.out.println("Ingrese Segundo número");
        int d2 = scan.nextInt(); 
        
        Socket s = new Socket("localhost", 3000);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(d1);
        pr.println(d2);
        
        pr.flush();
        
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        
        System.out.println("Recibiendo datos del Servidor ...");
        String str = bf.readLine();
        
        System.out.println("Suma: " + str);
        
        String str1 = bf.readLine();
        System.out.println("Resta: " + str1);
        
        String str3 = bf.readLine();
        System.out.println("Multiplicación: " + str3);
        
        String str4 = bf.readLine();
        System.out.println("División: " + str4);
        

    }
    
}
