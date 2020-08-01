package br.com.firjansenai.ipva.teste;

import br.com.firjansenai.ipva.Ipva;

public class IpvaTeste {

	public static void main(String[] args) {
		// EXEMPLO 1, VEÍCULO 1
		Ipva veiculo1 = new Ipva("Sandero", "LVC-5430", "gnv", 55000.0, 125);
		veiculo1.calculaIpva();
		System.out.println(veiculo1);

		// EXEMPLO 2, VEÍCULO 2
		Ipva veiculo2 = new Ipva("Fiesta", "MVC-1212", "flex", 40000.0, 125);
		veiculo2.calculaIpva();
		System.out.println(veiculo2);
	}
}
