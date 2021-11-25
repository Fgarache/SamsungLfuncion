package llfunciones;

import java.util.Scanner;

public class LavadoraSamsug {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanca o de color? ");
        System.out.println("1: ropa blanca, 2: ropa de color");
        int tipoderopa = entrada.nextInt();

        System.out.println("cuantos kilos de ropa? ");
        int kilos = entrada.nextInt();




        LLFunciones mensaje = new LLFunciones(kilos, tipoderopa);

        mensaje.ciclofinalizado();



    }

}
