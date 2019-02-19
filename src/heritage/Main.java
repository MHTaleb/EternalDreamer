/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 *
 * @author win 10
 */
public class Main{
    public static void main(String[] args) {
        
        
        // ici on va tester notre heritage Methode 1
        Pere p = new Pere();
        p.direBonjour();
        
        Fils f = new Fils();
        f.direBonjour();
        
        // ici methode 2 on va redefinir pendant l instantiation
        Fils f2 = new Fils(){
            @Override
            public void direBonjour() {
                System.out.println("dire bonjour specifique a f2 seulement");
            }
          
        };
        
        Fils f3 = new Fils();
        
        f2.direBonjour();
        f3.direBonjour();
        
    }
}
