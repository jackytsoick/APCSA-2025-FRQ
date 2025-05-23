public class SignedText {
    public SignedText(String firstName, String lastName) {
        firstName = fn;
        lastName = ln;
    }

    public String getSignature() {
        if(firstName == "") {
            return lastName;
        } else {
            return firstName.substring(0, 1) + "-" + lastName;
        }
    }

    public String addSignature() {
        
    }
}
