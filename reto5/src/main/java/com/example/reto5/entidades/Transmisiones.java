/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5.entidades;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author juan sebastian
 */
@Entity
public class Transmisiones {
    @Id
    Integer idTransmisiones;
    @OneToMany(mappedBy = "alias")
    Set<Usuario> Usuario_alias;
    @OneToMany(mappedBy = "idContenidos")
    Set<Contenidos> Contenidos_idContenidos;
    // Pendiente Fecha_Hora

    public Integer getIdTransmisiones() {
        return idTransmisiones;
    }

    public void setIdTransmisiones(Integer idTransmisiones) {
        this.idTransmisiones = idTransmisiones;
    }

    public Set<Usuario> getUsuario_alias() {
        return Usuario_alias;
    }

    public void setUsuario_alias(Set<Usuario> Usuario_alias) {
        this.Usuario_alias = Usuario_alias;
    }

    public Set<Contenidos> getContenidos_idContenidos() {
        return Contenidos_idContenidos;
    }

    public void setContenidos_idContenidos(Set<Contenidos> Contenidos_idContenidos) {
        this.Contenidos_idContenidos = Contenidos_idContenidos;
    }

    @Override
    public String toString() {
        return "transmisiones{" + "idTransmisiones=" + idTransmisiones + ", Usuario_alias=" + Usuario_alias + ", Contenidos_idContenidos=" + Contenidos_idContenidos + '}';
    }

}
