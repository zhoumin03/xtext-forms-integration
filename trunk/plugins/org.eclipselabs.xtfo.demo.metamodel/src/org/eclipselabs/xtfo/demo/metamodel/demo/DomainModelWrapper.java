/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.xtfo.demo.metamodel.demo;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.example.domainmodel.DomainModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAsString <em>As String</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAstRootElement <em>Ast Root Element</em>}</li>
 *   <li>{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getDomainModelWrapper()
 * @model
 * @generated
 */
public interface DomainModelWrapper extends EObject {
	/**
	 * Returns the value of the '<em><b>As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As String</em>' attribute.
	 * @see #setAsString(String)
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getDomainModelWrapper_AsString()
	 * @model
	 * @generated
	 */
	String getAsString();

	/**
	 * Sets the value of the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAsString <em>As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As String</em>' attribute.
	 * @see #getAsString()
	 * @generated
	 */
	void setAsString(String value);

	/**
	 * Returns the value of the '<em><b>Ast Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ast Root Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ast Root Element</em>' containment reference.
	 * @see #setAstRootElement(DomainModel)
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getDomainModelWrapper_AstRootElement()
	 * @model containment="true"
	 * @generated
	 */
	DomainModel getAstRootElement();

	/**
	 * Sets the value of the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getAstRootElement <em>Ast Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ast Root Element</em>' containment reference.
	 * @see #getAstRootElement()
	 * @generated
	 */
	void setAstRootElement(DomainModel value);

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
	 * @see org.eclipselabs.xtfo.demo.metamodel.demo.DemoPackage#getDomainModelWrapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.xtfo.demo.metamodel.demo.DomainModelWrapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DomainModelWrapper
