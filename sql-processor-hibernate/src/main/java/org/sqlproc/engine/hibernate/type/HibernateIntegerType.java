package org.sqlproc.engine.hibernate.type;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.type.PrimitiveType;
import org.hibernate.type.VersionType;
import org.hibernate.type.descriptor.ValueExtractor;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.BasicExtractor;
import org.hibernate.type.descriptor.sql.IntegerTypeDescriptor;
import org.sqlproc.engine.type.SqlIntegerType;

/**
 * The Hibernate META type INTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateIntegerType extends SqlIntegerType {
    /**
     * The extended Hibernate type INTEGER.
     */
    static public class MyIntegerTypeDescriptor extends IntegerTypeDescriptor {
        public static final MyIntegerTypeDescriptor INSTANCE = new MyIntegerTypeDescriptor();

        @Override
        public <X> ValueExtractor<X> getExtractor(final JavaTypeDescriptor<X> javaTypeDescriptor) {
            return new BasicExtractor<X>(javaTypeDescriptor, this) {
                @Override
                protected X doExtract(ResultSet rs, String name, WrapperOptions options) throws SQLException {
                    if (Character.isDigit(name.charAt(0)))
                        return javaTypeDescriptor.wrap(rs.getInt(Integer.parseInt(name)), options);
                    else
                        return javaTypeDescriptor.wrap(rs.getInt(name), options);
                }

                // @Override
                // protected X doExtract(CallableStatement statement, int index, WrapperOptions options)
                // throws SQLException {
                // return javaTypeDescriptor.wrap(statement.getInt(index), options);
                // }
                //
                // @Override
                // protected X doExtract(CallableStatement statement, String name, WrapperOptions options)
                // throws SQLException {
                // if (Character.isDigit(name.charAt(0)))
                // return javaTypeDescriptor.wrap(statement.getInt(Integer.parseInt(name)), options);
                // else
                // return javaTypeDescriptor.wrap(statement.getInt(name), options);
                // }
            };
        }
    }

    static public class MyIntegerType extends AbstractSingleColumnStandardBasicType<Integer>
            implements PrimitiveType<Integer>, DiscriminatorType<Integer>, VersionType<Integer> {

        public static final MyIntegerType INSTANCE = new MyIntegerType();

        @SuppressWarnings({ "UnnecessaryBoxing" })
        public static final Integer ZERO = Integer.valueOf(0);

        public MyIntegerType() {
            super(MyIntegerTypeDescriptor.INSTANCE, org.hibernate.type.descriptor.java.IntegerTypeDescriptor.INSTANCE);
        }

        public String getName() {
            return "integer";
        }

        @Override
        public String[] getRegistrationKeys() {
            return new String[] { getName(), int.class.getName(), Integer.class.getName() };
        }

        public Serializable getDefaultValue() {
            return ZERO;
        }

        public Class getPrimitiveClass() {
            return int.class;
        }

        public String objectToSQLString(Integer value, Dialect dialect) throws Exception {
            return toString(value);
        }

        public Integer stringToObject(String xml) {
            return fromString(xml);
        }

        public Integer seed(SessionImplementor session) {
            return ZERO;
        }

        @SuppressWarnings({ "UnnecessaryBoxing", "UnnecessaryUnboxing" })
        public Integer next(Integer current, SessionImplementor session) {
            return Integer.valueOf(current.intValue() + 1);
        }

        public Comparator<Integer> getComparator() {
            return getJavaTypeDescriptor().getComparator();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Integer.class, int.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return MyIntegerType.INSTANCE;
    }
}
