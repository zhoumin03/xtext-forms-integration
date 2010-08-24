/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoFactory
 * @model kind="package"
 * @generated
 */
public interface DemoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "demo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/xtext-forms-integration/demo/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoPackage eINSTANCE = org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOMAIN_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Arithmetics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARITHMETICS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl <em>Domain Model Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getDomainModelWrapper()
	 * @generated
	 */
	int DOMAIN_MODEL_WRAPPER = 1;

	/**
	 * The feature id for the '<em><b>As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_WRAPPER__AS_STRING = 0;

	/**
	 * The feature id for the '<em><b>Ast Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_WRAPPER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Domain Model Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_WRAPPER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ArithmeticWrapperImpl <em>Arithmetic Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.ArithmeticWrapperImpl
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getArithmeticWrapper()
	 * @generated
	 */
	int ARITHMETIC_WRAPPER = 2;

	/**
	 * The feature id for the '<em><b>As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_WRAPPER__AS_STRING = 0;

	/**
	 * The feature id for the '<em><b>Eval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_WRAPPER__EVAL = 1;

	/**
	 * The number of structural features of the '<em>Arithmetic Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_WRAPPER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getDomainModels <em>Domain Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Models</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.Model#getDomainModels()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DomainModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getArithmetics <em>Arithmetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arithmetics</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.Model#getArithmetics()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Arithmetics();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper <em>Domain Model Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model Wrapper</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper
	 * @generated
	 */
	EClass getDomainModelWrapper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAsString <em>As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As String</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAsString()
	 * @see #getDomainModelWrapper()
	 * @generated
	 */
	EAttribute getDomainModelWrapper_AsString();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAstRootElement <em>Ast Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ast Root Element</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAstRootElement()
	 * @see #getDomainModelWrapper()
	 * @generated
	 */
	EReference getDomainModelWrapper_AstRootElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getName()
	 * @see #getDomainModelWrapper()
	 * @generated
	 */
	EAttribute getDomainModelWrapper_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper <em>Arithmetic Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Wrapper</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper
	 * @generated
	 */
	EClass getArithmeticWrapper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper#getAsString <em>As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As String</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper#getAsString()
	 * @see #getArithmeticWrapper()
	 * @generated
	 */
	EAttribute getArithmeticWrapper_AsString();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eval</em>'.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper#getEval()
	 * @see #getArithmeticWrapper()
	 * @generated
	 */
	EReference getArithmeticWrapper_Eval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemoFactory getDemoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.ModelImpl
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DOMAIN_MODELS = eINSTANCE.getModel_DomainModels();

		/**
		 * The meta object literal for the '<em><b>Arithmetics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ARITHMETICS = eINSTANCE.getModel_Arithmetics();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl <em>Domain Model Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DomainModelWrapperImpl
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getDomainModelWrapper()
		 * @generated
		 */
		EClass DOMAIN_MODEL_WRAPPER = eINSTANCE.getDomainModelWrapper();

		/**
		 * The meta object literal for the '<em><b>As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL_WRAPPER__AS_STRING = eINSTANCE.getDomainModelWrapper_AsString();

		/**
		 * The meta object literal for the '<em><b>Ast Root Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_WRAPPER__AST_ROOT_ELEMENT = eINSTANCE.getDomainModelWrapper_AstRootElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL_WRAPPER__NAME = eINSTANCE.getDomainModelWrapper_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.impl.ArithmeticWrapperImpl <em>Arithmetic Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.ArithmeticWrapperImpl
		 * @see org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoPackageImpl#getArithmeticWrapper()
		 * @generated
		 */
		EClass ARITHMETIC_WRAPPER = eINSTANCE.getArithmeticWrapper();

		/**
		 * The meta object literal for the '<em><b>As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_WRAPPER__AS_STRING = eINSTANCE.getArithmeticWrapper_AsString();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_WRAPPER__EVAL = eINSTANCE.getArithmeticWrapper_Eval();

	}

} //DemoPackage
