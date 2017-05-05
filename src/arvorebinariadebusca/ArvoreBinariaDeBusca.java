/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariadebusca;

/**
 *
 * @author karolina.gkallajian
 */
public class ArvoreBinariaDeBusca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABB abb = new ABB();
        
        abb.inserirNo(8, "a");
        abb.inserirNo(3, "b");
        abb.inserirNo(10, "c");
        abb.inserirNo(1, "d");
        abb.inserirNo(6, "e");
        abb.inserirNo(14, "f");
        abb.inserirNo(4, "g");
        abb.inserirNo(7, "h");
        
        abb.emOrdem(abb.raiz);
        System.out.println("");
        abb.preOrdem(abb.raiz);
        System.out.println("");
        abb.posOrdem(abb.raiz);
        System.out.println("");
        System.out.println(abb.buscarNo(6).nome);
    }
    
}
