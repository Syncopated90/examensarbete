// Generated from org/jabref/search/Search.g4 by ANTLR 4.13.2

package org.jabref.search;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SearchParser}.
 */
public interface SearchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SearchParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SearchParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SearchParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitAndExpression}
	 * labeled alternative in {@link SearchParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitAndExpression(SearchParser.ImplicitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitAndExpression}
	 * labeled alternative in {@link SearchParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitAndExpression(SearchParser.ImplicitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(SearchParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(SearchParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negatedExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegatedExpression(SearchParser.NegatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negatedExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegatedExpression(SearchParser.NegatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(SearchParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(SearchParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(SearchParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(SearchParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SearchParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SearchParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SearchParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SearchParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#searchValue}.
	 * @param ctx the parse tree
	 */
	void enterSearchValue(SearchParser.SearchValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#searchValue}.
	 * @param ctx the parse tree
	 */
	void exitSearchValue(SearchParser.SearchValueContext ctx);
}