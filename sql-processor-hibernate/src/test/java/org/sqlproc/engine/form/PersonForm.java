package org.sqlproc.engine.form;

import java.util.Date;
import java.util.Set;

import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Size;

public class PersonForm {
    private Long id;
    private Date birthDate;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private Gender sex;
    private SsnForm ssn;
    private Size clothesSize;
    private PersonNameForm name;
    private Set<Long> idSet;
    private Set<Gender> sexs;
    private Set<Size> clothesSizes;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public SsnForm getSsn() {
        return ssn;
    }

    public void setSsn(SsnForm ssn) {
        this.ssn = ssn;
    }

    public PersonNameForm getName() {
        return name;
    }

    public void setName(PersonNameForm name) {
        this.name = name;
    }

    public Set<Long> getIdSet() {
        return idSet;
    }

    public void setIdSet(Set<Long> idSet) {
        this.idSet = idSet;
    }

    public Set<Gender> getSexs() {
        return sexs;
    }

    public void setSexs(Set<Gender> sexs) {
        this.sexs = sexs;
    }

    public Size getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

    public Set<Size> getClothesSizes() {
        return clothesSizes;
    }

    public void setClothesSizes(Set<Size> clothesSizes) {
        this.clothesSizes = clothesSizes;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
