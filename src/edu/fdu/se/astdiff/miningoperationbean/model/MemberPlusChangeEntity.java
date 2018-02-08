package edu.fdu.se.astdiff.miningoperationbean.model;

import edu.fdu.se.astdiff.miningactions.util.UpDownMatchUtil;
import edu.fdu.se.astdiff.miningoperationbean.ClusteredActionBean;
import edu.fdu.se.astdiff.miningoperationbean.OperationTypeConstants;

/**
 * Created by huangkaifeng on 2018/2/8.
 */
public class MemberPlusChangeEntity extends ChangeEntity {


    public MemberPlusChangeEntity(ClusteredActionBean bean){
        super(bean);
    }
    public MemberPlusChangeEntity(){
        super();
    }

    public void appendListString(){
        UpDownMatchUtil.setChangePacket(this.clusteredActionBean);
        this.changeType = this.clusteredActionBean.changePacket.getOperationType();
        this.outputStringList.add(OperationTypeConstants.getKeyNameByValue(this.changeType));
        this.outputStringList.add(this.changeEntity);
        this.outputStringList.add(OperationTypeConstants.getKeyNameByValue(this.clusteredActionBean.changePacket.getOperationSubEntity()));
        this.outputStringList.add(this.lineRangeStr);

    }
}
