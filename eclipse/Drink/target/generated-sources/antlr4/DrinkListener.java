// Generated from Drink.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrinkParser}.
 */
public interface DrinkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrinkParser#drinkSentence}.
	 * @param ctx the parse tree
	 */
	void enterDrinkSentence(@NotNull DrinkParser.DrinkSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#drinkSentence}.
	 * @param ctx the parse tree
	 */
	void exitDrinkSentence(@NotNull DrinkParser.DrinkSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrinkParser#drink}.
	 * @param ctx the parse tree
	 */
	void enterDrink(@NotNull DrinkParser.DrinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrinkParser#drink}.
	 * @param ctx the parse tree
	 */
	void exitDrink(@NotNull DrinkParser.DrinkContext ctx);
}