package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import java.util.Objects;

public class Dev {
    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

    public void InscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir() {
        Optional<Conteudos> conteudos = this.conteudosInscritos.stream().findFirst();
        if (conteudos.isPresent()) {
            this.conteudosConcluidos.add(conteudos.get());
            this.conteudosInscritos.remove(conteudos.get());

        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double calcularXp() {

        return this.conteudosConcluidos.stream().mapToDouble(conteudos -> conteudos.calcularXp()).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
