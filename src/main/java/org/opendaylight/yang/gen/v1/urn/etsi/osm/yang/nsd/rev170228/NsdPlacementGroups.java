package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-placement-groups {
 *   list placement-groups {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     list member-vnfd {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups</i>
 *
 */
public interface NsdPlacementGroups
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-placement-groups");

    /**
     * List of placement groups at NS level
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    @Nullable
    List<PlacementGroups> getPlacementGroups();

}

