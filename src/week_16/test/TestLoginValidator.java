package week_16.test;

import org.junit.jupiter.api.Test;
import week_16.java.LoginValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginValidator {
    @Test
    void TestValidEmailAdress() {
        LoginValidator loginValidator = new LoginValidator();
        assertTrue(loginValidator.validateUsername("emir@gmail.com"), "It is not true email address");

    }

    @Test
    void TestEmailWithoutAtSymbol() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("emirgmail.com"), "There is @ in the address ");
    }

    @Test
    void TestEmailWithoutDomain() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("emir@gmailcom"), "Domain is true");
    }

    @Test
    void TestEmailWithInvalidCharacters() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("emir%&@gmail.com"), "There is no invalid characters");
    }

    @Test
    void TestEmptyEmailString() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("        "), "There are characters");
    }

    @Test
    void TestNullEmailAddress() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername(null), "There are characters");
    }

    @Test
    void TestValidPassword() {
        LoginValidator loginValidator = new LoginValidator();
        assertTrue(loginValidator.validatePassword("P@ssw0rd123"), "It is not valid password");
    }

    @Test
    void TestPasswordWithoutSpecialCharacters() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("Passw0rd123"), "It is password without special characters");
    }
    @Test
    void TestPasswordWithoutNumber(){
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("P@ssword."), "It is password without numbers");
    }
    @Test
    void TestPasswordTooShort(){
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("Psw0rd."), "It is long password");
    }
    @Test
    void TestPasswordTooLong(){
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("Paa@123456478sw0rd.123"), "It is not long password");
    }
    @Test
    void TestEmptyPasswordString(){
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("        "),"It is valid password");
    }
    @Test
    void TestNullPassword(){
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword(null),"It is not null password");
    }

}
