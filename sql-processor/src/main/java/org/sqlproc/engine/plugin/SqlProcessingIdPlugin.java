package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlControl;

/**
 * The SQL Processor plugin devoted to the META SQL execution optimization.
 * 
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlProcessingIdPlugin extends Modifiers {

    /**
     * Used to construct the unique ID of the executed statement based on the input values combination.
     * 
     * @param name
     *            Name of the META SQL query or statement
     * @param dynamicInputValues
     *            the SQL statement dynamic parameters (input values)
     * @param sqlControl
     *            The compound parameters controlling the META SQL execution
     * @return the unique ID for processing case
     */
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl);
}
