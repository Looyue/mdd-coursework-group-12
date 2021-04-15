package mdd.coursework.xcss.scoping;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import mdd.coursework.xcss.xcss.CSSStyleDelacration;
import mdd.coursework.xcss.xcss.CSSStyleValue;
import mdd.coursework.xcss.xcss.VariableDeclaration;
import mdd.coursework.xcss.xcss.XCSSStyleRule;
import mdd.coursework.xcss.xcss.XcssModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

@SuppressWarnings("all")
public class XcssScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_CSSStyleValue_variable(final CSSStyleValue context, final EReference ref) {
    return this.visibleVariablesScope(context);
  }
  
  protected IScope _visibleVariablesScope(final CSSStyleValue cv) {
    return this.visibleVariablesScope(cv.eContainer());
  }
  
  protected IScope _visibleVariablesScope(final VariableDeclaration vd) {
    EObject _eContainer = vd.eContainer();
    return Scopes.scopeFor(Iterables.<VariableDeclaration>filter(((XcssModel) _eContainer).getElements(), VariableDeclaration.class));
  }
  
  protected IScope _visibleVariablesScope(final CSSStyleDelacration cd) {
    IScope _xblockexpression = null;
    {
      EObject _eContainer = cd.eContainer();
      final XCSSStyleRule xcssStyleRule = ((XCSSStyleRule) _eContainer);
      Iterable<VariableDeclaration> _filter = Iterables.<VariableDeclaration>filter(xcssStyleRule.getVariableDeclarations(), VariableDeclaration.class);
      EObject _eContainer_1 = xcssStyleRule.eContainer();
      Iterable<VariableDeclaration> _filter_1 = Iterables.<VariableDeclaration>filter(((XcssModel) _eContainer_1).getElements(), VariableDeclaration.class);
      Iterable<VariableDeclaration> _plus = Iterables.<VariableDeclaration>concat(_filter, _filter_1);
      _xblockexpression = Scopes.scopeFor(_plus);
    }
    return _xblockexpression;
  }
  
  public IScope visibleVariablesScope(final EObject cv) {
    if (cv instanceof CSSStyleValue) {
      return _visibleVariablesScope((CSSStyleValue)cv);
    } else if (cv instanceof VariableDeclaration) {
      return _visibleVariablesScope((VariableDeclaration)cv);
    } else if (cv instanceof CSSStyleDelacration) {
      return _visibleVariablesScope((CSSStyleDelacration)cv);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cv).toString());
    }
  }
}
