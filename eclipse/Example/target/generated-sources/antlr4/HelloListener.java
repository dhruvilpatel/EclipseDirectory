// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(@NotNull HelloParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(@NotNull HelloParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull HelloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull HelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull HelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull HelloParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull HelloParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull HelloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull HelloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement2}.
	 * @param ctx the parse tree
	 */
	void enterStatement2(@NotNull HelloParser.Statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement2}.
	 * @param ctx the parse tree
	 */
	void exitStatement2(@NotNull HelloParser.Statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement1}.
	 * @param ctx the parse tree
	 */
	void enterStatement1(@NotNull HelloParser.Statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement1}.
	 * @param ctx the parse tree
	 */
	void exitStatement1(@NotNull HelloParser.Statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull HelloParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull HelloParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#temp}.
	 * @param ctx the parse tree
	 */
	void enterTemp(@NotNull HelloParser.TempContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#temp}.
	 * @param ctx the parse tree
	 */
	void exitTemp(@NotNull HelloParser.TempContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull HelloParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull HelloParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull HelloParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull HelloParser.IdentifierContext ctx);
}