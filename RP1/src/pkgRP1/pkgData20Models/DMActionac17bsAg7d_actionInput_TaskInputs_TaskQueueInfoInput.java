package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="Actionac1{sAg}_actionInput_TaskInputs_TaskQueueInfoInput",EventTypeName="") public class DMActionac17bsAg7d_actionInput_TaskInputs_TaskQueueInfoInput extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotname;
  private String slotcustomTaskID;
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public String getSlotname(){
    return this.slotname;
  }
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public void setSlotname(  String paramname){
    this.slotname=paramname;
  }
  @IDataAnnotation(OriginalFieldName="customTaskID",FieldName="slotcustomTaskID",SlotKey="/customTaskID;1;0",Position=1,CameFromFloat=false) public String getSlotcustomTaskID(){
    return this.slotcustomTaskID;
  }
  @IDataAnnotation(OriginalFieldName="customTaskID",FieldName="slotcustomTaskID",SlotKey="/customTaskID;1;0",Position=1,CameFromFloat=false) public void setSlotcustomTaskID(  String paramcustomTaskID){
    this.slotcustomTaskID=paramcustomTaskID;
  }
}
