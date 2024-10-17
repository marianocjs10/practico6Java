import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("Elija el numero del ejercicio que desea o 0 para salir:");
            option = sc.nextInt();
            if(option==1){
                Ejercicios.punto1();
            } else if (option==2) {
                Ejercicios.punto2();
            } else if (option==3) {
                Ejercicios.punto3();
            }
        }while(option !=0);
    }
}