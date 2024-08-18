package Aug.ex_04082024.hasA;

public class car {
    void Startthecar(){
        //Aggration Has-A Relationship
        new Engine().start();
        new Tyres().rolling();
    }
}
