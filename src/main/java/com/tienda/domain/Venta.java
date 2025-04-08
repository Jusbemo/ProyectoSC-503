package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "Venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private long idVenta;

    private long idProducto;
    private long idFactura;

    private int cantidad;

    private double precio;



    public Venta() {
    }


    public Venta(long idProducto, long idFactura, int cantidad, double precio) {
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.precio = precio;
    }

}
