package com.example.practica01;

public class Aritmetica {
    private double n1;
    private double n2;

    public Aritmetica() {
    }

    public Aritmetica(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double Suma(){
        return n1 + n2;
    }

    public double Resta(){
        return n1 - n2;
    }

    public double Multi(){
        return n1 * n2;
    }

    public double Div(){
        double div = n1 / n2;
        return div;
    }
}
