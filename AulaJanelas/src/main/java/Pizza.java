
public class Pizza extends Produto {
    public static final String BORDA_SEM_RECHEIO = "Sem recheio";
    public static final String BORDA_CATUPIRY = "Borda Catupiry";
    public static final String BORDA_MUSSARELA = "Borda Mussarela";
    
    private String bordaRecheada;
    
    public Pizza(int codigo,String descricao, double preco, String bordaRecheada) {
        super(codigo, descricao, preco);
        this.bordaRecheada = bordaRecheada;
        
    }
    @Override
    public void imprime(){
        System.out.println("Pizza");
        System.out.println("borda : " + bordaRecheada);
        super.imprime();
    }
    
}


  
