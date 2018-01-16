public class Email {

    private final String EXTENTION="com";
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private int alternateEmail;
    private String company;


    public Email (String first, String last){
        firstName=first;
        lastName=last;
    }
    //Ask for name

    //ask for department

    //generate password

    //set capacity

    //set alternate email

    //change the password







    /*******************************/
    /*****SETTERS AND GETTERS*******/
    /*******************************/
    public String getEXTENTION() {
        return EXTENTION;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompany() {
        return company;
    }


    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public int getAlternameEmail() {
        return alternateEmail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(int alternateEmail) {
        this.alternateEmail = alternateEmail;
    }



}
