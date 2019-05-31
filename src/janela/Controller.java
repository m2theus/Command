package janela;

public class Controller {
	
	private Command[] commands;
	private Command ultimoCommand;
	
	public Controller (Command abrirCommand, Command fecharCommand) {
		this.commands = new Command[2];
		commands[0] = abrirCommand;
		commands[1] = fecharCommand;
	}
	
	public void abrirJanela() {
		commands[0].execute();
		ultimoCommand = commands[0];
	}
	
	public void fecharJanela() {
		commands[1].undo();
		ultimoCommand = commands[1];
	}
	
	public void resetar() {
		ultimoCommand.undo();
	}


}
