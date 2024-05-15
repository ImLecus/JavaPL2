package poo.javabnb;

import java.io.Serializable;

public record Card(String owner, String number, String endDate, String cvv) implements Serializable{
    /**
     * Cards are used by the particulars to pay the buildings.
     *
     * @param owner   the name of the card owner.
     * @param number  the card's number.
     * @param endDate the card's end date of validation
     * @param cvv     the card's CVV.
     **/
    public Card {}

    public String[] getInfo() {
        return new String[]{owner, number, endDate, cvv};
    }
}
