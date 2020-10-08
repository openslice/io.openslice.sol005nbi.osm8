package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.VnffgdCatalog;
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

    private VnffgdCatalog _vnffgdCatalog;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnffgdCatalog = base.getVnffgdCatalog();
    }


    public VnffgdCatalog getVnffgdCatalog() {
        return _vnffgdCatalog;
    }

    
    public Project1Builder setVnffgdCatalog(final VnffgdCatalog value) {
        this._vnffgdCatalog = value;
        return this;
    }
    

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {
    
        private final VnffgdCatalog _vnffgdCatalog;
    
    
        Project1Impl(Project1Builder base) {
            this._vnffgdCatalog = base.getVnffgdCatalog();
        }
    
        @Override
        public Class<Project1> getImplementedInterface() {
            return Project1.class;
        }
    
        @Override
        public VnffgdCatalog getVnffgdCatalog() {
            return _vnffgdCatalog;
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
            result = prime * result + Objects.hashCode(_vnffgdCatalog);
        
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
            if (!Objects.equals(_vnffgdCatalog, other.getVnffgdCatalog())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_vnffgdCatalog", _vnffgdCatalog);
            return helper.toString();
        }
    }
}
