package org.sqlproc.dsl.ui.outline;

import java.util.Arrays;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Singleton;

@Singleton
public class FixedOutlineFilterAndSorter extends OutlineFilterAndSorter {

    private IComparator comparator;

    public IOutlineNode[] filterAndSort(Iterable<IOutlineNode> nodes) {
        final Iterable<IFilter> enabledFilters = getEnabledFilters();
        Iterable<IOutlineNode> filteredNodes = null;
        if (Iterables.isEmpty(enabledFilters)) {
            filteredNodes = nodes;
        } else {
            filteredNodes = Iterables.filter(nodes, new Predicate<IOutlineNode>() {
                public boolean apply(final IOutlineNode node) {
                    return Iterables.all(enabledFilters, new Predicate<IFilter>() {
                        public boolean apply(IFilter filter) {
                            return filter.apply(node);
                        }
                    });
                }
            });
        }
        IOutlineNode[] nodesAsArray = Iterables.toArray(filteredNodes, IOutlineNode.class);
        if (comparator != null && comparator.isEnabled())
            Arrays.sort(nodesAsArray, comparator);
        return nodesAsArray;
    }

    public void setComparator(IComparator comparator) {
        this.comparator = comparator;
    }
}
