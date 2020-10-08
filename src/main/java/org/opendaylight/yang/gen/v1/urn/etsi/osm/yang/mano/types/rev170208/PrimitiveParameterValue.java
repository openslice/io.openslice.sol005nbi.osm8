package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.Parameter;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping primitive-parameter-value {
 *   list parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf data-type {
 *       type manotypes:parameter-data-type;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/primitive-parameter-value</i>
 *
 */
public interface PrimitiveParameterValue
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-parameter-value");

    /**
     * List of parameters to the configuration primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();

}

