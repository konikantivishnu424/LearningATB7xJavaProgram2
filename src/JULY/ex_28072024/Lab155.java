package JULY.ex_28072024;

public class Lab155 {
    public static void main(String[] args) {
        //Class -Attributes/properties-DataTypes-Primitive or non Primitive
        //class-Behavoiur/methods-Functions

        //object -real Entity class
        //Classname classref = new className();


        //new classname();  //object
        //   classref
        //     Classname = classname which blueprint you are using



        BuildingBp dlf = new BuildingBp();
        dlf.name="dlf Pvt Builder";
        dlf.noofRooms=100;

        dlf.uselift();

        BuildingBp prestige = new BuildingBp();
        prestige.name="prestige Pvt Builder";
        prestige.noofRooms=100;

        prestige.uselift();


    }
}
