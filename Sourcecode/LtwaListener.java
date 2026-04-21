// Generated from org/jabref/logic/journals/ltwa/Ltwa.g4 by ANTLR 4.13.2

package org.jabref.logic.journals.ltwa;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LtwaParser}.
 */
public interface LtwaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code SingleWordTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void enterSingleWordTitleFull(LtwaParser.SingleWordTitleFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleWordTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void exitSingleWordTitleFull(LtwaParser.SingleWordTitleFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopwordPlusTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void enterStopwordPlusTitleFull(LtwaParser.StopwordPlusTitleFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopwordPlusTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void exitStopwordPlusTitleFull(LtwaParser.StopwordPlusTitleFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyPlusSymbolsFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void enterAnyPlusSymbolsFull(LtwaParser.AnyPlusSymbolsFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyPlusSymbolsFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void exitAnyPlusSymbolsFull(LtwaParser.AnyPlusSymbolsFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void enterNormalTitleFull(LtwaParser.NormalTitleFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalTitleFull}
	 * labeled alternative in {@link LtwaParser#title}.
	 * @param ctx the parse tree
	 */
	void exitNormalTitleFull(LtwaParser.NormalTitleFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#singleWordTitle}.
	 * @param ctx the parse tree
	 */
	void enterSingleWordTitle(LtwaParser.SingleWordTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#singleWordTitle}.
	 * @param ctx the parse tree
	 */
	void exitSingleWordTitle(LtwaParser.SingleWordTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#stopwordPlusAny}.
	 * @param ctx the parse tree
	 */
	void enterStopwordPlusAny(LtwaParser.StopwordPlusAnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#stopwordPlusAny}.
	 * @param ctx the parse tree
	 */
	void exitStopwordPlusAny(LtwaParser.StopwordPlusAnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#anyPlusSymbols}.
	 * @param ctx the parse tree
	 */
	void enterAnyPlusSymbols(LtwaParser.AnyPlusSymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#anyPlusSymbols}.
	 * @param ctx the parse tree
	 */
	void exitAnyPlusSymbols(LtwaParser.AnyPlusSymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#normalTitle}.
	 * @param ctx the parse tree
	 */
	void enterNormalTitle(LtwaParser.NormalTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#normalTitle}.
	 * @param ctx the parse tree
	 */
	void exitNormalTitle(LtwaParser.NormalTitleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterArticleElement(LtwaParser.ArticleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArticleElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitArticleElement(LtwaParser.ArticleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopwordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterStopwordElement(LtwaParser.StopwordElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopwordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitStopwordElement(LtwaParser.StopwordElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolsElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsElement(LtwaParser.SymbolsElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolsElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsElement(LtwaParser.SymbolsElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrdinalElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterOrdinalElement(LtwaParser.OrdinalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrdinalElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitOrdinalElement(LtwaParser.OrdinalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterWordElement(LtwaParser.WordElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitWordElement(LtwaParser.WordElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HyphenElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterHyphenElement(LtwaParser.HyphenElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HyphenElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitHyphenElement(LtwaParser.HyphenElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PartElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterPartElement(LtwaParser.PartElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PartElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitPartElement(LtwaParser.PartElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbbreviationElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviationElement(LtwaParser.AbbreviationElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbbreviationElement}
	 * labeled alternative in {@link LtwaParser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviationElement(LtwaParser.AbbreviationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(LtwaParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(LtwaParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#stopword}.
	 * @param ctx the parse tree
	 */
	void enterStopword(LtwaParser.StopwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#stopword}.
	 * @param ctx the parse tree
	 */
	void exitStopword(LtwaParser.StopwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(LtwaParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(LtwaParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void enterOrdinal(LtwaParser.OrdinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void exitOrdinal(LtwaParser.OrdinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(LtwaParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(LtwaParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void enterHyphen(LtwaParser.HyphenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void exitHyphen(LtwaParser.HyphenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(LtwaParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(LtwaParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LtwaParser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviation(LtwaParser.AbbreviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LtwaParser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviation(LtwaParser.AbbreviationContext ctx);
}