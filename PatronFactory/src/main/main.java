package main;

import ico.fes.factory.DispositivosFactory;

public class main {
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            System.out.println(DispositivosFactory.createDispositivo(i+1));
        }
    }
}
