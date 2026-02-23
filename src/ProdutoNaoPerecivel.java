public class ProdutoNaoPerecivel extends Produto{
    
    public ProdutoNaoPerecivel(String desc, double precoCusto, double margemLucro){
        super.desc = desc;
        super.precoCusto = precoCusto;
        super.margemLucro = margemLucro;
    }

    @Override
    public double valorDeVenda() {
        return super.valorDeVenda();
    }
}
