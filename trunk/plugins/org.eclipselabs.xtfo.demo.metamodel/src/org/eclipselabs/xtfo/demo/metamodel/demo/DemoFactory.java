/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage
 * @generated
 */
public interface DemoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoFactory eINSTANCE = org.eclipselabs.xtfo.demo.metamodel.demo.impl.DemoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Domain Model Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model Wrapper</em>'.
	 * @generated
	 */
	DomainModelWrapper createDomainModelWrapper();

	/**
	 * Returns a new object of class '<em>Arithmetic Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Wrapper</em>'.
	 * @generated
	 */
	ArithmeticWrapper createArithmeticWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemoPackage getDemoPackage();

} //DemoFactory
