/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper;
import org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage;
import org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper;
import org.eclipselabs.xtfo.demo.metamodel.demo.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl#getDomainModels <em>Domain Models</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl#getArithmetics <em>Arithmetics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
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
	 * The cached value of the '{@link #getDomainModels() <em>Domain Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModels()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainModelWrapper> domainModels;

	/**
	 * The cached value of the '{@link #getArithmetics() <em>Arithmetics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmetics()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticWrapper> arithmetics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainModelWrapper> getDomainModels() {
		if (domainModels == null) {
			domainModels = new EObjectContainmentEList<DomainModelWrapper>(DomainModelWrapper.class, this, DemoPackage.MODEL__DOMAIN_MODELS);
		}
		return domainModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticWrapper> getArithmetics() {
		if (arithmetics == null) {
			arithmetics = new EObjectContainmentEList<ArithmeticWrapper>(ArithmeticWrapper.class, this, DemoPackage.MODEL__ARITHMETICS);
		}
		return arithmetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoPackage.MODEL__DOMAIN_MODELS:
				return ((InternalEList<?>)getDomainModels()).basicRemove(otherEnd, msgs);
			case DemoPackage.MODEL__ARITHMETICS:
				return ((InternalEList<?>)getArithmetics()).basicRemove(otherEnd, msgs);
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
			case DemoPackage.MODEL__NAME:
				return getName();
			case DemoPackage.MODEL__DOMAIN_MODELS:
				return getDomainModels();
			case DemoPackage.MODEL__ARITHMETICS:
				return getArithmetics();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DemoPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case DemoPackage.MODEL__DOMAIN_MODELS:
				getDomainModels().clear();
				getDomainModels().addAll((Collection<? extends DomainModelWrapper>)newValue);
				return;
			case DemoPackage.MODEL__ARITHMETICS:
				getArithmetics().clear();
				getArithmetics().addAll((Collection<? extends ArithmeticWrapper>)newValue);
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
			case DemoPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DemoPackage.MODEL__DOMAIN_MODELS:
				getDomainModels().clear();
				return;
			case DemoPackage.MODEL__ARITHMETICS:
				getArithmetics().clear();
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
			case DemoPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DemoPackage.MODEL__DOMAIN_MODELS:
				return domainModels != null && !domainModels.isEmpty();
			case DemoPackage.MODEL__ARITHMETICS:
				return arithmetics != null && !arithmetics.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
