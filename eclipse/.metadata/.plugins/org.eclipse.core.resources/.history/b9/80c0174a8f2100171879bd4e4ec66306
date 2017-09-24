import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

public class ANTLRDemo {
    public static void main(String[] args) throws Exception {
        ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
        HelloLexer lexer = new HelloLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        parser.eval();
    }

 
}