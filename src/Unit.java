public class Unit {
    String unitName;
    String unitCode;

    public Unit (String name, String code){
        unitName = name;
        unitCode = code;
    }

    public String getUnitDescription(){
        return unitName+" "+unitCode;
    }
}
