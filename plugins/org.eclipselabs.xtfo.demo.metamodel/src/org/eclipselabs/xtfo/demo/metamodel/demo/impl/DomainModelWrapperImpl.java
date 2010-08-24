/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.xtext.example.domainmodel.DomainModel;

import org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage;
import org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl#getAsString <em>As String</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl#getAstRootElement <em>Ast Root Element</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelWrapperImpl extends EObjectImpl implements DomainModelWrapper {
	/**
	 * The default value of the '{@link #getAsString() <em>As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsString() <em>As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsString()
	 * @generated
	 * @ordered
	 */
	protected String asString = AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAstRootElement() <em>Ast Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAstRootElement()
	 * @generated
	 * @ordered
	 */
	protected DomainModel astRootElement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.DOMAIN_MODEL_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsString() {
		return asString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsString(String newAsString) {
		String oldAsString = asString;
		asString = newAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.DOMAIN_MODEL_WRAPPER__AS_STRING, oldAsString, asString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getAstRootElement() {
		return astRootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAstRootElement(DomainModel newAstRootElement, NotificationChain msgs) {
		DomainModel oldAstRootElement = astRootElement;
		astRootElement = newAstRootElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT, oldAstRootElement, newAstRootElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAstRootElement(DomainModel newAstRootElement) {
		if (newAstRootElement != astRootElement) {
			NotificationChain msgs = null;
			if (astRootElement != null)
				msgs = ((InternalEObject)astRootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT, null, msgs);
			if (newAstRootElement != null)
				msgs = ((InternalEObject)newAstRootElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT, null, msgs);
			msgs = basicSetAstRootElement(newAstRootElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT, newAstRootElement, newAstRootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.DOMAIN_MODEL_WRAPPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT:
				return basicSetAstRootElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AS_STRING:
				return getAsString();
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT:
				return getAstRootElement();
			case DemoPackage.DOMAIN_MODEL_WRAPPER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AS_STRING:
				setAsString((String)newValue);
				return;
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT:
				setAstRootElement((DomainModel)newValue);
				return;
			case DemoPackage.DOMAIN_MODEL_WRAPPER__NAME:
				setName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AS_STRING:
				setAsString(AS_STRING_EDEFAULT);
				return;
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT:
				setAstRootElement((DomainModel)null);
				return;
			case DemoPackage.DOMAIN_MODEL_WRAPPER__NAME:
				setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AS_STRING:
				return AS_STRING_EDEFAULT == null ? asString != null : !AS_STRING_EDEFAULT.equals(asString);
			case DemoPackage.DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT:
				return astRootElement != null;
			case DemoPackage.DOMAIN_MODEL_WRAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (asString: ");
		result.append(asString);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainModelWrapperImpl
