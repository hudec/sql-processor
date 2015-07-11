package org.sqlproc.engine.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public abstract class Media extends MediaBase {
    public Media() {
    }

    public Media(String title) {
        super(title);
    }

    public boolean existsInLibrary(Long libraryId) {
        for (PhysicalMedia p : getPhysicalMedia()) {
            if (libraryId.equals(p.getLibrary().getId())) {
                return true;
            }
        }
        // none found
        return false;
    }
}
