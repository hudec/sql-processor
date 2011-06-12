/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.sqlproc.dsl.ui.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

import com.google.inject.Inject;

public class FilterOptionalFeaturesContribution extends AbstractFilterOutlineContribution {

    // public static final String PREFERENCE_KEY = "ui.outline.filterOptionalFeatures";

    @Inject
    private PluginImageHelper imageHelper;

    @Override
    protected boolean apply(IOutlineNode node) {
        boolean result = !(node instanceof EObjectNode)
                || !((EObjectNode) node).getEClass().equals(ProcessorDslPackage.Literals.OPTIONAL_FEATURE);
        System.out.println("opt " + node + " " + result);
        return result;
    }

    @Override
    public String getPreferenceKey() {
        return "ui.outline.filterOptionalFeatures";
    }

    @Override
    protected void configureAction(Action action) {
        action.setText("Hide optional features");
        action.setDescription("Hide optional features");
        action.setToolTipText("Hide optional features");
        action.setImageDescriptor(getImageDescriptor("icons/OPT.gif"));
    }

    protected ImageDescriptor getImageDescriptor(String imagePath) {
        return ImageDescriptor.createFromImage(imageHelper.getImage("OPT.gif"));
    }
}
