// Generated from PascalLang.g4 by ANTLR 4.4

	import dataStructure.pSymbol;
	import dataStructure.pSymbolTable;
	import dataStructure.pVariable;
	import exceptions.pException;
	import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalLangParser}.
 */
public interface PascalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterDecl_procedimento(@NotNull PascalLangParser.Decl_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#decl_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitDecl_procedimento(@NotNull PascalLangParser.Decl_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull PascalLangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull PascalLangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull PascalLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull PascalLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamada_procedimento(@NotNull PascalLangParser.Chamada_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamada_procedimento(@NotNull PascalLangParser.Chamada_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull PascalLangParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull PascalLangParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull PascalLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull PascalLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void enterLista_identificadores(@NotNull PascalLangParser.Lista_identificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void exitLista_identificadores(@NotNull PascalLangParser.Lista_identificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull PascalLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull PascalLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull PascalLangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull PascalLangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterSelec_parametr_formais(@NotNull PascalLangParser.Selec_parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#selec_parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitSelec_parametr_formais(@NotNull PascalLangParser.Selec_parametr_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull PascalLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull PascalLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void enterList_expressoes(@NotNull PascalLangParser.List_expressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#list_expressoes}.
	 * @param ctx the parse tree
	 */
	void exitList_expressoes(@NotNull PascalLangParser.List_expressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void enterParametr_formais(@NotNull PascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#parametr_formais}.
	 * @param ctx the parse tree
	 */
	void exitParametr_formais(@NotNull PascalLangParser.Parametr_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional(@NotNull PascalLangParser.Comando_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional(@NotNull PascalLangParser.Comando_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull PascalLangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull PascalLangParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(@NotNull PascalLangParser.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(@NotNull PascalLangParser.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull PascalLangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull PascalLangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void enterComando_composto(@NotNull PascalLangParser.Comando_compostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#comando_composto}.
	 * @param ctx the parse tree
	 */
	void exitComando_composto(@NotNull PascalLangParser.Comando_compostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull PascalLangParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull PascalLangParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComando_repetitivo(@NotNull PascalLangParser.Comando_repetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#comando_repetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComando_repetitivo(@NotNull PascalLangParser.Comando_repetitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_var(@NotNull PascalLangParser.Part_decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#part_decl_var}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_var(@NotNull PascalLangParser.Part_decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void enterPart_decl_sub_rotinas(@NotNull PascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#part_decl_sub_rotinas}.
	 * @param ctx the parse tree
	 */
	void exitPart_decl_sub_rotinas(@NotNull PascalLangParser.Part_decl_sub_rotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(@NotNull PascalLangParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(@NotNull PascalLangParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull PascalLangParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLangParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull PascalLangParser.IdentificadorContext ctx);
}