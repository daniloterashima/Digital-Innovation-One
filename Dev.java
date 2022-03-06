package desafio.dio.poo;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author danil
 */
public class Dev {
private String nome;
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

public void InscreverBootcamp(Bootcamp bootcamp){
this.conteudosInscritos.addAll(bootcamp.getConteudosConcluidos());
bootcamp.getDevsInscritos().add(this);
}

public void progredir(){
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
if(conteudo.isPresent()) {
this.conteudosConcluidos.add(conteudo.get());
this.conteudosInscritos.remove(conteudo.get());
} else {
    System.err.println("Você não está matriculado em nenhum conteúdo");
}
}

//Curso Collections
public double calcularTotalXp() {
return this.conteudosConcluidos
            .stream()
            .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }






    
}
