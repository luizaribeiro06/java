//comentário
/*comentário
* múltiplas
* linhas*/
/**
 * esse é um comentário JavaDoc
 * aceita tags HTML e pode exportar em HTML tbm ->
 * <p>- pode ser visualizado formatado</p>
 * @author Luiza Ribeiro
 * @since 10/2025
 * @see main
 */

public class Calculos {

    private int qtdItens;

    public Calculos(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public int acrescentarItem(){
        return qtdItens ++;
    }

    public int removerItem(){
        return qtdItens --;
    }

    @Override
    public String toString(){
        return "Calculos{"+
                "qtdItens="+qtdItens +
                '}';
    }
}
