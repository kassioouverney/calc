/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daves
 */
public class Calculadora {

    private double valor1, valor2;

    public Calculadora() {
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double adicao() {
        return valor1 + valor2;
    }

    public double subtracao() {
        return valor1 - valor2;
    }

    public double multiplicacao() {
        return valor1 * valor2;
    }

    public double divisao() throws Exception {
        if (valor2 ==0){
            throw new Exception("Divisão por zero");
        }
        return valor1 / valor2;
    }

    public double percentual() {
        return valor1 * (valor2/110);
    }

    
    public double elevado() {
        return Math.pow(valor1, valor2);
    }
    
}
