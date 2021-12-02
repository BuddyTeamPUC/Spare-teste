package model;

public class meta {
    private int id;
    private String titulo;
    private double progresso;
    private double valor;

    public meta() {
        this.id = 0;
        this.titulo = "";
        this.progresso = 0.0;
        this.valor = 0.0;
    }

    public meta(int id, String titulo, double progresso, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.progresso = progresso;
        this.valor = valor;
    }
    public meta(int id, String titulo, double valor) {
    	this.id = id;
    	this.valor = valor;
    	this.titulo = titulo;
    }
    public meta(int id, double valor) {
    	this.id = id;
    	this.valor = valor;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getProgresso() {
        return progresso;
    }

    public void setProgresso(double progresso) {
        this.progresso = progresso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Meta [id=" + id + ", titulo=" + titulo + ", progresso=" + progresso + ", valor=" + valor + "]";
    }
}
