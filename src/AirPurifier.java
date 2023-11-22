public class AirPurifier {
    private String model;
    private String serialNo;
    boolean isTurnOn = false;
    static int totalModel=0;
    static int NormalAmount=0, SpecialAmount=0;

    static String mostPopularModel(){
        int maxAmount = Math.max(NormalAmount, SpecialAmount);
        if(maxAmount == NormalAmount && maxAmount == SpecialAmount) {
            return "NORMAL & SPECIAL";
        }else if(maxAmount == NormalAmount){
            return "NORMAL";
        }else{
            return "SPECIAL";
        }
    }
    //class method mostPopularModel ไม่ต้องการInput return output string model name ที่มีจำนวนเยอะที่สุด

    static int getTotal(){
        return totalModel;
    }
    //getTotal return total airpurifier amount and doesn't need any Input
    AirPurifier(){
        this("","");
    } // Dummy Constructor

    AirPurifier(String model, String serialNo){
        if(model.toUpperCase().equals("NORMAL")){
            NormalAmount++;
        }else if(model.toUpperCase().equals("SPECIAL")){
            SpecialAmount++;
        }else{
            System.out.println("Invalid Model // Please Try Again!");
        }
        this.model = model.toUpperCase();
        this.serialNo = serialNo;
        totalModel++;
    }
    AirPurifier(String serialNo){
        this("NORMAL", serialNo);
    }

    void setTurnOn(){
        this.isTurnOn = true;
    }
    void setTurnOff(){
        this.isTurnOn = false;
    }
    //setTurnOn/Off ไม่ต้องการInput และไม่มีreturn output ทำหน้าที่แค่เปลี่ยนค่าในfield isTurnOn

    void printField(){
        System.out.println(this.model+" "+this.serialNo+" "+this.isTurnOn);
    }
// ตัวmethod printField ไม่ต้องการInputใดๆ สร้างมาเพื่อแสดงFieldของ Object
}