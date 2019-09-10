/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Models.Animal;
import clas.Cachorro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class CadastroAnimais {
    
    public static void main (String[] args){
        

           List <Cachorro> petadd = new ArrayList<>();
        Cachorro juao = new Cachorro();
         Cachorro juao2 = new Cachorro();
          Cachorro juao3 = new Cachorro();
           Cachorro juao4 = new Cachorro();
            Cachorro juao5 = new Cachorro();
             Cachorro juao6 = new Cachorro();
        juao.setNome("Bart");
          juao2.setNome("Cait");
            juao3.setNome("ijkJAS");
              juao4.setNome("junio");
                juao5.setNome("Boa noite bruno");
                  juao6.setNome("Sla");
                  
        petadd.add(juao);
        petadd.add(juao2);
        petadd.add(juao3);
        petadd.add(juao4);
        petadd.add(juao5);
        petadd.add(juao6);
        for(Cachorro ch: petadd){
            
            System.out.println(ch.getNome());
            System.out.println("");
            
        }
    }
    
}
