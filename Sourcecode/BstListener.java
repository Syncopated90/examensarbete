// Generated from org/jabref/logic/bst/Bst.g4 by ANTLR 4.13.2

package org.jabref.logic.bst;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BstParser}.
 */
public interface BstListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BstParser#bstFile}.
	 * @param ctx the parse tree
	 */
	void enterBstFile(BstParser.BstFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#bstFile}.
	 * @param ctx the parse tree
	 */
	void exitBstFile(BstParser.BstFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringsCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterStringsCommand(BstParser.StringsCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringsCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitStringsCommand(BstParser.StringsCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integersCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterIntegersCommand(BstParser.IntegersCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integersCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitIntegersCommand(BstParser.IntegersCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCommand(BstParser.FunctionCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCommand(BstParser.FunctionCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code macroCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterMacroCommand(BstParser.MacroCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitMacroCommand(BstParser.MacroCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterReadCommand(BstParser.ReadCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitReadCommand(BstParser.ReadCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code executeCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterExecuteCommand(BstParser.ExecuteCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code executeCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitExecuteCommand(BstParser.ExecuteCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterateCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterIterateCommand(BstParser.IterateCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterateCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitIterateCommand(BstParser.IterateCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reverseCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterReverseCommand(BstParser.ReverseCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reverseCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitReverseCommand(BstParser.ReverseCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entryCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterEntryCommand(BstParser.EntryCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entryCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitEntryCommand(BstParser.EntryCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterSortCommand(BstParser.SortCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitSortCommand(BstParser.SortCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BstParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BstParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#idListObl}.
	 * @param ctx the parse tree
	 */
	void enterIdListObl(BstParser.IdListOblContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#idListObl}.
	 * @param ctx the parse tree
	 */
	void exitIdListObl(BstParser.IdListOblContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#idListOpt}.
	 * @param ctx the parse tree
	 */
	void enterIdListOpt(BstParser.IdListOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#idListOpt}.
	 * @param ctx the parse tree
	 */
	void exitIdListOpt(BstParser.IdListOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#bstFunction}.
	 * @param ctx the parse tree
	 */
	void enterBstFunction(BstParser.BstFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#bstFunction}.
	 * @param ctx the parse tree
	 */
	void exitBstFunction(BstParser.BstFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(BstParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(BstParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link BstParser#stackitem}.
	 * @param ctx the parse tree
	 */
	void enterStackitem(BstParser.StackitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BstParser#stackitem}.
	 * @param ctx the parse tree
	 */
	void exitStackitem(BstParser.StackitemContext ctx);
}