package edu.huan.segundasemana;
public class Soneca {
    
    public static void main(String[] args){
        String primeiroNome = "Huan";
        String segundoNome = "Salomao";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método nomeCompleto: " +  primeiroNome.concat(" ").concat(segundoNome);
    }
}
