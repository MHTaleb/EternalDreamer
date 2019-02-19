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
public class Fils extends Pere{

    @Override
    public void direBonjour() {
        //super.direBonjour(); // cela va afficher dire bonjour du papa en cas tu enlee les commentaire
        System.out.println("le Fils a herité dire bonjour et l as redefinit via un heritage");
    }
    
}
