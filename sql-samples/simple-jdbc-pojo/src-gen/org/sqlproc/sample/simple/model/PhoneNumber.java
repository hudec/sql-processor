package org.sqlproc.sample.simple.model;

public class PhoneNumber {
	
  public PhoneNumber() {
  }
  
  public PhoneNumber(int area, int exch, int ext) {
  setArea(area);
  setExch(exch);
  setExt(ext);
  }
  
  private int area;
    
  public int getArea() {
    return area;
  }
    
  public PhoneNumber setArea(int area) {
    this.area = area;
    return this;
  }
  
  private int exch;
    
  public int getExch() {
    return exch;
  }
    
  public PhoneNumber setExch(int exch) {
    this.exch = exch;
    return this;
  }
  
  private int ext;
    
  public int getExt() {
    return ext;
  }
    
  public PhoneNumber setExt(int ext) {
    this.ext = ext;
    return this;
  }
}
