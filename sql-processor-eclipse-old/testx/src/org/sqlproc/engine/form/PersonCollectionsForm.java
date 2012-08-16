package org.sqlproc.engine.form;

import java.util.Set;

public class PersonCollectionsForm {
    private Set<Long> idSet;
    private Set<String> updatedBySet;
    private NameCollectionsForm names;

    public Set<Long> getIdSet() {
        return idSet;
    }

    public void setIdSet(Set<Long> idSet) {
        this.idSet = idSet;
    }

    public Set<String> getUpdatedBySet() {
        return updatedBySet;
    }

    public void setUpdatedBySet(Set<String> updatedBySet) {
        this.updatedBySet = updatedBySet;
    }

    public NameCollectionsForm getNames() {
        return names;
    }

    public void setNames(NameCollectionsForm names) {
        this.names = names;
    }
}
