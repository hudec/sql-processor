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
                    if (Character.isDigit(name.charAt(0))) {
                        return javaTypeDescriptor.wrap(rs.getLong(Integer.parseInt(name)), options);
                    } else {
                        return javaTypeDescriptor.wrap(rs.getLong(name), options);
                    }
                }
            };
        }
    };

    static public class MyLongType extends AbstractSingleColumnStandardBasicType<Long>
            implements PrimitiveType<Long>, DiscriminatorType<Long>, VersionType<Long> {

        public static final MyLongType INSTANCE = new MyLongType();

        @SuppressWarnings({ "UnnecessaryBoxing" })
        private static final Long ZERO = Long.valueOf(0);

        public MyLongType() {
            super(MyBigIntTypeDescriptor.INSTANCE, LongTypeDescriptor.INSTANCE);
        }

        public String getName() {
            return "long";
        }

        @Override
        public String[] getRegistrationKeys() {
            return new String[] { getName(), long.class.getName(), Long.class.getName() };
        }

        public Serializable getDefaultValue() {
            return ZERO;
        }

        public Class getPrimitiveClass() {
            return long.class;
        }

        public Long stringToObject(String xml) throws Exception {
            return new Long(xml);
        }

        @SuppressWarnings({ "UnnecessaryBoxing", "UnnecessaryUnboxing" })
        public Long next(Long current, SessionImplementor session) {
            return Long.valueOf(current.longValue() + 1);
        }

        public Long seed(SessionImplementor session) {
            return ZERO;
        }

        public Comparator<Long> getComparator() {
            return getJavaTypeDescriptor().getComparator();
        }

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
