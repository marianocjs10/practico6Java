import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);

    public static void punto1(){
        ArrayList<Integer> lista1 = new ArrayList<>(); //Se crea el ArrayList.
        int num;
        while(true){
            System.out.println("---- Ingrese un valor al ArrayList o un valor negativo para salir: ----");
            num = sc.nextInt();
            if(num>=0) {
                lista1.add(num); //Se agrega al ArrayList el numero ingresado.
            } else {
                break;
            }
        }
        System.out.println("ArrayList ingresado: ");
        System.out.print("| ");
        for(Integer i : lista1){ //Se recorre el ArrayList para mostrar sus valores.
            System.out.print(i+" ");
        }
        System.out.println("|");
        System.out.println("------------------------------------------------");
    }

    public static void punto2(){
        int cantidad=20;
        ArrayList<Integer> lista2 = Metodos.cargaDeArrayList(cantidad);
        Integer mayor= lista2.get(0);
        Integer menor= lista2.get(0);
        for(Integer numero : lista2){
            if(numero > mayor){
                mayor=numero;
            }
            if(numero < menor){
                menor=numero;
            }
        }
        int rango = mayor - menor;
        System.out.println("N° Mayor: "+mayor+"\nN° Menor: "+menor+"\nRango: "+rango);
        System.out.println("------------------------------------------------");
    }

    public static void punto3(){
        ArrayList<Integer> lista3 = Metodos.cargaDePositivosPares();
        int suma=0;
        for(Integer i : lista3){
            suma += i;
        }
        int promedioAritmetico = suma/lista3.size();
        int mayor=0; int menor=0; int igual=0;
        for(Integer i : lista3){
            if(i > promedioAritmetico){
                mayor++;
            } else if (i < promedioAritmetico){
                menor++;
            } else if (i == promedioAritmetico) {
                igual++;
            }
        }
        System.out.println("El promedio aritmetico es: "+promedioAritmetico+"\n"+
                            "La cantidad de numeros mayores al promedio son: "+mayor+"\n"+
                            "La cantidad de numeros menores al promedio son: "+menor+"\n"+
                            "La cantidad de numeros iguales al promedio son: "+igual+"\n");
        System.out.println("------------------------------------------------");
    }

    public static void punto4(){
        ArrayList<Integer> lista4 = Metodos.cargaRandom();
        System.out.println("Indique el valor que desea encontrar: ");
        int numeroBuscado = sc.nextInt();
        boolean encontrado = lista4.contains(numeroBuscado);
        if(encontrado){
            System.out.println("El numero <"+numeroBuscado+"> esta en la posicion: <"+lista4.indexOf(numeroBuscado)+">");
        }else{
            System.out.println("El numero no fue encontrado.");
        }
        System.out.println("------------------------------------------------");
    }

    public static void punto5(){
        ArrayList<Integer> lista1 = Metodos.cargaDeArrayList(10);
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista2.addAll(lista1);
        lista3.addAll(lista1);
        lista2.sort(null);
        lista3.sort(Collections.reverseOrder());
        System.out.println("Array ordenado de forma ascendente:");
        Metodos.mostrarArrayList(lista2);
        System.out.println("Array ordenado de forma descendente:");
        Metodos.mostrarArrayList(lista3);
        System.out.println("------------------------------------------------");
    }

    public static void punto6(){
        while(true){
            System.out.print("Ingrese el contenido de la celda o FIN para terminar la carga de celdas: ");
            String valor = sc.nextLine();
            if(!valor.equalsIgnoreCase("FIN")) {
                System.out.println("Ingrese el numero de fila: ");
                int numeroDeFila = sc.nextInt();
                System.out.println("Ingrese el numero de columna: ");
                int numeroDeColumna = sc.nextInt();
                sc.nextLine();
                //Se crea la celda
                Celda celda = new Celda();
                celda.setValor(valor);
                celda.setFila(numeroDeFila);
                celda.setColumna(numeroDeColumna);
                //Se agrega la celda creada al ArrayList.
                Matriz.agregarCelda(celda);
            } else {
                break;
            }
        }
        Matriz.mostrarMatriz();
        System.out.println("Ingrese: 1) Buscar el valor de una celda - 2) Salir");
        //Buscar el valor de la celda atravez de la fila y columna.
        if(sc.nextInt()==1){
            System.out.println("BUSCAR EL VALOR DE UNA CELDA");
            System.out.println("Ingrese fila:");
            int filaBuscada=sc.nextInt();
            System.out.println("Ingrese columna:");
            int columnaBuscada=sc.nextInt();
            sc.nextLine();
            System.out.println(Matriz.obtenerValor(filaBuscada, columnaBuscada));
            System.out.println("FIN DEL PROGRAMA.");
        } else {
            System.out.println("FIN DEL PROGRAMA.");
        }
        System.out.println("------------------------------------------------");
    }
}
