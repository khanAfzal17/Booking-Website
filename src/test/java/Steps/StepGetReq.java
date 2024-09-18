/*package Steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;

public class StepGetReq {
	private Response response;
	
	@Given("I have the endpoint1 {string}")
	public void I_have_the_endpoint1(String endpoint) {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = endpoint;
	}

	
	@When("I send the GET request1")
	public void I_send_the_get_request1() {
		response = RestAssured.get();
	}

	

	@Then("the response status code should be1 {int}")
	public void the_response_status_code_should_be1(Integer int1) {
		response.then().statusCode(200);
	}

	@Then("the response body should contain1 {string}")

	public void the_response_body_should_contain1(String string) throws InterruptedException {

		String jsonString = response.asString();

		if (jsonString.contains("email")) {

			System.out.println("The value users  is present");

		}

		else 

		{

			System.out.println("The value users is not present");

		}

		Thread.sleep(2000);

	}

	

	//Post Request 

	@Given("I have given the endpoint1 {string}")
	public void i_have_given_the_endpoint(String string) throws InterruptedException {
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = string;
		Thread.sleep(2000);
	}

	@When("I send the post request with a body1")
	public void i_send_the_post_request_with_a_body1() throws InterruptedException{

		String jsonfile = "{\r\n"

				+ "  \"name\": \"morpheus\",\r\n"

				+ "  \"job\": \"leader\"r\n"

				+ "}";

		response = RestAssured.given().body(jsonfile).post();

		Thread.sleep(2000);

	}

	@Then("The response statuscode should be1 {int}")

	public void the_response_statuscode_should_be1(Integer int1) throws InterruptedException{

		assertEquals(response.getStatusCode(), int1.intValue());

		Thread.sleep(2000);

	}

	

	@Then("the response body should contain2 {string}")

	public void the_response_body_should_contain2(String string) throws InterruptedException {

		String jsonfile = response.asString();

		if (jsonfile.contains(string)) {

			System.out.println("The Post is created");

		}

		else 

		{

			System.out.println("The Post Request got failed");

		}

		Thread.sleep(2000);

	}

	//Put Request

	@Given("I have given the endpoints1 {string}")

	public void i_have_given_the_Endpoints1(String string) throws InterruptedException{

		RestAssured.baseURI = "https://reqres.in";

		RestAssured.basePath = string;

		Thread.sleep(2000);

	}

	@When("I send the put request with a body1")

	public void i_send_the_put_request_with_a_body1() throws InterruptedException{

		String jsonfile = "{\r\n"

				+ "  \"name\": \"morpheus\",\r\n"

				+ "  \"job\": \"leader\"r\n"

				+ "}";

		response = RestAssured.given().body(jsonfile).post();

		Thread.sleep(2000);

	}

	

	@Then("the response statuscode should be as1 {int}")

	public void the_response_statuscode_should_be_as1(Integer int1) throws InterruptedException{

		assertEquals(response.getStatusCode(), int1.intValue());

		Thread.sleep(2000);

	}

	

	@Then("The response body should have1 {String}")

	public void the_response_body_should_have1(String string) throws InterruptedException{

		String update = response.jsonPath().getString("updateAt");

		if (!update.isEmpty()) {

			System.out.println("The Post was updated");

		}

		else 

		{

			System.out.println("The Post was not updated");

		}

		Thread.sleep(2000);

	}

	

	//Patch Request

	@Given("I have send the endpoints1 {string}")

	public void i_have_send_the_endpoints1(String string) throws InterruptedException{

		RestAssured.baseURI = "https://reqres.in";

		RestAssured.basePath = string;

		Thread.sleep(2000);

	}

	

	@When("I send the patch request with a body1")

	public void i_send_the_patch_request_with_a_body1() throws InterruptedException{

		String jsonfile= "{\r\n"

				+"   \"job\": \"leader\"r\n"

				+"}";

		response = RestAssured.given().body(jsonfile).patch();

		Thread.sleep(2000);

	}

	

	@Then("the response statuscode should come as1 {int}")

	public void the_response_statuscode_should_come_as1(Integer int1) throws InterruptedException{

		assertEquals(response.getStatusCode(),int1.intValue());

		Thread.sleep(2000);

	}

	

	@Then("The response body must have1 {string}")

	public void the_reponse_body_must_have1(String string) throws InterruptedException{

		String update = response.jsonPath().getString("updateAt");

		if (!update.isEmpty()) {

			System.out.println("The Post was updated");

		}

		else 

		{

			System.out.println("The Post was not updated");

		}

		Thread.sleep(2000);

	}
}
*/