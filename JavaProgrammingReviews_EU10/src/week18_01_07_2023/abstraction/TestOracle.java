package week18_01_07_2023.abstraction;

public class TestOracle {
    public static void main(String[] args) {
        OracleDatabase oracleDatabese=new OracleDatabase();
        oracleDatabese.save("Adam");
        System.out.println(oracleDatabese.names);
        oracleDatabese.save("Harun");
        System.out.println(oracleDatabese.names);
        oracleDatabese.delete("Adam");
        System.out.println(oracleDatabese.names);

        oracleDatabese.update("Harun","Doğuhan");
        System.out.println(oracleDatabese.names);


    }
}
