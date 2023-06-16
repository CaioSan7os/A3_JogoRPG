
package a3_jogo_uam.Historia;

public class Historia {
    
    //Atributos
    private int duracao;
    private int cenario;
    
    
    //Construtor
    public Historia(int duracao, int cenario){
          this.duracao = duracao;
          this.cenario = cenario;
        
        switch(cenario) {
            case 1 -> System.out.println("Estamos na Floresta");
            
            case 2 -> System.out.println("Estamos no Deserto");
            
            case 3 -> System.out.println("Estamos numa Cidade abandonada");
            
            case 4 -> System.out.println("Estamos na Caverna");
            
            default -> System.out.println("Opção inexistene, tente novamente!! HISTORIA");
        }
          
    }

    
    
    //Getters & Setters

    public int getDuracao() {
        return duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public int getCenario() {
        return cenario;
    }

    public void setCenario(int cenario) {
        this.cenario = cenario;
    }
    
    
    //Outros métodos
    public void contarHistoria() { 


    }
    
//    public void contarInimigos() { 
//        
//        if(cenario == 1) {
//            inimigo.nome;
//        }
//    }
    
    
}
