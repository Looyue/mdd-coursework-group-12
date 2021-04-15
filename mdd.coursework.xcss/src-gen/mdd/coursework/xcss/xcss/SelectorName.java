/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.SelectorName#isDot <em>Dot</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.SelectorName#getName <em>Name</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.SelectorName#getAsterisk <em>Asterisk</em>}</li>
 * </ul>
 *
 * @see mdd.coursework.xcss.xcss.XcssPackage#getSelectorName()
 * @model
 * @generated
 */
public interface SelectorName extends EObject
{
  /**
   * Returns the value of the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' attribute.
   * @see #setDot(boolean)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getSelectorName_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.SelectorName#isDot <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dot</em>' attribute.
   * @see #isDot()
   * @generated
   */
  void setDot(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getSelectorName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.SelectorName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Asterisk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asterisk</em>' attribute.
   * @see #setAsterisk(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getSelectorName_Asterisk()
   * @model
   * @generated
   */
  String getAsterisk();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.SelectorName#getAsterisk <em>Asterisk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asterisk</em>' attribute.
   * @see #getAsterisk()
   * @generated
   */
  void setAsterisk(String value);

} // SelectorName
