package org.sqlproc.engine.impl;

/**
 * Every parser error is encapsulated into the instance of this class.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class ErrorMsg {

    private String msg;
    private int start;
    private int length;
    private int line;

    public ErrorMsg(String msg, int start, int length, int line) {
        super();
        this.msg = msg;
        this.start = start;
        this.length = length;
        this.line = line;
    }

    public int getLength() {
        return length;
    }

    public int getLine() {
        return line;
    }

    public String getMsg() {
        return msg;
    }

    public int getStart() {
        return start;
    }

    @Override
    public String toString() {
        return msg + " (line:" + line + ", start:" + start + ", length:" + length + ")";
    }
}
