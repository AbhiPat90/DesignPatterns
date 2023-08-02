package src.SingletonDesignPattern;

public class SingletonClient {
    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getConnection();
        DatabaseConnection dbc2 = DatabaseConnection.getConnection();
        System.out.println(dbc1.equals(dbc2));
    }
}
