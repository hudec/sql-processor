package org.sqlproc.engine.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.Date;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Types {

    Integer t_int;
    Long t_long;
    Byte t_byte;
    Short t_short;
    Float t_float;
    Double t_double;
    Character t_char;
    String t_string;
    Date t_date;
    Date t_time;
    Date t_datetime;
    Timestamp t_timestamp;
    Boolean t_boolean;
    BigInteger t_big_integer;
    BigDecimal t_big_decimal;
    byte[] a_byte;
    // char[] a_char;
    String a_text;
    Clob a_clob;
    Blob a_blob;

    public Integer getT_int() {
        return t_int;
    }

    public void setT_int(Integer t_int) {
        this.t_int = t_int;
    }

    public Long getT_long() {
        return t_long;
    }

    public void setT_long(Long t_long) {
        this.t_long = t_long;
    }

    public Byte getT_byte() {
        return t_byte;
    }

    public void setT_byte(Byte t_byte) {
        this.t_byte = t_byte;
    }

    public Short getT_short() {
        return t_short;
    }

    public void setT_short(Short t_short) {
        this.t_short = t_short;
    }

    public String getT_string() {
        return t_string;
    }

    public void setT_string(String t_string) {
        this.t_string = t_string;
    }

    public Float getT_float() {
        return t_float;
    }

    public void setT_float(Float t_float) {
        this.t_float = t_float;
    }

    public Double getT_double() {
        return t_double;
    }

    public void setT_double(Double t_double) {
        this.t_double = t_double;
    }

    public Character getT_char() {
        return t_char;
    }

    public void setT_char(Character t_char) {
        this.t_char = t_char;
    }

    public Date getT_date() {
        return t_date;
    }

    public void setT_date(Date t_date) {
        this.t_date = t_date;
    }

    public Date getT_time() {
        return t_time;
    }

    public void setT_time(Date t_time) {
        this.t_time = t_time;
    }

    public Date getT_datetime() {
        return t_datetime;
    }

    public void setT_datetime(Date t_datetime) {
        this.t_datetime = t_datetime;
    }

    public Timestamp getT_timestamp() {
        return t_timestamp;
    }

    public void setT_timestamp(Timestamp t_timestamp) {
        this.t_timestamp = t_timestamp;
    }

    public Boolean getT_boolean() {
        return t_boolean;
    }

    public void setT_boolean(Boolean t_boolean) {
        this.t_boolean = t_boolean;
    }

    public BigInteger getT_big_integer() {
        return t_big_integer;
    }

    public void setT_big_integer(BigInteger t_big_integer) {
        this.t_big_integer = t_big_integer;
    }

    public BigDecimal getT_big_decimal() {
        return t_big_decimal;
    }

    public void setT_big_decimal(BigDecimal t_big_decimal) {
        this.t_big_decimal = t_big_decimal;
    }

    public byte[] getA_byte() {
        return a_byte;
    }

    public void setA_byte(byte[] a_byte) {
        this.a_byte = a_byte;
    }

    // public char[] getA_char() {
    // return a_char;
    // }
    // public void setA_char(char[] a_char) {
    // this.a_char = a_char;
    // }

    public String getA_text() {
        return a_text;
    }

    public void setA_text(String a_text) {
        this.a_text = a_text;
    }

    public Clob getA_clob() {
        return a_clob;
    }

    public void setA_clob(Clob a_clob) {
        this.a_clob = a_clob;
    }

    public Blob getA_blob() {
        return a_blob;
    }

    public void setA_blob(Blob a_blob) {
        this.a_blob = a_blob;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException("Not allowed to change the id property.");
        }
        this.id = id;
    }

}
