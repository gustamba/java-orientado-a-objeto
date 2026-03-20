package livraria;

public class Ebook extends Livro{
   
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15 ) {
            return false;
        }
        System.out.println("aplicando desconto no Ebook");
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
        }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }
}
