package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.VnfdCatalog;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project1Builder} instances.
 * 
 * @see Project1Builder
 *
 */
public class Project1Builder implements Builder<Project1> {

    private VnfdCatalog _vnfdCatalog;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnfdCatalog = base.getVnfdCatalog();
    }


    public VnfdCatalog getVnfdCatalog() {
        return _vnfdCatalog;
    }

    
    public Project1Builder setVnfdCatalog(final VnfdCatalog value) {
        this._vnfdCatalog = value;
        return this;
    }
    

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {
    
        private final VnfdCatalog _vnfdCatalog;
    
    
        Project1Impl(Project1Builder base) {
            this._vnfdCatalog = base.getVnfdCatalog();
        }
    
        @Override
        public Class<Project1> getImplementedInterface() {
            return Project1.class;
        }
    
        @Override
        public VnfdCatalog getVnfdCatalog() {
            return _vnfdCatalog;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_vnfdCatalog);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project1 other = (Project1)obj;
            if (!Objects.equals(_vnfdCatalog, other.getVnfdCatalog())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_vnfdCatalog", _vnfdCatalog);
            return helper.toString();
        }
    }
}
