package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        int res=suma(5,10,8);
        System.out.println(res);

        coche micoche = new coche();
        micoche.SumarPuerta();
        System.out.println("El numero de puertas es: " + micoche.puertas);

    }
    //Primera parte
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
//Segunda parte
class coche{
    public int puertas=0;

    public void SumarPuerta(){
        this.puertas++;
    }
}
