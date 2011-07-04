package org.sqlproc.sample.simple.model;

public final class PhoneNumber {
    private final int area; // area code (3 digits)
    private final int exch; // exchange (3 digits)
    private final int ext; // extension (4 digits)

    public PhoneNumber(int area, int exch, int ext) {
        this.area = area;
        this.exch = exch;
        this.ext = ext;
    }

    public int getArea() {
        return area;
    }

    public int getExch() {
        return exch;
    }

    public int getExt() {
        return ext;
    }

    // how you're supposed to implement equals
    public boolean equals(Object y) {
        if (y == this) {
            return true;
        }
        if (y == null) {
            return false;
        }
        if (y.getClass() != this.getClass()) {
            return false;
        }
        PhoneNumber a = this;
        PhoneNumber b = (PhoneNumber) y;
        return (a.area == b.area) && (a.exch == b.exch) && (a.ext == b.ext);
    }

    // 0 for padding with leading 0s
    public String toString() {
        return String.format("%03d-%03d-%04d", area, exch, ext);
    }

    // satisfies the hashCode contract
    public int hashCode() {
        return 10007 * (area + 1009 * exch) + ext;
    }
}