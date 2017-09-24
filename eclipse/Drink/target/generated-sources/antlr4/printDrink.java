import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class printDrink {
	
	public static void main(String[] args){
		printDrink("12*3-5");
	}
	
	private static void printDrink(String drinkSentence) {
	    // Get our lexer
	    DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    DrinkParser parser = new DrinkParser(tokens);
	 
	    // Specify our entry point
	    
	}
}