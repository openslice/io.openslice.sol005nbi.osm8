package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Object;
import java.math.BigInteger;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   uses rpc-common;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *     }
 *   }
 *   leaf instance-id {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-out/input</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleOutInputBuilder}.
 * @see ExecScaleOutInputBuilder
 *
 */
public interface ExecScaleOutInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<ExecScaleOutInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getScalingGroupNameRef();
    
    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getInstanceId();

}

