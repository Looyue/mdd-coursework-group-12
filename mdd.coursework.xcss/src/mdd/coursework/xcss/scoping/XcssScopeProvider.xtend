package mdd.coursework.xcss.scoping;

import static org.eclipse.xtext.scoping.Scopes.*
import org.eclipse.xtext.scoping.IScope
import mdd.coursework.xcss.xcss.CSSStyleValue
import org.eclipse.emf.ecore.EReference
import mdd.coursework.xcss.xcss.XcssModel
import mdd.coursework.xcss.xcss.VariableDeclaration
import mdd.coursework.xcss.xcss.CSSStyleDelacration
import mdd.coursework.xcss.xcss.XCSSStyleRule
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

class XcssScopeProvider extends AbstractDeclarativeScopeProvider {
	def IScope scope_CSSStyleValue_variable(CSSStyleValue context, EReference ref) {
//		System.out.println('########################')
//		System.out.println(context.visibleVariablesScope)
		context.visibleVariablesScope
	}
	
	dispatch def IScope visibleVariablesScope(CSSStyleValue cv) {
		cv.eContainer.visibleVariablesScope
	}
	
	dispatch def IScope visibleVariablesScope(VariableDeclaration vd) {
		scopeFor((vd.eContainer as XcssModel).elements.filter(VariableDeclaration))
	}
	
	dispatch def IScope visibleVariablesScope(CSSStyleDelacration cd) {
		val xcssStyleRule = cd.eContainer as XCSSStyleRule
		scopeFor(xcssStyleRule.variableDeclarations.filter(VariableDeclaration) + (xcssStyleRule.eContainer as XcssModel).elements.filter(VariableDeclaration))
	}
}
