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
public class ABB {

    NoArvore raiz;

    public ABB() {
        this.raiz = null;
    }

    public void inserirNo(int dado, String nome) {
        NoArvore novo = new NoArvore(dado, nome);
        if (raiz == null) {
            raiz = novo;
        } else {
            NoArvore auxiliar = raiz;
            NoArvore pai;
            while (true) {
                pai = auxiliar;
                if (dado < auxiliar.dado) {
                    auxiliar = auxiliar.FilhoEsquerdo;
                    if (auxiliar == null) {
                        pai.FilhoEsquerdo = novo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.FilhoDireito;
                    if (auxiliar == null) {
                        pai.FilhoDireito = novo;
                        return;
                    }
                }
            }
        }
    }

    public void emOrdem(NoArvore r) {
        if (r != null) {
            emOrdem(r.FilhoEsquerdo);
            System.out.print(r.dado + " ");
            emOrdem(r.FilhoDireito);
        }
    }

    public void preOrdem(NoArvore r) {
        if (r != null) {
            System.out.print(r.dado + " ");
            preOrdem(r.FilhoEsquerdo);
            preOrdem(r.FilhoDireito);
        }
    }

    public void posOrdem(NoArvore r) {
        if (r != null) {
            posOrdem(r.FilhoEsquerdo);
            posOrdem(r.FilhoDireito);
            System.out.print(r.dado + " ");
        }
    }

    public NoArvore buscarNo(int dado) {
        NoArvore aux = raiz;
        while (aux.dado != dado) {
            if (dado < aux.dado) {
                aux = aux.FilhoEsquerdo;
            } else {
                aux=aux.FilhoDireito;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
}
