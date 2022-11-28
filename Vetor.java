import java.util.Scanner;
import java.io.PrintStream;

/**
 * Biblioteca de metodos para processamento de vetores de inteiros.
 *
 * @author Augusto Leal
 * @version 27 nov. 2022
 */

public class Vetor {
    
    /**
     * Realiza a leitura de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>le</code> para um vetor parcial.
     * @param in Objeto da classe <code>Scanner</code> que ser&aacute; usado para realizar a leitura.
     * @param v Vetor a ser lido.
     */
    public static void le(Scanner in, int [] v) {
        le(in,v,v.length);
    }
    
    /**
     * Realiza a leitura de um vetor parcial (parcialmente preenchido) de inteiros.
     * @param in Objeto da classe <code>Scanner</code> que ser&aacute; usado para realizar a leitura.
     * @param v Vetor parcial a ser lido.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o lidos).
     */
    public static void le(Scanner in, int [] v, int t) {
        for (int i=0; i<t; ++i)
            v[i] = in.nextInt();
    }
    
    /**
     * Realiza a impress&atilde;o de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>imprime</code> para um vetor parcial.
     * @param out Objeto da classe <code>PrintStream</code> que ser&aacute; usado para realizar a impress&atilde;o.
     * @param v Vetor a ser impresso.
     */
    public static void imprime(PrintStream out,int[] v) {
        imprime(out,v,v.length);
    }

    /**
     * Realiza a impress&atilde;o de um vetor parcial (parcialmente preenchido) de inteiros.
     * @param out Objeto da classe <code>PrintStream</code> que ser&aacute; usado para realizar a impress&atilde;o.
     * @param v Vetor a ser impresso.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o impressos).
     */
    public static void imprime(PrintStream out,int[] v, int t) {
        for (int i=0; i<t; ++i) {
            if (i > 0)
                out.print(" ");
            out.print(v[i]);
        }
    }
    
    /**
     * Preenche todas as posi&ccedil;&otilde;es de um vetor (completamente preenchido) de inteiros com determinado valor.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>preenche</code> para um vetor parcial.
     * @param v Vetor a ser preenchido.
     * @param n Valor que ser&aacute; atribuido a cada posi&ccedil;&atilde;o do vetor.
     */
    public static void preenche(int[] v, int n) {
        preenche(v,v.length,n);
    }
    
    /**
     * Preenche as posi&ccedil;&otilde;es de um vetor parcial (parcialmente preenchido) de inteiros com determinado valor.
     * @param v Vetor a ser preenchido.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o atualizados).
     * @param n Valor que ser&aacute; atribuido a cada posi&ccedil;&atilde;o do vetor.
     */
    public static void preenche(int[] v, int t, int n) {
        for(int i =0; i<t;i++){
            v[i]=n;
        }
    }
    
    /**
     * Preenche todas as posi&ccedil;oes de um vetor (completamente preenchido) de inteiros com valores sequenciais a partir de 1.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>preencheSequencialmente</code> para um vetor parcial.
     * @param v Vetor a ser preenchido.
     */
    public static void preencheSequencialmente(int[] v) {
        preencheSequencialmente(v,v.length);
    }
    
    /**
     * Preenche as posi&ccedil;oes de um vetor parcialmente preenchido de inteiros com valores sequenciais a partir de 1.
     * @param v Vetor a ser preenchido.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o atualizados).
     */
    public static void preencheSequencialmente(int[] v, int t) {
        for(int i =0;i<t;i++){
            v[i]=i;
            }    
    }
    
    /**
     * Soma todos os elementos de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>soma</code> para um vetor parcial.
     * @param v Vetor cujos elementos devem ser somados.
     * @return Somat&oacute;rio dos elementos do vetor (<code>long</code>).
     */
    public static long soma(int[] v) {
        return soma(v,v.length);
    }
    
