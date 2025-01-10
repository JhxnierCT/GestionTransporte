/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontransporte.clases;

/**
 *
 * @author COTAYA
 */
public abstract class Vehiculo {

    public double calcularDistancia(double velocidad) {
        return velocidad * 1;

    }

    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;

    }

    public double calcularDistancia(double velocidad, double tiempo, double constante) {
        return velocidad * tiempo * constante;

    }

    public void transportar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
