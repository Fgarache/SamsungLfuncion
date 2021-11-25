package llfunciones;
/*      Samsung solicita el desarrollo de una clase programada en Java, para el
        funcionamiento lógico de su nueva línea de lavadoras, misma que puedan
        implementar sus programadores de manera sencilla en los programas

        desarrollados dentro de Samsung, con las siguientes características:

        Debe recibir los kilos de ropa y tipo de ropa a través de argumentos.

        Debe de realizar las funciones de llenado de agua, lavado y secado.

        La clase debe estar correctamente encapsulada, para evitar que los programadores
        de Samsung utilicen métodos o variables que no son necesarios.

        El único método disponible para importar, debe ser CicloFinalizado().*/


public class LLFunciones {
    private int kilos = 0, llenadocompleto = 0, tipoderopa = 0, lavadocompleto = 0, secadocompleto = 0;

    public LLFunciones(int kilos, int tipoderopa) {
        this.kilos = kilos;
        this.tipoderopa = tipoderopa;
    }


    private void llenado() {
        if (kilos <= 12) {
            llenadocompleto = 1;
            System.out.println("Llenando....");
            System.out.println("Llenado completo");
        } else {
            System.out.println("Limite superado, \nRedusca la cantidad");
        }

    }

    private void lavado() {
        llenado();
        if (llenadocompleto == 1) {
            if (tipoderopa == 1) {
                System.out.println("ropa blanca \n lavado suave");
                System.out.println("lavando....");
                lavadocompleto = 1;
            } else if (tipoderopa == 2) {
                System.out.println("ropa de color \n Lavado intenso");
                System.out.println("Lavando...");
                lavadocompleto = 1;
            } else {
                System.out.println("error");
            }
        }
    }

    private void secado() {
        lavado();
        if (lavadocompleto == 1) {
            System.out.println("Secando");
            secadocompleto = 1;
        }
    }

    public void ciclofinalizado() {
        secado();
        if (secadocompleto == 1) {
            System.out.println("la ropa esta lista");
        }


    }
}

