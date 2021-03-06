/*
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mdd.coursework.xcss.services.XcssGrammarAccess;
import mdd.coursework.xcss.xcss.Addition;
import mdd.coursework.xcss.xcss.CSSStyleDelacration;
import mdd.coursework.xcss.xcss.CSSStyleKey;
import mdd.coursework.xcss.xcss.CSSStyleValue;
import mdd.coursework.xcss.xcss.CSSStyleValueLiteral;
import mdd.coursework.xcss.xcss.Multiplication;
import mdd.coursework.xcss.xcss.NumberLiteral;
import mdd.coursework.xcss.xcss.PseudoClass;
import mdd.coursework.xcss.xcss.SelectorName;
import mdd.coursework.xcss.xcss.SizeLiteral;
import mdd.coursework.xcss.xcss.VariableDeclaration;
import mdd.coursework.xcss.xcss.XCSSSelector;
import mdd.coursework.xcss.xcss.XCSSStyleRule;
import mdd.coursework.xcss.xcss.XcssModel;
import mdd.coursework.xcss.xcss.XcssPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XcssSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XcssGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XcssPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XcssPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case XcssPackage.CSS_STYLE_DELACRATION:
				sequence_CSSStyleDelacration(context, (CSSStyleDelacration) semanticObject); 
				return; 
			case XcssPackage.CSS_STYLE_KEY:
				sequence_CSSStyleKey(context, (CSSStyleKey) semanticObject); 
				return; 
			case XcssPackage.CSS_STYLE_VALUE:
				sequence_CSSStyleValue(context, (CSSStyleValue) semanticObject); 
				return; 
			case XcssPackage.CSS_STYLE_VALUE_LITERAL:
				sequence_CSSStyleValueLiteral(context, (CSSStyleValueLiteral) semanticObject); 
				return; 
			case XcssPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case XcssPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case XcssPackage.PSEUDO_CLASS:
				sequence_PseudoClass(context, (PseudoClass) semanticObject); 
				return; 
			case XcssPackage.SELECTOR_NAME:
				sequence_SelectorName(context, (SelectorName) semanticObject); 
				return; 
			case XcssPackage.SIZE_LITERAL:
				sequence_SizeLiteral(context, (SizeLiteral) semanticObject); 
				return; 
			case XcssPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			case XcssPackage.XCSS_SELECTOR:
				sequence_XCSSSelector(context, (XCSSSelector) semanticObject); 
				return; 
			case XcssPackage.XCSS_STYLE_RULE:
				sequence_XCSSStyleRule(context, (XCSSStyleRule) semanticObject); 
				return; 
			case XcssPackage.XCSS_MODEL:
				sequence_XcssModel(context, (XcssModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Addition returns Addition
	 *     Addition.Addition_1_0 returns Addition
	 *     Multiplication returns Addition
	 *     Multiplication.Multiplication_1_0 returns Addition
	 *     Primary returns Addition
	 *
	 * Constraint:
	 *     (left=Addition_Addition_1_0 (operator+='+' | operator+='-') right+=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CSSStyleDelacration returns CSSStyleDelacration
	 *
	 * Constraint:
	 *     (cssStyleKey=CSSStyleKey cssStyleValue=CSSStyleValue)
	 */
	protected void sequence_CSSStyleDelacration(ISerializationContext context, CSSStyleDelacration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.CSS_STYLE_DELACRATION__CSS_STYLE_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.CSS_STYLE_DELACRATION__CSS_STYLE_KEY));
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.CSS_STYLE_DELACRATION__CSS_STYLE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.CSS_STYLE_DELACRATION__CSS_STYLE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleKeyCSSStyleKeyParserRuleCall_0_0(), semanticObject.getCssStyleKey());
		feeder.accept(grammarAccess.getCSSStyleDelacrationAccess().getCssStyleValueCSSStyleValueParserRuleCall_2_0(), semanticObject.getCssStyleValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CSSStyleKey returns CSSStyleKey
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_CSSStyleKey(ISerializationContext context, CSSStyleKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.CSS_STYLE_KEY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.CSS_STYLE_KEY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCSSStyleKeyAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CSSStyleValueLiteral returns CSSStyleValueLiteral
	 *
	 * Constraint:
	 *     (
	 *         number=NumberLiteral | 
	 *         size=SizeLiteral | 
	 *         word=ID | 
	 *         hex=HEX | 
	 *         function=FUNCTION_EXPRESSION | 
	 *         string=STRING
	 *     )
	 */
	protected void sequence_CSSStyleValueLiteral(ISerializationContext context, CSSStyleValueLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns CSSStyleValue
	 *     Addition.Addition_1_0 returns CSSStyleValue
	 *     Multiplication returns CSSStyleValue
	 *     Multiplication.Multiplication_1_0 returns CSSStyleValue
	 *     Primary returns CSSStyleValue
	 *     CSSStyleValue returns CSSStyleValue
	 *
	 * Constraint:
	 *     (value=CSSStyleValueLiteral | variable=[VariableDeclaration|VariableId])
	 */
	protected void sequence_CSSStyleValue(ISerializationContext context, CSSStyleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Addition returns Multiplication
	 *     Addition.Addition_1_0 returns Multiplication
	 *     Multiplication returns Multiplication
	 *     Multiplication.Multiplication_1_0 returns Multiplication
	 *     Primary returns Multiplication
	 *
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0 (operator+='*' | operator+='/') right+=Primary)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumberLiteral returns NumberLiteral
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberLiteral(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PseudoClass returns PseudoClass
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_PseudoClass(ISerializationContext context, PseudoClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.PSEUDO_CLASS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.PSEUDO_CLASS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPseudoClassAccess().getValueIDTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectorName returns SelectorName
	 *
	 * Constraint:
	 *     ((dot?='.'? name=ID) | asterisk='*')
	 */
	protected void sequence_SelectorName(ISerializationContext context, SelectorName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SizeLiteral returns SizeLiteral
	 *
	 * Constraint:
	 *     (value=NUMBER unit=ID)
	 */
	protected void sequence_SizeLiteral(ISerializationContext context, SizeLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.SIZE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.SIZE_LITERAL__VALUE));
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.SIZE_LITERAL__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.SIZE_LITERAL__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeLiteralAccess().getValueNUMBERParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getSizeLiteralAccess().getUnitIDTerminalRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=VariableId value=Addition)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.VARIABLE_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, XcssPackage.Literals.VARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XcssPackage.Literals.VARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameVariableIdParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getValueAdditionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XCSSSelector returns XCSSSelector
	 *
	 * Constraint:
	 *     (name=SelectorName pseudoClasses+=PseudoClass*)
	 */
	protected void sequence_XCSSSelector(ISerializationContext context, XCSSSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns XCSSStyleRule
	 *     XCSSStyleRule returns XCSSStyleRule
	 *
	 * Constraint:
	 *     (selectors+=XCSSSelector selectors+=XCSSSelector* variableDeclarations+=VariableDeclaration* cssStyleDeclarations+=CSSStyleDelacration*)
	 */
	protected void sequence_XCSSStyleRule(ISerializationContext context, XCSSStyleRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XcssModel returns XcssModel
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_XcssModel(ISerializationContext context, XcssModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
