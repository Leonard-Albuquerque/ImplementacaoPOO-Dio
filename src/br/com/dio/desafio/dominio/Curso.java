package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
   private int cargarHoraria;
    public Curso() { }
    public int getCargarHoraria() {
        return cargarHoraria;
    }
    public void setCargarHoraria(int cargarHoraria) {
        this.cargarHoraria = cargarHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargarHoraria=" + cargarHoraria +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargarHoraria;
    }
}
