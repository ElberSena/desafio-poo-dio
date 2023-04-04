import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("curso java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElber = new Dev();
        devElber.setNome("Elber");
        devElber.inscreverBoostcamp(bootcamp);
        System.out.println("Conteúdos inscritos Elber:" + devElber.getConteudosInscritos());
        devElber.progredir();
        devElber.progredir();
        devElber.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Elber:" + devElber.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Elber:" + devElber.getConteudosConcluidos());
        System.out.println("XP" + devElber.calcularTotalXP());

        System.out.println("--------------");

        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBoostcamp(bootcamp);
        System.out.println("Conteúdos inscritos Marcio:" + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Marcio:" + devElber.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcio:" + devMarcio.getConteudosConcluidos());
        System.out.println("XP" + devMarcio.calcularTotalXP());



    }
}