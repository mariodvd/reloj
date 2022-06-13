package dia3;

//ejercicio del relojj

public class relojj {
    //declarar instancias 
    int horas, minutos, segundos;

    //por default
    public relojj(){
        horas=12;
        minutos=0;
        segundos=0;
    }

    //constructor con 3 paramaetros
    public relojj(int h, int m, int s){
        horas=h;
        minutos=m;
        segundos=s;
    }

    //constructor con 1 parametro
    public relojj(int s){
        horas=s/3600;
        s&=3600;
        minutos=s/60;
        s%=60;
        segundos=s;
    }

    //metodos

    //set sirve para cambiar el valor de las variables
    //get sirve para obtener el valor de las variables
    
    //metodo setReloj
    //void no retorna nada 
    public void setReloj(int s){
        horas=s/3600;
        s&=3600;
        minutos=s/60;
        s%=60;
        segundos=s;
    }

    //metodo getReloj(), getMinutos(), getSegundos()
    public int getReloj(){
        return horas;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }

    //metodo set horas , minutos y segundos
    public void setHoras(int h){
        horas=h;
    }
    public void setMinutos(int m){
        minutos=m;
    }
    public void setSegundos(int s){
        segundos=s;
    }

    //metodo tick que incrementa 1 segundo
    public void tick(){
        segundos++;
        if (segundos==60){
            segundos=0;
            minutos++;
            if (minutos==60){
                minutos=0;
                horas++;
                if (horas==24){
                    horas=0;
                }
            }
        }
    }
   
    //metodo addReloj() que debe agregar la hora representada por el objeto en la clase actual
    public void addReloj(relojj r3){ //le agrego las variables de horas, minutos, segundos
        horas+=r3.horas;
        minutos+=r3.minutos;
        segundos+=r3.segundos;
        if (segundos>=60){
            segundos-=60;
            minutos++;
        }
        if (minutos>=60){
            minutos-=60;
            horas++;
        }
        if (horas>=24){
            horas-=24;
        }
    }

    //metodo to string
    public String toString(){
        return horas+":"+minutos+":"+segundos;
    }
   
    //metodo tick decrementa 1 segundo
    public void tick2(){
        segundos--;
        if (segundos==-1){
            segundos=59;
            minutos--;
            if (minutos==-1){
                minutos=59;
                horas--;
                if (horas==-1){
                    horas=23;
                }
            }
        }
    }

    //metodo restareloj
    public void restaReloj(relojj r3){
        horas-=r3.horas;
        minutos-=r3.minutos;
        segundos-=r3.segundos;
        if (segundos<0){
            segundos+=60;
            minutos--;
        }
        if (minutos<0){
            minutos+=60;
            horas--;
        }
        if (horas<0){
            horas+=24;
        }
    }

    //llamar e imprimir 
    public static void main(String[] args){
        
        relojj r1 = new relojj();  //reloj default
        System.out.println("horas: "+r1.horas+" minutos: "+r1.minutos+" segundos: "+r1.segundos);

        relojj r2 = new relojj(22,10,13); //reloj con 3 parametros
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);

        relojj r3 = new relojj(50000); //reloj con 1 parametro
        System.out.println("horas: "+r3.horas+" minutos: "+r3.minutos+" segundos: "+r3.segundos);

        //llamamos al metodo setReloj para cambiar el valor en este caso por segundos
        r3.setReloj(80000);
        System.out.println("horas: "+r3.horas+" minutos: "+r3.minutos+" segundos: "+r3.segundos);

        //llamamos al metodo getReloj para obtener el valor en este caso de las horas, minutos, segundos
        System.out.println("horas: "+r2.getReloj()+" minutos: "+r2.getMinutos()+" segundos: "+r2.getSegundos());

        //llamamos al metodo set horas, minutos y segundos
        r2.setHoras(10);
        r2.setMinutos(20);
        r2.setSegundos(30);
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);

        //llamamos al metodo tick
        r2.tick(); //incrementa 1 segundo mi reloj 2
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);

        //llamamos al metodo addReloj
        r2.addReloj(r3); //sumo las horas, minutos, segundos del reloj 3
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);
        
        //probamos el metodo string
        System.out.println(r2.toString());

        //decrementamos en un segundo por el metodo tick2
        r2.tick2();
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);
        
        //llamamos al metodo restaReloj
        r2.restaReloj(r3); //resto las horas, minutos, segundos del reloj 3
        System.out.println("horas: "+r2.horas+" minutos: "+r2.minutos+" segundos: "+r2.segundos);
    }
}