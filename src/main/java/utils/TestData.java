package utils;

public class TestData {
    public static final String BASE_URL = "https://www.saucedemo.com/";
    public static final String USERNAME = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static final String LOGIN_URL = "https://www.example.com/";


    public static String getBaseUrl() {
        return BASE_URL;
    }

    public String getLoginUrl() {
        return LOGIN_URL;
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }
}
