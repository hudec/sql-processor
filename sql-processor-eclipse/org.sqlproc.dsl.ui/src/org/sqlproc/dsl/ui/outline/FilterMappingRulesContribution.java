/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.sqlproc.dsl.ui.outline;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

import com.google.inject.Inject;

public class FilterMappingRulesContribution extends AbstractFilterOutlineContribution {

    protected Logger LOGGER = Logger.getLogger(FilterMappingRulesContribution.class);

    @Inject
    private PluginImageHelper imageHelper;

    @Override
    protected boolean apply(IOutlineNode node) {
        boolean result = !(node instanceof EObjectNode)
                || !((EObjectNode) node).getEClass().equals(ProcessorDslPackage.Literals.MAPPING_RULE);
        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace("OUT " + node + " " + result);
        }
        return result;
    }

    @Override
    public String getPreferenceKey() {
        return "ui.outline.filterMappingRules";
    }

    @Override
    protected void configureAction(Action action) {
        action.setText("Hide mapping rules");
        action.setDescription("Hide mapping rules");
        action.setToolTipText("Hide mapping rules");
        action.setImageDescriptor(getImageDescriptor("icons/OUT.gif"));
    }

    protected ImageDescriptor getImageDescriptor(String imagePath) {
        return ImageDescriptor.createFromImage(imageHelper.getImage("OUT.gif"));
    }
}
