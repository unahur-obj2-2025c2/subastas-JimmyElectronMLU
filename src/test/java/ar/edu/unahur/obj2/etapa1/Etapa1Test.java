package ar.edu.unahur.obj2.etapa1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.observer.Oferta;
import ar.edu.unahur.obj2.observer.ProductoSubastado;
import ar.edu.unahur.obj2.observer.Subastador;

public class Etapa1Test {
    @Test
    public void subastadorRecibeLaOferta(){
        ProductoSubastado producto = new ProductoSubastado("cuadro de picasso");
        Subastador gonzager = new Subastador("gonzager");

        producto.registrarSubastador(gonzager);
        producto.agregarOferta(new Oferta(gonzager, 10.0));

        assertEquals(10, gonzager.getUltimaOfertaRecibida().getValor(), 0.01);
    }
    
    @Test
    public void subastadorRecibeLaUltimaOferta(){
        ProductoSubastado producto = new ProductoSubastado("un cacharrito");
        Subastador gonzager = new Subastador("gonzager");
        Subastador diazdan = new Subastador("diazdan");

        producto.registrarSubastador(gonzager);
        producto.registrarSubastador(diazdan);

        producto.agregarOferta(new Oferta(diazdan, 10.0));
        producto.agregarOferta(new Oferta(gonzager, 20.0));
        producto.agregarOferta(new Oferta(diazdan, 30.0));


        assertEquals(30, gonzager.getUltimaOfertaRecibida().getValor(), 0.01);
        assertEquals(30, gonzager.getUltimaOfertaRecibida().getValor(), 0.01);
    }
}
