import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {


    public static <Get> void main(String[] args) {
Curso curso1=new Curso("Curso java","descrição curso java",8);
Curso curso2=new Curso("Curso js","descrição curso js",4);

Mentoria mentoria=new Mentoria("mentoria java","descrição de mentoria", LocalDate.now());


        Bootcamp bootcamp=new Bootcamp("Bootcamp Java","Curso de java Poo");
            bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DevChesco=new Dev("Franchesco");
        DevChesco.increverBotcampo(bootcamp);
        System.out.println("Conteudos Incritos Chesco"+ DevChesco.getConteudosInscritos());
        DevChesco.progredir();
        DevChesco.progredir();

        System.out.println("--------");

        System.out.println("Conteudos concluidos Chesco"+ DevChesco.getConteudosConcluidos());
            System.out.println("XP: "+DevChesco.calcularTotalXp());


        System.out.println("********");

        Dev DevJoao=new Dev("João");
        DevJoao.increverBotcampo(bootcamp);

        System.out.println("Conteudos Incritos João"+ DevJoao.getConteudosInscritos());
        DevJoao.progredir();
        System.out.println("--------");
        System.out.println("Conteudos concluidos jOÃO"+ DevJoao.getConteudosConcluidos());
            System.out.println("XP: "+DevJoao.calcularTotalXp());
    }
}