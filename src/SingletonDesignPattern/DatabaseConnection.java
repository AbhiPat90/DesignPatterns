package src.SingletonDesignPattern;

import java.util.concurrent.locks.Lock;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    Lock lock;
    private DatabaseConnection(){}

    public static DatabaseConnection getConnection(){
        if(databaseConnection == null){
           // lock.tryLock();
            if(databaseConnection == null)
                databaseConnection = new DatabaseConnection();
            //lock.tryLock();
        }
        return databaseConnection;
    }
}
