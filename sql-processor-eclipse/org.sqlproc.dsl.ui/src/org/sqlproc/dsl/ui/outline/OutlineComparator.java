package org.sqlproc.dsl.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution;

public class OutlineComparator extends SortOutlineContribution.DefaultComparator {

    public int compare(IOutlineNode o1, IOutlineNode o2) {
        String[] text1 = getText(o1.getText().toString());
        String[] text2 = getText(o2.getText().toString());
        int compare = text1[1].compareTo(text2[1]);
        if (compare != 0)
            return compare;
        return text1[0].compareTo(text2[0]);
    }

    private String[] getText(String text) {
        String[] out = new String[2];
        int pos = text.indexOf(":");
        if (pos > 0) {
            out[0] = text.substring(0, pos);
            out[1] = text.substring(pos + 1);
        } else {
            out[0] = text;
            out[1] = "";
        }
        return out;
    }
}