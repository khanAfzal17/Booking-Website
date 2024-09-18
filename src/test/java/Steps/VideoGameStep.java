//package Steps;
//
//import static org.testng.Assert.assertEquals;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//public class VideoGameStep {
//	private Response response;
//
//	@Given("the videogame endpoint {string}")
//
//	public void the_Videogame_endpoint(String endpoint) {
//		RestAssured.baseURI = "https://videogamedb.uk/swagger-ui/index.html#/api-video-games-controller-v-2";
//		RestAssured.basePath = endpoint;
//	}
//
//   @When("I have send the get request")
//
//	public void i_have_send_the_get_request() {
//
//		response = RestAssured.get();
//
//		response.prettyPrint();
//
//	   
//
//	}
//
//
//
//	@Then("the videogame response status should be {int}")
//
//	public void the_videogame_response_status_should_be(Integer int1) {
//
//		assertEquals(response.getStatusCode(),int1.intValue());
//
//	    
//
//	}
//
//
//
//	@Then("the videogame json should have {string}")
//
//	public void the_videogame_json_should_have(String string) {
//		String jsonString = response.asPrettyString();
//		System.out.println(jsonString);
//		if (jsonString.contains(string)) {
//
//
//
//		System.out.println("The value users is present");
//
//
//
//
//
//		}
//
//		else {
//
//		System.out.println("The value users is not present");
//
//
//
//
//
//		}
//
//	  
//
//	}
//
//
//
//	@Given("I have given the endpoint for post {string}")
//
//	public void i_have_given_the_endpoint_for_post(String endpoint) {
//
//		RestAssured.baseURI = "https://videogamedb.uk";
//
//		RestAssured.basePath = endpoint;
//
//
//
//	}
//
//
//
//	@When("I send the POST request with an body for video game")
//
//	public void i_send_the_post_request_with_an_body_for_video_game() {
//
//		String jsonString =  "{\r\n"
//
//		 		+ "  \"category\": \"string\",\r\n"
//
//		 		+ "  \"id\": 0,\r\n"
//
//		 		+ "  \"name\": \"string\",\r\n"
//
//		 		+ "  \"rating\": \"string\",\r\n"
//
//		 		+ "  \"releaseDate\": \"string\",\r\n"
//
//		 		+ "  \"reviewScore\": 85\r\n"
//
//		 		+ "}";
//
//	 response = RestAssured.given().body(jsonString).post();
//
//		
//
//		
//
//		
//
//	}
//
//
//
//	@Then("the video game response status code is {int}")
//
//	public void the_video_game_response_status_code_is(Integer int1) {
//
//		assertEquals(response.getStatusCode(),int1.intValue());
//
//
//
//	  
//
//	}
//
//
//
//	@Then("the video game response body should contains the {string}")
//
//	public void the_video_game_response_body_should_contains_the(String string) {
//
//	String jsonString = response.asPrettyString();
//	System.out.println(jsonString);
//	if (jsonString.contains(string)) {
//	System.out.println("The Post is created");
//	}
//
//	else {
//
//	System.out.println("The Post Request got failed");
//	}
//	}
////Put Request
//	@Given("I had the endpoint for put {string}")
//	public void i_had_the_endpoint_for_put(String endpoint) {
//		RestAssured.baseURI = "https://videogamedb.uk";
//		RestAssured.basePath = endpoint;
//	}
//
//	@When("I send the put request with an body in video game")
//	public void i_send_the_put_request_with_an_body_in_video_game() {
//		String jsonString = "{\r\n"
//				+ "  \"category\": \"Platform\",\r\n"
//				+ "  \"name\": \"Mario\",\r\n"
//				+ "  \"rating\": \"Mature\",\r\n"
//				+ "  \"releaseDate\": \"2012-05-04\",\r\n"
//				+ "  \"reviewScore\": 85\r\n"
//				+ "}";
//	 response = RestAssured.given().body(jsonString).header("Content-Type","application/json").put();
//
//	 
//
//	}
//
//
//
//	@Then("the video game response status code be {int}")
//
//	public void the_video_game_response_status_code_be(Integer int1) {
//
//		assertEquals(response.getStatusCode(),int1.intValue());
//
//	}
//
//
//	@Given("I had able to get the endpoint for delete {string}")
//
//	public void i_had_able_to_get_the_endpoint_for_delete(String endpoint) {
//
//		RestAssured.baseURI = "https://videogamedb.uk";
//
//		RestAssured.basePath = endpoint;
//
//	    
//
//	}
//
//
//
//	@When("I send the delete request for videogame")
//
//	public void i_send_the_delete_request_for_videogame() {
//
//		response = RestAssured.delete();
//
//	    
//
//	}
//
//
//
//	@Then("video game response status code must be {int}")
//
//	public void video_game_response_status_code_must_be(Integer int1) {
//
//		assertEquals(response.getStatusCode(),int1.intValue());
//
//	    
//
//	}
//
//
//
//	}
//
