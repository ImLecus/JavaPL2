package poo.javabnb;

public class Validate {
    public static boolean validateDNI(char[] dni){
        int number = 0;
        if(dni.length != 9){
            return false;
        }
        for(int i = 0; i < 8; ++i){
            if(!Character.isDigit(dni[i])){
                return false;
            }
            number += Integer.parseInt(String.valueOf(dni[i]));
            number *= 10;
        }
        number /= 10;
        char letter = dni[8];
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E' };
        return letter == letters[number % 23];
    }

    public static boolean validateName(String name){
        for (char c: name.toCharArray()){
            if(!Character.isAlphabetic(c)){
                return false;
            }
        }
        return !name.isEmpty();
    }

    public static boolean validatePassword(char[] password) {
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for(char c: password){
            hasLower |= Character.isLowerCase(c);
            hasUpper |= Character.isUpperCase(c);
            hasDigit |= Character.isDigit(c);
        }
        return password.length >= 8 && (hasLower && hasUpper && hasDigit);
    }

    public static boolean validatePhone(String phone) {
        if(phone.length() < 9){
            return false;
        }
        if(phone.toCharArray()[0] != '6' && phone.toCharArray()[0] != '7' && phone.toCharArray()[0] != '9'){
            return false;
        }
        for(char c: phone.toCharArray()){
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateMail(String mail){
        int arrobas = 0;
        boolean domain = false;

        if(mail.isEmpty()){
            return false;
        }
        for (char c: mail.toCharArray()){
            if(c == '@'){++arrobas;}
            if(c == '.'){domain = true;}
        }
        return arrobas == 1 && domain;
    }
}
