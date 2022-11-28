import java.util.Scanner;
import java.io.PrintStream;

/**
 * Metodos estaticos para manipulacao de matrizes de inteiros.
 *
 * @author Augusto Leal
 * @version 28 nov. 2022
 */
public class Matriz {

    /**
     * Le todos os elementos de uma matriz de inteiros.
     * @param in Objeto da classe <code>Scanner</code> a partir do qual sera
     * feita a leitura.
     * @param m Matriz cujos elementos ser&atilde;o lidos.
     */
    public static void le(Scanner in, int[][] m) {
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++) {
                m[i][j]=in.nextInt();
            }
        }
    }
    
    /**
     * Mostra todos os elementos de uma matriz de inteiros, cada linha da matriz separada
     * por uma quebra de linha, com valores das colunas separados por um espaco.
     * @param out Fluxo de saida (ou seja, objeto da classe <code>PrintStream</code>)
     * no qual a matriz sera impressa. Para imprimir no terminal deve-se passar
     * <code>System.out</code> no lugar deste par&acirc;metro.
     * @param m Matriz a ser impressa.
     */
    public static void imprime(PrintStream out, int[][] m) {
        for (int i=0; i<m.length; ++i) {
            for (int j=0; j<m[i].length; ++j) {
                if (j>0) out.print(" ");
                out.print(m[i][j]);
            }
            out.println();
        }
    }
    
    /**
     * Troca duas linhas de uma matriz de inteiros.
     * @param m Matriz cujas linhas serao trocadas.
     * @param l1 Primeira linha a ser trocada.
     * @param l2 Segunda linha a ser trocada.
     * @return Retorna um valor booleano (<code>boolean</code>), correspondendo a:
     * <code>false</code> se os numeros de linhas forem invalidos, ou
     * <code>true</code> se a troca tiver sido feita com sucesso.
     */
    public static boolean trocaLinhas(int[][] m, int l1, int l2) {
        if(l1>m.length ){
            for (int i=0;i<m.length;i++){
                for (int j = 0;j<m[0].length;j++){
                    int c =m[l1][j];
                    m[l1][j]=m[l2][j];
                    m[l2][j]=c;
                }
            }
            return true;
        }
        return false;
    }
    
    /**
     * Troca duas colunas de uma matriz de inteiros.
     * @param m Matriz cujas colunas serao trocadas.
     * @param c1 Primeira coluna a ser trocada.
     * @param c2 Segunda coluna a ser trocada.
     * @return Retorna um valor booleano (<code>boolean</code>), correspondendo a:
     * <code>false</code> se os nuameros de colunas forem inv&aacute;lidos, ou
     * <code>true</code> se a troca tiver sido feita com sucesso.
     */
    public static boolean trocaColunas(int[][] m, int c1, int c2) {
        if(c1==c2){
            for (int i=0;i<m.length;i++){
                for (int j = 0;j<m[c1].length;j++){
                    int c =m[i][c1];
                    m[i][c1]=m[i][c2];
                    m[i][c2]=c;
                }
            }
            return true;
        }
        return false;
    }
    
    /**
     * Preenche todos os elementos de uma matriz de inteiros com valores sequenciais,
     * iniciando em 1, com incremento de 1 de uma coluna para outra e da ultima
     * coluna de uma linha para a primeira coluna da proxima linha.
     * @param m Matriz cujos valores serao preenchidos sequencialmente.
     */
    public static void preencheSequencialmente(int[][] m) {
        int prox=1;
        for(int i =0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                if (j==0){
                    m[i][j]=prox+j;
                }else{
                    m[i][j]=prox+j;
                }
                if (j==m[0].length-1){
                    prox+=j+1;
                }
            }
        }
    }
    
    /**
     * Preenche todos os elementos de uma matriz de inteiros com determinado valor.
     * @param m Matriz cujos valores ser&atilde;o preenchidos.
     * @param n Valor inteiro a ser atribu&iacute;do a cada um dos elementos da matriz.
     */
    public static void preenche(int[][] m, int n) {
        for (int i=0;i<m.length;i++){
            for (int j=0;i<m[1].length;j++){
                m[i][j]=n;
            }
        }
    }
    
    /**
     * Soma todos os elementos de uma matriz de inteiros.
     * @param m Matriz cujos elementos serao somados.
     * @return Somatorio (<code>long</code>) dos elementos da matriz.
     */
    public static long soma(int [][] m) {
        long soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                soma+=m[i][j];
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos de uma linha de uma matriz de inteiros.
     * @param m Matriz cujos elementos de uma linha ser&atilde;o somados.
     * @param l Linha da matriz a ser somada.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos da linha da matriz.
     */
    public static long somaLinha(int [][] m, int l) {
        int soma=0;
        for (int i=0;i<m[1].length;i++){
            soma+=m[l][i];
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos de uma coluna de uma matriz de inteiros.
     * @param m Matriz cujos elementos de uma coluna ser&atilde;o somados.
     * @param c Coluna da matriz a ser somada.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos da coluna da matriz.
     */
    public static long somaColuna(int [][] m, int c) {
        int soma=0;
        for (int i=0;i<m[1].length;i++){
            soma+=m[i][c];
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos da diagonal principal de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos da diagonal principal devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos da diagonal principal da matriz.
     */
    public static long somaDiagonalPrincipal(int[][] m) {
        
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if( i==j){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos acima da diagonal principal de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos acima da diagonal principal devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos acima da diagonal principal da matriz.
     */
    public static long somaAcimaDiagonalPrincipal(int[][] m) {
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if( j>i){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos abaixo da diagonal principal de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos abaixo da diagonal principal devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos abaixo da diagonal principal da matriz.
     */
    public static long somaAbaixoDiagonalPrincipal(int[][] m) {
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if(i>j){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos da diagonal secund&aacute;ria de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos da diagonal secund&aacute;ria devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos da diagonal secund&aacute;ria da matriz.
     */
    public static long somaDiagonalSecundaria(int[][] m) {
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if(j+i==m.length-1){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos acima da diagonal secund&aacute;ria de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos acima da diagonal secund&aacute;ria devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos acima da diagonal secund&aacute;ria da matriz.
     */
    public static long somaAcimaDiagonalSecundaria(int[][] m) {
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if(j+i < m.length-1){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }
    
    /**
     * Soma todos os elementos abaixo da diagonal secund&aacute;ria de uma matriz quadrada de inteiros.
     * @param m Matriz cujos elementos abaixo da diagonal secund&aacute;ria devem ser somados.
     * @return Somat&oacute;rio (<code>long</code>) dos elementos abaixo da diagonal secund&aacute;ria da matriz.
     */
    public static long somaAbaixoDiagonalSecundaria(int[][] m) {
        int soma=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[1].length;j++){
                if(j+i > m.length-1){
                    soma+=m[i][j];
                }
            }
        }
        return soma;
    }   
    
    /**
     * Descobre qual o maior valor armazenado em uma matriz de inteiros e retorna este valor.
     * @param m Matriz onde ser&aacute; feita a busca pelo maior valor.
     * @return Maior valor contido na matriz.
     */
    public static int maiorValor(int[][] m) {
        int maior=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                if(i==0 && j==0){
                    maior =m[i][j];
                }
                if (maior<m[i][j]){
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
    
    /**
     * Descobre qual o menor valor armazenado em uma matriz de inteiros e retorna este valor.
     * @param m Matriz onde ser&aacute; feita a busca pelo menor valor.
     * @return Menor valor contido na matriz.
     */
    public static int menorValor(int[][] m) {
        int menor=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                if(i==0 && j==0){
                    menor =m[i][j];
                }
                if (menor > m[i][j]){
                    menor = m[i][j];
                }
            }
        }
        return menor;
    }

    /**
     * Cria uma matriz que &eacute; a transposta da matriz recebida como par&acirc;metro.
     * Uma matriz transposta de <code>m</code> &eacute; aquela que a primeira coluna corresponde &agrave;
     * primeira linha de <code>m</code>, a segunda coluna corresponde &agrave; segunda  linha de <code>m</code>,
     * e assim por diante.
     * @param m Matriz da qual ser&aacute; gerada a transposta.
     * @return Matriz transposta de <code>m</code>, alocada e devidamente preenchida.
     */
    public static int[][] transposta(int[][] m) {
        int linha=m.length;
        int col=m[0].length;
        if (linha == col){
            for (int i=0;i<m[0].length;i++){
                for (int j=0;j<m.length;j++){
                    if(j>i){
                        int aux=m[i][j];
                        m[i][j]=m[j][i];
                        m[j][i]=aux;
                    }
                    else if(j==i){
                        m[i][j]=m[i][j];
                    }
                }
            }
        }else{
            
        }
        return m;
    }
    
    /**
     * Verifica se uma determinada matriz &eacute; simetrica ou nao.
     * Uma matriz e simetrica se ela for quadrada e se para quaisquer
     * indices <code>i</code> e <code>j</code>, tivermos <code>m[i][j] == m[j][i]</code>.
     * @param m Matriz que sera testada.
     * @return Retorna <code>true</code> se a matriz for simetrica, ou
     * <code>false</code> se ela nao for simetrica.
     */
    public static boolean ehSimetrica(int[][] m) {
        if (m.length == m[0].length){
            for (int i=0;i<m.length;i++){
                for (int j=0;j<m[0].length;j++){
                    if (m[i][j] != m[j][i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    /**
     * Calcula a m&eacute;dia (<code>double</code>) de todos os elementos de uma matriz de inteiros.
     * @param m Matriz da qual se calcular&aacute; a m&eacute;dia de elementos.
     * @return M&eacute;dia (<code>double</code>) dos elementos da matriz.
     */
    public static double media(int[][] m) {
        double numDiv=m.length*m[0].length;
        double media=0;
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                    media+=m[i][j];
            }
        }
        media/=numDiv;
        return media;
    }

}
