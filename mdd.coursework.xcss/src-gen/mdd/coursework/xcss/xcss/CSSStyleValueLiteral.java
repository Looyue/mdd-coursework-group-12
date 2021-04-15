/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Style Value Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getNumber <em>Number</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getSize <em>Size</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getWord <em>Word</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getHex <em>Hex</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getFunction <em>Function</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getString <em>String</em>}</li>
 * </ul>
 *
 * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral()
 * @model
 * @generated
 */
public interface CSSStyleValueLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(NumberLiteral)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_Number()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getNumber();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(SizeLiteral)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_Size()
   * @model containment="true"
   * @generated
   */
  SizeLiteral getSize();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(SizeLiteral value);

  /**
   * Returns the value of the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' attribute.
   * @see #setWord(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_Word()
   * @model
   * @generated
   */
  String getWord();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see #getWord()
   * @generated
   */
  void setWord(String value);

  /**
   * Returns the value of the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hex</em>' attribute.
   * @see #setHex(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_Hex()
   * @model
   * @generated
   */
  String getHex();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getHex <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hex</em>' attribute.
   * @see #getHex()
   * @generated
   */
  void setHex(String value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getCSSStyleValueLiteral_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.CSSStyleValueLiteral#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // CSSStyleValueLiteral