/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author gabri
 */
public class Contador {
    
    
    
    public String Animation (String ret){
        
        String j = null;
        
        return j;
    }
    
public static void main (String[] args){
    

    int result = 1;
    int result2 = 1;
    final long segundos = (1000);
    Timer timer = new Timer();
    TimerTask tarefa;
    tarefa = new TimerTask() {
        @Override
        public void run() {
            
            for(int i = 0; i <=30; i++){
       System.out.println(result+result2);
            }
          
    };
    };
    
    timer.scheduleAtFixedRate(tarefa, 0, segundos);
    
}
    
}
