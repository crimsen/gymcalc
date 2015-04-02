/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.addressbook;

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
 * @see de.gymcalc.addressbook.AddressBookFactory
 * @model kind="package"
 * @generated
 */
public interface AddressBookPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "addressbook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gymcalc.de/addressbook/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "addressbook";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddressBookPackage eINSTANCE = de.gymcalc.addressbook.impl.AddressBookPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.gymcalc.addressbook.impl.AddressBookTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.addressbook.impl.AddressBookTypeImpl
	 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getAddressBookType()
	 * @generated
	 */
	int ADDRESS_BOOK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_TYPE__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_TYPE__ORGANIZATION = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.addressbook.impl.PersonTypeImpl <em>Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.addressbook.impl.PersonTypeImpl
	 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getPersonType()
	 * @generated
	 */
	int PERSON_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__FIRSTNAME = 2;

	/**
	 * The feature id for the '<em><b>Dateofbirth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__DATEOFBIRTH = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.gymcalc.addressbook.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.addressbook.impl.OrganizationTypeImpl
	 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Organization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.addressbook.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.addressbook.impl.AddressTypeImpl
	 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CITY = 0;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ZIP = 1;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STREET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link de.gymcalc.addressbook.AddressBookType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.gymcalc.addressbook.AddressBookType
	 * @generated
	 */
	EClass getAddressBookType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.addressbook.AddressBookType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see de.gymcalc.addressbook.AddressBookType#getAddress()
	 * @see #getAddressBookType()
	 * @generated
	 */
	EReference getAddressBookType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.addressbook.AddressBookType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see de.gymcalc.addressbook.AddressBookType#getPerson()
	 * @see #getAddressBookType()
	 * @generated
	 */
	EReference getAddressBookType_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.addressbook.AddressBookType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see de.gymcalc.addressbook.AddressBookType#getOrganization()
	 * @see #getAddressBookType()
	 * @generated
	 */
	EReference getAddressBookType_Organization();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.addressbook.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type</em>'.
	 * @see de.gymcalc.addressbook.PersonType
	 * @generated
	 */
	EClass getPersonType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.PersonType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.addressbook.PersonType#getId()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.PersonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.addressbook.PersonType#getName()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.PersonType#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see de.gymcalc.addressbook.PersonType#getFirstname()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.PersonType#getDateofbirth <em>Dateofbirth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateofbirth</em>'.
	 * @see de.gymcalc.addressbook.PersonType#getDateofbirth()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Dateofbirth();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.addressbook.PersonType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.gymcalc.addressbook.PersonType#getAddress()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Address();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.addressbook.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Type</em>'.
	 * @see de.gymcalc.addressbook.OrganizationType
	 * @generated
	 */
	EClass getOrganizationType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.OrganizationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.addressbook.OrganizationType#getId()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.OrganizationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.addressbook.OrganizationType#getName()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EAttribute getOrganizationType_Name();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.addressbook.OrganizationType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.gymcalc.addressbook.OrganizationType#getAddress()
	 * @see #getOrganizationType()
	 * @generated
	 */
	EReference getOrganizationType_Address();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.addressbook.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see de.gymcalc.addressbook.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.AddressType#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see de.gymcalc.addressbook.AddressType#getCity()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_City();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.AddressType#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see de.gymcalc.addressbook.AddressType#getZip()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Zip();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.AddressType#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see de.gymcalc.addressbook.AddressType#getStreet()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Street();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.addressbook.AddressType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.addressbook.AddressType#getId()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddressBookFactory getAddressBookFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link de.gymcalc.addressbook.impl.AddressBookTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.addressbook.impl.AddressBookTypeImpl
		 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getAddressBookType()
		 * @generated
		 */
		EClass ADDRESS_BOOK_TYPE = eINSTANCE.getAddressBookType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_BOOK_TYPE__ADDRESS = eINSTANCE.getAddressBookType_Address();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_BOOK_TYPE__PERSON = eINSTANCE.getAddressBookType_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_BOOK_TYPE__ORGANIZATION = eINSTANCE.getAddressBookType_Organization();

		/**
		 * The meta object literal for the '{@link de.gymcalc.addressbook.impl.PersonTypeImpl <em>Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.addressbook.impl.PersonTypeImpl
		 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getPersonType()
		 * @generated
		 */
		EClass PERSON_TYPE = eINSTANCE.getPersonType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__ID = eINSTANCE.getPersonType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__NAME = eINSTANCE.getPersonType_Name();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__FIRSTNAME = eINSTANCE.getPersonType_Firstname();

		/**
		 * The meta object literal for the '<em><b>Dateofbirth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__DATEOFBIRTH = eINSTANCE.getPersonType_Dateofbirth();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__ADDRESS = eINSTANCE.getPersonType_Address();

		/**
		 * The meta object literal for the '{@link de.gymcalc.addressbook.impl.OrganizationTypeImpl <em>Organization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.addressbook.impl.OrganizationTypeImpl
		 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getOrganizationType()
		 * @generated
		 */
		EClass ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__ID = eINSTANCE.getOrganizationType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_TYPE__NAME = eINSTANCE.getOrganizationType_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_TYPE__ADDRESS = eINSTANCE.getOrganizationType_Address();

		/**
		 * The meta object literal for the '{@link de.gymcalc.addressbook.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.addressbook.impl.AddressTypeImpl
		 * @see de.gymcalc.addressbook.impl.AddressBookPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__CITY = eINSTANCE.getAddressType_City();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ZIP = eINSTANCE.getAddressType_Zip();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__STREET = eINSTANCE.getAddressType_Street();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ID = eINSTANCE.getAddressType_Id();

	}

} //AddressBookPackage
