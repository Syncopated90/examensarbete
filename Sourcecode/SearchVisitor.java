// Generated from org/jabref/search/Search.g4 by ANTLR 4.13.2

package org.jabref.search;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SearchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SearchVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SearchParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SearchParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implicitAndExpression}
	 * labeled alternative in {@link SearchParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitAndExpression(SearchParser.ImplicitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(SearchParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negatedExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedExpression(SearchParser.NegatedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(SearchParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(SearchParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SearchParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SearchParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#searchValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchValue(SearchParser.SearchValueContext ctx);
}