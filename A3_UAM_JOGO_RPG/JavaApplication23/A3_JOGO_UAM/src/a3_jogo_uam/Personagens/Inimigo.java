
package a3_jogo_uam.Personagens;

import java.util.Random;

public class Inimigo extends Personagem {


    String[] nomes = {"Mago", "Sandmonster", "Zumbi", "Killer"};
    Random random = new Random();

    public Inimigo() {
        int i = random.nextInt(nomes.length);

        if (nomes[i].equals("Mago")) {
            
            super.setNome(nomes[i]);
            super.setVida(2);
            super.setAtaque(1);
            super.setDefesa(2);
            
        } 
        
        
        else if (nomes[i].equals("Sandmonster")) {
            
            super.setNome(nomes[i]);
            super.setVida(5);
            super.setAtaque(3);
            super.setDefesa(5);
            
            
        } 
        
          else if (nomes[i].equals("Zumbi")) {
            
            super.setNome(nomes[i]);
            super.setVida(3);
            super.setAtaque(5);
            super.setDefesa(6);
          }
        else {
            
            super.setNome(nomes[i]);
            super.setVida(3);
            super.setAtaque(2);
            super.setDefesa(1);
        }
    }

    @Override
    public int atacar() {
        if(super.getNome().equals("Mago")) {
            System.out.println("Ataque de FireBall");
            
        } else if(super.getNome().equals("Sandman")) {
            System.out.println("Ataque murro de Areia");
            
        }
        
         else if(super.getNome().equals("Zumbi")) {
            System.out.println("Ataque de Mordida Mortal");
            
        }
         else {
            System.out.println("Ataque de lançamento de Facas");
        }
        return super.getAtaque();
    }


    public String toString() {
        return "\nSeu inimigo será... \nNome:" + super.getNome() + "\nVida: " + super.getVida() ;
//                "\nAtaque: " + super.getAtaque() + "\nDefesa: " + super.getDefesa();
    }

}

