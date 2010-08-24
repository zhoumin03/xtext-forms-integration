/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.xtfo.demo.metamodel.demo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoFactoryImpl extends EFactoryImpl implements DemoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DemoFactory init() {
		try {
			DemoFactory theDemoFactory = (DemoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/xtext-forms-integration/demo/1.0.0"); 
			if (theDemoFactory != null) {
				return theDemoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DemoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DemoPackage.MODEL: return createModel();
			case DemoPackage.DOMAIN_MODEL_WRAPPER: return createDomainModelWrapper();
			case DemoPackage.ARITHMETIC_WRAPPER: return createArithmeticWrapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelWrapper createDomainModelWrapper() {
		DomainModelWrapperImpl domainModelWrapper = new DomainModelWrapperImpl();
		return domainModelWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticWrapper createArithmeticWrapper() {
		ArithmeticWrapperImpl arithmeticWrapper = new ArithmeticWrapperImpl();
		return arithmeticWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoPackage getDemoPackage() {
		return (DemoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DemoPackage getPackage() {
		return DemoPackage.eINSTANCE;
	}

} //DemoFactoryImpl
