package org.sample.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class Contact implements Serializable {
    private final static long serialVersionUID = 1L;

    public final static String ORDER_BY_ID = "ID";

    public final static String ORDER_BY_PERSON = "PERSON";

    public Contact() {
    }

    public Contact(final Person person, final ContactType type, final String address) {
        super();
        setPerson(person);
        setType(type);
        setAddress(address);
    }

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Contact _setId(final Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    private Person person;

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(final Person person) {
        this.person = person;
    }

    public Contact _setPerson(final Person person) {
        this.person = person;
        return this;
    }

    @NotNull
    private ContactType type;

    public ContactType getType() {
        return this.type;
    }

    public void setType(final ContactType type) {
        this.type = type;
    }

    public Contact _setType(final ContactType type) {
        this.type = type;
        return this;
    }

    @NotNull
    @Size(max = 100)
    private String address;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Contact _setAddress(final String address) {
        this.address = address;
        return this;
    }

    @Size(max = 100)
    private String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact _setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Size(max = 100)
    private String xNote;

    public String getxNote() {
        return this.xNote;
    }

    public void setxNote(final String xNote) {
        this.xNote = xNote;
    }

    public Contact _setxNote(final String xNote) {
        this.xNote = xNote;
        return this;
    }

    private boolean onlyIds;

    public boolean isOnlyIds() {
        return this.onlyIds;
    }

    public void setOnlyIds(final boolean onlyIds) {
        this.onlyIds = onlyIds;
    }

    public Contact _setOnlyIds(final boolean onlyIds) {
        this.onlyIds = onlyIds;
        return this;
    }

    private List<Long> ids = new java.util.ArrayList<Long>();

    public List<Long> getIds() {
        return this.ids;
    }

    public void setIds(final List<Long> ids) {
        this.ids = ids;
    }

    public Contact _setIds(final List<Long> ids) {
        this.ids = ids;
        return this;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (id == null || !id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id != null) ? id.hashCode() : 0);
        return result;
    }

    public int hashCodeForAttributes() {
        int result = 1;
        result = 31 * result + ((id != null) ? id.hashCode() : 0);
        result = 31 * result + ((address != null) ? address.hashCode() : 0);
        result = 31 * result + ((phoneNumber != null) ? phoneNumber.hashCode() : 0);
        result = 31 * result + ((xNote != null) ? xNote.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", type=" + type + ", address=" + address + ", phoneNumber=" + phoneNumber
                + ", xNote=" + xNote + "]";
    }

    public String toStringFull() {
        return "Contact [id=" + id + ", person=" + person + ", type=" + type + ", address=" + address + ", phoneNumber="
                + phoneNumber + ", xNote=" + xNote + ", onlyIds=" + onlyIds + ", ids=" + ids + "]";
    }

    public enum Attribute {
        phoneNumber,

        xNote;
    }

    private Set<String> nullValues = new java.util.HashSet<String>();

    public void setNull(final Contact.Attribute... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (Attribute attribute : attributes)
            nullValues.add(attribute.name());
    }

    public Contact _setNull(final Contact.Attribute... attributes) {
        setNull(attributes);
        return this;
    }

    public void clearNull(final Contact.Attribute... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (Attribute attribute : attributes)
            nullValues.remove(attribute.name());
    }

    public Contact _clearNull(final Contact.Attribute... attributes) {
        clearNull(attributes);
        return this;
    }

    public void setNull(final String... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (String attribute : attributes)
            nullValues.add(attribute);
    }

    public Contact _setNull(final String... attributes) {
        setNull(attributes);
        return this;
    }

    public void clearNull(final String... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (String attribute : attributes)
            nullValues.remove(attribute);
    }

    public Contact _clearNull(final String... attributes) {
        clearNull(attributes);
        return this;
    }

    public Boolean isNull(final Contact.Attribute attribute) {
        if (attribute == null)
            throw new IllegalArgumentException();
        return nullValues.contains(attribute.name());
    }

    public Boolean isNull(final String attrName) {
        if (attrName == null)
            throw new IllegalArgumentException();
        return nullValues.contains(attrName);
    }

    public Boolean isDef(final String attrName, final Boolean isAttrNotNull) {
        if (attrName == null)
            throw new IllegalArgumentException();
        if (nullValues.contains(attrName))
            return true;
        if (isAttrNotNull != null)
            return isAttrNotNull;
        return false;
    }

    public void clearAllNull() {
        nullValues = new java.util.HashSet<String>();
    }

    public int hashCodeForNulls() {
        if (nullValues == null)
            return 0;
        int result = 1;
        for (Attribute attribute : Attribute.values()) {
            result = 31 * result + (nullValues.contains(attribute.name()) ? attribute.name().hashCode() : 0);
        }
        return result;
    }

    public enum Association {
        person;
    }

    private Set<String> initAssociations = new java.util.HashSet<String>();

    public Set<String> getInitAssociations() {
        return this.initAssociations;
    }

    public void setInitAssociations(final Set<String> initAssociations) {
        this.initAssociations = initAssociations;
    }

    public void setInit(final Contact.Association... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (Association association : associations)
            initAssociations.add(association.name());
    }

    public Contact _setInit(final Contact.Association... associations) {
        setInit(associations);
        return this;
    }

    public void clearInit(final Contact.Association... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (Association association : associations)
            initAssociations.remove(association.name());
    }

    public Contact _clearInit(final Contact.Association... associations) {
        clearInit(associations);
        return this;
    }

    public void setInit(final String... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (String association : associations)
            initAssociations.add(association);
    }

    public Contact _setInit(final String... associations) {
        setInit(associations);
        return this;
    }

    public void clearInit(final String... associations) {
        if (associations == null)
            throw new IllegalArgumentException();
        for (String association : associations)
            initAssociations.remove(association);
    }

    public Contact _clearInit(final String... associations) {
        clearInit(associations);
        return this;
    }

    public Boolean toInit(final Contact.Association association) {
        if (association == null)
            throw new IllegalArgumentException();
        return initAssociations.contains(association.name());
    }

    public Boolean toInit(final String association) {
        if (association == null)
            throw new IllegalArgumentException();
        return initAssociations.contains(association);
    }

    public void clearAllInit() {
        initAssociations = new java.util.HashSet<String>();
    }

    public int hashCodeForAssociations() {
        if (initAssociations == null)
            return 0;
        int result = 1;
        for (Association association : Association.values()) {
            result = 31 * result + (initAssociations.contains(association.name()) ? association.name().hashCode() : 0);
        }
        return result;
    }

    public enum OpAttribute {
        id,

        person,

        type,

        address,

        phoneNumber,

        xNote,

        onlyIds,

        ids;
    }

    private Map<String, String> operators = new java.util.HashMap<String, String>();

    public Map<String, String> getOperators() {
        return operators;
    }

    public void setOp(final String operator, final Contact.OpAttribute... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (OpAttribute attribute : attributes)
            operators.put(attribute.name(), operator);
    }

    public Contact _setOp(final String operator, final Contact.OpAttribute... attributes) {
        setOp(operator, attributes);
        return this;
    }

    public void clearOp(final Contact.OpAttribute... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (OpAttribute attribute : attributes)
            operators.remove(attribute.name());
    }

    public Contact _clearOp(final Contact.OpAttribute... attributes) {
        clearOp(attributes);
        return this;
    }

    public void setOp(final String operator, final String... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (String attribute : attributes)
            operators.put(attribute, operator);
    }

    public Contact _setOp(final String operator, final String... attributes) {
        setOp(operator, attributes);
        return this;
    }

    public void clearOp(final String... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (String attribute : attributes)
            operators.remove(attribute);
    }

    public Contact _clearOp(final String... attributes) {
        clearOp(attributes);
        return this;
    }

    public void setNullOp(final Contact.OpAttribute... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (OpAttribute attribute : attributes)
            operators.put(attribute.name(), "is null");
    }

    public Contact _setNullOp(final Contact.OpAttribute... attributes) {
        setNullOp(attributes);
        return this;
    }

    public void setNullOp(final String... attributes) {
        if (attributes == null)
            throw new IllegalArgumentException();
        for (String attribute : attributes)
            operators.put(attribute, "is null");
    }

    public Contact _setNullOp(final String... attributes) {
        setNullOp(attributes);
        return this;
    }

    public void clearAllOps() {
        operators = new java.util.HashMap<String, String>();
    }

    public int hashCodeForOperators() {
        if (operators == null)
            return 0;
        int result = 1;
        for (OpAttribute opAttribute : OpAttribute.values()) {
            result = 31 * result
                    + (operators.containsKey(opAttribute.name()) ? operators.get(opAttribute.name()).hashCode() : 0);
        }
        return result;
    }

    public String getProcessingId(final Object... moreAttributes) {
        if (ids != null)
            return null;
        StringBuilder result = new StringBuilder();
        result.append("BASE:").append(hashCodeForAttributes());
        result.append(",DEF:").append(hashCodeForNulls());
        result.append(",ASSOC:").append(hashCodeForAssociations());
        result.append(",OPER:").append(hashCodeForOperators());
        if (moreAttributes != null)
            result.append(",MORE:").append(java.util.Arrays.hashCode(moreAttributes));
        return result.toString();
    }
}
