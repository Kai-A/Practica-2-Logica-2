import java.util.Random;

public class Matriz {
    //Atributos privador de la clase matriz

    private static  int matriz[][];

//Constructor

    public Matriz(int n) {
        matriz= new int[n][n];
    }

    //Metodo de llenado de la matriz

    public void Llenar(){
        Random aleatorio = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(1000);
            }
        }
    }
    public void Mostrar(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    public void sumarDatos(){
        int c=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
               c=matriz[i][j]+c;
            }
        }
        System.out.println(c);
    }

    public void pintaMayor(){
        int c=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                if(matriz[i][j]>c){
                    c=matriz[i][j];
                }
            }
        }
        System.out.println(c);
    }

    public void pintaMenor(){
        int c=1000;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                if(matriz[i][j]<c){
                    c=matriz[i][j];
                }
            }
        }
        System.out.println(c);
    }

    public void pintaMayorFila(){
        for(int i=0; i<matriz.length; i++){
            int c=0;
            for(int j=0; j<matriz.length; j++) {
                if(matriz[i][j]>c){
                    c=matriz[i][j];
                }
            }
            System.out.println(c);
        }
    }
    public void pintaMayorColumna(){
        for(int i=0; i<matriz.length; i++){
            int c=0;
            for(int j=0; j<matriz.length; j++) {
                if(matriz[j][i]>c){
                    c=matriz[i][j];
                }
            }
            System.out.println(c);
        }
    }

}
