// Generated from org/jabref/logic/journals/ltwa/Ltwa.g4 by ANTLR 4.13.2

package org.jabref.logic.journals.ltwa;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LtwaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LtwaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SingleWordTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleWordTitleFull(LtwaParser.SingleWordTitleFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopwordPlusTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopwordPlusTitleFull(LtwaParser.StopwordPlusTitleFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyPlusSymbolsFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyPlusSymbolsFull(LtwaParser.AnyPlusSymbolsFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTitleFull(LtwaParser.NormalTitleFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#singleWordTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleWordTitle(LtwaParser.SingleWordTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#stopwordPlusAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopwordPlusAny(LtwaParser.StopwordPlusAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#anyPlusSymbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyPlusSymbols(LtwaParser.AnyPlusSymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#normalTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTitle(LtwaParser.NormalTitleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticleElement(LtwaParser.ArticleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopwordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopwordElement(LtwaParser.StopwordElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolsElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolsElement(LtwaParser.SymbolsElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrdinalElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinalElement(LtwaParser.OrdinalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordElement(LtwaParser.WordElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HyphenElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyphenElement(LtwaParser.HyphenElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PartElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartElement(LtwaParser.PartElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbbreviationElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviationElement(LtwaParser.AbbreviationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(LtwaParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#stopword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopword(LtwaParser.StopwordContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbols(LtwaParser.SymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#ordinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinal(LtwaParser.OrdinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(LtwaParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#hyphen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHyphen(LtwaParser.HyphenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(LtwaParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LtwaParser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviation(LtwaParser.AbbreviationContext ctx);
}