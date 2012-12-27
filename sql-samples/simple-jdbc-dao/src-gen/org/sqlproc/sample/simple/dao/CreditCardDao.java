package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.CreditCard;

public interface CreditCardDao {
  
  public CreditCard insert(CreditCard creditCard, SqlControl sqlControl);
  
  public CreditCard insert(CreditCard creditCard);
  
  public CreditCard get(CreditCard creditCard, SqlControl sqlControl);
  	
  public CreditCard get(CreditCard creditCard);
  
  public int update(CreditCard creditCard, SqlControl sqlControl);
  
  public int update(CreditCard creditCard);
  
  public int delete(CreditCard creditCard, SqlControl sqlControl);
  
  public int delete(CreditCard creditCard);
  
  public List<CreditCard> list(CreditCard creditCard, SqlControl sqlControl);
  
  public List<CreditCard> list(CreditCard creditCard);
}
