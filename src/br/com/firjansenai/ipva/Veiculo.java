package br.com.firjansenai.ipva;

public class Veiculo {

	protected String modelo;
	protected String placa;
	protected String combustivel;
	protected double valorVeiculo;

	public Veiculo(String modelo, String placa, String combustivel, double valorVeiculo) {
		this.modelo = modelo;
		this.placa = placa;
		this.combustivel = combustivel;
		this.valorVeiculo = valorVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCombustivel() {
		return combustivel;
	}


	public double getValorVeiculo() {
		return valorVeiculo;
	}

	@Override
	public String toString() {
		return "Modelo                : " + modelo             + "\n" + 
			   "Placa                 : " + placa              + "\n" + 
			   "Combustível           : " + combustivel        + "\n" + 
			   "Valor do Veículo      : " + valorVeiculo       + "\n";
	}

}
