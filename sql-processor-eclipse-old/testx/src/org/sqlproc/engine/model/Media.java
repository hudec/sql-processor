package org.sqlproc.engine.model;


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
