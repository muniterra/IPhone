package iphone.aparelho;

import iphone.funcionalidades.aparelhoTelefonico;
import iphone.funcionalidades.navegadorInternet;
import iphone.funcionalidades.reprodutorMusical;

public class IPhone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical{

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

	@Override
	public void ligar() {
		System.out.println("FAZENDO LIGAÇÃO");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");	
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

}
