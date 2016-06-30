package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="Actionac1{sAg}_actionInput_TaskInputsInput",EventTypeName="") public class DMActionac17bsAg7d_actionInput_TaskInputsInput extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotuser;
  private String slottaskTypeID;
  private DMActionac17bsAg7d_actionInput_TaskInputs_TaskQueueInfoInput slotTaskQueueInfo;
  private DMActionac17bsAg7d_actionInput_TaskInputs_TaskDataInput slotTaskData;
  private String slotCallbackServiceName;
  private DMActionac17bsAg7d_actionInput_TaskInputs_ProcessDataInput slotProcessData;
  private String slotruleSet;
  @IDataAnnotation(OriginalFieldName="user",FieldName="slotuser",SlotKey="/user;1;0",Position=0,CameFromFloat=false) public String getSlotuser(){
    return this.slotuser;
  }
  @IDataAnnotation(OriginalFieldName="user",FieldName="slotuser",SlotKey="/user;1;0",Position=0,CameFromFloat=false) public void setSlotuser(  String paramuser){
    this.slotuser=paramuser;
  }
  @IDataAnnotation(OriginalFieldName="taskTypeID",FieldName="slottaskTypeID",SlotKey="/taskTypeID;1;0",Position=1,CameFromFloat=false) public String getSlottaskTypeID(){
    return this.slottaskTypeID;
  }
  @IDataAnnotation(OriginalFieldName="taskTypeID",FieldName="slottaskTypeID",SlotKey="/taskTypeID;1;0",Position=1,CameFromFloat=false) public void setSlottaskTypeID(  String paramtaskTypeID){
    this.slottaskTypeID=paramtaskTypeID;
  }
  @IDataAnnotation(OriginalFieldName="TaskQueueInfo",FieldName="slotTaskQueueInfo",SlotKey="/TaskQueueInfo;2;0",Position=2,CameFromFloat=false) public DMActionac17bsAg7d_actionInput_TaskInputs_TaskQueueInfoInput getSlotTaskQueueInfo(){
    return this.slotTaskQueueInfo;
  }
  @IDataAnnotation(OriginalFieldName="TaskQueueInfo",FieldName="slotTaskQueueInfo",SlotKey="/TaskQueueInfo;2;0",Position=2,CameFromFloat=false) public void setSlotTaskQueueInfo(  DMActionac17bsAg7d_actionInput_TaskInputs_TaskQueueInfoInput paramTaskQueueInfo){
    this.slotTaskQueueInfo=paramTaskQueueInfo;
  }
  @IDataAnnotation(OriginalFieldName="TaskData",FieldName="slotTaskData",SlotKey="/TaskData;2;0",Position=3,CameFromFloat=false) public DMActionac17bsAg7d_actionInput_TaskInputs_TaskDataInput getSlotTaskData(){
    return this.slotTaskData;
  }
  @IDataAnnotation(OriginalFieldName="TaskData",FieldName="slotTaskData",SlotKey="/TaskData;2;0",Position=3,CameFromFloat=false) public void setSlotTaskData(  DMActionac17bsAg7d_actionInput_TaskInputs_TaskDataInput paramTaskData){
    this.slotTaskData=paramTaskData;
  }
  @IDataAnnotation(OriginalFieldName="CallbackServiceName",FieldName="slotCallbackServiceName",SlotKey="/CallbackServiceName;1;0",Position=4,CameFromFloat=false) public String getSlotCallbackServiceName(){
    return this.slotCallbackServiceName;
  }
  @IDataAnnotation(OriginalFieldName="CallbackServiceName",FieldName="slotCallbackServiceName",SlotKey="/CallbackServiceName;1;0",Position=4,CameFromFloat=false) public void setSlotCallbackServiceName(  String paramCallbackServiceName){
    this.slotCallbackServiceName=paramCallbackServiceName;
  }
  @IDataAnnotation(OriginalFieldName="ProcessData",FieldName="slotProcessData",SlotKey="/ProcessData;2;0",Position=5,CameFromFloat=false) public DMActionac17bsAg7d_actionInput_TaskInputs_ProcessDataInput getSlotProcessData(){
    return this.slotProcessData;
  }
  @IDataAnnotation(OriginalFieldName="ProcessData",FieldName="slotProcessData",SlotKey="/ProcessData;2;0",Position=5,CameFromFloat=false) public void setSlotProcessData(  DMActionac17bsAg7d_actionInput_TaskInputs_ProcessDataInput paramProcessData){
    this.slotProcessData=paramProcessData;
  }
  @IDataAnnotation(OriginalFieldName="ruleSet",FieldName="slotruleSet",SlotKey="/ruleSet;1;0",Position=6,CameFromFloat=false) public String getSlotruleSet(){
    return this.slotruleSet;
  }
  @IDataAnnotation(OriginalFieldName="ruleSet",FieldName="slotruleSet",SlotKey="/ruleSet;1;0",Position=6,CameFromFloat=false) public void setSlotruleSet(  String paramruleSet){
    this.slotruleSet=paramruleSet;
  }
}
