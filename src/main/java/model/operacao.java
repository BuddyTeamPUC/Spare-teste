package model;
import java.util.Date;

public class operacao {
	private Date data;
	private int valor;
	private String tipo;
	private String descricao;
	private int id;

	public operacao() {
		this.data = new Date();
		this.valor = 0;
		this.tipo = "";
		this.id = 0;
		this.descricao="";
	}


    public operacao(Date data, int valor, String tipo, String descricao, int id) {
		this.data = data;
		this.valor = valor;
		this.tipo = tipo;
		this.descricao=descricao;
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Operacao [data=" + data + ", valor=" + valor + ", tipo=" + tipo + ", id=" + id + "]";
	}	
}