package janela;

public class AbrirCommand implements Command {
	
	private Janela janela;
	
	public AbrirCommand(Janela janela) {
		this.janela = janela;
	}
	
	public void execute() {
		janela.abrir();
	}
	
	public void undo() {
		janela.fechar();
	}

}
