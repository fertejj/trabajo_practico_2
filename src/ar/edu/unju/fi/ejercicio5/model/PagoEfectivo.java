package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago{

	public static final Double DESCUENTO = 0.10;
	public static final Double RECARGA = 0.15;
	
	private Double montoPagado;
	private LocalDate fechaPago;
	
	public PagoEfectivo() {
		
	}
	
	public PagoEfectivo(Double montoPagado, LocalDate fechaPago) {
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}


	@Override
	public void realizarPago(Double monto) {
		Double descuento = monto * DESCUENTO;
		Double nuevoMonto = monto - descuento;
		setMontoPagado(nuevoMonto);
	}

	@Override
	public void imprimirRecibo() {
		System.out.println("RECIBO");
		System.out.println("Fecha de Pago: "+this.fechaPago);
		System.out.println("Monto Pagado: $"+this.montoPagado);
		
	}

	public Double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(Double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

}