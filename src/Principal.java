import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido\n Ingrese el tamaño de la matriz"));
        Matriz matriz= new Matriz(n);


        matriz.Llenar();

        //este metodo no hay que hacerlo, solo es para ver si se llena la matriz correctamente
        matriz.Mostrar();


        matriz.sumarDatos();

        matriz.pintaMayor();

        matriz.pintaMenor();

        matriz.pintaMayorFila();

        matriz.pintaMayorColumna();
    }
}
