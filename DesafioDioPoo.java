/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.poo;

/**
 *
 * @author danil
 */
public class DesafioDioPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    Curso curso1 = new Curso();
//Aqui vai o valor Setado do Get e Set da Classe Curso
    curso1.setDescricao("Curso Java");
    curso1.setTitulo("Descrição do Curso Java");
    curso1.setCargaHoraria(8);
    //System.out.println(curso1);
        // TODO code application logic here.


Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
//bootcamp.setConteudosConcluidos().add(Curso1);
//bootcamp.setConteudosConcluidos().add(Curso2);
//bootcamp.setConteudosConcluidos().add(Mentoria);

Dev devDanilo = new Dev();
devDanilo.setNome("Danilo");
devDanilo.InscreverBootcamp(bootcamp);
System.out.println("Conteudo Inscritos: " + devDanilo.getConteudosInscritos());
devDanilo.progredir();
System.out.println("Conteudo Concluídos: " + devDanilo.getConteudosInscritos());


Dev devJoao = new Dev();
devJoao.setNome("Joao");
devDanilo.InscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: " + devJoao.getConteudosInscritos());
devJoao.progredir();
        System.out.println("Conteudo Concluídos: " + devJoao.getConteudosConcluidos());



}
}
