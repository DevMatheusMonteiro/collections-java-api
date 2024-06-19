package MapInterface.OrdenaCaoEmMap.LivrariaOnline;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private float preco;

    public Livro(String titulo, String autor, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public int compareTo(Livro o) {
        return Double.compare(preco, o.getPreco());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", preco=" + preco +
                '}';
    }
}

