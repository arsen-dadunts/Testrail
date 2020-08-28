package testrail.executors;

import org.json.simple.JSONObject;
import testrail.APIClient;
import testrail.APIException;

import java.io.IOException;

import static java.lang.System.getProperty;

public class Suites {
    public static final String
            BASE_URL = getProperty("BASE_URL"),
            GET_SUITE = getProperty("GET_SUITE"),
            GET_SUITES = getProperty("GET_SUITES"),
            ADD_SUITE = getProperty("ADD_SUITE"),
            UPDATE_SUITE = getProperty("UPDATE_SUITE"),
            DELETE_SUITE = getProperty("DELETE_SUITE"),
            TESTRAIL_USERNAME = getProperty("TESTRAIL_USERNAME"),
            TESTRAIL_PASSWORD = getProperty("TESTRAIL_PASSWORD");
    APIClient client;

    public Object get_suite(String suite_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_SUITE + suite_id, statusCode);
            response.toJSONString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_suites(String project_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_SUITES + project_id, statusCode);
            response.toJSONString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object update_suite(String suite_id, Object data, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(UPDATE_SUITE + suite_id, data, statusCode);
            response.toJSONString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object delete_suite(String suite_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(DELETE_SUITE + suite_id, null, statusCode);
            response.toJSONString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }
}