import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson Coelho");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anderson:" + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Anderson:" + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Anderson:" + devAnderson.getConteudosConcluidos());
        System.out.println("XP:" + devAnderson.calcularTotalXp());

        System.out.println("-------");

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mario:" + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        devMario.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mario:" + devMario.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mario:" + devMario.getConteudosConcluidos());
        System.out.println("XP:" + devMario.calcularTotalXp());

    }

}