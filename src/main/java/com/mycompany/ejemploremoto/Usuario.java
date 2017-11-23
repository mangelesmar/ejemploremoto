/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploremoto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formacion
 */
class Usuario {
    List<Pelicula> peliculas = new ArrayList<>();
    
    List<Pelicula> listaPeliculas() {
        return peliculas;
    }    
}
