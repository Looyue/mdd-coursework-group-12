package mdd.coursework.xcss.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mdd.coursework.xcss.services.XcssGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXcssParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DollarSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "EqualsSign", "RULE_ID", "RULE_HEX", "RULE_FUNCTION_EXPRESSION", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=16;
    public static final int RULE_END=19;
    public static final int RULE_BEGIN=18;
    public static final int RULE_STRING=21;
    public static final int RULE_SL_COMMENT=23;
    public static final int Comma=9;
    public static final int EqualsSign=14;
    public static final int HyphenMinus=10;
    public static final int LeftParenthesis=5;
    public static final int Solidus=12;
    public static final int Colon=13;
    public static final int EOF=-1;
    public static final int Asterisk=7;
    public static final int FullStop=11;
    public static final int RULE_ID=15;
    public static final int RULE_FUNCTION_EXPRESSION=17;
    public static final int RULE_WS=24;
    public static final int RightParenthesis=6;
    public static final int RULE_ANY_OTHER=25;
    public static final int PlusSign=8;
    public static final int RULE_INT=20;
    public static final int DollarSign=4;
    public static final int RULE_ML_COMMENT=22;

    // delegates
    // delegators


        public InternalXcssParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXcssParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXcssParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXcssParser.g"; }


    	private XcssGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("DollarSign", "'\\u0024'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("EqualsSign", "'='");
    	}

    	public void setGrammarAccess(XcssGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleXcssModel"
    // InternalXcssParser.g:66:1: entryRuleXcssModel : ruleXcssModel EOF ;
    public final void entryRuleXcssModel() throws RecognitionException {
        try {
            // InternalXcssParser.g:67:1: ( ruleXcssModel EOF )
            // InternalXcssParser.g:68:1: ruleXcssModel EOF
            {
             before(grammarAccess.getXcssModelRule()); 
            pushFollow(FOLLOW_1);
            ruleXcssModel();

            state._fsp--;

             after(grammarAccess.getXcssModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXcssModel"


    // $ANTLR start "ruleXcssModel"
    // InternalXcssParser.g:75:1: ruleXcssModel : ( ( rule__XcssModel__ElementsAssignment )* ) ;
    public final void ruleXcssModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:79:2: ( ( ( rule__XcssModel__ElementsAssignment )* ) )
            // InternalXcssParser.g:80:2: ( ( rule__XcssModel__ElementsAssignment )* )
            {
            // InternalXcssParser.g:80:2: ( ( rule__XcssModel__ElementsAssignment )* )
            // InternalXcssParser.g:81:3: ( rule__XcssModel__ElementsAssignment )*
            {
             before(grammarAccess.getXcssModelAccess().getElementsAssignment()); 
            // InternalXcssParser.g:82:3: ( rule__XcssModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DollarSign||LA1_0==Asterisk||LA1_0==FullStop||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXcssParser.g:82:4: rule__XcssModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XcssModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXcssModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXcssModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalXcssParser.g:91:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalXcssParser.g:92:1: ( ruleAbstractElement EOF )
            // InternalXcssParser.g:93:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalXcssParser.g:100:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:104:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalXcssParser.g:105:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalXcssParser.g:105:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalXcssParser.g:106:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalXcssParser.g:107:3: ( rule__AbstractElement__Alternatives )
            // InternalXcssParser.g:107:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleXCSSStyleRule"
    // InternalXcssParser.g:116:1: entryRuleXCSSStyleRule : ruleXCSSStyleRule EOF ;
    public final void entryRuleXCSSStyleRule() throws RecognitionException {
        try {
            // InternalXcssParser.g:117:1: ( ruleXCSSStyleRule EOF )
            // InternalXcssParser.g:118:1: ruleXCSSStyleRule EOF
            {
             before(grammarAccess.getXCSSStyleRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleXCSSStyleRule();

            state._fsp--;

             after(grammarAccess.getXCSSStyleRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXCSSStyleRule"


    // $ANTLR start "ruleXCSSStyleRule"
    // InternalXcssParser.g:125:1: ruleXCSSStyleRule : ( ( rule__XCSSStyleRule__Group__0 ) ) ;
    public final void ruleXCSSStyleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:129:2: ( ( ( rule__XCSSStyleRule__Group__0 ) ) )
            // InternalXcssParser.g:130:2: ( ( rule__XCSSStyleRule__Group__0 ) )
            {
            // InternalXcssParser.g:130:2: ( ( rule__XCSSStyleRule__Group__0 ) )
            // InternalXcssParser.g:131:3: ( rule__XCSSStyleRule__Group__0 )
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getGroup()); 
            // InternalXcssParser.g:132:3: ( rule__XCSSStyleRule__Group__0 )
            // InternalXcssParser.g:132:4: rule__XCSSStyleRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCSSStyleRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCSSStyleRule"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalXcssParser.g:141:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalXcssParser.g:142:1: ( ruleVariableDeclaration EOF )
            // InternalXcssParser.g:143:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalXcssParser.g:150:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:154:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalXcssParser.g:155:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalXcssParser.g:155:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalXcssParser.g:156:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalXcssParser.g:157:3: ( rule__VariableDeclaration__Group__0 )
            // InternalXcssParser.g:157:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableId"
    // InternalXcssParser.g:166:1: entryRuleVariableId : ruleVariableId EOF ;
    public final void entryRuleVariableId() throws RecognitionException {
        try {
            // InternalXcssParser.g:167:1: ( ruleVariableId EOF )
            // InternalXcssParser.g:168:1: ruleVariableId EOF
            {
             before(grammarAccess.getVariableIdRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getVariableIdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableId"


    // $ANTLR start "ruleVariableId"
    // InternalXcssParser.g:175:1: ruleVariableId : ( ( rule__VariableId__Group__0 ) ) ;
    public final void ruleVariableId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:179:2: ( ( ( rule__VariableId__Group__0 ) ) )
            // InternalXcssParser.g:180:2: ( ( rule__VariableId__Group__0 ) )
            {
            // InternalXcssParser.g:180:2: ( ( rule__VariableId__Group__0 ) )
            // InternalXcssParser.g:181:3: ( rule__VariableId__Group__0 )
            {
             before(grammarAccess.getVariableIdAccess().getGroup()); 
            // InternalXcssParser.g:182:3: ( rule__VariableId__Group__0 )
            // InternalXcssParser.g:182:4: rule__VariableId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableIdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableId"


    // $ANTLR start "entryRuleAddition"
    // InternalXcssParser.g:191:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalXcssParser.g:192:1: ( ruleAddition EOF )
            // InternalXcssParser.g:193:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalXcssParser.g:200:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:204:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalXcssParser.g:205:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalXcssParser.g:205:2: ( ( rule__Addition__Group__0 ) )
            // InternalXcssParser.g:206:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalXcssParser.g:207:3: ( rule__Addition__Group__0 )
            // InternalXcssParser.g:207:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalXcssParser.g:216:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalXcssParser.g:217:1: ( ruleMultiplication EOF )
            // InternalXcssParser.g:218:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalXcssParser.g:225:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:229:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalXcssParser.g:230:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalXcssParser.g:230:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalXcssParser.g:231:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalXcssParser.g:232:3: ( rule__Multiplication__Group__0 )
            // InternalXcssParser.g:232:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalXcssParser.g:241:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalXcssParser.g:242:1: ( rulePrimary EOF )
            // InternalXcssParser.g:243:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalXcssParser.g:250:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:254:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalXcssParser.g:255:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalXcssParser.g:255:2: ( ( rule__Primary__Alternatives ) )
            // InternalXcssParser.g:256:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalXcssParser.g:257:3: ( rule__Primary__Alternatives )
            // InternalXcssParser.g:257:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleXCSSSelector"
    // InternalXcssParser.g:266:1: entryRuleXCSSSelector : ruleXCSSSelector EOF ;
    public final void entryRuleXCSSSelector() throws RecognitionException {
        try {
            // InternalXcssParser.g:267:1: ( ruleXCSSSelector EOF )
            // InternalXcssParser.g:268:1: ruleXCSSSelector EOF
            {
             before(grammarAccess.getXCSSSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleXCSSSelector();

            state._fsp--;

             after(grammarAccess.getXCSSSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXCSSSelector"


    // $ANTLR start "ruleXCSSSelector"
    // InternalXcssParser.g:275:1: ruleXCSSSelector : ( ( rule__XCSSSelector__Group__0 ) ) ;
    public final void ruleXCSSSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:279:2: ( ( ( rule__XCSSSelector__Group__0 ) ) )
            // InternalXcssParser.g:280:2: ( ( rule__XCSSSelector__Group__0 ) )
            {
            // InternalXcssParser.g:280:2: ( ( rule__XCSSSelector__Group__0 ) )
            // InternalXcssParser.g:281:3: ( rule__XCSSSelector__Group__0 )
            {
             before(grammarAccess.getXCSSSelectorAccess().getGroup()); 
            // InternalXcssParser.g:282:3: ( rule__XCSSSelector__Group__0 )
            // InternalXcssParser.g:282:4: rule__XCSSSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCSSSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCSSSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCSSSelector"


    // $ANTLR start "entryRuleSelectorName"
    // InternalXcssParser.g:291:1: entryRuleSelectorName : ruleSelectorName EOF ;
    public final void entryRuleSelectorName() throws RecognitionException {
        try {
            // InternalXcssParser.g:292:1: ( ruleSelectorName EOF )
            // InternalXcssParser.g:293:1: ruleSelectorName EOF
            {
             before(grammarAccess.getSelectorNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorName();

            state._fsp--;

             after(grammarAccess.getSelectorNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectorName"


    // $ANTLR start "ruleSelectorName"
    // InternalXcssParser.g:300:1: ruleSelectorName : ( ( rule__SelectorName__Alternatives ) ) ;
    public final void ruleSelectorName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:304:2: ( ( ( rule__SelectorName__Alternatives ) ) )
            // InternalXcssParser.g:305:2: ( ( rule__SelectorName__Alternatives ) )
            {
            // InternalXcssParser.g:305:2: ( ( rule__SelectorName__Alternatives ) )
            // InternalXcssParser.g:306:3: ( rule__SelectorName__Alternatives )
            {
             before(grammarAccess.getSelectorNameAccess().getAlternatives()); 
            // InternalXcssParser.g:307:3: ( rule__SelectorName__Alternatives )
            // InternalXcssParser.g:307:4: rule__SelectorName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectorName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorName"


    // $ANTLR start "entryRulePseudoClass"
    // InternalXcssParser.g:316:1: entryRulePseudoClass : rulePseudoClass EOF ;
    public final void entryRulePseudoClass() throws RecognitionException {
        try {
            // InternalXcssParser.g:317:1: ( rulePseudoClass EOF )
            // InternalXcssParser.g:318:1: rulePseudoClass EOF
            {
             before(grammarAccess.getPseudoClassRule()); 
            pushFollow(FOLLOW_1);
            rulePseudoClass();

            state._fsp--;

             after(grammarAccess.getPseudoClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // InternalXcssParser.g:325:1: rulePseudoClass : ( ( rule__PseudoClass__Group__0 ) ) ;
    public final void rulePseudoClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:329:2: ( ( ( rule__PseudoClass__Group__0 ) ) )
            // InternalXcssParser.g:330:2: ( ( rule__PseudoClass__Group__0 ) )
            {
            // InternalXcssParser.g:330:2: ( ( rule__PseudoClass__Group__0 ) )
            // InternalXcssParser.g:331:3: ( rule__PseudoClass__Group__0 )
            {
             before(grammarAccess.getPseudoClassAccess().getGroup()); 
            // InternalXcssParser.g:332:3: ( rule__PseudoClass__Group__0 )
            // InternalXcssParser.g:332:4: rule__PseudoClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPseudoClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRuleCSSStyleDelacration"
    // InternalXcssParser.g:341:1: entryRuleCSSStyleDelacration : ruleCSSStyleDelacration EOF ;
    public final void entryRuleCSSStyleDelacration() throws RecognitionException {
        try {
            // InternalXcssParser.g:342:1: ( ruleCSSStyleDelacration EOF )
            // InternalXcssParser.g:343:1: ruleCSSStyleDelacration EOF
            {
             before(grammarAccess.getCSSStyleDelacrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCSSStyleDelacration();

            state._fsp--;

             after(grammarAccess.getCSSStyleDelacrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSStyleDelacration"


    // $ANTLR start "ruleCSSStyleDelacration"
    // InternalXcssParser.g:350:1: ruleCSSStyleDelacration : ( ( rule__CSSStyleDelacration__Group__0 ) ) ;
    public final void ruleCSSStyleDelacration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:354:2: ( ( ( rule__CSSStyleDelacration__Group__0 ) ) )
            // InternalXcssParser.g:355:2: ( ( rule__CSSStyleDelacration__Group__0 ) )
            {
            // InternalXcssParser.g:355:2: ( ( rule__CSSStyleDelacration__Group__0 ) )
            // InternalXcssParser.g:356:3: ( rule__CSSStyleDelacration__Group__0 )
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getGroup()); 
            // InternalXcssParser.g:357:3: ( rule__CSSStyleDelacration__Group__0 )
            // InternalXcssParser.g:357:4: rule__CSSStyleDelacration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleDelacrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSStyleDelacration"


    // $ANTLR start "entryRuleCSSStyleKey"
    // InternalXcssParser.g:366:1: entryRuleCSSStyleKey : ruleCSSStyleKey EOF ;
    public final void entryRuleCSSStyleKey() throws RecognitionException {
        try {
            // InternalXcssParser.g:367:1: ( ruleCSSStyleKey EOF )
            // InternalXcssParser.g:368:1: ruleCSSStyleKey EOF
            {
             before(grammarAccess.getCSSStyleKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleCSSStyleKey();

            state._fsp--;

             after(grammarAccess.getCSSStyleKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSStyleKey"


    // $ANTLR start "ruleCSSStyleKey"
    // InternalXcssParser.g:375:1: ruleCSSStyleKey : ( ( rule__CSSStyleKey__ValueAssignment ) ) ;
    public final void ruleCSSStyleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:379:2: ( ( ( rule__CSSStyleKey__ValueAssignment ) ) )
            // InternalXcssParser.g:380:2: ( ( rule__CSSStyleKey__ValueAssignment ) )
            {
            // InternalXcssParser.g:380:2: ( ( rule__CSSStyleKey__ValueAssignment ) )
            // InternalXcssParser.g:381:3: ( rule__CSSStyleKey__ValueAssignment )
            {
             before(grammarAccess.getCSSStyleKeyAccess().getValueAssignment()); 
            // InternalXcssParser.g:382:3: ( rule__CSSStyleKey__ValueAssignment )
            // InternalXcssParser.g:382:4: rule__CSSStyleKey__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleKey__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleKeyAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSStyleKey"


    // $ANTLR start "entryRuleCSSStyleValue"
    // InternalXcssParser.g:391:1: entryRuleCSSStyleValue : ruleCSSStyleValue EOF ;
    public final void entryRuleCSSStyleValue() throws RecognitionException {
        try {
            // InternalXcssParser.g:392:1: ( ruleCSSStyleValue EOF )
            // InternalXcssParser.g:393:1: ruleCSSStyleValue EOF
            {
             before(grammarAccess.getCSSStyleValueRule()); 
            pushFollow(FOLLOW_1);
            ruleCSSStyleValue();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSStyleValue"


    // $ANTLR start "ruleCSSStyleValue"
    // InternalXcssParser.g:400:1: ruleCSSStyleValue : ( ( rule__CSSStyleValue__Alternatives ) ) ;
    public final void ruleCSSStyleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:404:2: ( ( ( rule__CSSStyleValue__Alternatives ) ) )
            // InternalXcssParser.g:405:2: ( ( rule__CSSStyleValue__Alternatives ) )
            {
            // InternalXcssParser.g:405:2: ( ( rule__CSSStyleValue__Alternatives ) )
            // InternalXcssParser.g:406:3: ( rule__CSSStyleValue__Alternatives )
            {
             before(grammarAccess.getCSSStyleValueAccess().getAlternatives()); 
            // InternalXcssParser.g:407:3: ( rule__CSSStyleValue__Alternatives )
            // InternalXcssParser.g:407:4: rule__CSSStyleValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSStyleValue"


    // $ANTLR start "entryRuleCSSStyleValueLiteral"
    // InternalXcssParser.g:416:1: entryRuleCSSStyleValueLiteral : ruleCSSStyleValueLiteral EOF ;
    public final void entryRuleCSSStyleValueLiteral() throws RecognitionException {
        try {
            // InternalXcssParser.g:417:1: ( ruleCSSStyleValueLiteral EOF )
            // InternalXcssParser.g:418:1: ruleCSSStyleValueLiteral EOF
            {
             before(grammarAccess.getCSSStyleValueLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleCSSStyleValueLiteral();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSStyleValueLiteral"


    // $ANTLR start "ruleCSSStyleValueLiteral"
    // InternalXcssParser.g:425:1: ruleCSSStyleValueLiteral : ( ( rule__CSSStyleValueLiteral__Alternatives ) ) ;
    public final void ruleCSSStyleValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:429:2: ( ( ( rule__CSSStyleValueLiteral__Alternatives ) ) )
            // InternalXcssParser.g:430:2: ( ( rule__CSSStyleValueLiteral__Alternatives ) )
            {
            // InternalXcssParser.g:430:2: ( ( rule__CSSStyleValueLiteral__Alternatives ) )
            // InternalXcssParser.g:431:3: ( rule__CSSStyleValueLiteral__Alternatives )
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getAlternatives()); 
            // InternalXcssParser.g:432:3: ( rule__CSSStyleValueLiteral__Alternatives )
            // InternalXcssParser.g:432:4: rule__CSSStyleValueLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleValueLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleValueLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSStyleValueLiteral"


    // $ANTLR start "entryRuleSizeLiteral"
    // InternalXcssParser.g:441:1: entryRuleSizeLiteral : ruleSizeLiteral EOF ;
    public final void entryRuleSizeLiteral() throws RecognitionException {
        try {
            // InternalXcssParser.g:442:1: ( ruleSizeLiteral EOF )
            // InternalXcssParser.g:443:1: ruleSizeLiteral EOF
            {
             before(grammarAccess.getSizeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleSizeLiteral();

            state._fsp--;

             after(grammarAccess.getSizeLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSizeLiteral"


    // $ANTLR start "ruleSizeLiteral"
    // InternalXcssParser.g:450:1: ruleSizeLiteral : ( ( rule__SizeLiteral__Group__0 ) ) ;
    public final void ruleSizeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:454:2: ( ( ( rule__SizeLiteral__Group__0 ) ) )
            // InternalXcssParser.g:455:2: ( ( rule__SizeLiteral__Group__0 ) )
            {
            // InternalXcssParser.g:455:2: ( ( rule__SizeLiteral__Group__0 ) )
            // InternalXcssParser.g:456:3: ( rule__SizeLiteral__Group__0 )
            {
             before(grammarAccess.getSizeLiteralAccess().getGroup()); 
            // InternalXcssParser.g:457:3: ( rule__SizeLiteral__Group__0 )
            // InternalXcssParser.g:457:4: rule__SizeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SizeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSizeLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalXcssParser.g:466:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalXcssParser.g:467:1: ( ruleNumberLiteral EOF )
            // InternalXcssParser.g:468:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalXcssParser.g:475:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:479:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalXcssParser.g:480:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalXcssParser.g:480:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalXcssParser.g:481:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalXcssParser.g:482:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalXcssParser.g:482:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalXcssParser.g:491:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalXcssParser.g:492:1: ( ruleNUMBER EOF )
            // InternalXcssParser.g:493:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalXcssParser.g:500:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:504:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalXcssParser.g:505:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalXcssParser.g:505:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalXcssParser.g:506:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalXcssParser.g:507:3: ( rule__NUMBER__Alternatives )
            // InternalXcssParser.g:507:4: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleFLOAT"
    // InternalXcssParser.g:516:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalXcssParser.g:520:1: ( ruleFLOAT EOF )
            // InternalXcssParser.g:521:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalXcssParser.g:531:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:536:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalXcssParser.g:537:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalXcssParser.g:537:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalXcssParser.g:538:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalXcssParser.g:539:3: ( rule__FLOAT__Group__0 )
            // InternalXcssParser.g:539:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalXcssParser.g:548:1: rule__AbstractElement__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleXCSSStyleRule ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:552:1: ( ( ruleVariableDeclaration ) | ( ruleXCSSStyleRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DollarSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==Asterisk||LA2_0==FullStop||LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXcssParser.g:553:2: ( ruleVariableDeclaration )
                    {
                    // InternalXcssParser.g:553:2: ( ruleVariableDeclaration )
                    // InternalXcssParser.g:554:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:559:2: ( ruleXCSSStyleRule )
                    {
                    // InternalXcssParser.g:559:2: ( ruleXCSSStyleRule )
                    // InternalXcssParser.g:560:3: ruleXCSSStyleRule
                    {
                     before(grammarAccess.getAbstractElementAccess().getXCSSStyleRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXCSSStyleRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getXCSSStyleRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalXcssParser.g:569:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:573:1: ( ( PlusSign ) | ( HyphenMinus ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PlusSign) ) {
                alt3=1;
            }
            else if ( (LA3_0==HyphenMinus) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXcssParser.g:574:2: ( PlusSign )
                    {
                    // InternalXcssParser.g:574:2: ( PlusSign )
                    // InternalXcssParser.g:575:3: PlusSign
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,PlusSign,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:580:2: ( HyphenMinus )
                    {
                    // InternalXcssParser.g:580:2: ( HyphenMinus )
                    // InternalXcssParser.g:581:3: HyphenMinus
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,HyphenMinus,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalXcssParser.g:590:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( Asterisk ) | ( Solidus ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:594:1: ( ( Asterisk ) | ( Solidus ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Asterisk) ) {
                alt4=1;
            }
            else if ( (LA4_0==Solidus) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXcssParser.g:595:2: ( Asterisk )
                    {
                    // InternalXcssParser.g:595:2: ( Asterisk )
                    // InternalXcssParser.g:596:3: Asterisk
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,Asterisk,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:601:2: ( Solidus )
                    {
                    // InternalXcssParser.g:601:2: ( Solidus )
                    // InternalXcssParser.g:602:3: Solidus
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,Solidus,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalXcssParser.g:611:1: rule__Primary__Alternatives : ( ( ruleCSSStyleValue ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:615:1: ( ( ruleCSSStyleValue ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DollarSign||(LA5_0>=HyphenMinus && LA5_0<=FullStop)||(LA5_0>=RULE_ID && LA5_0<=RULE_FUNCTION_EXPRESSION)||(LA5_0>=RULE_INT && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==LeftParenthesis) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXcssParser.g:616:2: ( ruleCSSStyleValue )
                    {
                    // InternalXcssParser.g:616:2: ( ruleCSSStyleValue )
                    // InternalXcssParser.g:617:3: ruleCSSStyleValue
                    {
                     before(grammarAccess.getPrimaryAccess().getCSSStyleValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCSSStyleValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getCSSStyleValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:622:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalXcssParser.g:622:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalXcssParser.g:623:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalXcssParser.g:624:3: ( rule__Primary__Group_1__0 )
                    // InternalXcssParser.g:624:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__SelectorName__Alternatives"
    // InternalXcssParser.g:632:1: rule__SelectorName__Alternatives : ( ( ( rule__SelectorName__Group_0__0 ) ) | ( ( rule__SelectorName__AsteriskAssignment_1 ) ) );
    public final void rule__SelectorName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:636:1: ( ( ( rule__SelectorName__Group_0__0 ) ) | ( ( rule__SelectorName__AsteriskAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FullStop||LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==Asterisk) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXcssParser.g:637:2: ( ( rule__SelectorName__Group_0__0 ) )
                    {
                    // InternalXcssParser.g:637:2: ( ( rule__SelectorName__Group_0__0 ) )
                    // InternalXcssParser.g:638:3: ( rule__SelectorName__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorNameAccess().getGroup_0()); 
                    // InternalXcssParser.g:639:3: ( rule__SelectorName__Group_0__0 )
                    // InternalXcssParser.g:639:4: rule__SelectorName__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectorName__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorNameAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:643:2: ( ( rule__SelectorName__AsteriskAssignment_1 ) )
                    {
                    // InternalXcssParser.g:643:2: ( ( rule__SelectorName__AsteriskAssignment_1 ) )
                    // InternalXcssParser.g:644:3: ( rule__SelectorName__AsteriskAssignment_1 )
                    {
                     before(grammarAccess.getSelectorNameAccess().getAsteriskAssignment_1()); 
                    // InternalXcssParser.g:645:3: ( rule__SelectorName__AsteriskAssignment_1 )
                    // InternalXcssParser.g:645:4: rule__SelectorName__AsteriskAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectorName__AsteriskAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorNameAccess().getAsteriskAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__Alternatives"


    // $ANTLR start "rule__CSSStyleValue__Alternatives"
    // InternalXcssParser.g:653:1: rule__CSSStyleValue__Alternatives : ( ( ( rule__CSSStyleValue__ValueAssignment_0 ) ) | ( ( rule__CSSStyleValue__VariableAssignment_1 ) ) );
    public final void rule__CSSStyleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:657:1: ( ( ( rule__CSSStyleValue__ValueAssignment_0 ) ) | ( ( rule__CSSStyleValue__VariableAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=HyphenMinus && LA7_0<=FullStop)||(LA7_0>=RULE_ID && LA7_0<=RULE_FUNCTION_EXPRESSION)||(LA7_0>=RULE_INT && LA7_0<=RULE_STRING)) ) {
                alt7=1;
            }
            else if ( (LA7_0==DollarSign) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXcssParser.g:658:2: ( ( rule__CSSStyleValue__ValueAssignment_0 ) )
                    {
                    // InternalXcssParser.g:658:2: ( ( rule__CSSStyleValue__ValueAssignment_0 ) )
                    // InternalXcssParser.g:659:3: ( rule__CSSStyleValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getCSSStyleValueAccess().getValueAssignment_0()); 
                    // InternalXcssParser.g:660:3: ( rule__CSSStyleValue__ValueAssignment_0 )
                    // InternalXcssParser.g:660:4: rule__CSSStyleValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:664:2: ( ( rule__CSSStyleValue__VariableAssignment_1 ) )
                    {
                    // InternalXcssParser.g:664:2: ( ( rule__CSSStyleValue__VariableAssignment_1 ) )
                    // InternalXcssParser.g:665:3: ( rule__CSSStyleValue__VariableAssignment_1 )
                    {
                     before(grammarAccess.getCSSStyleValueAccess().getVariableAssignment_1()); 
                    // InternalXcssParser.g:666:3: ( rule__CSSStyleValue__VariableAssignment_1 )
                    // InternalXcssParser.g:666:4: rule__CSSStyleValue__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValue__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValue__Alternatives"


    // $ANTLR start "rule__CSSStyleValueLiteral__Alternatives"
    // InternalXcssParser.g:674:1: rule__CSSStyleValueLiteral__Alternatives : ( ( ( rule__CSSStyleValueLiteral__NumberAssignment_0 ) ) | ( ( rule__CSSStyleValueLiteral__SizeAssignment_1 ) ) | ( ( rule__CSSStyleValueLiteral__WordAssignment_2 ) ) | ( ( rule__CSSStyleValueLiteral__HexAssignment_3 ) ) | ( ( rule__CSSStyleValueLiteral__FunctionAssignment_4 ) ) | ( ( rule__CSSStyleValueLiteral__StringAssignment_5 ) ) );
    public final void rule__CSSStyleValueLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:678:1: ( ( ( rule__CSSStyleValueLiteral__NumberAssignment_0 ) ) | ( ( rule__CSSStyleValueLiteral__SizeAssignment_1 ) ) | ( ( rule__CSSStyleValueLiteral__WordAssignment_2 ) ) | ( ( rule__CSSStyleValueLiteral__HexAssignment_3 ) ) | ( ( rule__CSSStyleValueLiteral__FunctionAssignment_4 ) ) | ( ( rule__CSSStyleValueLiteral__StringAssignment_5 ) ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalXcssParser.g:679:2: ( ( rule__CSSStyleValueLiteral__NumberAssignment_0 ) )
                    {
                    // InternalXcssParser.g:679:2: ( ( rule__CSSStyleValueLiteral__NumberAssignment_0 ) )
                    // InternalXcssParser.g:680:3: ( rule__CSSStyleValueLiteral__NumberAssignment_0 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getNumberAssignment_0()); 
                    // InternalXcssParser.g:681:3: ( rule__CSSStyleValueLiteral__NumberAssignment_0 )
                    // InternalXcssParser.g:681:4: rule__CSSStyleValueLiteral__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:685:2: ( ( rule__CSSStyleValueLiteral__SizeAssignment_1 ) )
                    {
                    // InternalXcssParser.g:685:2: ( ( rule__CSSStyleValueLiteral__SizeAssignment_1 ) )
                    // InternalXcssParser.g:686:3: ( rule__CSSStyleValueLiteral__SizeAssignment_1 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getSizeAssignment_1()); 
                    // InternalXcssParser.g:687:3: ( rule__CSSStyleValueLiteral__SizeAssignment_1 )
                    // InternalXcssParser.g:687:4: rule__CSSStyleValueLiteral__SizeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__SizeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getSizeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXcssParser.g:691:2: ( ( rule__CSSStyleValueLiteral__WordAssignment_2 ) )
                    {
                    // InternalXcssParser.g:691:2: ( ( rule__CSSStyleValueLiteral__WordAssignment_2 ) )
                    // InternalXcssParser.g:692:3: ( rule__CSSStyleValueLiteral__WordAssignment_2 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getWordAssignment_2()); 
                    // InternalXcssParser.g:693:3: ( rule__CSSStyleValueLiteral__WordAssignment_2 )
                    // InternalXcssParser.g:693:4: rule__CSSStyleValueLiteral__WordAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__WordAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getWordAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXcssParser.g:697:2: ( ( rule__CSSStyleValueLiteral__HexAssignment_3 ) )
                    {
                    // InternalXcssParser.g:697:2: ( ( rule__CSSStyleValueLiteral__HexAssignment_3 ) )
                    // InternalXcssParser.g:698:3: ( rule__CSSStyleValueLiteral__HexAssignment_3 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getHexAssignment_3()); 
                    // InternalXcssParser.g:699:3: ( rule__CSSStyleValueLiteral__HexAssignment_3 )
                    // InternalXcssParser.g:699:4: rule__CSSStyleValueLiteral__HexAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__HexAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getHexAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXcssParser.g:703:2: ( ( rule__CSSStyleValueLiteral__FunctionAssignment_4 ) )
                    {
                    // InternalXcssParser.g:703:2: ( ( rule__CSSStyleValueLiteral__FunctionAssignment_4 ) )
                    // InternalXcssParser.g:704:3: ( rule__CSSStyleValueLiteral__FunctionAssignment_4 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getFunctionAssignment_4()); 
                    // InternalXcssParser.g:705:3: ( rule__CSSStyleValueLiteral__FunctionAssignment_4 )
                    // InternalXcssParser.g:705:4: rule__CSSStyleValueLiteral__FunctionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__FunctionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getFunctionAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXcssParser.g:709:2: ( ( rule__CSSStyleValueLiteral__StringAssignment_5 ) )
                    {
                    // InternalXcssParser.g:709:2: ( ( rule__CSSStyleValueLiteral__StringAssignment_5 ) )
                    // InternalXcssParser.g:710:3: ( rule__CSSStyleValueLiteral__StringAssignment_5 )
                    {
                     before(grammarAccess.getCSSStyleValueLiteralAccess().getStringAssignment_5()); 
                    // InternalXcssParser.g:711:3: ( rule__CSSStyleValueLiteral__StringAssignment_5 )
                    // InternalXcssParser.g:711:4: rule__CSSStyleValueLiteral__StringAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSStyleValueLiteral__StringAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getCSSStyleValueLiteralAccess().getStringAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // InternalXcssParser.g:719:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:723:1: ( ( RULE_INT ) | ( ruleFLOAT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case DollarSign:
                case RightParenthesis:
                case Asterisk:
                case PlusSign:
                case HyphenMinus:
                case Solidus:
                case RULE_ID:
                case RULE_END:
                    {
                    alt9=1;
                    }
                    break;
                case FullStop:
                    {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==RULE_INT) ) {
                        alt9=2;
                    }
                    else if ( (LA9_4==RULE_ID) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA9_0>=HyphenMinus && LA9_0<=FullStop)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXcssParser.g:724:2: ( RULE_INT )
                    {
                    // InternalXcssParser.g:724:2: ( RULE_INT )
                    // InternalXcssParser.g:725:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:730:2: ( ruleFLOAT )
                    {
                    // InternalXcssParser.g:730:2: ( ruleFLOAT )
                    // InternalXcssParser.g:731:3: ruleFLOAT
                    {
                     before(grammarAccess.getNUMBERAccess().getFLOATParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getNUMBERAccess().getFLOATParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__XCSSStyleRule__Group__0"
    // InternalXcssParser.g:740:1: rule__XCSSStyleRule__Group__0 : rule__XCSSStyleRule__Group__0__Impl rule__XCSSStyleRule__Group__1 ;
    public final void rule__XCSSStyleRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:744:1: ( rule__XCSSStyleRule__Group__0__Impl rule__XCSSStyleRule__Group__1 )
            // InternalXcssParser.g:745:2: rule__XCSSStyleRule__Group__0__Impl rule__XCSSStyleRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XCSSStyleRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__0"


    // $ANTLR start "rule__XCSSStyleRule__Group__0__Impl"
    // InternalXcssParser.g:752:1: rule__XCSSStyleRule__Group__0__Impl : ( ( rule__XCSSStyleRule__SelectorsAssignment_0 ) ) ;
    public final void rule__XCSSStyleRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:756:1: ( ( ( rule__XCSSStyleRule__SelectorsAssignment_0 ) ) )
            // InternalXcssParser.g:757:1: ( ( rule__XCSSStyleRule__SelectorsAssignment_0 ) )
            {
            // InternalXcssParser.g:757:1: ( ( rule__XCSSStyleRule__SelectorsAssignment_0 ) )
            // InternalXcssParser.g:758:2: ( rule__XCSSStyleRule__SelectorsAssignment_0 )
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getSelectorsAssignment_0()); 
            // InternalXcssParser.g:759:2: ( rule__XCSSStyleRule__SelectorsAssignment_0 )
            // InternalXcssParser.g:759:3: rule__XCSSStyleRule__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__SelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXCSSStyleRuleAccess().getSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__0__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group__1"
    // InternalXcssParser.g:767:1: rule__XCSSStyleRule__Group__1 : rule__XCSSStyleRule__Group__1__Impl rule__XCSSStyleRule__Group__2 ;
    public final void rule__XCSSStyleRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:771:1: ( rule__XCSSStyleRule__Group__1__Impl rule__XCSSStyleRule__Group__2 )
            // InternalXcssParser.g:772:2: rule__XCSSStyleRule__Group__1__Impl rule__XCSSStyleRule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XCSSStyleRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__1"


    // $ANTLR start "rule__XCSSStyleRule__Group__1__Impl"
    // InternalXcssParser.g:779:1: rule__XCSSStyleRule__Group__1__Impl : ( ( rule__XCSSStyleRule__Group_1__0 )* ) ;
    public final void rule__XCSSStyleRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:783:1: ( ( ( rule__XCSSStyleRule__Group_1__0 )* ) )
            // InternalXcssParser.g:784:1: ( ( rule__XCSSStyleRule__Group_1__0 )* )
            {
            // InternalXcssParser.g:784:1: ( ( rule__XCSSStyleRule__Group_1__0 )* )
            // InternalXcssParser.g:785:2: ( rule__XCSSStyleRule__Group_1__0 )*
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getGroup_1()); 
            // InternalXcssParser.g:786:2: ( rule__XCSSStyleRule__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXcssParser.g:786:3: rule__XCSSStyleRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__XCSSStyleRule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXCSSStyleRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__1__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group__2"
    // InternalXcssParser.g:794:1: rule__XCSSStyleRule__Group__2 : rule__XCSSStyleRule__Group__2__Impl rule__XCSSStyleRule__Group__3 ;
    public final void rule__XCSSStyleRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:798:1: ( rule__XCSSStyleRule__Group__2__Impl rule__XCSSStyleRule__Group__3 )
            // InternalXcssParser.g:799:2: rule__XCSSStyleRule__Group__2__Impl rule__XCSSStyleRule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__XCSSStyleRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__2"


    // $ANTLR start "rule__XCSSStyleRule__Group__2__Impl"
    // InternalXcssParser.g:806:1: rule__XCSSStyleRule__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__XCSSStyleRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:810:1: ( ( RULE_BEGIN ) )
            // InternalXcssParser.g:811:1: ( RULE_BEGIN )
            {
            // InternalXcssParser.g:811:1: ( RULE_BEGIN )
            // InternalXcssParser.g:812:2: RULE_BEGIN
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getXCSSStyleRuleAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__2__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group__3"
    // InternalXcssParser.g:821:1: rule__XCSSStyleRule__Group__3 : rule__XCSSStyleRule__Group__3__Impl rule__XCSSStyleRule__Group__4 ;
    public final void rule__XCSSStyleRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:825:1: ( rule__XCSSStyleRule__Group__3__Impl rule__XCSSStyleRule__Group__4 )
            // InternalXcssParser.g:826:2: rule__XCSSStyleRule__Group__3__Impl rule__XCSSStyleRule__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__XCSSStyleRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__3"


    // $ANTLR start "rule__XCSSStyleRule__Group__3__Impl"
    // InternalXcssParser.g:833:1: rule__XCSSStyleRule__Group__3__Impl : ( ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )* ) ;
    public final void rule__XCSSStyleRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:837:1: ( ( ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )* ) )
            // InternalXcssParser.g:838:1: ( ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )* )
            {
            // InternalXcssParser.g:838:1: ( ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )* )
            // InternalXcssParser.g:839:2: ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )*
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getVariableDeclarationsAssignment_3()); 
            // InternalXcssParser.g:840:2: ( rule__XCSSStyleRule__VariableDeclarationsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DollarSign) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXcssParser.g:840:3: rule__XCSSStyleRule__VariableDeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__XCSSStyleRule__VariableDeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getXCSSStyleRuleAccess().getVariableDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__3__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group__4"
    // InternalXcssParser.g:848:1: rule__XCSSStyleRule__Group__4 : rule__XCSSStyleRule__Group__4__Impl rule__XCSSStyleRule__Group__5 ;
    public final void rule__XCSSStyleRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:852:1: ( rule__XCSSStyleRule__Group__4__Impl rule__XCSSStyleRule__Group__5 )
            // InternalXcssParser.g:853:2: rule__XCSSStyleRule__Group__4__Impl rule__XCSSStyleRule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__XCSSStyleRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__4"


    // $ANTLR start "rule__XCSSStyleRule__Group__4__Impl"
    // InternalXcssParser.g:860:1: rule__XCSSStyleRule__Group__4__Impl : ( ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )* ) ;
    public final void rule__XCSSStyleRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:864:1: ( ( ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )* ) )
            // InternalXcssParser.g:865:1: ( ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )* )
            {
            // InternalXcssParser.g:865:1: ( ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )* )
            // InternalXcssParser.g:866:2: ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )*
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getCssStyleDeclarationsAssignment_4()); 
            // InternalXcssParser.g:867:2: ( rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXcssParser.g:867:3: rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getXCSSStyleRuleAccess().getCssStyleDeclarationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__4__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group__5"
    // InternalXcssParser.g:875:1: rule__XCSSStyleRule__Group__5 : rule__XCSSStyleRule__Group__5__Impl ;
    public final void rule__XCSSStyleRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:879:1: ( rule__XCSSStyleRule__Group__5__Impl )
            // InternalXcssParser.g:880:2: rule__XCSSStyleRule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__5"


    // $ANTLR start "rule__XCSSStyleRule__Group__5__Impl"
    // InternalXcssParser.g:886:1: rule__XCSSStyleRule__Group__5__Impl : ( RULE_END ) ;
    public final void rule__XCSSStyleRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:890:1: ( ( RULE_END ) )
            // InternalXcssParser.g:891:1: ( RULE_END )
            {
            // InternalXcssParser.g:891:1: ( RULE_END )
            // InternalXcssParser.g:892:2: RULE_END
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getXCSSStyleRuleAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group__5__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group_1__0"
    // InternalXcssParser.g:902:1: rule__XCSSStyleRule__Group_1__0 : rule__XCSSStyleRule__Group_1__0__Impl rule__XCSSStyleRule__Group_1__1 ;
    public final void rule__XCSSStyleRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:906:1: ( rule__XCSSStyleRule__Group_1__0__Impl rule__XCSSStyleRule__Group_1__1 )
            // InternalXcssParser.g:907:2: rule__XCSSStyleRule__Group_1__0__Impl rule__XCSSStyleRule__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__XCSSStyleRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group_1__0"


    // $ANTLR start "rule__XCSSStyleRule__Group_1__0__Impl"
    // InternalXcssParser.g:914:1: rule__XCSSStyleRule__Group_1__0__Impl : ( Comma ) ;
    public final void rule__XCSSStyleRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:918:1: ( ( Comma ) )
            // InternalXcssParser.g:919:1: ( Comma )
            {
            // InternalXcssParser.g:919:1: ( Comma )
            // InternalXcssParser.g:920:2: Comma
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getXCSSStyleRuleAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group_1__0__Impl"


    // $ANTLR start "rule__XCSSStyleRule__Group_1__1"
    // InternalXcssParser.g:929:1: rule__XCSSStyleRule__Group_1__1 : rule__XCSSStyleRule__Group_1__1__Impl ;
    public final void rule__XCSSStyleRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:933:1: ( rule__XCSSStyleRule__Group_1__1__Impl )
            // InternalXcssParser.g:934:2: rule__XCSSStyleRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group_1__1"


    // $ANTLR start "rule__XCSSStyleRule__Group_1__1__Impl"
    // InternalXcssParser.g:940:1: rule__XCSSStyleRule__Group_1__1__Impl : ( ( rule__XCSSStyleRule__SelectorsAssignment_1_1 ) ) ;
    public final void rule__XCSSStyleRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:944:1: ( ( ( rule__XCSSStyleRule__SelectorsAssignment_1_1 ) ) )
            // InternalXcssParser.g:945:1: ( ( rule__XCSSStyleRule__SelectorsAssignment_1_1 ) )
            {
            // InternalXcssParser.g:945:1: ( ( rule__XCSSStyleRule__SelectorsAssignment_1_1 ) )
            // InternalXcssParser.g:946:2: ( rule__XCSSStyleRule__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getSelectorsAssignment_1_1()); 
            // InternalXcssParser.g:947:2: ( rule__XCSSStyleRule__SelectorsAssignment_1_1 )
            // InternalXcssParser.g:947:3: rule__XCSSStyleRule__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XCSSStyleRule__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXCSSStyleRuleAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalXcssParser.g:956:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:960:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalXcssParser.g:961:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalXcssParser.g:968:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:972:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // InternalXcssParser.g:973:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // InternalXcssParser.g:973:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // InternalXcssParser.g:974:2: ( rule__VariableDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            // InternalXcssParser.g:975:2: ( rule__VariableDeclaration__NameAssignment_0 )
            // InternalXcssParser.g:975:3: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalXcssParser.g:983:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:987:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalXcssParser.g:988:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalXcssParser.g:995:1: rule__VariableDeclaration__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:999:1: ( ( EqualsSign ) )
            // InternalXcssParser.g:1000:1: ( EqualsSign )
            {
            // InternalXcssParser.g:1000:1: ( EqualsSign )
            // InternalXcssParser.g:1001:2: EqualsSign
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalXcssParser.g:1010:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1014:1: ( rule__VariableDeclaration__Group__2__Impl )
            // InternalXcssParser.g:1015:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalXcssParser.g:1021:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1025:1: ( ( ( rule__VariableDeclaration__ValueAssignment_2 ) ) )
            // InternalXcssParser.g:1026:1: ( ( rule__VariableDeclaration__ValueAssignment_2 ) )
            {
            // InternalXcssParser.g:1026:1: ( ( rule__VariableDeclaration__ValueAssignment_2 ) )
            // InternalXcssParser.g:1027:2: ( rule__VariableDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_2()); 
            // InternalXcssParser.g:1028:2: ( rule__VariableDeclaration__ValueAssignment_2 )
            // InternalXcssParser.g:1028:3: rule__VariableDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableId__Group__0"
    // InternalXcssParser.g:1037:1: rule__VariableId__Group__0 : rule__VariableId__Group__0__Impl rule__VariableId__Group__1 ;
    public final void rule__VariableId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1041:1: ( rule__VariableId__Group__0__Impl rule__VariableId__Group__1 )
            // InternalXcssParser.g:1042:2: rule__VariableId__Group__0__Impl rule__VariableId__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableId__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableId__Group__0"


    // $ANTLR start "rule__VariableId__Group__0__Impl"
    // InternalXcssParser.g:1049:1: rule__VariableId__Group__0__Impl : ( DollarSign ) ;
    public final void rule__VariableId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1053:1: ( ( DollarSign ) )
            // InternalXcssParser.g:1054:1: ( DollarSign )
            {
            // InternalXcssParser.g:1054:1: ( DollarSign )
            // InternalXcssParser.g:1055:2: DollarSign
            {
             before(grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 
            match(input,DollarSign,FOLLOW_2); 
             after(grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableId__Group__0__Impl"


    // $ANTLR start "rule__VariableId__Group__1"
    // InternalXcssParser.g:1064:1: rule__VariableId__Group__1 : rule__VariableId__Group__1__Impl ;
    public final void rule__VariableId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1068:1: ( rule__VariableId__Group__1__Impl )
            // InternalXcssParser.g:1069:2: rule__VariableId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableId__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableId__Group__1"


    // $ANTLR start "rule__VariableId__Group__1__Impl"
    // InternalXcssParser.g:1075:1: rule__VariableId__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VariableId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1079:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:1080:1: ( RULE_ID )
            {
            // InternalXcssParser.g:1080:1: ( RULE_ID )
            // InternalXcssParser.g:1081:2: RULE_ID
            {
             before(grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableId__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalXcssParser.g:1091:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1095:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalXcssParser.g:1096:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalXcssParser.g:1103:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1107:1: ( ( ruleMultiplication ) )
            // InternalXcssParser.g:1108:1: ( ruleMultiplication )
            {
            // InternalXcssParser.g:1108:1: ( ruleMultiplication )
            // InternalXcssParser.g:1109:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalXcssParser.g:1118:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1122:1: ( rule__Addition__Group__1__Impl )
            // InternalXcssParser.g:1123:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalXcssParser.g:1129:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1133:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalXcssParser.g:1134:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalXcssParser.g:1134:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalXcssParser.g:1135:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalXcssParser.g:1136:2: ( rule__Addition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PlusSign||LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXcssParser.g:1136:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalXcssParser.g:1145:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1149:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalXcssParser.g:1150:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalXcssParser.g:1157:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1161:1: ( ( () ) )
            // InternalXcssParser.g:1162:1: ( () )
            {
            // InternalXcssParser.g:1162:1: ( () )
            // InternalXcssParser.g:1163:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalXcssParser.g:1164:2: ()
            // InternalXcssParser.g:1164:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalXcssParser.g:1172:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1176:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalXcssParser.g:1177:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalXcssParser.g:1184:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1188:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalXcssParser.g:1189:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalXcssParser.g:1189:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalXcssParser.g:1190:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalXcssParser.g:1191:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalXcssParser.g:1191:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalXcssParser.g:1199:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1203:1: ( rule__Addition__Group_1__2__Impl )
            // InternalXcssParser.g:1204:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalXcssParser.g:1210:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1214:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalXcssParser.g:1215:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalXcssParser.g:1215:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalXcssParser.g:1216:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalXcssParser.g:1217:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalXcssParser.g:1217:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalXcssParser.g:1226:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1230:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalXcssParser.g:1231:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalXcssParser.g:1238:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1242:1: ( ( rulePrimary ) )
            // InternalXcssParser.g:1243:1: ( rulePrimary )
            {
            // InternalXcssParser.g:1243:1: ( rulePrimary )
            // InternalXcssParser.g:1244:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalXcssParser.g:1253:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1257:1: ( rule__Multiplication__Group__1__Impl )
            // InternalXcssParser.g:1258:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalXcssParser.g:1264:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1268:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalXcssParser.g:1269:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalXcssParser.g:1269:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalXcssParser.g:1270:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalXcssParser.g:1271:2: ( rule__Multiplication__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Asterisk) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=DollarSign && LA14_2<=LeftParenthesis)||(LA14_2>=HyphenMinus && LA14_2<=FullStop)||(LA14_2>=RULE_ID && LA14_2<=RULE_FUNCTION_EXPRESSION)||(LA14_2>=RULE_INT && LA14_2<=RULE_STRING)) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==Solidus) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXcssParser.g:1271:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalXcssParser.g:1280:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1284:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalXcssParser.g:1285:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalXcssParser.g:1292:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1296:1: ( ( () ) )
            // InternalXcssParser.g:1297:1: ( () )
            {
            // InternalXcssParser.g:1297:1: ( () )
            // InternalXcssParser.g:1298:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalXcssParser.g:1299:2: ()
            // InternalXcssParser.g:1299:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalXcssParser.g:1307:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1311:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalXcssParser.g:1312:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalXcssParser.g:1319:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1323:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalXcssParser.g:1324:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalXcssParser.g:1324:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalXcssParser.g:1325:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalXcssParser.g:1326:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalXcssParser.g:1326:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalXcssParser.g:1334:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1338:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalXcssParser.g:1339:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalXcssParser.g:1345:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1349:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalXcssParser.g:1350:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalXcssParser.g:1350:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalXcssParser.g:1351:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalXcssParser.g:1352:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalXcssParser.g:1352:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalXcssParser.g:1361:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1365:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalXcssParser.g:1366:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalXcssParser.g:1373:1: rule__Primary__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1377:1: ( ( LeftParenthesis ) )
            // InternalXcssParser.g:1378:1: ( LeftParenthesis )
            {
            // InternalXcssParser.g:1378:1: ( LeftParenthesis )
            // InternalXcssParser.g:1379:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalXcssParser.g:1388:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1392:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalXcssParser.g:1393:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalXcssParser.g:1400:1: rule__Primary__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1404:1: ( ( ruleAddition ) )
            // InternalXcssParser.g:1405:1: ( ruleAddition )
            {
            // InternalXcssParser.g:1405:1: ( ruleAddition )
            // InternalXcssParser.g:1406:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalXcssParser.g:1415:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1419:1: ( rule__Primary__Group_1__2__Impl )
            // InternalXcssParser.g:1420:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalXcssParser.g:1426:1: rule__Primary__Group_1__2__Impl : ( RightParenthesis ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1430:1: ( ( RightParenthesis ) )
            // InternalXcssParser.g:1431:1: ( RightParenthesis )
            {
            // InternalXcssParser.g:1431:1: ( RightParenthesis )
            // InternalXcssParser.g:1432:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__XCSSSelector__Group__0"
    // InternalXcssParser.g:1442:1: rule__XCSSSelector__Group__0 : rule__XCSSSelector__Group__0__Impl rule__XCSSSelector__Group__1 ;
    public final void rule__XCSSSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1446:1: ( rule__XCSSSelector__Group__0__Impl rule__XCSSSelector__Group__1 )
            // InternalXcssParser.g:1447:2: rule__XCSSSelector__Group__0__Impl rule__XCSSSelector__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__XCSSSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCSSSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__Group__0"


    // $ANTLR start "rule__XCSSSelector__Group__0__Impl"
    // InternalXcssParser.g:1454:1: rule__XCSSSelector__Group__0__Impl : ( ( rule__XCSSSelector__NameAssignment_0 ) ) ;
    public final void rule__XCSSSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1458:1: ( ( ( rule__XCSSSelector__NameAssignment_0 ) ) )
            // InternalXcssParser.g:1459:1: ( ( rule__XCSSSelector__NameAssignment_0 ) )
            {
            // InternalXcssParser.g:1459:1: ( ( rule__XCSSSelector__NameAssignment_0 ) )
            // InternalXcssParser.g:1460:2: ( rule__XCSSSelector__NameAssignment_0 )
            {
             before(grammarAccess.getXCSSSelectorAccess().getNameAssignment_0()); 
            // InternalXcssParser.g:1461:2: ( rule__XCSSSelector__NameAssignment_0 )
            // InternalXcssParser.g:1461:3: rule__XCSSSelector__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__XCSSSelector__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXCSSSelectorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__Group__0__Impl"


    // $ANTLR start "rule__XCSSSelector__Group__1"
    // InternalXcssParser.g:1469:1: rule__XCSSSelector__Group__1 : rule__XCSSSelector__Group__1__Impl ;
    public final void rule__XCSSSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1473:1: ( rule__XCSSSelector__Group__1__Impl )
            // InternalXcssParser.g:1474:2: rule__XCSSSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCSSSelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__Group__1"


    // $ANTLR start "rule__XCSSSelector__Group__1__Impl"
    // InternalXcssParser.g:1480:1: rule__XCSSSelector__Group__1__Impl : ( ( rule__XCSSSelector__PseudoClassesAssignment_1 )* ) ;
    public final void rule__XCSSSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1484:1: ( ( ( rule__XCSSSelector__PseudoClassesAssignment_1 )* ) )
            // InternalXcssParser.g:1485:1: ( ( rule__XCSSSelector__PseudoClassesAssignment_1 )* )
            {
            // InternalXcssParser.g:1485:1: ( ( rule__XCSSSelector__PseudoClassesAssignment_1 )* )
            // InternalXcssParser.g:1486:2: ( rule__XCSSSelector__PseudoClassesAssignment_1 )*
            {
             before(grammarAccess.getXCSSSelectorAccess().getPseudoClassesAssignment_1()); 
            // InternalXcssParser.g:1487:2: ( rule__XCSSSelector__PseudoClassesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Colon) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXcssParser.g:1487:3: rule__XCSSSelector__PseudoClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__XCSSSelector__PseudoClassesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getXCSSSelectorAccess().getPseudoClassesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__Group__1__Impl"


    // $ANTLR start "rule__SelectorName__Group_0__0"
    // InternalXcssParser.g:1496:1: rule__SelectorName__Group_0__0 : rule__SelectorName__Group_0__0__Impl rule__SelectorName__Group_0__1 ;
    public final void rule__SelectorName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1500:1: ( rule__SelectorName__Group_0__0__Impl rule__SelectorName__Group_0__1 )
            // InternalXcssParser.g:1501:2: rule__SelectorName__Group_0__0__Impl rule__SelectorName__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__SelectorName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__Group_0__0"


    // $ANTLR start "rule__SelectorName__Group_0__0__Impl"
    // InternalXcssParser.g:1508:1: rule__SelectorName__Group_0__0__Impl : ( ( rule__SelectorName__DotAssignment_0_0 )? ) ;
    public final void rule__SelectorName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1512:1: ( ( ( rule__SelectorName__DotAssignment_0_0 )? ) )
            // InternalXcssParser.g:1513:1: ( ( rule__SelectorName__DotAssignment_0_0 )? )
            {
            // InternalXcssParser.g:1513:1: ( ( rule__SelectorName__DotAssignment_0_0 )? )
            // InternalXcssParser.g:1514:2: ( rule__SelectorName__DotAssignment_0_0 )?
            {
             before(grammarAccess.getSelectorNameAccess().getDotAssignment_0_0()); 
            // InternalXcssParser.g:1515:2: ( rule__SelectorName__DotAssignment_0_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FullStop) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXcssParser.g:1515:3: rule__SelectorName__DotAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectorName__DotAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorNameAccess().getDotAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__Group_0__0__Impl"


    // $ANTLR start "rule__SelectorName__Group_0__1"
    // InternalXcssParser.g:1523:1: rule__SelectorName__Group_0__1 : rule__SelectorName__Group_0__1__Impl ;
    public final void rule__SelectorName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1527:1: ( rule__SelectorName__Group_0__1__Impl )
            // InternalXcssParser.g:1528:2: rule__SelectorName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorName__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__Group_0__1"


    // $ANTLR start "rule__SelectorName__Group_0__1__Impl"
    // InternalXcssParser.g:1534:1: rule__SelectorName__Group_0__1__Impl : ( ( rule__SelectorName__NameAssignment_0_1 ) ) ;
    public final void rule__SelectorName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1538:1: ( ( ( rule__SelectorName__NameAssignment_0_1 ) ) )
            // InternalXcssParser.g:1539:1: ( ( rule__SelectorName__NameAssignment_0_1 ) )
            {
            // InternalXcssParser.g:1539:1: ( ( rule__SelectorName__NameAssignment_0_1 ) )
            // InternalXcssParser.g:1540:2: ( rule__SelectorName__NameAssignment_0_1 )
            {
             before(grammarAccess.getSelectorNameAccess().getNameAssignment_0_1()); 
            // InternalXcssParser.g:1541:2: ( rule__SelectorName__NameAssignment_0_1 )
            // InternalXcssParser.g:1541:3: rule__SelectorName__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectorName__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorNameAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__Group_0__1__Impl"


    // $ANTLR start "rule__PseudoClass__Group__0"
    // InternalXcssParser.g:1550:1: rule__PseudoClass__Group__0 : rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 ;
    public final void rule__PseudoClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1554:1: ( rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 )
            // InternalXcssParser.g:1555:2: rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PseudoClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__0"


    // $ANTLR start "rule__PseudoClass__Group__0__Impl"
    // InternalXcssParser.g:1562:1: rule__PseudoClass__Group__0__Impl : ( Colon ) ;
    public final void rule__PseudoClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1566:1: ( ( Colon ) )
            // InternalXcssParser.g:1567:1: ( Colon )
            {
            // InternalXcssParser.g:1567:1: ( Colon )
            // InternalXcssParser.g:1568:2: Colon
            {
             before(grammarAccess.getPseudoClassAccess().getColonKeyword_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPseudoClassAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__0__Impl"


    // $ANTLR start "rule__PseudoClass__Group__1"
    // InternalXcssParser.g:1577:1: rule__PseudoClass__Group__1 : rule__PseudoClass__Group__1__Impl ;
    public final void rule__PseudoClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1581:1: ( rule__PseudoClass__Group__1__Impl )
            // InternalXcssParser.g:1582:2: rule__PseudoClass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__1"


    // $ANTLR start "rule__PseudoClass__Group__1__Impl"
    // InternalXcssParser.g:1588:1: rule__PseudoClass__Group__1__Impl : ( ( rule__PseudoClass__ValueAssignment_1 ) ) ;
    public final void rule__PseudoClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1592:1: ( ( ( rule__PseudoClass__ValueAssignment_1 ) ) )
            // InternalXcssParser.g:1593:1: ( ( rule__PseudoClass__ValueAssignment_1 ) )
            {
            // InternalXcssParser.g:1593:1: ( ( rule__PseudoClass__ValueAssignment_1 ) )
            // InternalXcssParser.g:1594:2: ( rule__PseudoClass__ValueAssignment_1 )
            {
             before(grammarAccess.getPseudoClassAccess().getValueAssignment_1()); 
            // InternalXcssParser.g:1595:2: ( rule__PseudoClass__ValueAssignment_1 )
            // InternalXcssParser.g:1595:3: rule__PseudoClass__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPseudoClassAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__1__Impl"


    // $ANTLR start "rule__CSSStyleDelacration__Group__0"
    // InternalXcssParser.g:1604:1: rule__CSSStyleDelacration__Group__0 : rule__CSSStyleDelacration__Group__0__Impl rule__CSSStyleDelacration__Group__1 ;
    public final void rule__CSSStyleDelacration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1608:1: ( rule__CSSStyleDelacration__Group__0__Impl rule__CSSStyleDelacration__Group__1 )
            // InternalXcssParser.g:1609:2: rule__CSSStyleDelacration__Group__0__Impl rule__CSSStyleDelacration__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CSSStyleDelacration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__0"


    // $ANTLR start "rule__CSSStyleDelacration__Group__0__Impl"
    // InternalXcssParser.g:1616:1: rule__CSSStyleDelacration__Group__0__Impl : ( ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 ) ) ;
    public final void rule__CSSStyleDelacration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1620:1: ( ( ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 ) ) )
            // InternalXcssParser.g:1621:1: ( ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 ) )
            {
            // InternalXcssParser.g:1621:1: ( ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 ) )
            // InternalXcssParser.g:1622:2: ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 )
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyAssignment_0()); 
            // InternalXcssParser.g:1623:2: ( rule__CSSStyleDelacration__CssStyleKeyAssignment_0 )
            // InternalXcssParser.g:1623:3: rule__CSSStyleDelacration__CssStyleKeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__CssStyleKeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__0__Impl"


    // $ANTLR start "rule__CSSStyleDelacration__Group__1"
    // InternalXcssParser.g:1631:1: rule__CSSStyleDelacration__Group__1 : rule__CSSStyleDelacration__Group__1__Impl rule__CSSStyleDelacration__Group__2 ;
    public final void rule__CSSStyleDelacration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1635:1: ( rule__CSSStyleDelacration__Group__1__Impl rule__CSSStyleDelacration__Group__2 )
            // InternalXcssParser.g:1636:2: rule__CSSStyleDelacration__Group__1__Impl rule__CSSStyleDelacration__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CSSStyleDelacration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__1"


    // $ANTLR start "rule__CSSStyleDelacration__Group__1__Impl"
    // InternalXcssParser.g:1643:1: rule__CSSStyleDelacration__Group__1__Impl : ( Colon ) ;
    public final void rule__CSSStyleDelacration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1647:1: ( ( Colon ) )
            // InternalXcssParser.g:1648:1: ( Colon )
            {
            // InternalXcssParser.g:1648:1: ( Colon )
            // InternalXcssParser.g:1649:2: Colon
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCSSStyleDelacrationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__1__Impl"


    // $ANTLR start "rule__CSSStyleDelacration__Group__2"
    // InternalXcssParser.g:1658:1: rule__CSSStyleDelacration__Group__2 : rule__CSSStyleDelacration__Group__2__Impl ;
    public final void rule__CSSStyleDelacration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1662:1: ( rule__CSSStyleDelacration__Group__2__Impl )
            // InternalXcssParser.g:1663:2: rule__CSSStyleDelacration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__2"


    // $ANTLR start "rule__CSSStyleDelacration__Group__2__Impl"
    // InternalXcssParser.g:1669:1: rule__CSSStyleDelacration__Group__2__Impl : ( ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 ) ) ;
    public final void rule__CSSStyleDelacration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1673:1: ( ( ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 ) ) )
            // InternalXcssParser.g:1674:1: ( ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 ) )
            {
            // InternalXcssParser.g:1674:1: ( ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 ) )
            // InternalXcssParser.g:1675:2: ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 )
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueAssignment_2()); 
            // InternalXcssParser.g:1676:2: ( rule__CSSStyleDelacration__CssStyleValueAssignment_2 )
            // InternalXcssParser.g:1676:3: rule__CSSStyleDelacration__CssStyleValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSStyleDelacration__CssStyleValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__Group__2__Impl"


    // $ANTLR start "rule__SizeLiteral__Group__0"
    // InternalXcssParser.g:1685:1: rule__SizeLiteral__Group__0 : rule__SizeLiteral__Group__0__Impl rule__SizeLiteral__Group__1 ;
    public final void rule__SizeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1689:1: ( rule__SizeLiteral__Group__0__Impl rule__SizeLiteral__Group__1 )
            // InternalXcssParser.g:1690:2: rule__SizeLiteral__Group__0__Impl rule__SizeLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SizeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__Group__0"


    // $ANTLR start "rule__SizeLiteral__Group__0__Impl"
    // InternalXcssParser.g:1697:1: rule__SizeLiteral__Group__0__Impl : ( ( rule__SizeLiteral__ValueAssignment_0 ) ) ;
    public final void rule__SizeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1701:1: ( ( ( rule__SizeLiteral__ValueAssignment_0 ) ) )
            // InternalXcssParser.g:1702:1: ( ( rule__SizeLiteral__ValueAssignment_0 ) )
            {
            // InternalXcssParser.g:1702:1: ( ( rule__SizeLiteral__ValueAssignment_0 ) )
            // InternalXcssParser.g:1703:2: ( rule__SizeLiteral__ValueAssignment_0 )
            {
             before(grammarAccess.getSizeLiteralAccess().getValueAssignment_0()); 
            // InternalXcssParser.g:1704:2: ( rule__SizeLiteral__ValueAssignment_0 )
            // InternalXcssParser.g:1704:3: rule__SizeLiteral__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SizeLiteral__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeLiteralAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__Group__0__Impl"


    // $ANTLR start "rule__SizeLiteral__Group__1"
    // InternalXcssParser.g:1712:1: rule__SizeLiteral__Group__1 : rule__SizeLiteral__Group__1__Impl ;
    public final void rule__SizeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1716:1: ( rule__SizeLiteral__Group__1__Impl )
            // InternalXcssParser.g:1717:2: rule__SizeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SizeLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__Group__1"


    // $ANTLR start "rule__SizeLiteral__Group__1__Impl"
    // InternalXcssParser.g:1723:1: rule__SizeLiteral__Group__1__Impl : ( ( rule__SizeLiteral__UnitAssignment_1 ) ) ;
    public final void rule__SizeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1727:1: ( ( ( rule__SizeLiteral__UnitAssignment_1 ) ) )
            // InternalXcssParser.g:1728:1: ( ( rule__SizeLiteral__UnitAssignment_1 ) )
            {
            // InternalXcssParser.g:1728:1: ( ( rule__SizeLiteral__UnitAssignment_1 ) )
            // InternalXcssParser.g:1729:2: ( rule__SizeLiteral__UnitAssignment_1 )
            {
             before(grammarAccess.getSizeLiteralAccess().getUnitAssignment_1()); 
            // InternalXcssParser.g:1730:2: ( rule__SizeLiteral__UnitAssignment_1 )
            // InternalXcssParser.g:1730:3: rule__SizeLiteral__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SizeLiteral__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeLiteralAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalXcssParser.g:1739:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1743:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalXcssParser.g:1744:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalXcssParser.g:1751:1: rule__FLOAT__Group__0__Impl : ( ( HyphenMinus )? ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1755:1: ( ( ( HyphenMinus )? ) )
            // InternalXcssParser.g:1756:1: ( ( HyphenMinus )? )
            {
            // InternalXcssParser.g:1756:1: ( ( HyphenMinus )? )
            // InternalXcssParser.g:1757:2: ( HyphenMinus )?
            {
             before(grammarAccess.getFLOATAccess().getHyphenMinusKeyword_0()); 
            // InternalXcssParser.g:1758:2: ( HyphenMinus )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXcssParser.g:1758:3: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFLOATAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalXcssParser.g:1766:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1770:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalXcssParser.g:1771:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalXcssParser.g:1778:1: rule__FLOAT__Group__1__Impl : ( ( RULE_INT )* ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1782:1: ( ( ( RULE_INT )* ) )
            // InternalXcssParser.g:1783:1: ( ( RULE_INT )* )
            {
            // InternalXcssParser.g:1783:1: ( ( RULE_INT )* )
            // InternalXcssParser.g:1784:2: ( RULE_INT )*
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1()); 
            // InternalXcssParser.g:1785:2: ( RULE_INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXcssParser.g:1785:3: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalXcssParser.g:1793:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl rule__FLOAT__Group__3 ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1797:1: ( rule__FLOAT__Group__2__Impl rule__FLOAT__Group__3 )
            // InternalXcssParser.g:1798:2: rule__FLOAT__Group__2__Impl rule__FLOAT__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalXcssParser.g:1805:1: rule__FLOAT__Group__2__Impl : ( FullStop ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1809:1: ( ( FullStop ) )
            // InternalXcssParser.g:1810:1: ( FullStop )
            {
            // InternalXcssParser.g:1810:1: ( FullStop )
            // InternalXcssParser.g:1811:2: FullStop
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__FLOAT__Group__3"
    // InternalXcssParser.g:1820:1: rule__FLOAT__Group__3 : rule__FLOAT__Group__3__Impl ;
    public final void rule__FLOAT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1824:1: ( rule__FLOAT__Group__3__Impl )
            // InternalXcssParser.g:1825:2: rule__FLOAT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__3"


    // $ANTLR start "rule__FLOAT__Group__3__Impl"
    // InternalXcssParser.g:1831:1: rule__FLOAT__Group__3__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__FLOAT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1835:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalXcssParser.g:1836:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalXcssParser.g:1836:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalXcssParser.g:1837:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalXcssParser.g:1837:2: ( ( RULE_INT ) )
            // InternalXcssParser.g:1838:3: ( RULE_INT )
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3()); 
            // InternalXcssParser.g:1839:3: ( RULE_INT )
            // InternalXcssParser.g:1839:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_23); 

            }

             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3()); 

            }

            // InternalXcssParser.g:1842:2: ( ( RULE_INT )* )
            // InternalXcssParser.g:1843:3: ( RULE_INT )*
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3()); 
            // InternalXcssParser.g:1844:3: ( RULE_INT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXcssParser.g:1844:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__3__Impl"


    // $ANTLR start "rule__XcssModel__ElementsAssignment"
    // InternalXcssParser.g:1854:1: rule__XcssModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__XcssModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1858:1: ( ( ruleAbstractElement ) )
            // InternalXcssParser.g:1859:2: ( ruleAbstractElement )
            {
            // InternalXcssParser.g:1859:2: ( ruleAbstractElement )
            // InternalXcssParser.g:1860:3: ruleAbstractElement
            {
             before(grammarAccess.getXcssModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getXcssModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XcssModel__ElementsAssignment"


    // $ANTLR start "rule__XCSSStyleRule__SelectorsAssignment_0"
    // InternalXcssParser.g:1869:1: rule__XCSSStyleRule__SelectorsAssignment_0 : ( ruleXCSSSelector ) ;
    public final void rule__XCSSStyleRule__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1873:1: ( ( ruleXCSSSelector ) )
            // InternalXcssParser.g:1874:2: ( ruleXCSSSelector )
            {
            // InternalXcssParser.g:1874:2: ( ruleXCSSSelector )
            // InternalXcssParser.g:1875:3: ruleXCSSSelector
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXCSSSelector();

            state._fsp--;

             after(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__SelectorsAssignment_0"


    // $ANTLR start "rule__XCSSStyleRule__SelectorsAssignment_1_1"
    // InternalXcssParser.g:1884:1: rule__XCSSStyleRule__SelectorsAssignment_1_1 : ( ruleXCSSSelector ) ;
    public final void rule__XCSSStyleRule__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1888:1: ( ( ruleXCSSSelector ) )
            // InternalXcssParser.g:1889:2: ( ruleXCSSSelector )
            {
            // InternalXcssParser.g:1889:2: ( ruleXCSSSelector )
            // InternalXcssParser.g:1890:3: ruleXCSSSelector
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXCSSSelector();

            state._fsp--;

             after(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__SelectorsAssignment_1_1"


    // $ANTLR start "rule__XCSSStyleRule__VariableDeclarationsAssignment_3"
    // InternalXcssParser.g:1899:1: rule__XCSSStyleRule__VariableDeclarationsAssignment_3 : ( ruleVariableDeclaration ) ;
    public final void rule__XCSSStyleRule__VariableDeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1903:1: ( ( ruleVariableDeclaration ) )
            // InternalXcssParser.g:1904:2: ( ruleVariableDeclaration )
            {
            // InternalXcssParser.g:1904:2: ( ruleVariableDeclaration )
            // InternalXcssParser.g:1905:3: ruleVariableDeclaration
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getXCSSStyleRuleAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__VariableDeclarationsAssignment_3"


    // $ANTLR start "rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4"
    // InternalXcssParser.g:1914:1: rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4 : ( ruleCSSStyleDelacration ) ;
    public final void rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1918:1: ( ( ruleCSSStyleDelacration ) )
            // InternalXcssParser.g:1919:2: ( ruleCSSStyleDelacration )
            {
            // InternalXcssParser.g:1919:2: ( ruleCSSStyleDelacration )
            // InternalXcssParser.g:1920:3: ruleCSSStyleDelacration
            {
             before(grammarAccess.getXCSSStyleRuleAccess().getCssStyleDeclarationsCSSStyleDelacrationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCSSStyleDelacration();

            state._fsp--;

             after(grammarAccess.getXCSSStyleRuleAccess().getCssStyleDeclarationsCSSStyleDelacrationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSStyleRule__CssStyleDeclarationsAssignment_4"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_0"
    // InternalXcssParser.g:1929:1: rule__VariableDeclaration__NameAssignment_0 : ( ruleVariableId ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1933:1: ( ( ruleVariableId ) )
            // InternalXcssParser.g:1934:2: ( ruleVariableId )
            {
            // InternalXcssParser.g:1934:2: ( ruleVariableId )
            // InternalXcssParser.g:1935:3: ruleVariableId
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameVariableIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getNameVariableIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_2"
    // InternalXcssParser.g:1944:1: rule__VariableDeclaration__ValueAssignment_2 : ( ruleAddition ) ;
    public final void rule__VariableDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1948:1: ( ( ruleAddition ) )
            // InternalXcssParser.g:1949:2: ( ruleAddition )
            {
            // InternalXcssParser.g:1949:2: ( ruleAddition )
            // InternalXcssParser.g:1950:3: ruleAddition
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getValueAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalXcssParser.g:1959:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1963:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalXcssParser.g:1964:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalXcssParser.g:1964:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalXcssParser.g:1965:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalXcssParser.g:1966:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalXcssParser.g:1966:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalXcssParser.g:1974:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1978:1: ( ( ruleMultiplication ) )
            // InternalXcssParser.g:1979:2: ( ruleMultiplication )
            {
            // InternalXcssParser.g:1979:2: ( ruleMultiplication )
            // InternalXcssParser.g:1980:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalXcssParser.g:1989:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:1993:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalXcssParser.g:1994:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalXcssParser.g:1994:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalXcssParser.g:1995:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalXcssParser.g:1996:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalXcssParser.g:1996:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalXcssParser.g:2004:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2008:1: ( ( rulePrimary ) )
            // InternalXcssParser.g:2009:2: ( rulePrimary )
            {
            // InternalXcssParser.g:2009:2: ( rulePrimary )
            // InternalXcssParser.g:2010:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__XCSSSelector__NameAssignment_0"
    // InternalXcssParser.g:2019:1: rule__XCSSSelector__NameAssignment_0 : ( ruleSelectorName ) ;
    public final void rule__XCSSSelector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2023:1: ( ( ruleSelectorName ) )
            // InternalXcssParser.g:2024:2: ( ruleSelectorName )
            {
            // InternalXcssParser.g:2024:2: ( ruleSelectorName )
            // InternalXcssParser.g:2025:3: ruleSelectorName
            {
             before(grammarAccess.getXCSSSelectorAccess().getNameSelectorNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorName();

            state._fsp--;

             after(grammarAccess.getXCSSSelectorAccess().getNameSelectorNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__NameAssignment_0"


    // $ANTLR start "rule__XCSSSelector__PseudoClassesAssignment_1"
    // InternalXcssParser.g:2034:1: rule__XCSSSelector__PseudoClassesAssignment_1 : ( rulePseudoClass ) ;
    public final void rule__XCSSSelector__PseudoClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2038:1: ( ( rulePseudoClass ) )
            // InternalXcssParser.g:2039:2: ( rulePseudoClass )
            {
            // InternalXcssParser.g:2039:2: ( rulePseudoClass )
            // InternalXcssParser.g:2040:3: rulePseudoClass
            {
             before(grammarAccess.getXCSSSelectorAccess().getPseudoClassesPseudoClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePseudoClass();

            state._fsp--;

             after(grammarAccess.getXCSSSelectorAccess().getPseudoClassesPseudoClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCSSSelector__PseudoClassesAssignment_1"


    // $ANTLR start "rule__SelectorName__DotAssignment_0_0"
    // InternalXcssParser.g:2049:1: rule__SelectorName__DotAssignment_0_0 : ( ( FullStop ) ) ;
    public final void rule__SelectorName__DotAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2053:1: ( ( ( FullStop ) ) )
            // InternalXcssParser.g:2054:2: ( ( FullStop ) )
            {
            // InternalXcssParser.g:2054:2: ( ( FullStop ) )
            // InternalXcssParser.g:2055:3: ( FullStop )
            {
             before(grammarAccess.getSelectorNameAccess().getDotFullStopKeyword_0_0_0()); 
            // InternalXcssParser.g:2056:3: ( FullStop )
            // InternalXcssParser.g:2057:4: FullStop
            {
             before(grammarAccess.getSelectorNameAccess().getDotFullStopKeyword_0_0_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getSelectorNameAccess().getDotFullStopKeyword_0_0_0()); 

            }

             after(grammarAccess.getSelectorNameAccess().getDotFullStopKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__DotAssignment_0_0"


    // $ANTLR start "rule__SelectorName__NameAssignment_0_1"
    // InternalXcssParser.g:2068:1: rule__SelectorName__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SelectorName__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2072:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:2073:2: ( RULE_ID )
            {
            // InternalXcssParser.g:2073:2: ( RULE_ID )
            // InternalXcssParser.g:2074:3: RULE_ID
            {
             before(grammarAccess.getSelectorNameAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorNameAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__NameAssignment_0_1"


    // $ANTLR start "rule__SelectorName__AsteriskAssignment_1"
    // InternalXcssParser.g:2083:1: rule__SelectorName__AsteriskAssignment_1 : ( ( Asterisk ) ) ;
    public final void rule__SelectorName__AsteriskAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2087:1: ( ( ( Asterisk ) ) )
            // InternalXcssParser.g:2088:2: ( ( Asterisk ) )
            {
            // InternalXcssParser.g:2088:2: ( ( Asterisk ) )
            // InternalXcssParser.g:2089:3: ( Asterisk )
            {
             before(grammarAccess.getSelectorNameAccess().getAsteriskAsteriskKeyword_1_0()); 
            // InternalXcssParser.g:2090:3: ( Asterisk )
            // InternalXcssParser.g:2091:4: Asterisk
            {
             before(grammarAccess.getSelectorNameAccess().getAsteriskAsteriskKeyword_1_0()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getSelectorNameAccess().getAsteriskAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getSelectorNameAccess().getAsteriskAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorName__AsteriskAssignment_1"


    // $ANTLR start "rule__PseudoClass__ValueAssignment_1"
    // InternalXcssParser.g:2102:1: rule__PseudoClass__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__PseudoClass__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2106:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:2107:2: ( RULE_ID )
            {
            // InternalXcssParser.g:2107:2: ( RULE_ID )
            // InternalXcssParser.g:2108:3: RULE_ID
            {
             before(grammarAccess.getPseudoClassAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPseudoClassAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__ValueAssignment_1"


    // $ANTLR start "rule__CSSStyleDelacration__CssStyleKeyAssignment_0"
    // InternalXcssParser.g:2117:1: rule__CSSStyleDelacration__CssStyleKeyAssignment_0 : ( ruleCSSStyleKey ) ;
    public final void rule__CSSStyleDelacration__CssStyleKeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2121:1: ( ( ruleCSSStyleKey ) )
            // InternalXcssParser.g:2122:2: ( ruleCSSStyleKey )
            {
            // InternalXcssParser.g:2122:2: ( ruleCSSStyleKey )
            // InternalXcssParser.g:2123:3: ruleCSSStyleKey
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyCSSStyleKeyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCSSStyleKey();

            state._fsp--;

             after(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyCSSStyleKeyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__CssStyleKeyAssignment_0"


    // $ANTLR start "rule__CSSStyleDelacration__CssStyleValueAssignment_2"
    // InternalXcssParser.g:2132:1: rule__CSSStyleDelacration__CssStyleValueAssignment_2 : ( ruleCSSStyleValue ) ;
    public final void rule__CSSStyleDelacration__CssStyleValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2136:1: ( ( ruleCSSStyleValue ) )
            // InternalXcssParser.g:2137:2: ( ruleCSSStyleValue )
            {
            // InternalXcssParser.g:2137:2: ( ruleCSSStyleValue )
            // InternalXcssParser.g:2138:3: ruleCSSStyleValue
            {
             before(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueCSSStyleValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCSSStyleValue();

            state._fsp--;

             after(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueCSSStyleValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleDelacration__CssStyleValueAssignment_2"


    // $ANTLR start "rule__CSSStyleKey__ValueAssignment"
    // InternalXcssParser.g:2147:1: rule__CSSStyleKey__ValueAssignment : ( RULE_ID ) ;
    public final void rule__CSSStyleKey__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2151:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:2152:2: ( RULE_ID )
            {
            // InternalXcssParser.g:2152:2: ( RULE_ID )
            // InternalXcssParser.g:2153:3: RULE_ID
            {
             before(grammarAccess.getCSSStyleKeyAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCSSStyleKeyAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleKey__ValueAssignment"


    // $ANTLR start "rule__CSSStyleValue__ValueAssignment_0"
    // InternalXcssParser.g:2162:1: rule__CSSStyleValue__ValueAssignment_0 : ( ruleCSSStyleValueLiteral ) ;
    public final void rule__CSSStyleValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2166:1: ( ( ruleCSSStyleValueLiteral ) )
            // InternalXcssParser.g:2167:2: ( ruleCSSStyleValueLiteral )
            {
            // InternalXcssParser.g:2167:2: ( ruleCSSStyleValueLiteral )
            // InternalXcssParser.g:2168:3: ruleCSSStyleValueLiteral
            {
             before(grammarAccess.getCSSStyleValueAccess().getValueCSSStyleValueLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCSSStyleValueLiteral();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueAccess().getValueCSSStyleValueLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValue__ValueAssignment_0"


    // $ANTLR start "rule__CSSStyleValue__VariableAssignment_1"
    // InternalXcssParser.g:2177:1: rule__CSSStyleValue__VariableAssignment_1 : ( ( ruleVariableId ) ) ;
    public final void rule__CSSStyleValue__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2181:1: ( ( ( ruleVariableId ) ) )
            // InternalXcssParser.g:2182:2: ( ( ruleVariableId ) )
            {
            // InternalXcssParser.g:2182:2: ( ( ruleVariableId ) )
            // InternalXcssParser.g:2183:3: ( ruleVariableId )
            {
             before(grammarAccess.getCSSStyleValueAccess().getVariableVariableDeclarationCrossReference_1_0()); 
            // InternalXcssParser.g:2184:3: ( ruleVariableId )
            // InternalXcssParser.g:2185:4: ruleVariableId
            {
             before(grammarAccess.getCSSStyleValueAccess().getVariableVariableDeclarationVariableIdParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueAccess().getVariableVariableDeclarationVariableIdParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCSSStyleValueAccess().getVariableVariableDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValue__VariableAssignment_1"


    // $ANTLR start "rule__CSSStyleValueLiteral__NumberAssignment_0"
    // InternalXcssParser.g:2196:1: rule__CSSStyleValueLiteral__NumberAssignment_0 : ( ruleNumberLiteral ) ;
    public final void rule__CSSStyleValueLiteral__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2200:1: ( ( ruleNumberLiteral ) )
            // InternalXcssParser.g:2201:2: ( ruleNumberLiteral )
            {
            // InternalXcssParser.g:2201:2: ( ruleNumberLiteral )
            // InternalXcssParser.g:2202:3: ruleNumberLiteral
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getNumberNumberLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueLiteralAccess().getNumberNumberLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__NumberAssignment_0"


    // $ANTLR start "rule__CSSStyleValueLiteral__SizeAssignment_1"
    // InternalXcssParser.g:2211:1: rule__CSSStyleValueLiteral__SizeAssignment_1 : ( ruleSizeLiteral ) ;
    public final void rule__CSSStyleValueLiteral__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2215:1: ( ( ruleSizeLiteral ) )
            // InternalXcssParser.g:2216:2: ( ruleSizeLiteral )
            {
            // InternalXcssParser.g:2216:2: ( ruleSizeLiteral )
            // InternalXcssParser.g:2217:3: ruleSizeLiteral
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getSizeSizeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSizeLiteral();

            state._fsp--;

             after(grammarAccess.getCSSStyleValueLiteralAccess().getSizeSizeLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__SizeAssignment_1"


    // $ANTLR start "rule__CSSStyleValueLiteral__WordAssignment_2"
    // InternalXcssParser.g:2226:1: rule__CSSStyleValueLiteral__WordAssignment_2 : ( RULE_ID ) ;
    public final void rule__CSSStyleValueLiteral__WordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2230:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:2231:2: ( RULE_ID )
            {
            // InternalXcssParser.g:2231:2: ( RULE_ID )
            // InternalXcssParser.g:2232:3: RULE_ID
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getWordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCSSStyleValueLiteralAccess().getWordIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__WordAssignment_2"


    // $ANTLR start "rule__CSSStyleValueLiteral__HexAssignment_3"
    // InternalXcssParser.g:2241:1: rule__CSSStyleValueLiteral__HexAssignment_3 : ( RULE_HEX ) ;
    public final void rule__CSSStyleValueLiteral__HexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2245:1: ( ( RULE_HEX ) )
            // InternalXcssParser.g:2246:2: ( RULE_HEX )
            {
            // InternalXcssParser.g:2246:2: ( RULE_HEX )
            // InternalXcssParser.g:2247:3: RULE_HEX
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getHexHEXTerminalRuleCall_3_0()); 
            match(input,RULE_HEX,FOLLOW_2); 
             after(grammarAccess.getCSSStyleValueLiteralAccess().getHexHEXTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__HexAssignment_3"


    // $ANTLR start "rule__CSSStyleValueLiteral__FunctionAssignment_4"
    // InternalXcssParser.g:2256:1: rule__CSSStyleValueLiteral__FunctionAssignment_4 : ( RULE_FUNCTION_EXPRESSION ) ;
    public final void rule__CSSStyleValueLiteral__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2260:1: ( ( RULE_FUNCTION_EXPRESSION ) )
            // InternalXcssParser.g:2261:2: ( RULE_FUNCTION_EXPRESSION )
            {
            // InternalXcssParser.g:2261:2: ( RULE_FUNCTION_EXPRESSION )
            // InternalXcssParser.g:2262:3: RULE_FUNCTION_EXPRESSION
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getFunctionFUNCTION_EXPRESSIONTerminalRuleCall_4_0()); 
            match(input,RULE_FUNCTION_EXPRESSION,FOLLOW_2); 
             after(grammarAccess.getCSSStyleValueLiteralAccess().getFunctionFUNCTION_EXPRESSIONTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__FunctionAssignment_4"


    // $ANTLR start "rule__CSSStyleValueLiteral__StringAssignment_5"
    // InternalXcssParser.g:2271:1: rule__CSSStyleValueLiteral__StringAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CSSStyleValueLiteral__StringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2275:1: ( ( RULE_STRING ) )
            // InternalXcssParser.g:2276:2: ( RULE_STRING )
            {
            // InternalXcssParser.g:2276:2: ( RULE_STRING )
            // InternalXcssParser.g:2277:3: RULE_STRING
            {
             before(grammarAccess.getCSSStyleValueLiteralAccess().getStringSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCSSStyleValueLiteralAccess().getStringSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSStyleValueLiteral__StringAssignment_5"


    // $ANTLR start "rule__SizeLiteral__ValueAssignment_0"
    // InternalXcssParser.g:2286:1: rule__SizeLiteral__ValueAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__SizeLiteral__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2290:1: ( ( ruleNUMBER ) )
            // InternalXcssParser.g:2291:2: ( ruleNUMBER )
            {
            // InternalXcssParser.g:2291:2: ( ruleNUMBER )
            // InternalXcssParser.g:2292:3: ruleNUMBER
            {
             before(grammarAccess.getSizeLiteralAccess().getValueNUMBERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getSizeLiteralAccess().getValueNUMBERParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__ValueAssignment_0"


    // $ANTLR start "rule__SizeLiteral__UnitAssignment_1"
    // InternalXcssParser.g:2301:1: rule__SizeLiteral__UnitAssignment_1 : ( RULE_ID ) ;
    public final void rule__SizeLiteral__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2305:1: ( ( RULE_ID ) )
            // InternalXcssParser.g:2306:2: ( RULE_ID )
            {
            // InternalXcssParser.g:2306:2: ( RULE_ID )
            // InternalXcssParser.g:2307:3: RULE_ID
            {
             before(grammarAccess.getSizeLiteralAccess().getUnitIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSizeLiteralAccess().getUnitIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeLiteral__UnitAssignment_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalXcssParser.g:2316:1: rule__NumberLiteral__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXcssParser.g:2320:1: ( ( ruleNUMBER ) )
            // InternalXcssParser.g:2321:2: ( ruleNUMBER )
            {
            // InternalXcssParser.g:2321:2: ( ruleNUMBER )
            // InternalXcssParser.g:2322:3: ruleNUMBER
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\uffff\1\10\10\uffff\1\15\1\uffff\1\10\1\uffff\1\10";
    static final String dfa_3s = "\1\12\1\4\1\13\1\24\5\uffff\1\17\1\4\1\13\1\4\1\uffff\1\4";
    static final String dfa_4s = "\1\25\3\24\5\uffff\1\24\1\23\2\24\1\uffff\1\24";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\6\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\3\uffff\1\4\1\5\1\6\2\uffff\1\1\1\7",
            "\1\10\1\uffff\3\10\1\uffff\1\10\1\11\1\10\2\uffff\1\12\3\uffff\1\10\1\13",
            "\1\3\10\uffff\1\13",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\10\4\uffff\1\14",
            "\1\15\1\uffff\3\15\1\10\3\15\1\10\1\uffff\1\15\2\uffff\1\10\1\15",
            "\1\3\10\uffff\1\13",
            "\1\10\1\uffff\3\10\1\uffff\3\10\2\uffff\1\12\3\uffff\1\10\1\16",
            "",
            "\1\10\1\uffff\3\10\1\uffff\3\10\2\uffff\1\12\3\uffff\1\10\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "674:1: rule__CSSStyleValueLiteral__Alternatives : ( ( ( rule__CSSStyleValueLiteral__NumberAssignment_0 ) ) | ( ( rule__CSSStyleValueLiteral__SizeAssignment_1 ) ) | ( ( rule__CSSStyleValueLiteral__WordAssignment_2 ) ) | ( ( rule__CSSStyleValueLiteral__HexAssignment_3 ) ) | ( ( rule__CSSStyleValueLiteral__FunctionAssignment_4 ) ) | ( ( rule__CSSStyleValueLiteral__StringAssignment_5 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008892L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008890L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000338C30L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000338C10L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100C00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});

}