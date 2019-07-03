import java.io.Serializable;

public class Person  implements Serializable{

    private String Name;
    private String Username;
    private String CNIC;
    private char[] password;
    private int mobileNo;

    public Person() {

    }

    public Person(String Name, char[] password, String Username, String cNIC, int mobileNo) {
        this.Name = Name;
        this.Username = Username;
        CNIC = cNIC;
        this.password = password;
        this.mobileNo = mobileNo;
    }


    public String getFirstName() {
        return Name;
    }


    public void setFirstName(String Name) {
        this.Name = Name;
    }


    public String getUsername() {
        return Username;
    }


    public void setUsername(String Username) {
        this.Username = Username;
    }


    public String getCNIC() {
        return CNIC;
    }


    public void setCNIC(String cNIC) {
        CNIC = cNIC;
    }


    public char[] getPassword() {
        return password;
    }


    public void setPassword(char[] password) {
        this.password = password;
    }


    public Integer getMobileNo() {
        return mobileNo;
    }


    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }






}