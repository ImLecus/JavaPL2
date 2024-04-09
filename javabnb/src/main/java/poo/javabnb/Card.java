package poo.javabnb;

class Card {
    private final String owner;
    private final String number;
    private final String endDate;
    private final String cvv;

    /**
     * Cards are used by the particulars to pay the buildings.
     * @param owner the name of the card owner.
     * @param number the card's number.
     * @param endDate the card's end date of validation
     * @param cvv the card's CVV.
     **/
    public Card(String owner, String number, String endDate, String cvv) {
        this.owner = owner;
        this.number = number;
        this.endDate = endDate;
        this.cvv = cvv;
    }

    /**
     * @return all the card information packaged into an array of Strings.
     */
    public String[] getInfo() {
        return new String[]{owner, number, endDate, cvv};
    }
}
