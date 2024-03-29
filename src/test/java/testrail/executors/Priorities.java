package testrail.executors;

import org.json.simple.JSONArray;
import testrail.clients.APIClient;


import static java.lang.System.getProperty;

public class Priorities {
    public static final String
            BASE_URL = getProperty("BASE_URL"),
            GET_PRIORITIES = getProperty("GET_PRIORITIES"),
            TESTRAIL_USERNAME = getProperty("TESTRAIL_USERNAME"),
            TESTRAIL_PASSWORD = getProperty("TESTRAIL_PASSWORD");
    APIClient client;


    public JSONArray get_priorities(int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        return (JSONArray) client.sendGet(GET_PRIORITIES, statusCode);
    }
}