    /**
     * Soma os elementos de um vetor parcialmente preenchido de inteiros.
     * @param v Vetor cujos elementos devem ser somados.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o somados).
     * @return Somat&oacute;rio dos elementos do vetor parcial (<code>long</code>).
     */
    public static long soma (int[] v, int t) {
        long soma = 0;
        for (int i = 0; i < t; i++){
            soma = soma + v[i];
        }

        return soma;
    }
    
    /**
     * M&eacute;dia de todos os elementos de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>media</code> para um vetor parcial.
     * @param v Vetor de cujos elementos a m&eacute;dia ser&aacute; calculada.
     * @return M&eacute;dia dos elementos do vetor (<code>double</code>).
     */
    public static double media(int[] v) {
        return (double)soma(v,v.length)/v.length;
    }
    
    /**
     * M&eacute;dia dos elementos de um vetor parcial (parcialmente preenchido) de inteiros.
     * @param v Vetor de cujos elementos a m&eacute;dia ser&aacute; calculada.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @return M&eacute;dia dos elementos do vetor parcial (<code>double</code>).
     */
    public static double media(int[] v,int t) {
        double media = 0;
        media = soma(v, t);
        media = media / t;
        return media;
    }
    
    /**
     * Determina o menor valor de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>menor</code> para um vetor parcial.
     * @param v Vetor para o qual ser&aacute; determinado o menor valor.
     * @return Menor valor dos elementos do vetor.
     */
    public static int menor(int[] v) {
            return menor(v,v.length);
    }
    
    /**
     * Determina o menor valor de um vetor parcial (parcialmente preenchido) de inteiros.
     * @param v Vetor para o qual ser&aacute; determinado o menor valor.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @return Menor valor dos elementos do vetor parcial.
     */
    public static int menor(int[] v, int t) {
        int menor = 0;
        for(int i=0; i<t; i++){
            if(i==0)
                menor = v[i];
            else if (menor>v[i])
                menor = v[i];
        }
        return menor;
    }
    
    /**
     * Determina o maior valor de um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>maior</code> para um vetor parcial.
     * @param v Vetor para o qual ser&aacute; determinado o maior valor.
     * @return Maior valor dos elementos do vetor.
     */
    public static int maior(int[] v) {
        return maior(v,v.length);
    }
    
    /**
     * Determina o maior valor de um vetor parcial (parcialmente preenchido) de inteiros.
     * @param v Vetor para o qual ser&aacute; determinado o maior valor.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @return Maior valor dos elementos do vetor parcial.
     */
    public static int maior(int[] v, int t) {
        int maior = 0;
        for(int i=0; i<t; i++){
            if(i==0)
                maior = v[i];
            else if (maior<v[i])
                maior = v[i];
        }
        return maior;
    }

    /**
     * Conta quantas vezes determinado valor aparece em um vetor (completamente preenchido) de inteiros.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>conta</code> para um vetor parcial.
     * @param v Vetor no qual ser&aacute; feita a verifica&ccedil;&atilde;o.
     * @param n Valor inteiro que ser&aacute; contado no vetor.
     * @return N&uacute;mero de vezes que o valor inteiro foi localizado no vetor.
     */
    public static int conta(int[] v, int n) {
        return conta(v,v.length,n);
    }
    
    /**
     * Conta quantas vezes determinado valor aparece em um vetor parcial (parcialmente preenchido) de inteiros.
     * @param v Vetor no qual ser&aacute; feita a verifica&ccedil;&atilde;o.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o testados).
     * @param n Valor inteiro que ser&aacute; contado no vetor.
     * @return N&uacute;mero de vezes que o valor inteiro foi localizado no vetor.
     */
    public static int conta(int[] v, int t, int n) {
        int conta = 0;
        for (int i = 0; i < t; i++) {
            if(n== v[i])
                conta++;
        }
        return conta;
    }
    
    /**
     * Inverte os elementos de um vetor (completamente preenchido) de inteiros, de forma que o primeiro elemento
     * seja trocado com o &uacute;ltimo, o segundo com o pen&uacute;ltimo, e assim por diante.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>inverte</code> para um vetor parcial.
     * @param v Vetor que ser&aacute; invertido.
     */
    public static void inverte(int[] v) {
        inverte(v,v.length);
    }
    
