package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="Actionac1{sAg}Output",EventTypeName="") public class DMActionac17bsAg7dOutput extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotoutputMessage;
  @IDataAnnotation(OriginalFieldName="outputMessage",FieldName="slotoutputMessage",SlotKey="/outputMessage;1;0",Position=0,CameFromFloat=false) public String getSlotoutputMessage(){
    return this.slotoutputMessage;
  }
  @IDataAnnotation(OriginalFieldName="outputMessage",FieldName="slotoutputMessage",SlotKey="/outputMessage;1;0",Position=0,CameFromFloat=false) public void setSlotoutputMessage(  String paramoutputMessage){
    this.slotoutputMessage=paramoutputMessage;
  }
}
