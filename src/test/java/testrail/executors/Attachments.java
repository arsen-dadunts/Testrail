package testrail.executors;

import org.json.simple.JSONObject;
import testrail.APIClient;
import testrail.APIException;

import java.io.IOException;

import static java.lang.System.getProperty;


public class Attachments {
    String attachmentFile = "/home/arsen_d/Desktop/PDP/Testrail/src/main/resources/images/test_image_1.jpg";
    APIClient client;

    public static final String
            BASE_URL = getProperty("BASE_URL"),
            ADD_ATTACHMENT_TO_PLAN = getProperty("ADD_ATTACHMENT_TO_PLAN"),
            ADD_ATTACHMENT_TO_PLAN_ENTRY = getProperty("ADD_ATTACHMENT_TO_PLAN_ENTRY"),
            ADD_ATTACHMENT_TO_RESULT = getProperty("ADD_ATTACHMENT_TO_RESULT"),
            ADD_ATTACHMENT_TO_RUN = getProperty("ADD_ATTACHMENT_TO_RUN"),
            GET_ATTACHMENT_FOR_CASE = getProperty("GET_ATTACHMENT_FOR_CASE"),
            GET_ATTACHMENT_FOR_PLAN = getProperty("GET_ATTACHMENT_FOR_PLAN"),
            GET_ATTACHMENT_FOR_PLAN_ENTRY = getProperty("GET_ATTACHMENT_FOR_PLAN_ENTRY"),
            GET_ATTACHMENT_FOR_RUN = getProperty("GET_ATTACHMENT_FOR_RUN"),
            GET_ATTACHMENT_FOR_TEST = getProperty("GET_ATTACHMENT_FOR_TEST"),
            GET_ATTACHMENT = getProperty("GET_ATTACHMENT"),
            DELETE_ATTACHMENT = getProperty("DELETE_ATTACHMENT"),
            TESTRAIL_USERNAME = getProperty("TESTRAIL_USERNAME"),
            TESTRAIL_PASSWORD = getProperty("TESTRAIL_PASSWORD");

    public Object add_attachment_to_plan(String plan_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(ADD_ATTACHMENT_TO_PLAN + plan_id, attachmentFile, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }


    public Object add_attachment_to_plan_entry(String plan_id, String entry_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(ADD_ATTACHMENT_TO_PLAN_ENTRY + plan_id + entry_id, attachmentFile, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object add_attachment_to_result(String result_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(ADD_ATTACHMENT_TO_RESULT + result_id, attachmentFile, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object add_attachment_to_run(String run_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(ADD_ATTACHMENT_TO_RUN + run_id, attachmentFile, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachments_for_case(String case_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT_FOR_CASE + case_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachments_for_plan(String plan_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT_FOR_PLAN + plan_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachments_for_plan_entry(String plan_id, String entry_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT_FOR_PLAN_ENTRY + plan_id + entry_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachments_for_run(String run_id, int statusCode) {
        client = new APIClient(BASE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT_FOR_RUN + run_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachments_for_test(String test_id, int statusCode) {
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT_FOR_TEST + test_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object get_attachment(String attachment_id, int statusCode) {
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendGet(GET_ATTACHMENT + attachment_id, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Object delete_attachment(String attachment_id, int statusCode) {
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        JSONObject response = null;
        try {
            response = (JSONObject) client.sendPost(DELETE_ATTACHMENT + attachment_id, null, statusCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }
        return response;
    }
}