package testrail.tests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;
import testrail.common.Constants;
import testrail.executors.Projects;
import testrail.executors.Runs;

import java.util.HashMap;

public class Tests {
    String project_id, run_id;
    testrail.executors.Tests tests = new testrail.executors.Tests();
    Runs run;
    Projects project;

    @BeforeClass
    public void setup() {
        run = new Runs();
        project = new Projects();
        JSONArray projects = project.get_projects_with_filters(Constants.OK, 0);
        JSONObject project = (JSONObject) projects.get(0);
        project_id = project.get("id").toString();
        //get runs
        HashMap<String, String> filters = new HashMap<>();
        filters.put("created_by", Constants.CREATED_BY_ID);
        JSONArray runs = run.get_runs(project_id, filters, Constants.OK);
        JSONObject run = (JSONObject) runs.get(0);
        run_id = run.get("id").toString();
    }

    @Test
    public void get_test() {
        JSONObject response = tests.get_test(Constants.EXAMPLE_TEST_ID, Constants.OK);
        Assert.assertEquals(response.get("id").toString(), Constants.EXAMPLE_TEST_ID);
        Assert.assertNotNull(response.get("case_id"));
        Assert.assertNotNull(response.get("status_id"));
        Assert.assertEquals(response.get("assignedto_id").toString(), Constants.ASSIGNED_TO_ID);
        Assert.assertNotNull(response.get("run_id"));
        Assert.assertNotNull(response.get("title"));
        Assert.assertNotNull(response.get("template_id"));
        Assert.assertNotNull(response.get("type_id"));
        Assert.assertNotNull(response.get("priority_id"));
    }

    @Test
    public void get_tests() {
        JSONArray res = tests.get_tests(run_id, Constants.OK);
        for (Object re : res) {
            JSONObject response = (JSONObject) re;
            Assert.assertNotNull(response.get("id"));
            Assert.assertNotNull(response.get("case_id"));
            Assert.assertNotNull(response.get("status_id"));
            Assert.assertEquals(response.get("assignedto_id").toString(), Constants.ASSIGNED_TO_ID);
            Assert.assertNotNull(response.get("run_id"));
            Assert.assertNotNull(response.get("title"));
            Assert.assertNotNull(response.get("template_id"));
            Assert.assertNotNull(response.get("type_id"));
            Assert.assertNotNull(response.get("priority_id"));
            Assert.assertNull(response.get("estimate_forecast"));
        }
    }
}
