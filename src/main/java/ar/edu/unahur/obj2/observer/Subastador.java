package ar.edu.unahur.obj2.observer;

public class Subastador {

    private String nombre;
    private Oferta ultimaOfertaRecibida;

    public Subastador(String nombre) {
        this.nombre = nombre;}

    public Oferta getUltimaOfertaRecibida() {
        return this.ultimaOfertaRecibida;
    }

    public void actualizar(Oferta oferta) {
        this.ultimaOfertaRecibida = oferta;
    }



}
