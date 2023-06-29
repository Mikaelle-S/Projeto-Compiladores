/* Parser.java */
/* Generated By:JavaCC: Do not edit this line. Parser.java */
import java.io.*;

public class Parser implements ParserConstants {
  public static void main(String args []) throws ParseException, IOException
  {
    try {
      Parser parser = new Parser(new FileInputStream(args[0]));
      parser.Start();
    }catch(ParseException e) {
      System.out.println("Erros foram encontrados: " + e);
    } catch (IOException e) {
      System.out.println("Erro ao ler o arquivo de entrada: " + e);
    }


  }

  static final public int Start() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Goal();
    }
    jj_consume_token(0);
System.out.print("Sintaxe ok. \n");
    {if ("" != null) return 0;}
    throw new Error("Missing return statement in function");
}

//Goal	::=	MainClass ( ClassDeclaration )* <EOF>
void Goal() throws ParseException {Token t;
    MainClass();
    label_2:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_2;
      }
      ClassDeclaration();
    }
}

/*MainClass	::=	"class" Identifier "{"
 "public" "static" "void" "main" "(" "String" "[" "]" Identifier ")" "{"
 Statement "}" "}"*/
  static final public 
void MainClass() throws ParseException {
    jj_consume_token(CLASS);
    Identifier();
    jj_consume_token(AC);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(AP);
    jj_consume_token(STRING);
    jj_consume_token(ACO);
    jj_consume_token(FCO);
    jj_consume_token(ID);
    jj_consume_token(FP);
    jj_consume_token(AC);
    Statement();
    jj_consume_token(FC);
    jj_consume_token(FC);
}

/*ClassDeclaration	::=	"class" Identifier ( "extends" Identifier )?
"{" ( VarDeclaration )* ( MethodDeclaration )* "}"*/
  static final public 
void ClassDeclaration() throws ParseException {
    jj_consume_token(CLASS);
    Identifier();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case EXTENDS:{
      jj_consume_token(EXTENDS);
      Identifier();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    jj_consume_token(AC);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INT:
      case BOOLEAN:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      VarDeclaration();
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PUBLIC:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      MethodDeclaration();
    }
    jj_consume_token(FC);
}

//VarDeclaration	::=	Type Identifier ";"
  static final public 
void VarDeclaration() throws ParseException {
    Type();
    Identifier();
    jj_consume_token(PV);
}

/*MethodDeclaration	::=	"public" Type Identifier "(" ( Type Identifier ( "," Type
Identifier )* )? ")" "{" ( VarDeclaration )* ( Statement )* "return" Expression ";" "}*/
  static final public 
void MethodDeclaration() throws ParseException {
    jj_consume_token(PUBLIC);
    Type();
    Identifier();
    jj_consume_token(AP);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INT:
    case BOOLEAN:
    case ID:{
      Type();
      Identifier();
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case VIRGULA:{
          ;
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          break label_5;
        }
        jj_consume_token(VIRGULA);
        Type();
        Identifier();
      }
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    jj_consume_token(FP);
    jj_consume_token(AC);
    label_6:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_6;
      }
      VarDeclaration();
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IF:
      case WHILE:
      case AC:
      case SYSTEM_OUT_PRINTLN:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        break label_7;
      }
      Statement();
    }
    jj_consume_token(RETURN);
    Expression();
    jj_consume_token(PV);
    jj_consume_token(FC);
}

/*Type	::=	"int" "[" "]"
|	"boolean"
|	"int"
|	Identifier
*/
  static final public 
