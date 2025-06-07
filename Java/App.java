public class App {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setCodigo(1L);
        produto.setNome("IPhone 13");
        produto.setMarca("Apple");

        produto.listar();
        produto.remover(1);
        produto.alterar(1);
        produto.cadastrar(1);
    }

}
