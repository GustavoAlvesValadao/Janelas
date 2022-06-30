
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    
    public Produto(){
        codigo = 0;
        descricao = "sem descrição";
        preco = 0.0;
        
    }
    
    public Produto(int codigo, String descricao, double preco){
        this.codigo = 0;
        this.descricao = "sem descrição";
        this.preco = 0.0;
        
    }


    public int getCodigo() {
        return codigo;
    }

  
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void imprime(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
    }
    
}
