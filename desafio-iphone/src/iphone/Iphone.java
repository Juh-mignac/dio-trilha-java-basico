package iphone;

public class Iphone {

	public static void main(String[] args) {
		
		ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
		
		reprodutorMusical.selecionarMusica(10);
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
		
		aparelhoTelefonico.ligar("+558182300474");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		NavegadorInternet navegadorInternet = new NavegadorInternetImpl();
		navegadorInternet.exibirPagina("google.com");
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();

	}

}
