package mdd.coursework.xcss.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdd.coursework.xcss.services.XcssGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXcssParser extends AbstractInternalAntlrParser {
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

        public InternalXcssParser(TokenStream input, XcssGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XcssModel";
       	}

       	@Override
       	protected XcssGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXcssModel"
    // InternalXcssParser.g:57:1: entryRuleXcssModel returns [EObject current=null] : iv_ruleXcssModel= ruleXcssModel EOF ;
    public final EObject entryRuleXcssModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXcssModel = null;


        try {
            // InternalXcssParser.g:57:50: (iv_ruleXcssModel= ruleXcssModel EOF )
            // InternalXcssParser.g:58:2: iv_ruleXcssModel= ruleXcssModel EOF
            {
             newCompositeNode(grammarAccess.getXcssModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXcssModel=ruleXcssModel();

            state._fsp--;

             current =iv_ruleXcssModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXcssModel"


    // $ANTLR start "ruleXcssModel"
    // InternalXcssParser.g:64:1: ruleXcssModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleXcssModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:70:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalXcssParser.g:71:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalXcssParser.g:71:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DollarSign||LA1_0==Asterisk||LA1_0==FullStop||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXcssParser.g:72:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalXcssParser.g:72:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalXcssParser.g:73:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getXcssModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getXcssModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"mdd.coursework.xcss.Xcss.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXcssModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalXcssParser.g:93:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalXcssParser.g:93:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalXcssParser.g:94:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalXcssParser.g:100:1: ruleAbstractElement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_XCSSStyleRule_1= ruleXCSSStyleRule ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_XCSSStyleRule_1 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:106:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_XCSSStyleRule_1= ruleXCSSStyleRule ) )
            // InternalXcssParser.g:107:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_XCSSStyleRule_1= ruleXCSSStyleRule )
            {
            // InternalXcssParser.g:107:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_XCSSStyleRule_1= ruleXCSSStyleRule )
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
                    // InternalXcssParser.g:108:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:117:3: this_XCSSStyleRule_1= ruleXCSSStyleRule
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getXCSSStyleRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XCSSStyleRule_1=ruleXCSSStyleRule();

                    state._fsp--;


                    			current = this_XCSSStyleRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleXCSSStyleRule"
    // InternalXcssParser.g:129:1: entryRuleXCSSStyleRule returns [EObject current=null] : iv_ruleXCSSStyleRule= ruleXCSSStyleRule EOF ;
    public final EObject entryRuleXCSSStyleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCSSStyleRule = null;


        try {
            // InternalXcssParser.g:129:54: (iv_ruleXCSSStyleRule= ruleXCSSStyleRule EOF )
            // InternalXcssParser.g:130:2: iv_ruleXCSSStyleRule= ruleXCSSStyleRule EOF
            {
             newCompositeNode(grammarAccess.getXCSSStyleRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCSSStyleRule=ruleXCSSStyleRule();

            state._fsp--;

             current =iv_ruleXCSSStyleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCSSStyleRule"


    // $ANTLR start "ruleXCSSStyleRule"
    // InternalXcssParser.g:136:1: ruleXCSSStyleRule returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleXCSSSelector ) ) (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )* this_BEGIN_3= RULE_BEGIN ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )* ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )* this_END_6= RULE_END ) ;
    public final EObject ruleXCSSStyleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_6=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_variableDeclarations_4_0 = null;

        EObject lv_cssStyleDeclarations_5_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:142:2: ( ( ( (lv_selectors_0_0= ruleXCSSSelector ) ) (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )* this_BEGIN_3= RULE_BEGIN ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )* ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )* this_END_6= RULE_END ) )
            // InternalXcssParser.g:143:2: ( ( (lv_selectors_0_0= ruleXCSSSelector ) ) (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )* this_BEGIN_3= RULE_BEGIN ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )* ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )* this_END_6= RULE_END )
            {
            // InternalXcssParser.g:143:2: ( ( (lv_selectors_0_0= ruleXCSSSelector ) ) (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )* this_BEGIN_3= RULE_BEGIN ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )* ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )* this_END_6= RULE_END )
            // InternalXcssParser.g:144:3: ( (lv_selectors_0_0= ruleXCSSSelector ) ) (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )* this_BEGIN_3= RULE_BEGIN ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )* ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )* this_END_6= RULE_END
            {
            // InternalXcssParser.g:144:3: ( (lv_selectors_0_0= ruleXCSSSelector ) )
            // InternalXcssParser.g:145:4: (lv_selectors_0_0= ruleXCSSSelector )
            {
            // InternalXcssParser.g:145:4: (lv_selectors_0_0= ruleXCSSSelector )
            // InternalXcssParser.g:146:5: lv_selectors_0_0= ruleXCSSSelector
            {

            					newCompositeNode(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_selectors_0_0=ruleXCSSSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXCSSStyleRuleRule());
            					}
            					add(
            						current,
            						"selectors",
            						lv_selectors_0_0,
            						"mdd.coursework.xcss.Xcss.XCSSSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXcssParser.g:163:3: (otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Comma) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXcssParser.g:164:4: otherlv_1= Comma ( (lv_selectors_2_0= ruleXCSSSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getXCSSStyleRuleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalXcssParser.g:168:4: ( (lv_selectors_2_0= ruleXCSSSelector ) )
            	    // InternalXcssParser.g:169:5: (lv_selectors_2_0= ruleXCSSSelector )
            	    {
            	    // InternalXcssParser.g:169:5: (lv_selectors_2_0= ruleXCSSSelector )
            	    // InternalXcssParser.g:170:6: lv_selectors_2_0= ruleXCSSSelector
            	    {

            	    						newCompositeNode(grammarAccess.getXCSSStyleRuleAccess().getSelectorsXCSSSelectorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_selectors_2_0=ruleXCSSSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXCSSStyleRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"selectors",
            	    							lv_selectors_2_0,
            	    							"mdd.coursework.xcss.Xcss.XCSSSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getXCSSStyleRuleAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalXcssParser.g:192:3: ( (lv_variableDeclarations_4_0= ruleVariableDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DollarSign) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXcssParser.g:193:4: (lv_variableDeclarations_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalXcssParser.g:193:4: (lv_variableDeclarations_4_0= ruleVariableDeclaration )
            	    // InternalXcssParser.g:194:5: lv_variableDeclarations_4_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getXCSSStyleRuleAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variableDeclarations_4_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXCSSStyleRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variableDeclarations",
            	    						lv_variableDeclarations_4_0,
            	    						"mdd.coursework.xcss.Xcss.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalXcssParser.g:211:3: ( (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXcssParser.g:212:4: (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration )
            	    {
            	    // InternalXcssParser.g:212:4: (lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration )
            	    // InternalXcssParser.g:213:5: lv_cssStyleDeclarations_5_0= ruleCSSStyleDelacration
            	    {

            	    					newCompositeNode(grammarAccess.getXCSSStyleRuleAccess().getCssStyleDeclarationsCSSStyleDelacrationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_cssStyleDeclarations_5_0=ruleCSSStyleDelacration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXCSSStyleRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cssStyleDeclarations",
            	    						lv_cssStyleDeclarations_5_0,
            	    						"mdd.coursework.xcss.Xcss.CSSStyleDelacration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getXCSSStyleRuleAccess().getENDTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCSSStyleRule"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalXcssParser.g:238:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalXcssParser.g:238:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalXcssParser.g:239:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalXcssParser.g:245:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableId ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAddition ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:251:2: ( ( ( (lv_name_0_0= ruleVariableId ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAddition ) ) ) )
            // InternalXcssParser.g:252:2: ( ( (lv_name_0_0= ruleVariableId ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAddition ) ) )
            {
            // InternalXcssParser.g:252:2: ( ( (lv_name_0_0= ruleVariableId ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAddition ) ) )
            // InternalXcssParser.g:253:3: ( (lv_name_0_0= ruleVariableId ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAddition ) )
            {
            // InternalXcssParser.g:253:3: ( (lv_name_0_0= ruleVariableId ) )
            // InternalXcssParser.g:254:4: (lv_name_0_0= ruleVariableId )
            {
            // InternalXcssParser.g:254:4: (lv_name_0_0= ruleVariableId )
            // InternalXcssParser.g:255:5: lv_name_0_0= ruleVariableId
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameVariableIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleVariableId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mdd.coursework.xcss.Xcss.VariableId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_1());
            		
            // InternalXcssParser.g:276:3: ( (lv_value_2_0= ruleAddition ) )
            // InternalXcssParser.g:277:4: (lv_value_2_0= ruleAddition )
            {
            // InternalXcssParser.g:277:4: (lv_value_2_0= ruleAddition )
            // InternalXcssParser.g:278:5: lv_value_2_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueAdditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"mdd.coursework.xcss.Xcss.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableId"
    // InternalXcssParser.g:299:1: entryRuleVariableId returns [String current=null] : iv_ruleVariableId= ruleVariableId EOF ;
    public final String entryRuleVariableId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableId = null;


        try {
            // InternalXcssParser.g:299:50: (iv_ruleVariableId= ruleVariableId EOF )
            // InternalXcssParser.g:300:2: iv_ruleVariableId= ruleVariableId EOF
            {
             newCompositeNode(grammarAccess.getVariableIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableId=ruleVariableId();

            state._fsp--;

             current =iv_ruleVariableId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableId"


    // $ANTLR start "ruleVariableId"
    // InternalXcssParser.g:306:1: ruleVariableId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= DollarSign this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleVariableId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXcssParser.g:312:2: ( (kw= DollarSign this_ID_1= RULE_ID ) )
            // InternalXcssParser.g:313:2: (kw= DollarSign this_ID_1= RULE_ID )
            {
            // InternalXcssParser.g:313:2: (kw= DollarSign this_ID_1= RULE_ID )
            // InternalXcssParser.g:314:3: kw= DollarSign this_ID_1= RULE_ID
            {
            kw=(Token)match(input,DollarSign,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariableIdAccess().getDollarSignKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableId"


    // $ANTLR start "entryRuleAddition"
    // InternalXcssParser.g:330:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalXcssParser.g:330:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalXcssParser.g:331:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalXcssParser.g:337:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:343:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalXcssParser.g:344:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalXcssParser.g:344:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalXcssParser.g:345:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXcssParser.g:353:3: ( () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==PlusSign||LA7_0==HyphenMinus) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXcssParser.g:354:4: () ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalXcssParser.g:354:4: ()
            	    // InternalXcssParser.g:355:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalXcssParser.g:361:4: ( ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) ) )
            	    // InternalXcssParser.g:362:5: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) )
            	    {
            	    // InternalXcssParser.g:362:5: ( (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus ) )
            	    // InternalXcssParser.g:363:6: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus )
            	    {
            	    // InternalXcssParser.g:363:6: (lv_operator_2_1= PlusSign | lv_operator_2_2= HyphenMinus )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==PlusSign) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==HyphenMinus) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalXcssParser.g:364:7: lv_operator_2_1= PlusSign
            	            {
            	            lv_operator_2_1=(Token)match(input,PlusSign,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalXcssParser.g:375:7: lv_operator_2_2= HyphenMinus
            	            {
            	            lv_operator_2_2=(Token)match(input,HyphenMinus,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalXcssParser.g:388:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalXcssParser.g:389:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalXcssParser.g:389:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalXcssParser.g:390:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdd.coursework.xcss.Xcss.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalXcssParser.g:412:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalXcssParser.g:412:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalXcssParser.g:413:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalXcssParser.g:419:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:425:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalXcssParser.g:426:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalXcssParser.g:426:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalXcssParser.g:427:3: this_Primary_0= rulePrimary ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalXcssParser.g:435:3: ( () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Asterisk) ) {
                    int LA9_2 = input.LA(2);

                    if ( ((LA9_2>=DollarSign && LA9_2<=LeftParenthesis)||(LA9_2>=HyphenMinus && LA9_2<=FullStop)||(LA9_2>=RULE_ID && LA9_2<=RULE_FUNCTION_EXPRESSION)||(LA9_2>=RULE_INT && LA9_2<=RULE_STRING)) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==Solidus) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXcssParser.g:436:4: () ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalXcssParser.g:436:4: ()
            	    // InternalXcssParser.g:437:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalXcssParser.g:443:4: ( ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) ) )
            	    // InternalXcssParser.g:444:5: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) )
            	    {
            	    // InternalXcssParser.g:444:5: ( (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus ) )
            	    // InternalXcssParser.g:445:6: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus )
            	    {
            	    // InternalXcssParser.g:445:6: (lv_operator_2_1= Asterisk | lv_operator_2_2= Solidus )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==Asterisk) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==Solidus) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalXcssParser.g:446:7: lv_operator_2_1= Asterisk
            	            {
            	            lv_operator_2_1=(Token)match(input,Asterisk,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalXcssParser.g:457:7: lv_operator_2_2= Solidus
            	            {
            	            lv_operator_2_2=(Token)match(input,Solidus,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalXcssParser.g:470:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalXcssParser.g:471:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalXcssParser.g:471:5: (lv_right_3_0= rulePrimary )
            	    // InternalXcssParser.g:472:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mdd.coursework.xcss.Xcss.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalXcssParser.g:494:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalXcssParser.g:494:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalXcssParser.g:495:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalXcssParser.g:501:1: rulePrimary returns [EObject current=null] : (this_CSSStyleValue_0= ruleCSSStyleValue | (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_CSSStyleValue_0 = null;

        EObject this_Addition_2 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:507:2: ( (this_CSSStyleValue_0= ruleCSSStyleValue | (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis ) ) )
            // InternalXcssParser.g:508:2: (this_CSSStyleValue_0= ruleCSSStyleValue | (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis ) )
            {
            // InternalXcssParser.g:508:2: (this_CSSStyleValue_0= ruleCSSStyleValue | (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DollarSign||(LA10_0>=HyphenMinus && LA10_0<=FullStop)||(LA10_0>=RULE_ID && LA10_0<=RULE_FUNCTION_EXPRESSION)||(LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==LeftParenthesis) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXcssParser.g:509:3: this_CSSStyleValue_0= ruleCSSStyleValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCSSStyleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CSSStyleValue_0=ruleCSSStyleValue();

                    state._fsp--;


                    			current = this_CSSStyleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:518:3: (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis )
                    {
                    // InternalXcssParser.g:518:3: (otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis )
                    // InternalXcssParser.g:519:4: otherlv_1= LeftParenthesis this_Addition_2= ruleAddition otherlv_3= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleXCSSSelector"
    // InternalXcssParser.g:540:1: entryRuleXCSSSelector returns [EObject current=null] : iv_ruleXCSSSelector= ruleXCSSSelector EOF ;
    public final EObject entryRuleXCSSSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCSSSelector = null;


        try {
            // InternalXcssParser.g:540:53: (iv_ruleXCSSSelector= ruleXCSSSelector EOF )
            // InternalXcssParser.g:541:2: iv_ruleXCSSSelector= ruleXCSSSelector EOF
            {
             newCompositeNode(grammarAccess.getXCSSSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXCSSSelector=ruleXCSSSelector();

            state._fsp--;

             current =iv_ruleXCSSSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCSSSelector"


    // $ANTLR start "ruleXCSSSelector"
    // InternalXcssParser.g:547:1: ruleXCSSSelector returns [EObject current=null] : ( ( (lv_name_0_0= ruleSelectorName ) ) ( (lv_pseudoClasses_1_0= rulePseudoClass ) )* ) ;
    public final EObject ruleXCSSSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_pseudoClasses_1_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:553:2: ( ( ( (lv_name_0_0= ruleSelectorName ) ) ( (lv_pseudoClasses_1_0= rulePseudoClass ) )* ) )
            // InternalXcssParser.g:554:2: ( ( (lv_name_0_0= ruleSelectorName ) ) ( (lv_pseudoClasses_1_0= rulePseudoClass ) )* )
            {
            // InternalXcssParser.g:554:2: ( ( (lv_name_0_0= ruleSelectorName ) ) ( (lv_pseudoClasses_1_0= rulePseudoClass ) )* )
            // InternalXcssParser.g:555:3: ( (lv_name_0_0= ruleSelectorName ) ) ( (lv_pseudoClasses_1_0= rulePseudoClass ) )*
            {
            // InternalXcssParser.g:555:3: ( (lv_name_0_0= ruleSelectorName ) )
            // InternalXcssParser.g:556:4: (lv_name_0_0= ruleSelectorName )
            {
            // InternalXcssParser.g:556:4: (lv_name_0_0= ruleSelectorName )
            // InternalXcssParser.g:557:5: lv_name_0_0= ruleSelectorName
            {

            					newCompositeNode(grammarAccess.getXCSSSelectorAccess().getNameSelectorNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleSelectorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXCSSSelectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mdd.coursework.xcss.Xcss.SelectorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXcssParser.g:574:3: ( (lv_pseudoClasses_1_0= rulePseudoClass ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Colon) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXcssParser.g:575:4: (lv_pseudoClasses_1_0= rulePseudoClass )
            	    {
            	    // InternalXcssParser.g:575:4: (lv_pseudoClasses_1_0= rulePseudoClass )
            	    // InternalXcssParser.g:576:5: lv_pseudoClasses_1_0= rulePseudoClass
            	    {

            	    					newCompositeNode(grammarAccess.getXCSSSelectorAccess().getPseudoClassesPseudoClassParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_pseudoClasses_1_0=rulePseudoClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXCSSSelectorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pseudoClasses",
            	    						lv_pseudoClasses_1_0,
            	    						"mdd.coursework.xcss.Xcss.PseudoClass");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCSSSelector"


    // $ANTLR start "entryRuleSelectorName"
    // InternalXcssParser.g:597:1: entryRuleSelectorName returns [EObject current=null] : iv_ruleSelectorName= ruleSelectorName EOF ;
    public final EObject entryRuleSelectorName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorName = null;


        try {
            // InternalXcssParser.g:597:53: (iv_ruleSelectorName= ruleSelectorName EOF )
            // InternalXcssParser.g:598:2: iv_ruleSelectorName= ruleSelectorName EOF
            {
             newCompositeNode(grammarAccess.getSelectorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorName=ruleSelectorName();

            state._fsp--;

             current =iv_ruleSelectorName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectorName"


    // $ANTLR start "ruleSelectorName"
    // InternalXcssParser.g:604:1: ruleSelectorName returns [EObject current=null] : ( ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_asterisk_2_0= Asterisk ) ) ) ;
    public final EObject ruleSelectorName() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;
        Token lv_name_1_0=null;
        Token lv_asterisk_2_0=null;


        	enterRule();

        try {
            // InternalXcssParser.g:610:2: ( ( ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_asterisk_2_0= Asterisk ) ) ) )
            // InternalXcssParser.g:611:2: ( ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_asterisk_2_0= Asterisk ) ) )
            {
            // InternalXcssParser.g:611:2: ( ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_asterisk_2_0= Asterisk ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStop||LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==Asterisk) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXcssParser.g:612:3: ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalXcssParser.g:612:3: ( ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalXcssParser.g:613:4: ( (lv_dot_0_0= FullStop ) )? ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalXcssParser.g:613:4: ( (lv_dot_0_0= FullStop ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==FullStop) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalXcssParser.g:614:5: (lv_dot_0_0= FullStop )
                            {
                            // InternalXcssParser.g:614:5: (lv_dot_0_0= FullStop )
                            // InternalXcssParser.g:615:6: lv_dot_0_0= FullStop
                            {
                            lv_dot_0_0=(Token)match(input,FullStop,FOLLOW_10); 

                            						newLeafNode(lv_dot_0_0, grammarAccess.getSelectorNameAccess().getDotFullStopKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSelectorNameRule());
                            						}
                            						setWithLastConsumed(current, "dot", lv_dot_0_0 != null, ".");
                            					

                            }


                            }
                            break;

                    }

                    // InternalXcssParser.g:627:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXcssParser.g:628:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXcssParser.g:628:5: (lv_name_1_0= RULE_ID )
                    // InternalXcssParser.g:629:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSelectorNameAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"mdd.coursework.xcss.Xcss.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:647:3: ( (lv_asterisk_2_0= Asterisk ) )
                    {
                    // InternalXcssParser.g:647:3: ( (lv_asterisk_2_0= Asterisk ) )
                    // InternalXcssParser.g:648:4: (lv_asterisk_2_0= Asterisk )
                    {
                    // InternalXcssParser.g:648:4: (lv_asterisk_2_0= Asterisk )
                    // InternalXcssParser.g:649:5: lv_asterisk_2_0= Asterisk
                    {
                    lv_asterisk_2_0=(Token)match(input,Asterisk,FOLLOW_2); 

                    					newLeafNode(lv_asterisk_2_0, grammarAccess.getSelectorNameAccess().getAsteriskAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectorNameRule());
                    					}
                    					setWithLastConsumed(current, "asterisk", lv_asterisk_2_0, "*");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorName"


    // $ANTLR start "entryRulePseudoClass"
    // InternalXcssParser.g:665:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // InternalXcssParser.g:665:52: (iv_rulePseudoClass= rulePseudoClass EOF )
            // InternalXcssParser.g:666:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
             newCompositeNode(grammarAccess.getPseudoClassRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;

             current =iv_rulePseudoClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // InternalXcssParser.g:672:1: rulePseudoClass returns [EObject current=null] : (otherlv_0= Colon ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalXcssParser.g:678:2: ( (otherlv_0= Colon ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalXcssParser.g:679:2: (otherlv_0= Colon ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalXcssParser.g:679:2: (otherlv_0= Colon ( (lv_value_1_0= RULE_ID ) ) )
            // InternalXcssParser.g:680:3: otherlv_0= Colon ( (lv_value_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPseudoClassAccess().getColonKeyword_0());
            		
            // InternalXcssParser.g:684:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalXcssParser.g:685:4: (lv_value_1_0= RULE_ID )
            {
            // InternalXcssParser.g:685:4: (lv_value_1_0= RULE_ID )
            // InternalXcssParser.g:686:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPseudoClassAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPseudoClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"mdd.coursework.xcss.Xcss.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRuleCSSStyleDelacration"
    // InternalXcssParser.g:706:1: entryRuleCSSStyleDelacration returns [EObject current=null] : iv_ruleCSSStyleDelacration= ruleCSSStyleDelacration EOF ;
    public final EObject entryRuleCSSStyleDelacration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSStyleDelacration = null;


        try {
            // InternalXcssParser.g:706:60: (iv_ruleCSSStyleDelacration= ruleCSSStyleDelacration EOF )
            // InternalXcssParser.g:707:2: iv_ruleCSSStyleDelacration= ruleCSSStyleDelacration EOF
            {
             newCompositeNode(grammarAccess.getCSSStyleDelacrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSSStyleDelacration=ruleCSSStyleDelacration();

            state._fsp--;

             current =iv_ruleCSSStyleDelacration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSStyleDelacration"


    // $ANTLR start "ruleCSSStyleDelacration"
    // InternalXcssParser.g:713:1: ruleCSSStyleDelacration returns [EObject current=null] : ( ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) ) otherlv_1= Colon ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) ) ) ;
    public final EObject ruleCSSStyleDelacration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cssStyleKey_0_0 = null;

        EObject lv_cssStyleValue_2_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:719:2: ( ( ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) ) otherlv_1= Colon ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) ) ) )
            // InternalXcssParser.g:720:2: ( ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) ) otherlv_1= Colon ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) ) )
            {
            // InternalXcssParser.g:720:2: ( ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) ) otherlv_1= Colon ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) ) )
            // InternalXcssParser.g:721:3: ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) ) otherlv_1= Colon ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) )
            {
            // InternalXcssParser.g:721:3: ( (lv_cssStyleKey_0_0= ruleCSSStyleKey ) )
            // InternalXcssParser.g:722:4: (lv_cssStyleKey_0_0= ruleCSSStyleKey )
            {
            // InternalXcssParser.g:722:4: (lv_cssStyleKey_0_0= ruleCSSStyleKey )
            // InternalXcssParser.g:723:5: lv_cssStyleKey_0_0= ruleCSSStyleKey
            {

            					newCompositeNode(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyCSSStyleKeyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_cssStyleKey_0_0=ruleCSSStyleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSSStyleDelacrationRule());
            					}
            					set(
            						current,
            						"cssStyleKey",
            						lv_cssStyleKey_0_0,
            						"mdd.coursework.xcss.Xcss.CSSStyleKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCSSStyleDelacrationAccess().getColonKeyword_1());
            		
            // InternalXcssParser.g:744:3: ( (lv_cssStyleValue_2_0= ruleCSSStyleValue ) )
            // InternalXcssParser.g:745:4: (lv_cssStyleValue_2_0= ruleCSSStyleValue )
            {
            // InternalXcssParser.g:745:4: (lv_cssStyleValue_2_0= ruleCSSStyleValue )
            // InternalXcssParser.g:746:5: lv_cssStyleValue_2_0= ruleCSSStyleValue
            {

            					newCompositeNode(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueCSSStyleValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cssStyleValue_2_0=ruleCSSStyleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSSStyleDelacrationRule());
            					}
            					set(
            						current,
            						"cssStyleValue",
            						lv_cssStyleValue_2_0,
            						"mdd.coursework.xcss.Xcss.CSSStyleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSStyleDelacration"


    // $ANTLR start "entryRuleCSSStyleKey"
    // InternalXcssParser.g:767:1: entryRuleCSSStyleKey returns [EObject current=null] : iv_ruleCSSStyleKey= ruleCSSStyleKey EOF ;
    public final EObject entryRuleCSSStyleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSStyleKey = null;


        try {
            // InternalXcssParser.g:767:52: (iv_ruleCSSStyleKey= ruleCSSStyleKey EOF )
            // InternalXcssParser.g:768:2: iv_ruleCSSStyleKey= ruleCSSStyleKey EOF
            {
             newCompositeNode(grammarAccess.getCSSStyleKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSSStyleKey=ruleCSSStyleKey();

            state._fsp--;

             current =iv_ruleCSSStyleKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSStyleKey"


    // $ANTLR start "ruleCSSStyleKey"
    // InternalXcssParser.g:774:1: ruleCSSStyleKey returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleCSSStyleKey() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalXcssParser.g:780:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalXcssParser.g:781:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalXcssParser.g:781:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalXcssParser.g:782:3: (lv_value_0_0= RULE_ID )
            {
            // InternalXcssParser.g:782:3: (lv_value_0_0= RULE_ID )
            // InternalXcssParser.g:783:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCSSStyleKeyAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCSSStyleKeyRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"mdd.coursework.xcss.Xcss.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSStyleKey"


    // $ANTLR start "entryRuleCSSStyleValue"
    // InternalXcssParser.g:802:1: entryRuleCSSStyleValue returns [EObject current=null] : iv_ruleCSSStyleValue= ruleCSSStyleValue EOF ;
    public final EObject entryRuleCSSStyleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSStyleValue = null;


        try {
            // InternalXcssParser.g:802:54: (iv_ruleCSSStyleValue= ruleCSSStyleValue EOF )
            // InternalXcssParser.g:803:2: iv_ruleCSSStyleValue= ruleCSSStyleValue EOF
            {
             newCompositeNode(grammarAccess.getCSSStyleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSSStyleValue=ruleCSSStyleValue();

            state._fsp--;

             current =iv_ruleCSSStyleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSStyleValue"


    // $ANTLR start "ruleCSSStyleValue"
    // InternalXcssParser.g:809:1: ruleCSSStyleValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleCSSStyleValueLiteral ) ) | ( ( ruleVariableId ) ) ) ;
    public final EObject ruleCSSStyleValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:815:2: ( ( ( (lv_value_0_0= ruleCSSStyleValueLiteral ) ) | ( ( ruleVariableId ) ) ) )
            // InternalXcssParser.g:816:2: ( ( (lv_value_0_0= ruleCSSStyleValueLiteral ) ) | ( ( ruleVariableId ) ) )
            {
            // InternalXcssParser.g:816:2: ( ( (lv_value_0_0= ruleCSSStyleValueLiteral ) ) | ( ( ruleVariableId ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=HyphenMinus && LA14_0<=FullStop)||(LA14_0>=RULE_ID && LA14_0<=RULE_FUNCTION_EXPRESSION)||(LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            else if ( (LA14_0==DollarSign) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXcssParser.g:817:3: ( (lv_value_0_0= ruleCSSStyleValueLiteral ) )
                    {
                    // InternalXcssParser.g:817:3: ( (lv_value_0_0= ruleCSSStyleValueLiteral ) )
                    // InternalXcssParser.g:818:4: (lv_value_0_0= ruleCSSStyleValueLiteral )
                    {
                    // InternalXcssParser.g:818:4: (lv_value_0_0= ruleCSSStyleValueLiteral )
                    // InternalXcssParser.g:819:5: lv_value_0_0= ruleCSSStyleValueLiteral
                    {

                    					newCompositeNode(grammarAccess.getCSSStyleValueAccess().getValueCSSStyleValueLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleCSSStyleValueLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCSSStyleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"mdd.coursework.xcss.Xcss.CSSStyleValueLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:837:3: ( ( ruleVariableId ) )
                    {
                    // InternalXcssParser.g:837:3: ( ( ruleVariableId ) )
                    // InternalXcssParser.g:838:4: ( ruleVariableId )
                    {
                    // InternalXcssParser.g:838:4: ( ruleVariableId )
                    // InternalXcssParser.g:839:5: ruleVariableId
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCSSStyleValueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getCSSStyleValueAccess().getVariableVariableDeclarationCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleVariableId();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSStyleValue"


    // $ANTLR start "entryRuleCSSStyleValueLiteral"
    // InternalXcssParser.g:857:1: entryRuleCSSStyleValueLiteral returns [EObject current=null] : iv_ruleCSSStyleValueLiteral= ruleCSSStyleValueLiteral EOF ;
    public final EObject entryRuleCSSStyleValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSStyleValueLiteral = null;


        try {
            // InternalXcssParser.g:857:61: (iv_ruleCSSStyleValueLiteral= ruleCSSStyleValueLiteral EOF )
            // InternalXcssParser.g:858:2: iv_ruleCSSStyleValueLiteral= ruleCSSStyleValueLiteral EOF
            {
             newCompositeNode(grammarAccess.getCSSStyleValueLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSSStyleValueLiteral=ruleCSSStyleValueLiteral();

            state._fsp--;

             current =iv_ruleCSSStyleValueLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSStyleValueLiteral"


    // $ANTLR start "ruleCSSStyleValueLiteral"
    // InternalXcssParser.g:864:1: ruleCSSStyleValueLiteral returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumberLiteral ) ) | ( (lv_size_1_0= ruleSizeLiteral ) ) | ( (lv_word_2_0= RULE_ID ) ) | ( (lv_hex_3_0= RULE_HEX ) ) | ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) ) | ( (lv_string_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSSStyleValueLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_word_2_0=null;
        Token lv_hex_3_0=null;
        Token lv_function_4_0=null;
        Token lv_string_5_0=null;
        EObject lv_number_0_0 = null;

        EObject lv_size_1_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:870:2: ( ( ( (lv_number_0_0= ruleNumberLiteral ) ) | ( (lv_size_1_0= ruleSizeLiteral ) ) | ( (lv_word_2_0= RULE_ID ) ) | ( (lv_hex_3_0= RULE_HEX ) ) | ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) ) | ( (lv_string_5_0= RULE_STRING ) ) ) )
            // InternalXcssParser.g:871:2: ( ( (lv_number_0_0= ruleNumberLiteral ) ) | ( (lv_size_1_0= ruleSizeLiteral ) ) | ( (lv_word_2_0= RULE_ID ) ) | ( (lv_hex_3_0= RULE_HEX ) ) | ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) ) | ( (lv_string_5_0= RULE_STRING ) ) )
            {
            // InternalXcssParser.g:871:2: ( ( (lv_number_0_0= ruleNumberLiteral ) ) | ( (lv_size_1_0= ruleSizeLiteral ) ) | ( (lv_word_2_0= RULE_ID ) ) | ( (lv_hex_3_0= RULE_HEX ) ) | ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) ) | ( (lv_string_5_0= RULE_STRING ) ) )
            int alt15=6;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalXcssParser.g:872:3: ( (lv_number_0_0= ruleNumberLiteral ) )
                    {
                    // InternalXcssParser.g:872:3: ( (lv_number_0_0= ruleNumberLiteral ) )
                    // InternalXcssParser.g:873:4: (lv_number_0_0= ruleNumberLiteral )
                    {
                    // InternalXcssParser.g:873:4: (lv_number_0_0= ruleNumberLiteral )
                    // InternalXcssParser.g:874:5: lv_number_0_0= ruleNumberLiteral
                    {

                    					newCompositeNode(grammarAccess.getCSSStyleValueLiteralAccess().getNumberNumberLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleNumberLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"mdd.coursework.xcss.Xcss.NumberLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:892:3: ( (lv_size_1_0= ruleSizeLiteral ) )
                    {
                    // InternalXcssParser.g:892:3: ( (lv_size_1_0= ruleSizeLiteral ) )
                    // InternalXcssParser.g:893:4: (lv_size_1_0= ruleSizeLiteral )
                    {
                    // InternalXcssParser.g:893:4: (lv_size_1_0= ruleSizeLiteral )
                    // InternalXcssParser.g:894:5: lv_size_1_0= ruleSizeLiteral
                    {

                    					newCompositeNode(grammarAccess.getCSSStyleValueLiteralAccess().getSizeSizeLiteralParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_size_1_0=ruleSizeLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_1_0,
                    						"mdd.coursework.xcss.Xcss.SizeLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXcssParser.g:912:3: ( (lv_word_2_0= RULE_ID ) )
                    {
                    // InternalXcssParser.g:912:3: ( (lv_word_2_0= RULE_ID ) )
                    // InternalXcssParser.g:913:4: (lv_word_2_0= RULE_ID )
                    {
                    // InternalXcssParser.g:913:4: (lv_word_2_0= RULE_ID )
                    // InternalXcssParser.g:914:5: lv_word_2_0= RULE_ID
                    {
                    lv_word_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_word_2_0, grammarAccess.getCSSStyleValueLiteralAccess().getWordIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"word",
                    						lv_word_2_0,
                    						"mdd.coursework.xcss.Xcss.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXcssParser.g:931:3: ( (lv_hex_3_0= RULE_HEX ) )
                    {
                    // InternalXcssParser.g:931:3: ( (lv_hex_3_0= RULE_HEX ) )
                    // InternalXcssParser.g:932:4: (lv_hex_3_0= RULE_HEX )
                    {
                    // InternalXcssParser.g:932:4: (lv_hex_3_0= RULE_HEX )
                    // InternalXcssParser.g:933:5: lv_hex_3_0= RULE_HEX
                    {
                    lv_hex_3_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    					newLeafNode(lv_hex_3_0, grammarAccess.getCSSStyleValueLiteralAccess().getHexHEXTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"hex",
                    						lv_hex_3_0,
                    						"mdd.coursework.xcss.Xcss.HEX");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalXcssParser.g:950:3: ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) )
                    {
                    // InternalXcssParser.g:950:3: ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) )
                    // InternalXcssParser.g:951:4: (lv_function_4_0= RULE_FUNCTION_EXPRESSION )
                    {
                    // InternalXcssParser.g:951:4: (lv_function_4_0= RULE_FUNCTION_EXPRESSION )
                    // InternalXcssParser.g:952:5: lv_function_4_0= RULE_FUNCTION_EXPRESSION
                    {
                    lv_function_4_0=(Token)match(input,RULE_FUNCTION_EXPRESSION,FOLLOW_2); 

                    					newLeafNode(lv_function_4_0, grammarAccess.getCSSStyleValueLiteralAccess().getFunctionFUNCTION_EXPRESSIONTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"function",
                    						lv_function_4_0,
                    						"mdd.coursework.xcss.Xcss.FUNCTION_EXPRESSION");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalXcssParser.g:969:3: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // InternalXcssParser.g:969:3: ( (lv_string_5_0= RULE_STRING ) )
                    // InternalXcssParser.g:970:4: (lv_string_5_0= RULE_STRING )
                    {
                    // InternalXcssParser.g:970:4: (lv_string_5_0= RULE_STRING )
                    // InternalXcssParser.g:971:5: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_5_0, grammarAccess.getCSSStyleValueLiteralAccess().getStringSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCSSStyleValueLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSStyleValueLiteral"


    // $ANTLR start "entryRuleSizeLiteral"
    // InternalXcssParser.g:991:1: entryRuleSizeLiteral returns [EObject current=null] : iv_ruleSizeLiteral= ruleSizeLiteral EOF ;
    public final EObject entryRuleSizeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeLiteral = null;


        try {
            // InternalXcssParser.g:991:52: (iv_ruleSizeLiteral= ruleSizeLiteral EOF )
            // InternalXcssParser.g:992:2: iv_ruleSizeLiteral= ruleSizeLiteral EOF
            {
             newCompositeNode(grammarAccess.getSizeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeLiteral=ruleSizeLiteral();

            state._fsp--;

             current =iv_ruleSizeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizeLiteral"


    // $ANTLR start "ruleSizeLiteral"
    // InternalXcssParser.g:998:1: ruleSizeLiteral returns [EObject current=null] : ( ( (lv_value_0_0= ruleNUMBER ) ) ( (lv_unit_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSizeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_unit_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:1004:2: ( ( ( (lv_value_0_0= ruleNUMBER ) ) ( (lv_unit_1_0= RULE_ID ) ) ) )
            // InternalXcssParser.g:1005:2: ( ( (lv_value_0_0= ruleNUMBER ) ) ( (lv_unit_1_0= RULE_ID ) ) )
            {
            // InternalXcssParser.g:1005:2: ( ( (lv_value_0_0= ruleNUMBER ) ) ( (lv_unit_1_0= RULE_ID ) ) )
            // InternalXcssParser.g:1006:3: ( (lv_value_0_0= ruleNUMBER ) ) ( (lv_unit_1_0= RULE_ID ) )
            {
            // InternalXcssParser.g:1006:3: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalXcssParser.g:1007:4: (lv_value_0_0= ruleNUMBER )
            {
            // InternalXcssParser.g:1007:4: (lv_value_0_0= ruleNUMBER )
            // InternalXcssParser.g:1008:5: lv_value_0_0= ruleNUMBER
            {

            					newCompositeNode(grammarAccess.getSizeLiteralAccess().getValueNUMBERParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"mdd.coursework.xcss.Xcss.NUMBER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXcssParser.g:1025:3: ( (lv_unit_1_0= RULE_ID ) )
            // InternalXcssParser.g:1026:4: (lv_unit_1_0= RULE_ID )
            {
            // InternalXcssParser.g:1026:4: (lv_unit_1_0= RULE_ID )
            // InternalXcssParser.g:1027:5: lv_unit_1_0= RULE_ID
            {
            lv_unit_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_unit_1_0, grammarAccess.getSizeLiteralAccess().getUnitIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"mdd.coursework.xcss.Xcss.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizeLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalXcssParser.g:1047:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalXcssParser.g:1047:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalXcssParser.g:1048:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalXcssParser.g:1054:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:1060:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalXcssParser.g:1061:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalXcssParser.g:1061:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalXcssParser.g:1062:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalXcssParser.g:1062:3: (lv_value_0_0= ruleNUMBER )
            // InternalXcssParser.g:1063:4: lv_value_0_0= ruleNUMBER
            {

            				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"mdd.coursework.xcss.Xcss.NUMBER");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalXcssParser.g:1083:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalXcssParser.g:1083:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalXcssParser.g:1084:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalXcssParser.g:1090:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;



        	enterRule();

        try {
            // InternalXcssParser.g:1096:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT ) )
            // InternalXcssParser.g:1097:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT )
            {
            // InternalXcssParser.g:1097:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
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
                    alt16=1;
                    }
                    break;
                case FullStop:
                    {
                    int LA16_4 = input.LA(3);

                    if ( (LA16_4==RULE_ID) ) {
                        alt16=1;
                    }
                    else if ( (LA16_4==RULE_INT) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA16_0>=HyphenMinus && LA16_0<=FullStop)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXcssParser.g:1098:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXcssParser.g:1106:3: this_FLOAT_1= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getNUMBERAccess().getFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleFLOAT"
    // InternalXcssParser.g:1120:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalXcssParser.g:1122:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalXcssParser.g:1123:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalXcssParser.g:1132:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? (this_INT_1= RULE_INT )* kw= FullStop (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalXcssParser.g:1139:2: ( ( (kw= HyphenMinus )? (this_INT_1= RULE_INT )* kw= FullStop (this_INT_3= RULE_INT )+ ) )
            // InternalXcssParser.g:1140:2: ( (kw= HyphenMinus )? (this_INT_1= RULE_INT )* kw= FullStop (this_INT_3= RULE_INT )+ )
            {
            // InternalXcssParser.g:1140:2: ( (kw= HyphenMinus )? (this_INT_1= RULE_INT )* kw= FullStop (this_INT_3= RULE_INT )+ )
            // InternalXcssParser.g:1141:3: (kw= HyphenMinus )? (this_INT_1= RULE_INT )* kw= FullStop (this_INT_3= RULE_INT )+
            {
            // InternalXcssParser.g:1141:3: (kw= HyphenMinus )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXcssParser.g:1142:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFLOATAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalXcssParser.g:1148:3: (this_INT_1= RULE_INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXcssParser.g:1149:4: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    				current.merge(this_INT_1);
            	    			

            	    				newLeafNode(this_INT_1, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            kw=(Token)match(input,FullStop,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_2());
            		
            // InternalXcssParser.g:1162:3: (this_INT_3= RULE_INT )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXcssParser.g:1163:4: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    				current.merge(this_INT_3);
            	    			

            	    				newLeafNode(this_INT_3, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\uffff\1\13\10\uffff\1\15\1\uffff\1\13\1\uffff";
    static final String dfa_3s = "\1\12\1\4\1\13\1\24\4\uffff\1\17\1\13\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\25\3\24\4\uffff\2\24\1\23\1\uffff\1\24\1\uffff";
    static final String dfa_5s = "\4\uffff\1\3\1\4\1\5\1\6\3\uffff\1\1\1\uffff\1\2";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\3\uffff\1\4\1\5\1\6\2\uffff\1\1\1\7",
            "\1\13\1\uffff\3\13\1\uffff\1\13\1\10\1\13\2\uffff\1\12\3\uffff\1\13\1\11",
            "\1\3\10\uffff\1\11",
            "\1\14",
            "",
            "",
            "",
            "",
            "\1\13\4\uffff\1\14",
            "\1\3\10\uffff\1\11",
            "\1\15\1\uffff\3\15\1\13\3\15\1\13\1\uffff\1\15\2\uffff\1\13\1\15",
            "",
            "\1\13\1\uffff\3\13\1\uffff\3\13\2\uffff\1\12\3\uffff\1\13\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "871:2: ( ( (lv_number_0_0= ruleNumberLiteral ) ) | ( (lv_size_1_0= ruleSizeLiteral ) ) | ( (lv_word_2_0= RULE_ID ) ) | ( (lv_hex_3_0= RULE_HEX ) ) | ( (lv_function_4_0= RULE_FUNCTION_EXPRESSION ) ) | ( (lv_string_5_0= RULE_STRING ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008892L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000048A90L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000338C30L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000338C10L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100002L});

}