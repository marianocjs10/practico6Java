import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);

    public static void punto1(){
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        int num;
        System.out.println("---- Ingrese un valor al ArrayList o un valor negativo para salir: ----");
        do{
            System.out.print("");
            num = sc.nextInt();
            if(num>=0) {
                lista1.add(num);
            }
        } while(num >= 0);
        System.out.println("ArrayList ingresado: ");
        for(Integer i : lista1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    public static void punto2(){
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        for(int i=1; i<=20; i++){
            System.out.println("Ingrese el "+i+"° numero al ArrayList:");
            double num = (sc.nextDouble());
            lista2.add((int) num);
        }
        System.out.println("ArrayList ingresado: ");
        for(Integer i : lista2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        Integer mayor= lista2.get(0);
        Integer menor= lista2.get(0);
        for(Integer numero : lista2){
            if(numero > mayor){
                mayor=numero;
            }
            if(numero<menor){
                menor=numero;
            }
        }
        int rango = mayor - menor;
        System.out.println("N° Mayor: "+mayor+"\nN° Menor: "+menor+"\nRango: "+rango);
    }

    public static void punto3(){

    }
}
