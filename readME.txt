Alunas: Mikaelle dos Santos Oliveira - 192080350
Natalia Maria de Araujo Lima - 192080369

Projeto compiladores usando a ferramenta JavaCC para realizar análises léxicas e sintáticas de programas escritos na linguagem MiniJava.

Pré-requisitos:

Java Development Kit (JDK) instalado em seu sistema.

	1°opção: JavaCC instalado em seu sistema. Você pode baixar o JavaCC em: https://javacc.github.io/javacc/

	2°opção: via eclipse Marketplace  

Passos:

1. Baixe o projeto  e salve-o em um diretório de sua escolha.

2. Abra o terminal e navegue até o diretório onde você salvou os arquivos Scanner.jj e Parser.jj.

3. Execute o comando abaixo para gerar o código Java a partir do arquivo .jj:

	javacc Scanner.jj 
	ou
	javacc Parser.jj

Isso irá gerar os arquivos Java necessários para a análise lexica (Scanner) e análise sintatica (Parser) da gramática MinJava.

4. Compile os arquivos Java gerados usando o seguinte comando:

	javac *.java

Isso irá compilar os arquivos Java e gerar os arquivos de classe correspondentes.

5. Agora execute o programa. Utilize o seguinte comando para executar o arquivo de classe Gramatica:

	java Scanner example.txt ou java Scanner example.mjv
	java Parser example.txt ou java Parser example.mjv

O programa irá ler o arquivo example contendo um exemplo de código em MinJava. Ele realizará a análise léxica e sintática do código e imprimirá a saída correspondente.
