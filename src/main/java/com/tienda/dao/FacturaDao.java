package com.tienda.dao;

import com.tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface FacturaDao extends JpaRepository<Factura, Long> {

}
