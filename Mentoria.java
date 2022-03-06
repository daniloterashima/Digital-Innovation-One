//Mentoria é filha de Conteudo por causa do "Extends"
//Polimorfismo quando é filha e pode estanciar as demais


package desafio.dio.poo;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template..
 */

/**
 *
 * @author danil
 */
public abstract class Mentoria extends Conteudo{
   //private String titulo;
   //private String descricao;
   private LocalDate data;

@Override
public double calcularXp(){
return XP_PADRAO + 20d; 
}

    /*public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
  }

    public String getDescricao() {
    return descricao;
    }

    public void setDescricao(String descricao) {
    this.descricao = descricao;
    }*/

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
@Override
public String toString() {
return "Mentoria{" + 
        "titulo='" + getTitulo() + '\'' + 
        ", descricao='" + getDescricao() + '\'' + 
        ", data=" + data + 
    '}';
}

}

