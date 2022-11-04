import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("É de arrepiar!");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("É de arrepiar!");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Super Mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1.getData());
        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Você aprende Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.InscreverBootcamp(bootcamp);
        System.out.println("Coteudos Incritos: " + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        System.out.println("Coteudos Concluidos: " + devLeonardo.getConteudosConcluidos());
        System.out.println("XP: " + devLeonardo.calcularXp());

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devJessica.getConteudosInscritos());
        devJessica.progredir();
        System.out.println("Conteudos Concluidos: " + devJessica.getConteudosConcluidos());
        System.out.println("XP: " + devJessica.calcularXp());

    }
}
