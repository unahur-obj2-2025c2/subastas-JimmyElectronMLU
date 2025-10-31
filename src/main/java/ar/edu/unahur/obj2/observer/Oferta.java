package ar.edu.unahur.obj2.observer;

public class Oferta {

    private Subastador subastador;
    private Double monto;

    public Oferta(Subastador subastador, Double monto) {
        this.subastador = subastador; 
        this.monto = monto;  
    }

    public Double getValor(){
        return monto;
    }

}
