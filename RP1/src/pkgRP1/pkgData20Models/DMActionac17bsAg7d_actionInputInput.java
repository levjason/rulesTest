package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="Actionac1{sAg}_actionInputInput",EventTypeName="") public class DMActionac17bsAg7d_actionInputInput extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotprocessModelID;
  private String slotdoctypeName;
  private String slotprotocolType;
  private String slotconnectionAlias;
  private String slotdestinationName;
  private String slotdestinationType;
  private DMActionac17bsAg7d_actionInput_TaskInputsInput slotTaskInputs;
  private DMActionac17bsAg7dtestPackage_docs_doc1Input slotdocument;
  @IDataAnnotation(OriginalFieldName="processModelID",FieldName="slotprocessModelID",SlotKey="/processModelID;1;0",Position=0,CameFromFloat=false) public String getSlotprocessModelID(){
    return this.slotprocessModelID;
  }
  @IDataAnnotation(OriginalFieldName="processModelID",FieldName="slotprocessModelID",SlotKey="/processModelID;1;0",Position=0,CameFromFloat=false) public void setSlotprocessModelID(  String paramprocessModelID){
    this.slotprocessModelID=paramprocessModelID;
  }
  @IDataAnnotation(OriginalFieldName="doctypeName",FieldName="slotdoctypeName",SlotKey="/doctypeName;1;0",Position=1,CameFromFloat=false) public String getSlotdoctypeName(){
    return this.slotdoctypeName;
  }
  @IDataAnnotation(OriginalFieldName="doctypeName",FieldName="slotdoctypeName",SlotKey="/doctypeName;1;0",Position=1,CameFromFloat=false) public void setSlotdoctypeName(  String paramdoctypeName){
    this.slotdoctypeName=paramdoctypeName;
  }
  @IDataAnnotation(OriginalFieldName="protocolType",FieldName="slotprotocolType",SlotKey="/protocolType;1;0",Position=2,CameFromFloat=false) public String getSlotprotocolType(){
    return this.slotprotocolType;
  }
  @IDataAnnotation(OriginalFieldName="protocolType",FieldName="slotprotocolType",SlotKey="/protocolType;1;0",Position=2,CameFromFloat=false) public void setSlotprotocolType(  String paramprotocolType){
    this.slotprotocolType=paramprotocolType;
  }
  @IDataAnnotation(OriginalFieldName="connectionAlias",FieldName="slotconnectionAlias",SlotKey="/connectionAlias;1;0",Position=3,CameFromFloat=false) public String getSlotconnectionAlias(){
    return this.slotconnectionAlias;
  }
  @IDataAnnotation(OriginalFieldName="connectionAlias",FieldName="slotconnectionAlias",SlotKey="/connectionAlias;1;0",Position=3,CameFromFloat=false) public void setSlotconnectionAlias(  String paramconnectionAlias){
    this.slotconnectionAlias=paramconnectionAlias;
  }
  @IDataAnnotation(OriginalFieldName="destinationName",FieldName="slotdestinationName",SlotKey="/destinationName;1;0",Position=4,CameFromFloat=false) public String getSlotdestinationName(){
    return this.slotdestinationName;
  }
  @IDataAnnotation(OriginalFieldName="destinationName",FieldName="slotdestinationName",SlotKey="/destinationName;1;0",Position=4,CameFromFloat=false) public void setSlotdestinationName(  String paramdestinationName){
    this.slotdestinationName=paramdestinationName;
  }
  @IDataAnnotation(OriginalFieldName="destinationType",FieldName="slotdestinationType",SlotKey="/destinationType;1;0",Position=5,CameFromFloat=false) public String getSlotdestinationType(){
    return this.slotdestinationType;
  }
  @IDataAnnotation(OriginalFieldName="destinationType",FieldName="slotdestinationType",SlotKey="/destinationType;1;0",Position=5,CameFromFloat=false) public void setSlotdestinationType(  String paramdestinationType){
    this.slotdestinationType=paramdestinationType;
  }
  @IDataAnnotation(OriginalFieldName="TaskInputs",FieldName="slotTaskInputs",SlotKey="/TaskInputs;2;0",Position=6,CameFromFloat=false) public DMActionac17bsAg7d_actionInput_TaskInputsInput getSlotTaskInputs(){
    return this.slotTaskInputs;
  }
  @IDataAnnotation(OriginalFieldName="TaskInputs",FieldName="slotTaskInputs",SlotKey="/TaskInputs;2;0",Position=6,CameFromFloat=false) public void setSlotTaskInputs(  DMActionac17bsAg7d_actionInput_TaskInputsInput paramTaskInputs){
    this.slotTaskInputs=paramTaskInputs;
  }
  @IDataAnnotation(OriginalFieldName="document",FieldName="slotdocument",SlotKey="/document;4;0;testPackage.docs:doc1",Position=7,CameFromFloat=false) public DMActionac17bsAg7dtestPackage_docs_doc1Input getSlotdocument(){
    return this.slotdocument;
  }
  @IDataAnnotation(OriginalFieldName="document",FieldName="slotdocument",SlotKey="/document;4;0;testPackage.docs:doc1",Position=7,CameFromFloat=false) public void setSlotdocument(  DMActionac17bsAg7dtestPackage_docs_doc1Input paramdocument){
    this.slotdocument=paramdocument;
  }
}
