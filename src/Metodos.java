import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metodos {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> cargaDeArrayList(int cantidad){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=1; i<=cantidad; i++){
            System.out.println("Ingrese el "+i+"° numero al ArrayList:");
            lista.add(sc.nextInt());
        }
        System.out.println("ArrayList ingresado: ");
        for(Integer i : lista){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        return lista;
    }

    public static ArrayList<Integer> cargaDePositivosPares() {
        ArrayList<Integer> lista = new ArrayList<>();
        while(lista.size()<20){
            System.out.println("Ingrese un numero Positivo y Par:");
            int num = sc.nextInt();
            if (num >= 1 && num <= 100 && (num % 2 == 0)) {
                lista.add(num);
            } else {
                System.out.println("Error. Intente de nuevo...");
            }
        }
        System.out.println("ArrayList ingresado: ");
        for(Integer i : lista){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        return lista;
    }

    public static ArrayList<Integer> cargaRandom() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        while(lista.size()<50){
            int num = random.nextInt(101);
            lista.add(num);
        }
        System.out.println("ArrayList creado: ");
        for(Integer i : lista){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        return lista;
    }

    public static void mostrarArrayList(ArrayList<Integer> lista){
        for(Integer i : lista){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
