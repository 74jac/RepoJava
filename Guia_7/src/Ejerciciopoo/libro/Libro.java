/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciopoo.libro;

/**
 *
 * @author JoséAgustín
 */

   
    public class Libro {

        public long ISBN;
        public String Titulo;
        public String Autor;
        public int NumeroPaginas;

        public Libro() {
        }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroPaginas) {
        this.ISBN = ISBN;     
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }
    
} 

