package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductoSubastado {

    private String nombre;
    private List<Subastador> subastadores = new ArrayList<Subastador>();
    private List<Oferta> ofertas = new ArrayList<Oferta>();

    public ProductoSubastado(String nombre) {
        this.nombre = nombre;
    }

    public void registrarSubastador(Subastador subastador) {
        this.subastadores.add(subastador);
    }

    public void agregarOferta(Oferta oferta) {
        this.ofertas.add(oferta); 
        notificarObservadores(oferta);   
    }

    private void notificarObservadores(Oferta oferta) {
        for (Subastador subastador : this.subastadores){
            subastador.actualizar(oferta);        
    } 
}

}