    /**
     * Inverte os elementos de um vetor parcial (parcialmente preenchido) de inteiros, de forma que o primeiro elemento
     * seja trocado com o &uacute;ltimo, o segundo com o pen&uacute;ltimo, e assim por diante.
     * @param v Vetor que ser&aacute; invertido.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     */
    public static void inverte(int[] v, int t) {
          if(v.length%2==0){
            for (int i=0;i<t/2;i++){
                int aux=0;
                aux=v[i];
                v[i]=v[t-1-i];
                v[t-1-i]=aux;
            }
        }else{
            for (int i=0;i<t/2+1;i++){
                int aux=0;
                aux=v[i];
                v[i]=v[t-1-i];
                v[t-1-i]=aux;
            }
        }
    }
    
    /**
     * Realiza a busca de um determinado valor, linearmente, em um vetor (completamente
     * preenchido) de inteiros, do primeiro at&aacute; o &uacute;ltimo elemento, retornando
     * o &iacutue;ndice da primeira posi&ccedil;&atilde;o em que o elemento foi encontrado; ou
     * <code>-1</code> caso o elemento n&atilde;o seja encontrado.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>buscaLinear</code> para um vetor parcial.
     * @param v Vetor no qual a busca linear ser&aacute; feita.
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice da primeira ocorr&ecirc;ncia do elemento procurado no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaLinear(int[] v, int n) {
        return buscaLinear(v,v.length,n);
    }
    
    /**
     * Realiza a busca de um determinado valor, linearmente, em um vetor parcial
     * (parcialmente preenchido) de inteiros, do primeiro at&aacute; o &uacute;ltimo
     * elemento, retornando o &iacutue;ndice da primeira posi&ccedil;&atilde;o em que
     * o elemento foi encontrado; ou <code>-1</code> caso o elemento n&atilde;o seja
     * encontrado.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>buscaLinear</code> para um vetor parcial.
     * @param v Vetor no qual a busca linear ser&aacute; feita.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice da primeira ocorr&ecirc;ncia do elemento procurado no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaLinear(int[] v, int t, int n) {
        int pos=0;
        boolean achou=false;
        while (pos < t && !achou) {
            if (v[pos] == n) {
                    achou = true;
                }
                else {
                    pos++;
                }
            }
        if (achou)
            return pos;
        return -1;
    }
    
    /**
     * Realiza a busca de um determinado valor em um vetor (completamente preenchido) de
     * inteiros ordenado, usando o algoritmo de busca bin&acute;ria e retornando
     * o &iacutue;ndice da posi&ccedil;&atilde;o em que o elemento foi encontrado; ou
     * <code>-1</code> caso o elemento n&atilde;o seja encontrado.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>buscaBinaria</code> para um vetor parcial.
     * @param v Vetor no qual a busca bin&aacute;ria ser&aacute; feita.
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice do elemento no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaBinaria(int[] v, int n) {
        return buscaBinaria(v,v.length,n);
    }
    
    /**
     * Realiza a busca de um determinado valor em um vetor parcial (parcialmente
     * preenchido) de inteiros ordenado, usando o algoritmo de busca bin&acute;ria
     * e retornando o indice da posi&ccedilatilde;o em que o elemento
     * foi encontrado; ou <code>-1</code> caso o elemento n&atilde;o seja encontrado.
     * @param v Vetor no qual a busca bin&aacute;ria ser&aacute; feita.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice do elemento no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaBinaria(int[] v, int t, int n) {
        for(int i =0;i<t;i++){
            if(v[i]==n){
                return i;
                }
        }
        return-1;
    }
    
    /**
     * Realiza a busca de um determinado valor em um vetor (completamente preenchido) de
     * inteiros ordenado, usando o algoritmo de busca bin&acute;ria recursiva e retornando
     * o &iacutue;ndice da posi&ccedil;&atilde;o em que o elemento foi encontrado; ou
     * <code>-1</code> caso o elemento n&atilde;o seja encontrado.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>buscaBinariaRec</code> para um vetor parcial ou completo.
     * @param v Vetor no qual a busca bin&aacute;ria ser&aacute; feita.
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice do elemento no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaBinariaRec(int[] v, int n) {
        return buscaBinariaRec(v,0,v.length-1,n);
    }
    
    /**
     * Realiza a busca de um determinado valor em um vetor parcial (parcialmente
     * preenchido) de inteiros ordenado, usando o algoritmo de busca bin&acute;ria recursiva
     * e retornando o &iacutue;ndice da posi&ccedil;&atilde;o em que o elemento
     * foi encontrado; ou <code>-1</code> caso o elemento n&atilde;o seja encontrado.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>buscaBinariaRec</code> para um vetor parcial ou completo.
     * @param v Vetor no qual a busca bin&aacute;ria ser&aacute; feita.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice do elemento no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaBinariaRec(int[] v, int t, int n) {
        return buscaBinariaRec(v,0,t-1,n);
    }
    
    /**
     * Realiza a busca de um determinado valor em um vetor parcial (parcialmente
     * preenchido) ou completamente preenchido de inteiros ordenado, usando o
     * algoritmo de busca bin&acute;ria recursiva e retornando o &iacutue;ndice
     * da posi&ccedil;&atilde;o em que o elemento foi encontrado; ou <code>-1</code>
     * caso o elemento n&atilde;o seja encontrado.
     * @param v Vetor no qual a busca bin&aacute;ria recursiva ser&aacute; feita.
     * @param ini Posi&ccedil;&atilde;o inicial dentro do vetor onde a busca ser&aacute; feita.
     * @param fim Posi&ccedil;&atilde;o final dentro do vetor onde a busca ser&aacute; feita.
     * @param n Valor inteiro que ser&aacute; pesquisado no vetor.
     * @return &Iacute;ndice do elemento no vetor, ou
     * <code>-1</code>, caso o valor n&atilde;o tenha sido encontrado.
     */
    public static int buscaBinariaRec(int[]v,int ini,int fim,int n){
        if(ini>fim)return -1;
        int meio=(ini+fim)/2;
        if(n==v[meio])return meio;
        if(n<v[meio])
            return buscaBinariaRec(v, ini, meio, n);
        else
            return buscaBinariaRec(v, meio+1, fim, n);
    }
    
