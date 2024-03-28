import java.io.*;

class UserDetails implements Serializable {
    private int id;
    private String name;
    private String address;
    private long contact;
    
    UserDetails(int id, String name, String address, long contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
    
    public String toString() {
        return "id: " + id + ", name: " + name + ", address: " + address + ", contact: " + contact;
    }
}

public class SerializationExample {
    
    public static void main(String[] args) {
       
        UserDetails u1 = new UserDetails(1, "Arumugam", "Ahmedabad", 4125544);
        serializeUserDetails(u1);

        
        UserDetails deserializedUser = deserializeUserDetails("user1.ser");
        System.out.println(deserializedUser);
    }

    private static void serializeUserDetails(UserDetails userDetails) {
        try (FileOutputStream fos = new FileOutputStream("user1.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(userDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data has been written");
    }

    private static UserDetails deserializeUserDetails(String filePath) {
        UserDetails userDetails = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            userDetails = (UserDetails) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userDetails;
    }
}
