/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.SizeLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.SizeLiteral#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see mdd.coursework.xcss.xcss.XcssPackage#getSizeLiteral()
 * @model
 * @generated
 */
public interface SizeLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getSizeLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.SizeLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getSizeLiteral_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.SizeLiteral#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

} // SizeLiteral