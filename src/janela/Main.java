package janela;

public class Main {

	public static void main(String[] args) {
		Janela janela =  new Janela();
		AbrirCommand command = new AbrirCommand(janela);
		Controller control = new Controller(command,command);
		
		control.abrirJanela();
		control.fecharJanela();
	}

}
