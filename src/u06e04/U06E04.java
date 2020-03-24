
package u06e04;


import java.util.Scanner;

public class U06E04 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[10];
        for(int i=0; i<valores.length; i++){
            valores[i]=Math.round(Math.random()*100);
            //System.out.println(valores[i]);
        }
        imprimeArray(valores);
        promedioArray(valores);
    }
    static void imprimeArray(double[] a){
        for (int i=0; i<a.length; i++){
            System.out.println((int)a[i]);
        }
    }
    static void promedioArray (double[] a){
        double z=0;
        int x;
        for(x=0; x<a.length; x++){
            z = a[x]+z;
        }    
        System.out.print("\nEl promedio de los valores del array es: "+(z/a.length));
    }
}