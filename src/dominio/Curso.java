package dominio;

public class Curso extends Conteudos {

    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public Curso() {

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
