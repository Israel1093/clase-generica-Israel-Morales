public class Operacion <T>{
    private T cantidadUno;
    private T cantidadDos;
    private T resultado;

    /*public Operacion(T cantidadUno, T cantidadDos) {
        this.cantidadUno = cantidadUno;
        this.cantidadDos = cantidadDos;
    }

    public Operacion(T resultado) {
        this.resultado = resultado;
    }*/

    public T suma(T cantidadUno, T cantidadDos) {
        resultado = cantidadUno + cantidadDos;
        return resultado;
    }

    public double resta() {
        resultado = cantidadUno - cantidadDos;
        return resultado;
    }

    public double multiplicacion() {
        resultado = cantidadUno * cantidadDos;
        return resultado;
    }

    public double division() {
        resultado = cantidadUno / cantidadDos;
        return resultado;
    }
}
/*
public class Operacion {
    int cantidadUno;
    int cantidadDos;
    double resultado;

    public Operacion(int cantidadUno, int cantidadDos) {
        this.cantidadUno = cantidadUno;
        this.cantidadDos = cantidadDos;
    }

    public Operacion(double resultado) {
        this.resultado = resultado;
    }

    public double suma() {
        resultado = cantidadUno + cantidadDos;
        return resultado;
    }

    public double resta() {
        resultado = cantidadUno - cantidadDos;
        return resultado;
    }

    public double multiplicacion() {
        resultado = cantidadUno * cantidadDos;
        return resultado;
    }

    public double division() {
        resultado = cantidadUno / cantidadDos;
        return resultado;
    }
}

 */