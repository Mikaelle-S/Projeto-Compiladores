# Projeto de Compiladores
## Mini-compilador para análise léxica e sintática
Projeto desenvolvido para a disciplina de compiladores da UEPB turma 2023..

O objetivo é construir um compilador que seja capaz de realizar as análises léxicas e sintáticas de programas escritos na linguagem [MiniJava](https://www.cambridge.org/us/features/052182060X/ "MiniJava"). (Java Simplificado).

### Ferramentas
Foi utilizada a ferramenta [JavaCC](https://javacc.github.io/javacc/ "JavaCC")

### O que produzir
1. Um projeto Java contendo todas as classes e arquivos auxiliares necessários para o correto funcionamento dessas duas fases da compilação.
2. Um arquivo readme.txt com o passo-a-passo descrevendo como executar o projeto e compilar um programa escrito em MiniJava dado como exemplo/teste.

### Sobre o analisador léxico
O analisador léxico deve  produzir na saída a lista de tokens corretamente sendo identificados. Caso haja algum erro léxico, o compilador deve apenas indicar na saída que deu erro, e não precisa dar detalhes.

### Sobre o Analisador sintático
O analisador sintático deve apenas indicar na saída se o programa está sintaticamente correto ou não. Não precisa dar detalhes da árvore sintática produzida, ou dos erros sintáticos encontrados.

### DATAS DE ENTREGA E CRITÉRIOS DE AVALIAÇÃO

+ **29/05/23** - Início do projeto
+ 1° Parte – **09/06/23** - 30% da entrega - **Entregar via email:** Arquivo .jj contendo a especificação da gramática do MiniJava no formato correto para uso pelo JavaCC
+ 2° Parte – **19/06/23** -  70% da entrega - **Apresentar (15min) o projeto:** explicar o que fazem as classes produzidas e mostrar uma demo do compilador em funcionamento. 

	–** Entregar via email:** Arquivo .zip com o projeto completo (pastas, classes, docs, arquivos auxiliares, readme.txt)


##### Exemplo simples de MiniJava usado no projeto :

```java
class Factorial{
    public static void main(String[] a){
        System.out.println(new Fac().ComputeFac(10));
    }
}
class Fac {
    public int ComputeFac(int num){
        int num_aux;
        if (num < 1)
            num_aux = 1;
        else
            num_aux = num * (this.ComputeFac(num-1));
        return num_aux ;
    }
}
```
### Espaços em branco:
```
[ \n  \t  \r  \f ]
```
### Comentários: dois tipos de comentário

```
// -- comentário de linha
/* */ -- comentário de 1 ou mais linhas
```

##### Identificadores: uma letra [a-z][A-Z]+, seguido de zero ou mais letras [0-9]][a-z][A-Z], dígitos ou _*

##### Numerais: apenas números inteiros __[0-9]__

#### Operadores: 

```
=
<
+
-
*
&&
!
```

#### Pontuação: 

```
(
)
[
]
{
}
;
.
,
```

#### Palavras reservadas: 

```
class
public
static
void
main
String
extends
return
if
else
while
true
false
this
new
int
boolean
length
System.out.println
```
### Instruções
1. Baixe o projeto  e salve-o em um diretório de sua escolha.
2. Abra o terminal e navegue até o diretório onde você salvou os arquivos Scanner.jj e Parser.jj.
3. Execute o comando abaixo para gerar o código Java a partir do arquivo .jj:
   
	`javacc Scanner.jj ` ou `javacc Parser.jj`

	Isso irá gerar os arquivos Java necessários para a análise lexica (Scanner) e análise sintatica (Parser) da gramática MinJava.
5. Compile os arquivos Java gerados usando o seguinte comando:
	`javac *.java`
	Isso irá compilar os arquivos Java e gerar os arquivos de classe correspondentes.
6. Agora execute o programa. Utilize o seguinte comando para executar o arquivo de classe Gramatica:
   
	`java Scanner example.txt` ou `java Scanner example.mjv`

	`java Parser example.txt` ou `java Parser example.mjv`

	O programa irá ler o arquivo example contendo um exemplo de código em MinJava. Ele realizará a análise léxica e sintática do código e imprimirá a saída correspondente.

# 

- Desenvolvido por: [Mikaelle Oliveira](https://github.com/Mikaelle-S) e [Natalia Maria](https://github.com/NattLima)

### Referências:

1. http://www.cs.tufts.edu/~sguyer/classes/comp181-2006/minijava.html
2. https://www.cambridge.org/us/features/052182060X/ 
3. https://javacc.github.io/javacc/
