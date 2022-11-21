import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Curso curso1=new Curso("Curso java","descrição curso java",8);
Curso curso2=new Curso("Curso js","descrição curso js",4);

Mentoria mentoria=new Mentoria("mentoria java","descrição de mentoria", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}