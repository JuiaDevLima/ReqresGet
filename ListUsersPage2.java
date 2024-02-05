package api.test.get;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListUsersPage2 {

	Response response;

	@Test
	public void gestTestStatusCode() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.getStatusCode());

	}

	@Test
	public void testGetBodyPrimeiroId() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals("7", response.jsonPath().getString("data[0].id"));
		assertEquals("michael.lawson@reqres.in", response.jsonPath().getString("data[0].email"));
		assertEquals("Michael", response.jsonPath().getString("data[0].first_name"));
		assertEquals("Lawson", response.jsonPath().getString("data[0].last_name"));
		assertEquals("https://reqres.in/img/faces/7-image.jpg", response.jsonPath().getString("data[0].avatar"));
	}

	@Test
	public void testGetBodySegundoid() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals("8", response.jsonPath().getString("data[1].id"));
		assertEquals("lindsay.ferguson@reqres.in", response.jsonPath().getString("data[1].email"));
		assertEquals("Lindsay", response.jsonPath().getString("data[1].first_name"));
		assertEquals("Ferguson", response.jsonPath().getString("data[1].last_name"));
		assertEquals("https://reqres.in/img/faces/8-image.jpg", response.jsonPath().getString("data[1].avatar"));
	}

	@Test
	public void testGetBodyTerceiroid() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals("10", response.jsonPath().getString("data[3].id"));
		assertEquals("byron.fields@reqres.in", response.jsonPath().getString("data[3].email"));
		assertEquals("Byron", response.jsonPath().getString("data[3].first_name"));
		assertEquals("Fields", response.jsonPath().getString("data[3].last_name"));
		assertEquals("https://reqres.in/img/faces/10-image.jpg", response.jsonPath().getString("data[3].avatar"));

	}

	@Test
	public void testGetBodyQuartoid() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals("11", response.jsonPath().getString("data[4].id"));
		assertEquals("george.edwards@reqres.in", response.jsonPath().getString("data[4].email"));
		assertEquals("George", response.jsonPath().getString("data[4].first_name"));
		assertEquals("Edwards", response.jsonPath().getString("data[4].last_name"));
		assertEquals("https://reqres.in/img/faces/11-image.jpg", response.jsonPath().getString("data[4].avatar"));
	}

	@Test
	public void testGetBodyQuintoid() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals("12", response.jsonPath().getString("data[5].id"));
		assertEquals("rachel.howell@reqres.in", response.jsonPath().getString("data[5].email"));
		assertEquals("Rachel", response.jsonPath().getString("data[5].first_name"));
		assertEquals("Howell", response.jsonPath().getString("data[5].last_name"));
		assertEquals("https://reqres.in/img/faces/12-image.jpg", response.jsonPath().getString("data[5].avatar"));
	}

}
