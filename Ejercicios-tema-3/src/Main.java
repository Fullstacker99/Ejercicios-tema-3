package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=8;
        int res=suma(a,b,c);
        System.out.println(res);

        coche micoche = new coche();
        micoche.SumarPuerta();
        System.out.println(micoche.puertas);

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
