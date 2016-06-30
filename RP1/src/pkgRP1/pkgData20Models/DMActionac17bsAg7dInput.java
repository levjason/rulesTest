package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="Actionac1{sAg}Input",EventTypeName="") public class DMActionac17bsAg7dInput extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotaction;
  private DMActionac17bsAg7d_actionInputInput slotactionInput;
  @IDataAnnotation(OriginalFieldName="action",FieldName="slotaction",SlotKey="/action;1;0",Position=0,CameFromFloat=false) public String getSlotaction(){
    return this.slotaction;
  }
  @IDataAnnotation(OriginalFieldName="action",FieldName="slotaction",SlotKey="/action;1;0",Position=0,CameFromFloat=false) public void setSlotaction(  String paramaction){
    this.slotaction=paramaction;
  }
  @IDataAnnotation(OriginalFieldName="actionInput",FieldName="slotactionInput",SlotKey="/actionInput;2;0",Position=1,CameFromFloat=false) public DMActionac17bsAg7d_actionInputInput getSlotactionInput(){
    return this.slotactionInput;
  }
  @IDataAnnotation(OriginalFieldName="actionInput",FieldName="slotactionInput",SlotKey="/actionInput;2;0",Position=1,CameFromFloat=false) public void setSlotactionInput(  DMActionac17bsAg7d_actionInputInput paramactionInput){
    this.slotactionInput=paramactionInput;
  }
}
