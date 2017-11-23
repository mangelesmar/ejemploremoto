/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploremoto;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class EjemploTest {
    
    public EjemploTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

/*
    Como un usuario, quiero poder añadir una película
	a mi lista de películas
*/
     @Test
     public void annadirPeliculaTest() {
         Usuario u = new Usuario();
         Pelicula p = new Pelicula();
         List<Pelicula> l = u.listaPeliculas();
         l.add(p);
     }
}
