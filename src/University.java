public class University {
    public static Unit[] units;
    public static void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnit();
        displayUnit();
        System.out.println();
      //  Unit firstUnit = new Unit("FIT2099","object oriented design");
      //  System.out.println(firstUnit.getUnitDescription());
        System.out.println("Thank you for using Java University");

    }

    public static void createUnit(){
        units = new Unit[3];
        units[0] = new Unit("C++","FIT1048");
        units[1] = new Unit("maker lab","FIT3146");
        units[2] = new Unit("object oriented design","FIT2099");

    }
    public static void displayUnit(){
        for(Unit unit: units){
            System.out.println(unit.getUnitDescription());
        }
    }
}
