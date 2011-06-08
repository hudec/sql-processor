
package org.sqlproc.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProcessorDslStandaloneSetup extends ProcessorDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ProcessorDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

