package eit.cli;
import edu.fra.uas.oop.Terminal;
import eit.linecode.DataEncoder8B6T;

public class main {

	public static void main(String[] args) {
		while(true) {
		Terminal.printLine("Enter \"encode\" to encode data 8B to 6T.");
		Terminal.printLine("Enter \"quit\" to end the program.");
		String text = Terminal.readLine();
		text = text.trim();
		if(text.equals("quit"))
			break;
		else if(text.contains("encode ")) {
			byte[] str =  DataEncoder8B6T.prepareString(text);
			DataEncode8B6T test = new DataEncode8B6T(str);
			
			Terminal.printLine("Datastream 1: ");
			Terminal.printLine("Datastream 2: ");
			Terminal.printLine("Datastream 3: ");
		}
		else
			Terminal.printError("unknown Error");
	}
}

}

