package org.sqlproc.engine.form;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.Date;

public class TypesTransport {

    int n_int;
    Integer t_int;
    long n_long;
    Long t_long;
    byte n_byte;
    Byte t_byte;
    short n_short;
    Short t_short;
    float n_float;
    Float t_float;
    double n_double;
    Double t_double;
    char n_char;
    Character t_char;
    String t_string;
    java.sql.Time t_time;
    java.sql.Date t_date;
    Date t_datetime;
    Timestamp t_timestamp;
    boolean n_boolean;
    Boolean t_boolean;
    BigInteger t_big_integer;
    BigDecimal t_big_decimal;
    byte[] an_byte;
    Byte[] at_byte;
    String a_text;
    Clob a_clob;
    Blob a_blob;

    public int getN_int() {
        return n_int;
    }

    public void setN_int(int n_int) {
        this.n_int = n_int;
    }

    public Integer getT_int() {
        return t_int;
    }

    public void setT_int(Integer t_int) {
        this.t_int = t_int;
    }

    public long getN_long() {
        return n_long;
    }

    public void setN_long(long n_long) {
        this.n_long = n_long;
    }

    public Long getT_long() {
        return t_long;
    }

    public void setT_long(Long t_long) {
        this.t_long = t_long;
    }

    public byte getN_byte() {
        return n_byte;
    }

    public void setN_byte(byte n_byte) {
        this.n_byte = n_byte;
    }

    public Byte getT_byte() {
        return t_byte;
    }

    public void setT_byte(Byte t_byte) {
        this.t_byte = t_byte;
    }

    public short getN_short() {
        return n_short;
    }

    public void setN_short(short n_short) {
        this.n_short = n_short;
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

    public float getN_float() {
        return n_float;
    }

    public void setN_float(float n_float) {
        this.n_float = n_float;
    }

    public Float getT_float() {
        return t_float;
    }

    public void setT_float(Float t_float) {
        this.t_float = t_float;
    }

    public double getN_double() {
        return n_double;
    }

    public void setN_double(double n_double) {
        this.n_double = n_double;
    }

    public Double getT_double() {
        return t_double;
    }

    public void setT_double(Double t_double) {
        this.t_double = t_double;
    }

    public char getN_char() {
        return n_char;
    }

    public void setN_char(char n_char) {
        this.n_char = n_char;
    }

    public Character getT_char() {
        return t_char;
    }

    public void setT_char(Character t_char) {
        this.t_char = t_char;
    }

    public java.sql.Time getT_time() {
        return t_time;
    }

    public void setT_time(java.sql.Time t_time) {
        this.t_time = t_time;
    }

    public java.sql.Date getT_date() {
        return t_date;
    }

    public void setT_date(java.sql.Date t_date) {
        this.t_date = t_date;
    }

    public Timestamp getT_timestamp() {
        return t_timestamp;
    }

    public void setT_timestamp(Timestamp t_timestamp) {
        this.t_timestamp = t_timestamp;
    }

    public boolean isN_boolean() {
        return n_boolean;
    }

    public void setN_boolean(boolean n_boolean) {
        this.n_boolean = n_boolean;
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

    public byte[] getAn_byte() {
        return an_byte;
    }

    public void setAn_byte(byte[] an_byte) {
        this.an_byte = an_byte;
    }

    public Byte[] getAt_byte() {
        return at_byte;
    }

    public void setAt_byte(Byte[] at_byte) {
        this.at_byte = at_byte;
    }

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

    public Date getT_datetime() {
        return t_datetime;
    }

    public void setT_datetime(Date t_datetime) {
        this.t_datetime = t_datetime;
    }
}
