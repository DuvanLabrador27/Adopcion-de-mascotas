/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author duvan
 */
public class Mascota {
    
    private String nombre;
    private Genero genero;
    private TipoMascota tipoMascota;
    private String edad;
    private String raza;
    private Talla talla;
    private String descripcion;

    public Mascota() {
        
    }

    public Mascota(String nombre, Genero genero, TipoMascota tipoMascota, String edad, String raza, Talla talla, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipoMascota = tipoMascota;
        this.edad = edad;
        this.raza = raza;
        this.talla = talla;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        if (this.tipoMascota != other.tipoMascota) {
            return false;
        }
        if (this.talla != other.talla) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", genero=" + genero + ", tipoMascota=" + tipoMascota + ", edad=" + edad + ", raza=" + raza + ", talla=" + talla + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
    
}
