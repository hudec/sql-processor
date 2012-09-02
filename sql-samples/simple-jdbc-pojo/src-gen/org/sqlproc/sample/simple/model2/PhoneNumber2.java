package org.sqlproc.sample.simple.model2;

public class PhoneNumber2 {
	
  public PhoneNumber2() {
  }
  
  public PhoneNumber2(int area, int exch, int ext) {
  setArea(area);
  setExch(exch);
  setExt(ext);
  }
  
  private int area;
    
  public int getArea() {
    return area;
  }
    
  public PhoneNumber2 setArea(int area) {
    this.area = area;
    return this;
  }
  
  private int exch;
    
  public int getExch() {
    return exch;
  }
    
  public PhoneNumber2 setExch(int exch) {
    this.exch = exch;
    return this;
  }
  
  private int ext;
    
  public int getExt() {
    return ext;
  }
    
  public PhoneNumber2 setExt(int ext) {
    this.ext = ext;
    return this;
  }
}
