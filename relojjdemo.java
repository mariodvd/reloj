package dia3;

//rehacer

import java.util.Scanner;

//importamos relojj


public class relojjdemo {
    public static void main(String[] args) {
        try (//pedir al usuario que ingrese los segundos
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese los segundos: ");
            int s = scan.nextInt();
            //instanciar un objeto de la clase reloj, con el constructor de segundos
            relojj r1 = new relojj(s);
            //imprimir la hora
            System.out.println("Hora: "+r1.horas+" Minutos: "+r1.minutos+" Segundos: "+r1.segundos);
            //usar el metodo tick 10 veces
            for (int i = 0; i < 10; i++) {
                r1.tick();
            }
            
            System.out.println("Hora: "+r1.horas+" Minutos: "+r1.minutos+" Segundos: "+r1.segundos);
            reloj r2 = new reloj(10,20,30);
            System.out.println("Hora: "+r2.hora+" Minutos: "+r2.minutos+" Segundos: "+r2.segundos);
            r2.restarReloj(r2);
            System.out.println("Hora: "+r2.hora+" Minutos: "+r2.minutos+" Segundos: "+r2.segundos);
        }
    }
}
