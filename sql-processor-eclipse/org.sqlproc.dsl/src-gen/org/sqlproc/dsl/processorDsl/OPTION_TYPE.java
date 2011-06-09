/**
 * <copyright>
 * </copyright>
 *

 */
package org.sqlproc.dsl.processorDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OPTION TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOPTION_TYPE()
 * @model
 * @generated
 */
public enum OPTION_TYPE implements Enumerator
{
  /**
   * The '<em><b>OPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPT_VALUE
   * @generated
   * @ordered
   */
  OPT(0, "OPT", "OPT"),

  /**
   * The '<em><b>LOPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOPT_VALUE
   * @generated
   * @ordered
   */
  LOPT(1, "LOPT", "LOPT"),

  /**
   * The '<em><b>IOPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IOPT_VALUE
   * @generated
   * @ordered
   */
  IOPT(2, "IOPT", "IOPT"),

  /**
   * The '<em><b>SOPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOPT_VALUE
   * @generated
   * @ordered
   */
  SOPT(3, "SOPT", "SOPT"),

  /**
   * The '<em><b>BOPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOPT_VALUE
   * @generated
   * @ordered
   */
  BOPT(4, "BOPT", "BOPT");

  /**
   * The '<em><b>OPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPT
   * @model
   * @generated
   * @ordered
   */
  public static final int OPT_VALUE = 0;

  /**
   * The '<em><b>LOPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOPT
   * @model
   * @generated
   * @ordered
   */
  public static final int LOPT_VALUE = 1;

  /**
   * The '<em><b>IOPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IOPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IOPT
   * @model
   * @generated
   * @ordered
   */
  public static final int IOPT_VALUE = 2;

  /**
   * The '<em><b>SOPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOPT
   * @model
   * @generated
   * @ordered
   */
  public static final int SOPT_VALUE = 3;

  /**
   * The '<em><b>BOPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOPT
   * @model
   * @generated
   * @ordered
   */
  public static final int BOPT_VALUE = 4;

  /**
   * An array of all the '<em><b>OPTION TYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OPTION_TYPE[] VALUES_ARRAY =
    new OPTION_TYPE[]
    {
      OPT,
      LOPT,
      IOPT,
      SOPT,
      BOPT,
    };

  /**
   * A public read-only list of all the '<em><b>OPTION TYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OPTION_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>OPTION TYPE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OPTION_TYPE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OPTION_TYPE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OPTION TYPE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OPTION_TYPE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OPTION_TYPE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OPTION TYPE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OPTION_TYPE get(int value)
  {
    switch (value)
    {
      case OPT_VALUE: return OPT;
      case LOPT_VALUE: return LOPT;
      case IOPT_VALUE: return IOPT;
      case SOPT_VALUE: return SOPT;
      case BOPT_VALUE: return BOPT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OPTION_TYPE(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OPTION_TYPE