void Type() throws ParseException {
    if (jj_2_3(2)) {
      jj_consume_token(INT);
      jj_consume_token(ACO);
      jj_consume_token(FCO);
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BOOLEAN:{
        jj_consume_token(BOOLEAN);
        break;
        }
      case INT:{
        jj_consume_token(INT);
        break;
        }
      case ID:{
        Identifier();
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
}

/*Statement	::=	"{" ( Statement )* "}"
|	"if" "(" Expression ")" Statement "else" Statement
|	"while" "(" Expression ")" Statement
|	"System.out.println" "(" Expression ")" ";"
|	Identifier "=" Expression ";"
|	Identifier "[" Expression "]" "=" Expression ";"*/
  static final public 
void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AC:{
      jj_consume_token(AC);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IF:
        case WHILE:
        case AC:
        case SYSTEM_OUT_PRINTLN:
        case ID:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_8;
        }
        Statement();
      }
      jj_consume_token(FC);
      break;
      }
    case IF:{
      jj_consume_token(IF);
      jj_consume_token(AP);
      Expression();
      jj_consume_token(FP);
      Statement();
      jj_consume_token(ELSE);
      Statement();
      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      jj_consume_token(AP);
      Expression();
      jj_consume_token(FP);
      Statement();
      break;
      }
    case SYSTEM_OUT_PRINTLN:{
      jj_consume_token(SYSTEM_OUT_PRINTLN);
      jj_consume_token(AP);
      Expression();
      jj_consume_token(FP);
      jj_consume_token(PV);
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      if (jj_2_4(2)) {
        Identifier();
        jj_consume_token(IGUAL);
        Expression();
        jj_consume_token(PV);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ID:{
          Identifier();
          jj_consume_token(ACO);
          Expression();
          jj_consume_token(FCO);
          jj_consume_token(IGUAL);
          Expression();
          jj_consume_token(PV);
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
}

/*Expression	::=	Expression ( "&&" | "<" | "+" | "-" | "*" ) Expression
|	Expression "[" Expression "]"
|	Expression "." "length"
|	Expression "." Identifier "(" ( Expression ( "," Expression )* )? ")"
|	<INTEGER_LITERAL>
|	"true"
|	"false"
|	Identifier
|	"this"
|	"new" "int" "[" Expression "]"
|	"new" Identifier "(" ")"
|	"!" Expression
|	"(" Expression ")"*/
  static final public 
void Expression() throws ParseException {Token t;
    Term();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MAIS:
      case MENOS:
      case MULTIPLICAR:
      case MENOR:
      case OP_AND:
      case ACO:
      case PONTO:{
        ;
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        break label_9;
      }
      Expressionl();
    }
}

  static final public void Expressionl() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OP_AND:{
      jj_consume_token(OP_AND);
      Term();
      break;
      }
    case MENOR:{
      jj_consume_token(MENOR);
      Term();
      break;
      }
    case MAIS:{
      jj_consume_token(MAIS);
      Term();
      break;
      }
    case MENOS:{
      jj_consume_token(MENOS);
      Term();
      break;
      }
    case MULTIPLICAR:{
      jj_consume_token(MULTIPLICAR);
      Term();
      break;
      }
    case ACO:{
      jj_consume_token(ACO);
      Expression();
      jj_consume_token(FCO);
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      if (jj_2_5(2)) {
        jj_consume_token(PONTO);
        jj_consume_token(LENGTH);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PONTO:{
          jj_consume_token(PONTO);
          Identifier();
          jj_consume_token(AP);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case TRUE:
          case FALSE:
          case THIS:
          case NEW:
          case OP_NOT:
          case AP:
          case ID:
          case INTEGER_LITERAL:{
            Expression();
            label_10:
            while (true) {
              switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
              case VIRGULA:{
                ;
                break;
                }
              default:
                jj_la1[12] = jj_gen;
                break label_10;
              }
              jj_consume_token(VIRGULA);
              Expression();
            }
            break;
            }
          default:
            jj_la1[13] = jj_gen;
            ;
          }
          jj_consume_token(FP);
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
}

  static final public void Term() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_LITERAL:{
      jj_consume_token(INTEGER_LITERAL);
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    case ID:{
      Identifier();
      break;
      }
    case THIS:{
      jj_consume_token(THIS);
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      if (jj_2_6(2)) {
        jj_consume_token(NEW);
        jj_consume_token(INT);
        jj_consume_token(ACO);
        Expression();
        jj_consume_token(FCO);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NEW:{
          jj_consume_token(NEW);
          Identifier();
          jj_consume_token(AP);
          jj_consume_token(FP);
          break;
          }
        case OP_NOT:{
          jj_consume_token(OP_NOT);
          Term();
          break;
          }
        case AP:{
          jj_consume_token(AP);
          Expression();
          jj_consume_token(FP);
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
}

  static final public void Identifier() throws ParseException {
    jj_consume_token(ID);
}

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_1()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_2()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_3()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_4()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_5()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return (!jj_3_6()); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_3_6()
 {
    if (jj_scan_token(NEW)) return true;
    if (jj_scan_token(INT)) return true;
    return false;
  }

  static private boolean jj_3_1()
 {
    if (jj_3R_ClassDeclaration_138_3_11()) return true;
    return false;
  }

  static private boolean jj_3R_Type_170_3_13()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_scan_token(23)) {
    jj_scanpos = xsp;
    if (jj_scan_token(22)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3R_VarDeclaration_147_3_12()
 {
    if (jj_3R_Type_170_3_13()) return true;
    if (jj_scan_token(43)) return true;
    return false;
  }

  static private boolean jj_3_3()
 {
    if (jj_scan_token(INT)) return true;
    if (jj_scan_token(ACO)) return true;
    return false;
  }

  static private boolean jj_3_4()
 {
    if (jj_scan_token(43)) return true;
    if (jj_scan_token(IGUAL)) return true;
    return false;
  }

  static private boolean jj_3_2()
 {
    if (jj_3R_VarDeclaration_147_3_12()) return true;
    return false;
  }

  static private boolean jj_3R_ClassDeclaration_138_3_11()
 {
    if (jj_scan_token(CLASS)) return true;
    if (jj_scan_token(43)) return true;
    return false;
  }

  static private boolean jj_3_5()
 {
    if (jj_scan_token(PONTO)) return true;
    if (jj_scan_token(LENGTH)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x80,0x2000,0xc00000,0x100,0x0,0xc00000,0x28000,0xc00000,0x28000,0x28000,0x0,0x3e000000,0x0,0x403c0000,0x3e000000,0x0,0x1c0000,0x40200000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x0,0x800,0x0,0x100,0x800,0xa08,0x800,0xa08,0x208,0x800,0xa0,0x100,0x1802,0x20,0x80,0x1800,0x2,};
	}
  static final private JJCalls[] jj_2_rtns = new JJCalls[6];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new ParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new ParserTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new ParserTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
	 for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   if (++jj_gc > 100) {
		 jj_gc = 0;
		 for (int i = 0; i < jj_2_rtns.length; i++) {
		   JJCalls c = jj_2_rtns[i];
		   while (c != null) {
			 if (c.gen < jj_gen) c.first = null;
			 c = c.next;
		   }
		 }
	   }
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error {
    @Override
    public Throwable fillInStackTrace() {
      return this;
    }
  }
  static private final LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
	 if (jj_scanpos == jj_lastpos) {
	   jj_la--;
	   if (jj_scanpos.next == null) {
		 jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
	   } else {
		 jj_lastpos = jj_scanpos = jj_scanpos.next;
	   }
	 } else {
	   jj_scanpos = jj_scanpos.next;
	 }
	 if (jj_rescan) {
	   int i = 0; Token tok = token;
	   while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
	   if (tok != null) jj_add_error_token(kind, i);
	 }
	 if (jj_scanpos.kind != kind) return true;
	 if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
	 return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
	 if (pos >= 100) {
		return;
	 }

	 if (pos == jj_endpos + 1) {
	   jj_lasttokens[jj_endpos++] = kind;
	 } else if (jj_endpos != 0) {
	   jj_expentry = new int[jj_endpos];

	   for (int i = 0; i < jj_endpos; i++) {
		 jj_expentry[i] = jj_lasttokens[i];
	   }

	   for (int[] oldentry : jj_expentries) {
		 if (oldentry.length == jj_expentry.length) {
		   boolean isMatched = true;

		   for (int i = 0; i < jj_expentry.length; i++) {
			 if (oldentry[i] != jj_expentry[i]) {
			   isMatched = false;
			   break;
			 }

		   }
		   if (isMatched) {
			 jj_expentries.add(jj_expentry);
			 break;
		   }
		 }
	   }

	   if (pos != 0) {
		 jj_lasttokens[(jj_endpos = pos) - 1] = kind;
	   }
	 }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[45];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 18; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 45; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 jj_endpos = 0;
	 jj_rescan_token();
	 jj_add_error_token(0, 0);
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
	 jj_rescan = true;
	 for (int i = 0; i < 6; i++) {
	   try {
		 JJCalls p = jj_2_rtns[i];

		 do {
		   if (p.gen > jj_gen) {
			 jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
			 switch (i) {
			   case 0: jj_3_1(); break;
			   case 1: jj_3_2(); break;
			   case 2: jj_3_3(); break;
			   case 3: jj_3_4(); break;
			   case 4: jj_3_5(); break;
			   case 5: jj_3_6(); break;
			 }
		   }
		   p = p.next;
		 } while (p != null);

		 } catch(LookaheadSuccess ls) { }
	 }
	 jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
	 JJCalls p = jj_2_rtns[index];
	 while (p.gen > jj_gen) {
	   if (p.next == null) { p = p.next = new JJCalls(); break; }
	   p = p.next;
	 }

	 p.gen = jj_gen + xla - jj_la; 
	 p.first = token;
	 p.arg = xla;
  }

  static final class JJCalls {
	 int gen;
	 Token first;
	 int arg;
	 JJCalls next;
  }

}