package poo.util;

import poo.modelo.loja.Cliente;

import java.util.Date;

public class Teste {

    public static void Main(String args[]){
        var cliente = new Cliente();
        cliente.setDataNascimento();
       System.out.println(cliente.calcularIdade());
    }
}
