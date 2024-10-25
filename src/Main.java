import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("Elija el ejercicio que desea:\n" +
                                                             "1) EJERCICIO 1\n"+
                                                             "2) EJERCICIO 2\n"+
                                                             "3) EJERCICIO 3\n"+
                                                             "4) EJERCICIO 4\n"+
                                                             "5) EJERCICIO 5\n"+
                                                             "6) EJERCICIO 6\n"+
                                                             "0) SALIR");
            option = sc.nextInt();
            if(option==1){
                Ejercicios.punto1();
            } else if (option==2) {
                Ejercicios.punto2();
            } else if (option==3) {
                Ejercicios.punto3();
            } else if (option==4) {
                Ejercicios.punto4();
            } else if (option==5) {
                Ejercicios.punto5();
            } else if (option==6) {
                Ejercicios.punto6();
            } else if (option==0) {
                System.out.println("XXXXXX");
            } else {
                System.out.println("Opcion incorrecta. Vuelva a intentar...");
            }
        }while(option !=0);
    }
}