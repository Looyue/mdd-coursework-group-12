/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss.impl;

import java.util.Collection;

import mdd.coursework.xcss.xcss.CSSStyleDelacration;
import mdd.coursework.xcss.xcss.VariableDeclaration;
import mdd.coursework.xcss.xcss.XCSSSelector;
import mdd.coursework.xcss.xcss.XCSSStyleRule;
import mdd.coursework.xcss.xcss.XcssPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCSS Style Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.XCSSStyleRuleImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.XCSSStyleRuleImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.XCSSStyleRuleImpl#getCssStyleDeclarations <em>Css Style Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XCSSStyleRuleImpl extends AbstractElementImpl implements XCSSStyleRule
{
  /**
   * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectors()
   * @generated
   * @ordered
   */
  protected EList<XCSSSelector> selectors;

  /**
   * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variableDeclarations;

  /**
   * The cached value of the '{@link #getCssStyleDeclarations() <em>Css Style Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssStyleDeclarations()
   * @generated
   * @ordered
   */
  protected EList<CSSStyleDelacration> cssStyleDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XCSSStyleRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XcssPackage.Literals.XCSS_STYLE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<XCSSSelector> getSelectors()
  {
    if (selectors == null)
    {
      selectors = new EObjectContainmentEList<XCSSSelector>(XCSSSelector.class, this, XcssPackage.XCSS_STYLE_RULE__SELECTORS);
    }
    return selectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<VariableDeclaration> getVariableDeclarations()
  {
    if (variableDeclarations == null)
    {
      variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS);
    }
    return variableDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CSSStyleDelacration> getCssStyleDeclarations()
  {
    if (cssStyleDeclarations == null)
    {
      cssStyleDeclarations = new EObjectContainmentEList<CSSStyleDelacration>(CSSStyleDelacration.class, this, XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS);
    }
    return cssStyleDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XcssPackage.XCSS_STYLE_RULE__SELECTORS:
        return ((InternalEList<?>)getSelectors()).basicRemove(otherEnd, msgs);
      case XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS:
        return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
      case XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS:
        return ((InternalEList<?>)getCssStyleDeclarations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XcssPackage.XCSS_STYLE_RULE__SELECTORS:
        return getSelectors();
      case XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS:
        return getVariableDeclarations();
      case XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS:
        return getCssStyleDeclarations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XcssPackage.XCSS_STYLE_RULE__SELECTORS:
        getSelectors().clear();
        getSelectors().addAll((Collection<? extends XCSSSelector>)newValue);
        return;
      case XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS:
        getCssStyleDeclarations().clear();
        getCssStyleDeclarations().addAll((Collection<? extends CSSStyleDelacration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XcssPackage.XCSS_STYLE_RULE__SELECTORS:
        getSelectors().clear();
        return;
      case XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        return;
      case XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS:
        getCssStyleDeclarations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XcssPackage.XCSS_STYLE_RULE__SELECTORS:
        return selectors != null && !selectors.isEmpty();
      case XcssPackage.XCSS_STYLE_RULE__VARIABLE_DECLARATIONS:
        return variableDeclarations != null && !variableDeclarations.isEmpty();
      case XcssPackage.XCSS_STYLE_RULE__CSS_STYLE_DECLARATIONS:
        return cssStyleDeclarations != null && !cssStyleDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XCSSStyleRuleImpl
