package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos {

    private LocalDate data;

    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
