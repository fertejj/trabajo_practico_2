package ar.edu.unju.fi.ejercicio1.model;

public class Producto {

	private String codigo;
	private String descripcion;
	private Double precio;
	private FabricadoEn FabricadoEn;
    private Categoria categoria;
    
    public Producto() {
    	
    }

    public Producto(String codigo, String descripcion, Double precio, FabricadoEn FabricadoEn,
			Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.FabricadoEn = FabricadoEn;
		this.categoria = categoria;
	}
    
	public enum FabricadoEn {
        ARGENTINA, CHINA, BRASIL, URUGUAY;
    }

    public enum Categoria {
        TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS;
    }
    
	@Override
	public String toString() {
		return "Producto [Código: " + codigo + " - Descripción: " + descripcion + " - Precio: $" + precio
				+ " - Origen de Fabricación: " + FabricadoEn + " - Categoría: " + categoria + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public FabricadoEn getFabricadoEn() {
		return FabricadoEn;
	}

	public void setFabricadoEn(FabricadoEn FabricadoEn) {
		this.FabricadoEn = FabricadoEn;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}