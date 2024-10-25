import java.util.ArrayList;

public class Matriz {
    static ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public static void agregarCelda(Celda celda){
        matrizCuadrada.add(celda);
    }

    public static void mostrarMatriz(){
        for(Celda celda:matrizCuadrada){
            System.out.println("| Fila: "+celda.getFila()+" | Columna: "+celda.getColumna()+" | Valor: "+celda.getValor());
            System.out.println("------------------------------------------------");
        }
    }

    public static String obtenerValor(int fila, int columna){
        for(Celda celda : matrizCuadrada){
            if(celda.getFila() == fila && celda.getColumna()==columna){
                return "EL valor de la celda es: "+celda.getValor();
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }
}


