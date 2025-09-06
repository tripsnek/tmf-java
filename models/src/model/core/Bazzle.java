/**
 */
package model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bazzle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.Bazzle#getBackupBar <em>Backup Bar</em>}</li>
 *   <li>{@link model.core.Bazzle#getOneToOneFoo <em>One To One Foo</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getBazzle()
 * @model
 * @generated
 */
public interface Bazzle extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Backup Bar</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.core.Bar#getBackupFor <em>Backup For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Bar</em>' reference.
	 * @see #setBackupBar(Bar)
	 * @see model.core.CorePackage#getBazzle_BackupBar()
	 * @see model.core.Bar#getBackupFor
	 * @model opposite="backupFor"
	 * @generated
	 */
	Bar getBackupBar();

	/**
	 * Sets the value of the '{@link model.core.Bazzle#getBackupBar <em>Backup Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Bar</em>' reference.
	 * @see #getBackupBar()
	 * @generated
	 */
	void setBackupBar(Bar value);

	/**
	 * Returns the value of the '<em><b>One To One Foo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.core.Foo#getOneToOneBazzle <em>One To One Bazzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To One Foo</em>' reference.
	 * @see #setOneToOneFoo(Foo)
	 * @see model.core.CorePackage#getBazzle_OneToOneFoo()
	 * @see model.core.Foo#getOneToOneBazzle
	 * @model opposite="oneToOneBazzle"
	 * @generated
	 */
	Foo getOneToOneFoo();

	/**
	 * Sets the value of the '{@link model.core.Bazzle#getOneToOneFoo <em>One To One Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To One Foo</em>' reference.
	 * @see #getOneToOneFoo()
	 * @generated
	 */
	void setOneToOneFoo(Foo value);

} // Bazzle