    /**
     * Realiza a ordena&ccedil;&atilde;o de um vetor (completamente preenchido) de
     * inteiros, usando o algoritmo <i>Bubble Sort</i>.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>bubbleSort</code> para um vetor parcial.
     * @param v Vetor que ser&aacute; ordenado.
     */
    public static void bubbleSort(int[] v) {
        bubbleSort(v,v.length);
    }
    
    /**
     * Realiza a ordena&ccedil;&atilde;o de um vetor parcial (parcialmente
     * preenchido) de inteiros, usando o algoritmo <i>Bubble Sort</i>.
     * @param v Vetor que ser&aacute; ordenado.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     */
    public static void bubbleSort(int[]v, int t){
        int trocas = 1;
        int fim = t-1;
        while(trocas != 0){
        trocas = 0;
        for (int i = 0; i < t; i++) {
            if(v[i] > v[i+1]){
            int aux = v[i];
            v[i]= v[i+1];
            v[i+1]= aux;
            trocas++;
            }
        }
        --fim;
        }
    }

    /**
     * Realiza a ordena&ccedil;&atilde;o de um vetor (completamente preenchido) de
     * inteiros, usando o algoritmo <i>Selection Sort</i>.
     * Este m&eacute;todo utiliza o m&eacute;todo <code>selectionSort</code> para um vetor parcial.
     * @param v Vetor que ser&aacute; ordenado.
     */
    public static void selectionSort(int[] v) {
        bubbleSort(v,v.length);
    }
    
