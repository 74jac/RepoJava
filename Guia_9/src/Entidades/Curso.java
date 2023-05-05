/*
 clase entidad
    - Curso:
       - atributos: nombreCurso
                   cantidadHorasPorDia
                   cantidadDiasPorSemana, 
                   turno (mañana o tarde)
                   precioPorHora
                   alumnos. (Donde alumnos  es un arreglo de tipo String de dimensión 5 (cinco), 
                            donde se alojarán los nombres de cada alumno. 
       - métodos:
                    Un constructor por defecto.
                    Un constructor con todos los atributos como parámetro.
                    Métodos getters y setters de cada atributo.
 */
package Entidades;

/**
 *
 * @author PC SABRINA
 */
public class Curso {
    
    
    //atributos
    String nombreCurso;
    int cantidadHoraspordia;
    int cantidadDiasPorSemana;
    String turno;
    double precioPorHora;
    public String[] alumnos=new String[5];
    
    //constructor

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHoraspordia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoraspordia = cantidadHoraspordia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }
    
    // get set

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoraspordia() {
        return cantidadHoraspordia;
    }

    public void setCantidadHoraspordia(int cantidadHoraspordia) {
        this.cantidadHoraspordia = cantidadHoraspordia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
    
    
    
    
}
