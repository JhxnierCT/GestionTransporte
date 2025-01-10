
package com.mycompany.gestiontransporte;

import com.mycompany.gestiontransporte.clases.Avion;
import com.mycompany.gestiontransporte.clases.Carro;
import com.mycompany.gestiontransporte.clases.Moto;
import com.mycompany.gestiontransporte.clases.Vehiculo;

public class GestionTransporte {

    public static void main(String[] args) {
        
        Vehiculo carro = new Carro();
        Vehiculo avion = new Avion();
        Vehiculo moto = new Moto();
        
        System.out.println("Calculo de distancia para un carro");
        System.out.println("Distancia(solo velocidad):"+carro.calcularDistancia(50));
        System.out.println("Distancia(velocidad y tiempo):"+carro.calcularDistancia(50, 2));
        System.out.println("Distancia(velocidad, tiempo y constante"+carro.calcularDistancia(50, 2, 2));
        
        System.out.println("Metodos polimorfismos dinamicos:");
        Vehiculo vehiculos[]= {carro, avion, moto};
        for(int i=0;i<vehiculos.length;i++){
            vehiculos[i].transportar();
        }
        
    }
}
