package application;

import java.util.Date;

import entidades.Pedido;
import entidades_enum.StatusPedido;

public class Pedido1 {

	public static void main(String[] args) {
		Pedido ped = new Pedido(1234, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		System.out.println(ped);
		
		StatusPedido sp1 = StatusPedido.EMBARCADO;
		StatusPedido sp2 = StatusPedido.valueOf("EMBARCADO");
		System.out.println(sp1 + " " + sp2);
	}

}
