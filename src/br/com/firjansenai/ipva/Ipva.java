package br.com.firjansenai.ipva;

public class Ipva extends Veiculo {
	protected double valorIpva;
	protected double taxaLicenciamento;

	public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.taxaLicenciamento = taxaLicenciamento;
	}

	public double getValorIpva() {
		return valorIpva;
	}

	public void calculaIpva() {
		if (combustivel.equals("GNV")) {
			valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
		} else if (combustivel.equals("FLEX")) {
			valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
		} else {
			valorIpva = (valorVeiculo * 0.04) + taxaLicenciamento;
		}
	}

	@Override
	public String toString() {
		return "Modelo                : " + modelo             + "\n" + 
			   "Placa                 : " + placa              + "\n" + 
			   "Combustível           : " + combustivel        + "\n" + 
			   "Valor do Veículo      : " + valorVeiculo       + "\n" +
			   "Taxa de Licenciamento : " + taxaLicenciamento  + "\n" +
			   "Valor do IPVA         : " + valorIpva          + "\n";
	}

}
