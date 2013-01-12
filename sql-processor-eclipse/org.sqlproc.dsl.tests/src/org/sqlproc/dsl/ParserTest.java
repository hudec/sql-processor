package org.sqlproc.dsl;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sqlproc.dsl.processorDsl.Artifacts;

import com.google.inject.Inject;

@InjectWith(ProcessorDslInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest {

    @Inject
    ParseHelper<Artifacts> parser;

    @Test
    public void parseModel() throws Exception {
        Artifacts artifacts = parser.parse("resolve-pojo-on");
        assertEquals("resolve-pojo-on", artifacts.getProperties().get(0).getName());
    }
}
