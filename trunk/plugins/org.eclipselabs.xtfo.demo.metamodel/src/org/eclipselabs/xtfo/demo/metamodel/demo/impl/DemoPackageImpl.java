/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.example.arithmetics.arithmetics.ArithmeticsPackage;

import org.eclipse.xtext.example.domainmodel.DomainmodelPackage;

import org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper;
import org.eclipselabs.xtfo.demo.metamodel.demo.DemoFactory;
import org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage;
import org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper;
import org.eclipselabs.xtfo.demo.metamodel.demo.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoPackageImpl extends EPackageImpl implements DemoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticWrapperEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DemoPackageImpl() {
		super(eNS_URI, DemoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DemoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DemoPackage init() {
		if (isInited) return (DemoPackage)EPackage.Registry.INSTANCE.getEPackage(DemoPackage.eNS_URI);

		// Obtain or create and register package
		DemoPackageImpl theDemoPackage = (DemoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArithmeticsPackage.eINSTANCE.eClass();
		DomainmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDemoPackage.createPackageContents();

		// Initialize created meta-data
		theDemoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDemoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DemoPackage.eNS_URI, theDemoPackage);
		return theDemoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DomainModels() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Arithmetics() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelWrapper() {
		return domainModelWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModelWrapper_AsString() {
		return (EAttribute)domainModelWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelWrapper_AstRootElement() {
		return (EReference)domainModelWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModelWrapper_Name() {
		return (EAttribute)domainModelWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticWrapper() {
		return arithmeticWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmeticWrapper_AsString() {
		return (EAttribute)arithmeticWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticWrapper_Eval() {
		return (EReference)arithmeticWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoFactory getDemoFactory() {
		return (DemoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__DOMAIN_MODELS);
		createEReference(modelEClass, MODEL__ARITHMETICS);

		domainModelWrapperEClass = createEClass(DOMAIN_MODEL_WRAPPER);
		createEAttribute(domainModelWrapperEClass, DOMAIN_MODEL_WRAPPER__AS_STRING);
		createEReference(domainModelWrapperEClass, DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT);
		createEAttribute(domainModelWrapperEClass, DOMAIN_MODEL_WRAPPER__NAME);

		arithmeticWrapperEClass = createEClass(ARITHMETIC_WRAPPER);
		createEAttribute(arithmeticWrapperEClass, ARITHMETIC_WRAPPER__AS_STRING);
		createEReference(arithmeticWrapperEClass, ARITHMETIC_WRAPPER__EVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DomainmodelPackage theDomainmodelPackage = (DomainmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DomainmodelPackage.eNS_URI);
		ArithmeticsPackage theArithmeticsPackage = (ArithmeticsPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmeticsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DomainModels(), this.getDomainModelWrapper(), null, "domainModels", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Arithmetics(), this.getArithmeticWrapper(), null, "arithmetics", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelWrapperEClass, DomainModelWrapper.class, "DomainModelWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainModelWrapper_AsString(), ecorePackage.getEString(), "asString", null, 0, 1, DomainModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModelWrapper_AstRootElement(), theDomainmodelPackage.getDomainModel(), null, "astRootElement", null, 0, 1, DomainModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainModelWrapper_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainModelWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticWrapperEClass, ArithmeticWrapper.class, "ArithmeticWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmeticWrapper_AsString(), ecorePackage.getEString(), "asString", null, 0, 1, ArithmeticWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticWrapper_Eval(), theArithmeticsPackage.getEvaluation(), null, "eval", null, 0, 1, ArithmeticWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DemoPackageImpl
