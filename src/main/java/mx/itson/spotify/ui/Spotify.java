/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.spotify.entities.Album;
import mx.itson.spotify.entities.Artista;
import mx.itson.spotify.entities.Cancion;

/**
 *
 * @author thinkpad
 */
public class Spotify {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Juice WRLD");
        artista.setPerfil("999");
        artista.setOyentesMensuales(29569526);
        artista.setFollowers(33100000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Lucid Dreams");
        cancion1.setDuracion(240);
        
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Black & White");
        cancion2.setDuracion(180);
        
        Cancion cancion3 = new Cancion();
        cancion3.setTitulo("All Girls Are The Same");
        cancion3.setDuracion(150);
        
        Cancion cancion4 = new Cancion();
        cancion4.setTitulo("Lean Wit Me");
        cancion4.setDuracion(150);
        
        List<Cancion> temas = new ArrayList<>();
        temas.add(cancion1);
        temas.add(cancion2);
        temas.add(cancion3);
        temas.add(cancion4);
        
        Album album = new Album();
        album.setNombre("Goodbye & Good Riddance");
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCanciones(temas);
        album.setGenero("Hip-Hop/Rap");
        
        
        
        System.out.println("Artista: " + album.getArtista().getNombre());
        System.out.println("Descripcion: " + album.getArtista().getPerfil());
        System.out.println("Seguidores: " + album.getArtista().getFollowers() + "   Oyentes mensuales: " + album.getArtista().getOyentesMensuales());
        
        //System.out.println("Oyentes Mensuales: " + album.getArtista().getOyentesMensuales());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Discografia:");
        System.out.println("Goodbye & Good Riddance - Genero: " + album.getGenero());
        
        //System.out.println("Discografia: " + album.getNombre() + "      Genero: " + album.getGenero());
        
        /*
        System.out.println(artista.getNombre());
        System.out.println(album.getNombre());
*/
        System.out.println("| 1 | " + temas.get(0).getTitulo() + "                     Duracion: " + temas.get(0).getDuracion());
        System.out.println("| 2 | " + temas.get(1).getTitulo() + "                    Duracion: " + temas.get(1).getDuracion());
        System.out.println("| 3 | " + temas.get(2).getTitulo() + "           Duracion: " + temas.get(2).getDuracion());
        System.out.println("| 4 | " + temas.get(3).getTitulo() + "                      Duracion: " + temas.get(3).getDuracion());
    }
}
