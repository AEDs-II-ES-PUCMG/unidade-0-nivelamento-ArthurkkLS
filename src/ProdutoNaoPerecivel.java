public class ProdutoNaoPerecivel extends Produto{
    
    public ProdutoNaoPerecivel(String desc, double precoCusto, double margemLucro){
        super(desc, precoCusto, margemLucro);
    }

    @Override
    public double valorDeVenda() {
        return super.valorDeVenda();
    }
}