    /**
     * Realiza a ordena&ccedil;&atilde;o de um vetor parcial (parcialmente
     * preenchido) de inteiros, usando o algoritmo <i>Selection Sort</i>.
     * @param v Vetor que ser&aacute; ordenado.
     * @param t Tamanho do vetor parcial (ou seja, n&uacute;mero de elementos que ser&atilde;o considerados).
     */
    public static void SelectionSort(int[]v,int t){
        for (int i=0;i<t-1;i++){
            int men=i;
            for(int j=i+1;j<t;j++){
                if(v[j]<v[men])
                    men=j;
            }
            if (men!=i){
                int aux=v[men];
                v[men]=v[i];
                v[i]=aux;
            }
        }
    }
    
    /**
     * Realiza a remo&ccedil;&atilde;o de um elemento de um vetor parcial (parcialmente
     * preenchido) de inteiros, copiando todos os elementos que est&atilde;o depois do elemento a ser removido,
     * uma posi&ccedil;&atilde;o em dire&ccedil;&atilde;o ao in&iacute;cio do vetor.
     * @param v Vetor do qual o elemento ser&aacute; removido.
     * @param t Tamanho atual do vetor parcial.
     * @param pos Posi&acedil;&atilde;o (ou &iacute;ndice) do elemento que ser&aacute; removido.
     * @return Retorna o novo tamanho do vetor parcial (ou seja, o tamanho anterior menos um), ou ou mesmo tamanho
     * que foi recebido, caso n&atilde;o seja poss&iacute;vel fazer a remo&ccedil;&atilde;o.
     */
    public static int removeElemento(int[] v, int tam, int pos) {
        if ( pos>=0 && pos<=v.length-1 ) {
            for (int i = pos; i < tam - 1; i++) {
                v[i] = v[i + 1];
            }
            tam--;
        }
        return tam;
    }
    
    /**
     * Realiza a inser&ccedil;&atilde;o de um elemento no final um vetor parcial (parcialmente
     * preenchido) de inteiros.
     * @param v Vetor no qual o elemento ser&aacute; inserido.
     * @param t Tamanho atual do vetor parcial.
     * @param n Valor inteiro a ser inserido no vetor.
     * @return Retorna o novo tamanho do vetor parcial (ou seja, o tamanho anterior mais um), ou mesmo tamanho
     * que foi recebido, caso n&atilde;o seja poss&iacute;vel fazer a inser&ccedil;&atilde;o.
     */
    public static int insereNoFinal(int[] v, int tam, int n) {
        if (tam < v.length){
            v[tam]=n;
            tam++;
        }
        return tam;
    }

    /**
     * Realiza a inser&ccedil;&atilde;o de um elemento em uma posi&ccedil;&atilde;o espec&iacute;fica
     * em um vetor parcial (parcialmente preenchido) de inteiros. A partir da posi&ccedil;&atilde;o
     * especificada, at&eacute; o final do vetor, todos os elementos s&atilde;o deslocados uma posi&ccedil;o
     * em dire&ccedil;&atilde;o ao final do vetor, para que o novo valor seja inserido nessa posi&ccedil;&atilde;o.
     * @param v Vetor no qual o elemento ser&aacute; inserido.
     * @param t Tamanho atual do vetor parcial.
     * @param pos Posi&ccedil;&atilde;o (ou &iacute;ndice) do vetor onde o valor dever&aacute; ser inserido.
     * @param n Valor inteiro a ser inserido no vetor.
     * @return Retorna o novo tamanho do vetor parcial (ou seja, o tamanho anterior mais um), ou mesmo tamanho
     * que foi recebido, caso n&atilde;o seja poss&iacute;vel fazer a inser&ccedil;&atilde;o.
     */
    public static int insere(int[] v, int tam, int pos, int n) {
        if (tam < v.length){
            tam++;
            for (int i=pos;i<tam;i++){
                int aux=v[pos];
                v[pos]= n;
                v[pos+1]=aux;
            }
        }
        return tam;
       }
}