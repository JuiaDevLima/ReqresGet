package api.test.get;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListUsersPage1 {

	Response response;

	@Test
	public void gestTestStatusCode() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals(200, response.getStatusCode());

	}

	@Test
	public void testGetBodyPrimeiroId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("1", response.jsonPath().getString("data[0].id"));
		assertEquals("george.bluth@reqres.in", response.jsonPath().getString("data[0].email"));
		assertEquals("George", response.jsonPath().getString("data[0].first_name"));
		assertEquals("Bluth", response.jsonPath().getString("data[0].last_name"));
		assertEquals("https://reqres.in/img/faces/1-image.jpg", response.jsonPath().getString("data[0].avatar"));
	}

	@Test
	public void testGetBodySegundoId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("2", response.jsonPath().getString("data[1].id"));
		assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data[1].email"));
		assertEquals("Janet", response.jsonPath().getString("data[1].first_name"));
		assertEquals("Weaver", response.jsonPath().getString("data[1].last_name"));
		assertEquals("https://reqres.in/img/faces/2-image.jpg", response.jsonPath().getString("data[1].avatar"));
	}

	@Test
	public void testGetBodyTerceiroId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("3", response.jsonPath().getString("data[2].id"));
		assertEquals("emma.wong@reqres.in", response.jsonPath().getString("data[2].email"));
		assertEquals("Emma", response.jsonPath().getString("data[2].first_name"));
		assertEquals("Wong", response.jsonPath().getString("data[2].last_name"));
		assertEquals("https://reqres.in/img/faces/3-image.jpg", response.jsonPath().getString("data[2].avatar"));
	}

	@Test
	public void testGetBodyQuartoId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("4", response.jsonPath().getString("data[3].id"));
		assertEquals("eve.holt@reqres.in", response.jsonPath().getString("data[3].email"));
		assertEquals("Eve", response.jsonPath().getString("data[3].first_name"));
		assertEquals("Holt", response.jsonPath().getString("data[3].last_name"));
		assertEquals("https://reqres.in/img/faces/4-image.jpg", response.jsonPath().getString("data[3].avatar"));
	}

	@Test
	public void testGetBodyQuintoId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("5", response.jsonPath().getString("data[4].id"));
		assertEquals("charles.morris@reqres.in", response.jsonPath().getString("data[4].email"));
		assertEquals("Charles", response.jsonPath().getString("data[4].first_name"));
		assertEquals("Morris", response.jsonPath().getString("data[4].last_name"));
		assertEquals("https://reqres.in/img/faces/5-image.jpg", response.jsonPath().getString("data[4].avatar"));
	}

	@Test
	public void testGetBodySextoId() {
		response = RestAssured.get("https://reqres.in/api/users?page=1");
		assertEquals("6", response.jsonPath().getString("data[5].id"));
		assertEquals("tracey.ramos@reqres.in", response.jsonPath().getString("data[5].email"));
		assertEquals("Tracey", response.jsonPath().getString("data[5].first_name"));
		assertEquals("Ramos", response.jsonPath().getString("data[5].last_name"));
		assertEquals("https://reqres.in/img/faces/6-image.jpg", response.jsonPath().getString("data[5].avatar"));
	}

}
