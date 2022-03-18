package br.ulbra.classes;

public class Pessoa {
    
    private double peso;
    private double altura;

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public Pessoa() {
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularIMC(){
        double IMC = this.peso/(Math.pow(this.altura, 2));
        return IMC;
    }
    public String mostrarIMC(){
        String resposta = "";
        if (calcularIMC() < 18.5){
            resposta = "Você está abaixo do peso ideal.";
        } else if (calcularIMC() >= 18.5 && calcularIMC() <= 24.99){
            resposta = "Parabéns, você está em seu peso normal!";
        } else if (calcularIMC() >= 25.0 && calcularIMC() <= 29.99){
            resposta = "Você está acima do seu peso(sobrepeso)";
        } else if (calcularIMC() >= 30.0 && calcularIMC() <= 34.99){
            resposta = "Obesidade grau I";
        } else if (calcularIMC() >= 35.0 && calcularIMC() <= 39.99){
            resposta = "Obesidade grau II";
        } else { 
            resposta = "Obdesidade grau III";
        }
        return resposta;
    }
    
    public String toString(){
        return "Sua altura é: " + getAltura() + " m" +
               "\nSeu peso é: " + getPeso() + " Kg" +
               "\nSeu IMC é: " + calcularIMC() +
               "\n" + mostrarIMC();
    }
}
