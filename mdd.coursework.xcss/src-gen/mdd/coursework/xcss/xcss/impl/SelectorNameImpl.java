/**
 * generated by Xtext 2.24.0
 */
package mdd.coursework.xcss.xcss.impl;

import mdd.coursework.xcss.xcss.SelectorName;
import mdd.coursework.xcss.xcss.XcssPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.SelectorNameImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.SelectorNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdd.coursework.xcss.xcss.impl.SelectorNameImpl#getAsterisk <em>Asterisk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectorNameImpl extends MinimalEObjectImpl.Container implements SelectorName
{
  /**
   * The default value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected static final boolean DOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected boolean dot = DOT_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAsterisk() <em>Asterisk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsterisk()
   * @generated
   * @ordered
   */
  protected static final String ASTERISK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAsterisk() <em>Asterisk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsterisk()
   * @generated
   * @ordered
   */
  protected String asterisk = ASTERISK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorNameImpl()
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
    return XcssPackage.Literals.SELECTOR_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDot(boolean newDot)
  {
    boolean oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XcssPackage.SELECTOR_NAME__DOT, oldDot, dot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XcssPackage.SELECTOR_NAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAsterisk()
  {
    return asterisk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAsterisk(String newAsterisk)
  {
    String oldAsterisk = asterisk;
    asterisk = newAsterisk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XcssPackage.SELECTOR_NAME__ASTERISK, oldAsterisk, asterisk));
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
      case XcssPackage.SELECTOR_NAME__DOT:
        return isDot();
      case XcssPackage.SELECTOR_NAME__NAME:
        return getName();
      case XcssPackage.SELECTOR_NAME__ASTERISK:
        return getAsterisk();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XcssPackage.SELECTOR_NAME__DOT:
        setDot((Boolean)newValue);
        return;
      case XcssPackage.SELECTOR_NAME__NAME:
        setName((String)newValue);
        return;
      case XcssPackage.SELECTOR_NAME__ASTERISK:
        setAsterisk((String)newValue);
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
      case XcssPackage.SELECTOR_NAME__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case XcssPackage.SELECTOR_NAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XcssPackage.SELECTOR_NAME__ASTERISK:
        setAsterisk(ASTERISK_EDEFAULT);
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
      case XcssPackage.SELECTOR_NAME__DOT:
        return dot != DOT_EDEFAULT;
      case XcssPackage.SELECTOR_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XcssPackage.SELECTOR_NAME__ASTERISK:
        return ASTERISK_EDEFAULT == null ? asterisk != null : !ASTERISK_EDEFAULT.equals(asterisk);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dot: ");
    result.append(dot);
    result.append(", name: ");
    result.append(name);
    result.append(", asterisk: ");
    result.append(asterisk);
    result.append(')');
    return result.toString();
  }

} //SelectorNameImpl