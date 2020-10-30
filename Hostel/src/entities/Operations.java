package entities;

public class Operations {
    private String guestName;
    private String emailName;
// Método Construtor
    public Operations(String guestName, String emailName) {
        this.guestName = guestName;
        this.emailName = emailName;
    }


    // Métodos especiais Getters & Setters.
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }
}
