package org.sqlproc.dsl.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.sqlproc.dsl.parser.antlr.internal.InternalProcessorDslLexer;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        if (tokenType == InternalProcessorDslLexer.RULE_BAND || tokenType == InternalProcessorDslLexer.RULE_RBRACE
                || tokenType == InternalProcessorDslLexer.RULE_CARET
                || tokenType == InternalProcessorDslLexer.RULE_MORE_THAN
                || tokenType == InternalProcessorDslLexer.RULE_SEMICOLON
                || tokenType == InternalProcessorDslLexer.RULE_PLUS || tokenType == InternalProcessorDslLexer.RULE_OR
                || tokenType == InternalProcessorDslLexer.RULE_HASH
                || tokenType == InternalProcessorDslLexer.RULE_COMMA || tokenType == InternalProcessorDslLexer.RULE_AND
                || tokenType == InternalProcessorDslLexer.RULE_QUESTI
                || tokenType == InternalProcessorDslLexer.RULE_NOT || tokenType == InternalProcessorDslLexer.RULE_MINUS
                || tokenType == InternalProcessorDslLexer.RULE_COLON
                || tokenType == InternalProcessorDslLexer.RULE_STRING
                || tokenType == InternalProcessorDslLexer.RULE_REST
                || tokenType == InternalProcessorDslLexer.RULE_ESC_CHAR
                || tokenType == InternalProcessorDslLexer.RULE_NUMBER
                || tokenType == InternalProcessorDslLexer.RULE_IDENT
                || tokenType == InternalProcessorDslLexer.RULE_LPAREN
                || tokenType == InternalProcessorDslLexer.RULE_EQUALS
                || tokenType == InternalProcessorDslLexer.RULE_LBRACE
                || tokenType == InternalProcessorDslLexer.RULE_RPAREN
                || tokenType == InternalProcessorDslLexer.RULE_BOR
                || tokenType == InternalProcessorDslLexer.RULE_LESS_THAN
                || tokenType == InternalProcessorDslLexer.RULE_PERCENT
                || tokenType == InternalProcessorDslLexer.RULE_IDENT_DOT
                || tokenType == InternalProcessorDslLexer.RULE_AT)
            return HighlightingConfiguration.PUNCTATION;

        if (tokenType == InternalProcessorDslLexer.RULE_ML_COMMENT
                || tokenType == InternalProcessorDslLexer.RULE_SL_COMMENT)
            return HighlightingConfiguration.COMMENT;

        if (tokenName.equals("'BOPT'") || tokenName.equals("'OUT'") || tokenName.equals("'SOPT'")
                || tokenName.equals("'OPT'") || tokenName.equals("'QRY'") || tokenName.equals("'IOPT'")
                || tokenName.equals("'LOPT'") || tokenName.equals("'CRUD'") || tokenName.equals("'CALL'")
                || tokenName.equals("'pojo'") || tokenName.equals("'out'") || tokenName.equals("'in'")
                || tokenName.equals("'const'") || tokenName.equals("'table'") || tokenName.equals("'col'")
                || tokenName.equals("'prefix'") || tokenName.startsWith("'database")
                || tokenName.startsWith("'resolve") || tokenName.equals("'abstract'") || tokenName.equals("'package'")
                || tokenName.startsWith("'equals") || tokenName.equals("'outx'") || tokenName.equals("'inx'")
                || tokenName.equals("'constx'") || tokenName.equals("'colx'") || tokenName.equals("'final'")
                || tokenName.equals("'discriminator'") || tokenName.equals("'required'")
                || tokenName.equals("'primaryKey'") || tokenName.equals("'dao'") || tokenName.equals("'procedure'")
                || tokenName.equals("'function'"))
            return HighlightingConfiguration.TYPE;

        return HighlightingConfiguration.DEFAULT;
    }
}
