import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
     Curso curso1 = new Curso();
     curso1.setTitulo("Curso Java");
     curso1.setDescricao("descrição curso Java");
     curso1.setCargarHoraria(8);

     Curso curso2 = new Curso();
     curso2.setTitulo("Curso JS");
     curso2.setDescricao("descrição curso Js");
     curso2.setCargarHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJames = new Dev();
        devJames.setNome("James");
        devJames.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos James : " + devJames.getConteudosInscritos());
        devJames.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos James : " + devJames.getConteudosInscritos());
        System.out.println("Conteudos Concluidos James : " + devJames.getConteudosConcluidos());
        devJames.progredir();
        System.out.println("XP: " + devJames.calcularTotalXp());


        System.out.println("============");

        Dev devLevy = new Dev();
        devLevy.setNome("Levy");
        devLevy.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Levy : " + devLevy.getConteudosInscritos());
        devLevy.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Levy : " + devLevy.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Levy : " + devLevy.getConteudosConcluidos());
        System.out.println("XP:" + devLevy.calcularTotalXp());

    }
}