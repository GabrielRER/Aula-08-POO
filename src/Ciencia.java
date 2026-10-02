public abstract class Ciencia {


    private String area;

    public Ciencia(String area){
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public abstract void descricao();
}
