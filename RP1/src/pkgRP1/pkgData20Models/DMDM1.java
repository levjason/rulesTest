package pkgRP1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RP1",DataModelName="DM1",EventTypeName="") public class DMDM1 extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotName;
  private Integer slotAge;
  private Long slotpremium;
  @IDataAnnotation(OriginalFieldName="Name",FieldName="slotName",SlotKey="/Name;1;0",Position=0,CameFromFloat=false) public String getSlotName(){
    return this.slotName;
  }
  @IDataAnnotation(OriginalFieldName="Name",FieldName="slotName",SlotKey="/Name;1;0",Position=0,CameFromFloat=false) public void setSlotName(  String paramName){
    this.slotName=paramName;
  }
  @IDataAnnotation(OriginalFieldName="Age",FieldName="slotAge",SlotKey="/Age;3.6;0",Position=1,CameFromFloat=false) public Integer getSlotAge(){
    return this.slotAge;
  }
  @IDataAnnotation(OriginalFieldName="Age",FieldName="slotAge",SlotKey="/Age;3.6;0",Position=1,CameFromFloat=false) public void setSlotAge(  Integer paramAge){
    this.slotAge=paramAge;
  }
  @IDataAnnotation(OriginalFieldName="Age",FieldName="slotAge",SlotKey="/Age;3.6;0",Position=1,CameFromFloat=false) public void setSlotAge(  String paramAge){
    if (paramAge != null) {
      this.slotAge=new Integer(paramAge);
    }
 else {
      this.slotAge=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="Age",FieldName="slotAge",SlotKey="/Age;3.6;0",Position=1,CameFromFloat=false) public void setSlotAge(  Double paramAge){
    if (paramAge != null) {
      this.slotAge=paramAge.intValue();
    }
 else {
      this.slotAge=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="premium",FieldName="slotpremium",SlotKey="/premium;3.7;0",Position=2,CameFromFloat=false) public Long getSlotpremium(){
    return this.slotpremium;
  }
  @IDataAnnotation(OriginalFieldName="premium",FieldName="slotpremium",SlotKey="/premium;3.7;0",Position=2,CameFromFloat=false) public void setSlotpremium(  Long parampremium){
    this.slotpremium=parampremium;
  }
  @IDataAnnotation(OriginalFieldName="premium",FieldName="slotpremium",SlotKey="/premium;3.7;0",Position=2,CameFromFloat=false) public void setSlotpremium(  String parampremium){
    if (parampremium != null) {
      this.slotpremium=new Long(parampremium);
    }
 else {
      this.slotpremium=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="premium",FieldName="slotpremium",SlotKey="/premium;3.7;0",Position=2,CameFromFloat=false) public void setSlotpremium(  Double parampremium){
    if (parampremium != null) {
      this.slotpremium=parampremium.longValue();
    }
 else {
      this.slotpremium=null;
    }
  }
}
