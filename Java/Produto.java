public class Produto {

    private Long codigo;
    private String nome;
    private String marca;

    public Produto() {

    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void listar() {
        System.out.println("Lista de produtos");
    }

    public void remover(long codigo) {
        System.out.println("Produto de código:  " + codigo + " foi removido");
    }

    public void alterar(long codigo) {
        System.out.println("Produto de código:  " + codigo + " foi alterado");
    }

    public void cadastrar(long codigo) {
        System.out.println("Produto de código:  " + codigo + " foi cadastrado");
    }

}