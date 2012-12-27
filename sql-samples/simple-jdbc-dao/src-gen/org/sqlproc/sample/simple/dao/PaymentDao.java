package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Payment;

public interface PaymentDao {
  
  public Payment insert(Payment payment, SqlControl sqlControl);
  
  public Payment insert(Payment payment);
  
  public Payment get(Payment payment, SqlControl sqlControl);
  	
  public Payment get(Payment payment);
  
  public int update(Payment payment, SqlControl sqlControl);
  
  public int update(Payment payment);
  
  public int delete(Payment payment, SqlControl sqlControl);
  
  public int delete(Payment payment);
  
  public List<Payment> list(Payment payment, SqlControl sqlControl);
  
  public List<Payment> list(Payment payment);
}
