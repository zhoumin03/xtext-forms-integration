/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getDomainModels <em>Domain Models</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getArithmetics <em>Arithmetics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Models</em>' containment reference list.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getModel_DomainModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainModelWrapper> getDomainModels();

	/**
	 * Returns the value of the '<em><b>Arithmetics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.xtfo.demo.metamodel.demo.ArithmeticWrapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetics</em>' containment reference list.
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getModel_Arithmetics()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArithmeticWrapper> getArithmetics();

} // Model
