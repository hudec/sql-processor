package org.sqlproc.engine.hibernate.type;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.type.PrimitiveType;
import org.hibernate.type.VersionType;
import org.hibernate.type.descriptor.ValueExtractor;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.java.LongTypeDescriptor;
import org.hibernate.type.descriptor.sql.BasicExtractor;
import org.hibernate.type.descriptor.sql.BigIntTypeDescriptor;
import org.sqlproc.engine.type.SqlLongType;

/**
 * The Hibernate META type LONG.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateLongType extends SqlLongType {
    /**
     * The extended Hibernate type LONG.
     */
    static public class MyBigIntTypeDescriptor extends BigIntTypeDescriptor {
        public static final MyBigIntTypeDescriptor INSTANCE = new MyBigIntTypeDescriptor();

        @Override
        public <X> ValueExtractor<X> getExtractor(final JavaTypeDescriptor<X> javaTypeDescriptor) {
            return new BasicExtractor<X>(javaTypeDescriptor, this) {
                @Override
                protected X doExtract(ResultSet rs, String name, WrapperOptions options) throws SQLException {
                    if (Character.isDigit(name.charAt(0)))
                        return javaTypeDescriptor.wrap(rs.getLong(Integer.parseInt(name)), options);
                    else
                        return javaTypeDescriptor.wrap(rs.getLong(name), options);
                }

                @Override
                protected X doExtract(CallableStatement statement, int index, WrapperOptions options)
                        throws SQLException {
                    return javaTypeDescriptor.wrap(statement.getLong(index), options);
                }

                @Override
                protected X doExtract(CallableStatement statement, String name, WrapperOptions options)
                        throws SQLException {
                    if (Character.isDigit(name.charAt(0)))
                        return javaTypeDescriptor.wrap(statement.getLong(Integer.parseInt(name)), options);
                    else
                        return javaTypeDescriptor.wrap(statement.getLong(name), options);
                }
            };
        }
    };

    static public class MyLongType extends AbstractSingleColumnStandardBasicType<Long>
            implements PrimitiveType<Long>, DiscriminatorType<Long>, VersionType<Long> {

        public static final MyLongType INSTANCE = new MyLongType();

        private static final Long ZERO = (long) 0;

        public MyLongType() {
            super(MyBigIntTypeDescriptor.INSTANCE, LongTypeDescriptor.INSTANCE);
        }

        @Override
        public String getName() {
            return "long";
        }

        @Override
        public String[] getRegistrationKeys() {
            return new String[] { getName(), long.class.getName(), Long.class.getName() };
        }

        @Override
        public Serializable getDefaultValue() {
            return ZERO;
        }

        @Override
        public Class getPrimitiveClass() {
            return long.class;
        }

        @Override
        public Long stringToObject(String xml) throws Exception {
            return new Long(xml);
        }

        @Override
        public Long next(Long current, SharedSessionContractImplementor session) {
            return Long.valueOf(current.longValue() + 1);
        }

        @Override
        public Long seed(SharedSessionContractImplementor session) {
            return ZERO;
        }

        @Override
        public Comparator<Long> getComparator() {
            return getJavaTypeDescriptor().getComparator();
        }

        @Override
        public String objectToSQLString(Long value, Dialect dialect) throws Exception {
            return value.toString();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Long.class, long.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return MyLongType.INSTANCE;
    }
}
