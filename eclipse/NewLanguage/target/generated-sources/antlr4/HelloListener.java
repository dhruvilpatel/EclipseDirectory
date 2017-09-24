// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#drinkSentence}.
	 * @param ctx the parse tree
	 */
	void enterDrinkSentence(@NotNull HelloParser.DrinkSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#drinkSentence}.
	 * @param ctx the parse tree
	 */
	void exitDrinkSentence(@NotNull HelloParser.DrinkSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#drink}.
	 * @param ctx the parse tree
	 */
	void enterDrink(@NotNull HelloParser.DrinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#drink}.
	 * @param ctx the parse tree
	 */
	void exitDrink(@NotNull HelloParser.DrinkContext ctx);
}