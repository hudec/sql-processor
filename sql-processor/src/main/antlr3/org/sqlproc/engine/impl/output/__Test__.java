import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.sqlproc.engine.impl.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SqlProcessorLexer lex = new SqlProcessorLexer(new ANTLRFileStream("/home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SqlProcessorParser g = new SqlProcessorParser(tokens, 49100, null);
        try {
            g.parse();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}