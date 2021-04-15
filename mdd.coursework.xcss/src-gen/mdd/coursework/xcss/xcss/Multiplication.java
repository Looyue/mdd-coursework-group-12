/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.Multiplication#getLeft <em>Left</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.Multiplication#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.Multiplication#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mdd.coursework.xcss.xcss.XcssPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see mdd.coursework.xcss.xcss.XcssPackage#getMultiplication_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link mdd.coursework.xcss.xcss.Multiplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see mdd.coursework.xcss.xcss.XcssPackage#getMultiplication_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link mdd.coursework.xcss.xcss.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see mdd.coursework.xcss.xcss.XcssPackage#getMultiplication_Right()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getRight();

} // Multiplication
