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
public class NoArvore {
    protected int dado;
    protected String nome;
    protected NoArvore FilhoEsquerdo, FilhoDireito;
    
    public NoArvore(int dado,String nome){
        this.dado = dado;
        this.nome = nome;
        this.FilhoDireito = null;
        this.FilhoEsquerdo = null;
    }
    
}
