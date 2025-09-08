/**
 */
package model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.Bar#getFoo <em>Foo</em>}</li>
 *   <li>{@link model.core.Bar#getBazzles <em>Bazzles</em>}</li>
 *   <li>{@link model.core.Bar#getBackupFor <em>Backup For</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getBar()
 * @model
 * @generated
 */
public interface Bar extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Foo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.core.Foo#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo</em>' container reference.
	 * @see #setFoo(Foo)
	 * @see model.core.CorePackage#getBar_Foo()
	 * @see model.core.Foo#getBars
	 * @model opposite="bars" transient="false"
	 * @generated
	 */
	Foo getFoo();

	/**
	 * Sets the value of the '{@link model.core.Bar#getFoo <em>Foo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo</em>' container reference.
	 * @see #getFoo()
	 * @generated
	 */
	void setFoo(Foo value);

	/**
	 * Returns the value of the '<em><b>Bazzles</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.Bazzle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bazzles</em>' containment reference list.
	 * @see model.core.CorePackage#getBar_Bazzles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bazzle> getBazzles();

	/**
	 * Returns the value of the '<em><b>Backup For</b></em>' reference list.
	 * The list contents are of type {@link model.core.Bazzle}.
	 * It is bidirectional and its opposite is '{@link model.core.Bazzle#getBackupBar <em>Backup Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup For</em>' reference list.
	 * @see model.core.CorePackage#getBar_BackupFor()
	 * @see model.core.Bazzle#getBackupBar
	 * @model opposite="backupBar"
	 * @generated
	 */
	EList<Bazzle> getBackupFor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bazzlesMany="true"
	 * @generated
	 */
	void doSomethingWithFooAndBazzles(Foo foo, EList<Bazzle> bazzles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model classesMany="true" numbersMany="true"
	 * @generated
	 */
	void doSomethingWithClassesAndNumbers(EList<FooClass> classes, EList<BoundedNumber> numbers);

} // Bar
