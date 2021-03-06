/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCSS Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.XCSSSelector#getName <em>Name</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.XCSSSelector#getPseudoClasses <em>Pseudo Classes</em>}</li>
 * </ul>
 *
 * @see mdd.coursework.xcss.xcss.XcssPackage#getXCSSSelector()
 * @model
 * @generated
 */
public interface XCSSSelector extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(SelectorName)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getXCSSSelector_Name()
   * @model containment="true"
   * @generated
   */
  SelectorName getName();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.XCSSSelector#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(SelectorName value);

  /**
   * Returns the value of the '<em><b>Pseudo Classes</b></em>' containment reference list.
   * The list contents are of type {@link mdd.coursework.xcss.xcss.PseudoClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Classes</em>' containment reference list.
   * @see mdd.coursework.xcss.xcss.XcssPackage#getXCSSSelector_PseudoClasses()
   * @model containment="true"
   * @generated
   */
  EList<PseudoClass> getPseudoClasses();

} // XCSSSelector
