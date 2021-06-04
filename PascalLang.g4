grammar PascalLang;

//Programa e Bloco

programa	: PROGRAM identificador PV bloco
			;
			
bloco		: part_decl_var? part_decl_sub_rotinas? comando_composto
			;

//Declarações

part_decl_var : decl_vars (PV decl_vars)* PV
			  ;

decl_vars 	: tipo lista_identificadores
			;
			
lista_identificadores	: identificador (VG identificador)*
						;

part_decl_sub_rotinas	: ( decl_procedimento PV)*
						;
						
decl_procedimento	: PROCEDURE identificador parametr_formais? PV bloco
					;
					
parametr_formais	: AP selec_parametr_formais (PV selec_parametr_formais)* FP
					;
			
selec_parametr_formais	: VAR? lista_identificadores DP identificador
						;
						
//Comandos

comando_composto	: BEGIN comando (comando)* END {System.out.println("Reconheci um comando composto");}
					;
					
comando	: atribuicao | chamada_procedimento | comando_composto | comando_condicional | comando_repetitivo
		;
		
atribuicao	: variavel ATB expressao {System.out.println("Reconheci um comando de atribuicao");}
			;
			
chamada_procedimento	: identificador (AP list_expressoes FP)? {System.out.println("Reconheci um comando de chamada de procedimento");}
						;
						
comando_condicional	: IF expressao THEN comando (ELSE comando)? {System.out.println("Reconheci um comando condicional");}
					;

comando_repetitivo	: WHILE expressao DO comando {System.out.println("Reconheci um comando repetitivo");}
					;

//Expressões
expressao	: expressao_simples (Relacao expressao_simples)?
			;
					
expressao_simples	: (PLUS | MINUS)? termo ((PLUS | MINUS | OR) termo)*
					;
					
termo	: fator ((TIMES | DIV | AND) fator)*
		;
		
fator	: variavel | numero | AP expressao FP | NOT fator
		;

variavel	: identificador | identificador (expressao)?
			;
			
list_expressoes	: expressao (VG expressao)*
				;		
		
//Números e idetificadores
numero	:Digito (Digito)*
		;	
		
identificador	: Letra (Letra | Digito)*
				;
				
//TIPOS		
tipo	: Integer | Real | Boolean | Char | String  
		;
				
//TOKENS				
				
Digito	: [0-9]
		;	
				
Letra	:	'_' | [a-z] | [A-Z] 			
		;

Relacao	: '=' | '<>' | '<' | '<=' | '>=' | '>'
		;
	
PROGRAM : 'program'
		;
	
PROCEDURE	: 'procedure'
			;
			
VAR	:	'var'
	;
	
BEGIN	:	'begin'
		;
		
END	:	'end'
	;

THEN:	'then'
	;
	
ELSE:	'else'
	;
	
WHILE	:	'while'
		;

DO	:	'do'
	;
	
OR	:	'or'
	;
	
DIV	:	'div'
	;
	
AND	:	'and'
	;
	
NOT	:	'not'
	;
	
Integer	: 	'integer'
		;
		
Real	:	'real'
		;
		
Boolean	:	'boolean'
		;
		
Char	:	'char'
		;
		
String	:	'String'
		;
		
TRUE	: 	'TRUE'
		;
		
FALSE	:	'FALSE'
		;
	
PLUS	:	'+'
		;
		
MINUS	:	'-'
		;
		
TIMES	:	'*'
		;		

AP	:	'('
	;
	
FP	:	')'
	;
			
PV	:	';'
	;
	
VG	: 	','
	;
	
DP	:	':'
	;		

ATB	:	':='
	;
	
IF	: 	'if'
	;
	
WS	:	(' ' | '\n' | '\t' | '\r') -> skip;