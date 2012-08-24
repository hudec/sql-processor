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
    
  public void setArea(int area) {
    this.area = area;
  }
  
  private int exch;
    
  public int getExch() {
    return exch;
  }
    
  public void setExch(int exch) {
    this.exch = exch;
  }
  
  private int ext;
    
  public int getExt() {
    return ext;
  }
    
  public void setExt(int ext) {
    this.ext = ext;
  }
}
