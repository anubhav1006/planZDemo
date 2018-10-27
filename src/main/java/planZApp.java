import ConnectionDB.MongoConnection;

public class planZApp {
    public static void main(String[] args) {

        MongoConnection mongoConnection = new MongoConnection();
        mongoConnection.establishConnection();
    }
}
