package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for custom vim data
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping supplemental-boot-data {
 *   container supplemental-boot-data {
 *     leaf boot-data-drive {
 *       type boolean;
 *       default false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/supplemental-boot-data</i>
 *
 */
public interface SupplementalBootData
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supplemental-boot-data");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.supplemental.boot.data.SupplementalBootData</code> <code>supplementalBootData</code>, or <code>null</code> if not present
     */
    @Nullable
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.supplemental.boot.data.SupplementalBootData getSupplementalBootData();

}

