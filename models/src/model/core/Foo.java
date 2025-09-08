/**
 */
package model.core;

import java.util.Date;

import model.core.CapitalizedPackage.ClassInCapitalizedPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.core.Foo#getGroup <em>Group</em>}</li>
 *   <li>{@link model.core.Foo#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link model.core.Foo#getFooClass <em>Foo Class</em>}</li>
 *   <li>{@link model.core.Foo#getRange <em>Range</em>}</li>
 *   <li>{@link model.core.Foo#getBars <em>Bars</em>}</li>
 *   <li>{@link model.core.Foo#getOneToOneBazzle <em>One To One Bazzle</em>}</li>
 *   <li>{@link model.core.Foo#getManyAttribute <em>Many Attribute</em>}</li>
 *   <li>{@link model.core.Foo#getUnchangeableAttribute <em>Unchangeable Attribute</em>}</li>
 *   <li>{@link model.core.Foo#getUnchangeableReference <em>Unchangeable Reference</em>}</li>
 *   <li>{@link model.core.Foo#getTransientAttribute <em>Transient Attribute</em>}</li>
 *   <li>{@link model.core.Foo#getTransientReference <em>Transient Reference</em>}</li>
 *   <li>{@link model.core.Foo#getVolatileAttribute <em>Volatile Attribute</em>}</li>
 *   <li>{@link model.core.Foo#getVolatileReference <em>Volatile Reference</em>}</li>
 *   <li>{@link model.core.Foo#getManyCrossAggregate <em>Many Cross Aggregate</em>}</li>
 *   <li>{@link model.core.Foo#getManyCrossAggregateNested <em>Many Cross Aggregate Nested</em>}</li>
 *   <li>{@link model.core.Foo#getManyValueObjects <em>Many Value Objects</em>}</li>
 *   <li>{@link model.core.Foo#getOneToOneContainment <em>One To One Containment</em>}</li>
 *   <li>{@link model.core.Foo#getOwnedFoos <em>Owned Foos</em>}</li>
 *   <li>{@link model.core.Foo#getSubpackageReference <em>Subpackage Reference</em>}</li>
 *   <li>{@link model.core.Foo#getContainedThingsWithNoID <em>Contained Things With No ID</em>}</li>
 *   <li>{@link model.core.Foo#getContainedThingsWithNoID2 <em>Contained Things With No ID2</em>}</li>
 * </ul>
 *
 * @see model.core.CorePackage#getFoo()
 * @model
 * @generated
 */
public interface Foo extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(FooGroup)
	 * @see model.core.CorePackage#getFoo_Group()
	 * @model
	 * @generated
	 */
	FooGroup getGroup();

	/**
	 * Sets the value of the '{@link model.core.Foo#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(FooGroup value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see model.core.CorePackage#getFoo_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link model.core.Foo#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Foo Class</b></em>' attribute.
	 * The literals are from the enumeration {@link model.core.FooClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo Class</em>' attribute.
	 * @see model.core.FooClass
	 * @see #setFooClass(FooClass)
	 * @see model.core.CorePackage#getFoo_FooClass()
	 * @model
	 * @generated
	 */
	FooClass getFooClass();

	/**
	 * Sets the value of the '{@link model.core.Foo#getFooClass <em>Foo Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo Class</em>' attribute.
	 * @see model.core.FooClass
	 * @see #getFooClass()
	 * @generated
	 */
	void setFooClass(FooClass value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(BoundedNumber)
	 * @see model.core.CorePackage#getFoo_Range()
	 * @model containment="true"
	 * @generated
	 */
	BoundedNumber getRange();

	/**
	 * Sets the value of the '{@link model.core.Foo#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(BoundedNumber value);

	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.Bar}.
	 * It is bidirectional and its opposite is '{@link model.core.Bar#getFoo <em>Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see model.core.CorePackage#getFoo_Bars()
	 * @see model.core.Bar#getFoo
	 * @model opposite="foo" containment="true"
	 * @generated
	 */
	EList<Bar> getBars();

	/**
	 * Returns the value of the '<em><b>One To One Bazzle</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.core.Bazzle#getOneToOneFoo <em>One To One Foo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To One Bazzle</em>' reference.
	 * @see #setOneToOneBazzle(Bazzle)
	 * @see model.core.CorePackage#getFoo_OneToOneBazzle()
	 * @see model.core.Bazzle#getOneToOneFoo
	 * @model opposite="oneToOneFoo"
	 * @generated
	 */
	Bazzle getOneToOneBazzle();

	/**
	 * Sets the value of the '{@link model.core.Foo#getOneToOneBazzle <em>One To One Bazzle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To One Bazzle</em>' reference.
	 * @see #getOneToOneBazzle()
	 * @generated
	 */
	void setOneToOneBazzle(Bazzle value);

	/**
	 * Returns the value of the '<em><b>Many Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Attribute</em>' attribute list.
	 * @see model.core.CorePackage#getFoo_ManyAttribute()
	 * @model
	 * @generated
	 */
	EList<String> getManyAttribute();

	/**
	 * Returns the value of the '<em><b>Unchangeable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Attribute</em>' attribute.
	 * @see model.core.CorePackage#getFoo_UnchangeableAttribute()
	 * @model changeable="false"
	 * @generated
	 */
	String getUnchangeableAttribute();

	/**
	 * Returns the value of the '<em><b>Unchangeable Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Reference</em>' containment reference.
	 * @see model.core.CorePackage#getFoo_UnchangeableReference()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	Bazzle getUnchangeableReference();

	/**
	 * Returns the value of the '<em><b>Transient Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Attribute</em>' attribute.
	 * @see #setTransientAttribute(String)
	 * @see model.core.CorePackage#getFoo_TransientAttribute()
	 * @model transient="true"
	 * @generated
	 */
	String getTransientAttribute();

	/**
	 * Sets the value of the '{@link model.core.Foo#getTransientAttribute <em>Transient Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Attribute</em>' attribute.
	 * @see #getTransientAttribute()
	 * @generated
	 */
	void setTransientAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Reference</em>' reference.
	 * @see #setTransientReference(Foo)
	 * @see model.core.CorePackage#getFoo_TransientReference()
	 * @model transient="true"
	 * @generated
	 */
	Foo getTransientReference();

	/**
	 * Sets the value of the '{@link model.core.Foo#getTransientReference <em>Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Reference</em>' reference.
	 * @see #getTransientReference()
	 * @generated
	 */
	void setTransientReference(Foo value);

	/**
	 * Returns the value of the '<em><b>Volatile Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile Attribute</em>' attribute.
	 * @see #setVolatileAttribute(String)
	 * @see model.core.CorePackage#getFoo_VolatileAttribute()
	 * @model volatile="true"
	 * @generated
	 */
	String getVolatileAttribute();

	/**
	 * Sets the value of the '{@link model.core.Foo#getVolatileAttribute <em>Volatile Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile Attribute</em>' attribute.
	 * @see #getVolatileAttribute()
	 * @generated
	 */
	void setVolatileAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Volatile Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile Reference</em>' reference.
	 * @see #setVolatileReference(Foo)
	 * @see model.core.CorePackage#getFoo_VolatileReference()
	 * @model volatile="true"
	 * @generated
	 */
	Foo getVolatileReference();

	/**
	 * Sets the value of the '{@link model.core.Foo#getVolatileReference <em>Volatile Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile Reference</em>' reference.
	 * @see #getVolatileReference()
	 * @generated
	 */
	void setVolatileReference(Foo value);

	/**
	 * Returns the value of the '<em><b>Many Cross Aggregate</b></em>' reference list.
	 * The list contents are of type {@link model.core.Foo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Cross Aggregate</em>' reference list.
	 * @see model.core.CorePackage#getFoo_ManyCrossAggregate()
	 * @model
	 * @generated
	 */
	EList<Foo> getManyCrossAggregate();

	/**
	 * Returns the value of the '<em><b>Many Cross Aggregate Nested</b></em>' reference list.
	 * The list contents are of type {@link model.core.Bar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Cross Aggregate Nested</em>' reference list.
	 * @see model.core.CorePackage#getFoo_ManyCrossAggregateNested()
	 * @model
	 * @generated
	 */
	EList<Bar> getManyCrossAggregateNested();

	/**
	 * Returns the value of the '<em><b>Many Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.BoundedNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many Value Objects</em>' containment reference list.
	 * @see model.core.CorePackage#getFoo_ManyValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundedNumber> getManyValueObjects();

	/**
	 * Returns the value of the '<em><b>One To One Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To One Containment</em>' containment reference.
	 * @see #setOneToOneContainment(Bazzle)
	 * @see model.core.CorePackage#getFoo_OneToOneContainment()
	 * @model containment="true"
	 * @generated
	 */
	Bazzle getOneToOneContainment();

	/**
	 * Sets the value of the '{@link model.core.Foo#getOneToOneContainment <em>One To One Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To One Containment</em>' containment reference.
	 * @see #getOneToOneContainment()
	 * @generated
	 */
	void setOneToOneContainment(Bazzle value);

	/**
	 * Returns the value of the '<em><b>Owned Foos</b></em>' reference list.
	 * The list contents are of type {@link model.core.Foo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Foos</em>' reference list.
	 * @see model.core.CorePackage#getFoo_OwnedFoos()
	 * @model
	 * @generated
	 */
	EList<Foo> getOwnedFoos();

	/**
	 * Returns the value of the '<em><b>Subpackage Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage Reference</em>' reference.
	 * @see #setSubpackageReference(ClassInCapitalizedPackage)
	 * @see model.core.CorePackage#getFoo_SubpackageReference()
	 * @model
	 * @generated
	 */
	ClassInCapitalizedPackage getSubpackageReference();

	/**
	 * Sets the value of the '{@link model.core.Foo#getSubpackageReference <em>Subpackage Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subpackage Reference</em>' reference.
	 * @see #getSubpackageReference()
	 * @generated
	 */
	void setSubpackageReference(ClassInCapitalizedPackage value);

	/**
	 * Returns the value of the '<em><b>Contained Things With No ID</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.ThingWithoutID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Things With No ID</em>' containment reference list.
	 * @see model.core.CorePackage#getFoo_ContainedThingsWithNoID()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThingWithoutID> getContainedThingsWithNoID();

	/**
	 * Returns the value of the '<em><b>Contained Things With No ID2</b></em>' containment reference list.
	 * The list contents are of type {@link model.core.ThingWithoutID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Things With No ID2</em>' containment reference list.
	 * @see model.core.CorePackage#getFoo_ContainedThingsWithNoID2()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThingWithoutID> getContainedThingsWithNoID2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Foo copyFoo();

} // Foo
