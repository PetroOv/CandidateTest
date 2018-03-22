package api.tests;

import api.entities.people.People;
import api.entities.people.Result;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class apiTest {
    private final static String API_URL = "https://swapi.co/api/people/";


    @Test
    @Description("Проверить, что существует персонаж “Luke Skywalker” c home planet Tatooine")
    public void likePlanetTest() {
        Response response = given().when().get(API_URL).then().extract().response();
        People people = response.as(People.class);
        boolean found = false;
        for (Result result :
                people.getResults()) {
            if (result.getName().equals("Luke Skywalker")) {
                String planetName = getPlanet(result.getHomeworld()).as(api.entities.planets.Result.class).getName();
                if (planetName.equals("Tatooine"))
                    found = true;
            }
        }
        assertThat("Luke for tatooine not found", found);
    }

    @Test
    @Description("Проверить что количество персонажей соответствует 87")
    public void charactersCountTest() {
        Response response = given().when().get(API_URL).then().extract().response();
        People people = response.as(People.class);
        assertThat("wrong characters count", people.getCount(), equalTo(87));
    }

    @Test
    @Description("Проверить что первые 3 персонажа это Luke Skywalker, C-3PO и R2-D2")
    public void firstCharacterTest() {
        Response response = given().when().get(API_URL).then().extract().response();
        People people = response.as(People.class);
        assertThat("it isn't Luke", people.getResults().get(0).getName(), equalTo("Luke Skywalker"));
        assertThat("it isn't C-3PO", people.getResults().get(1).getName(), equalTo("C-3PO"));
        assertThat("it isn't R2-D2", people.getResults().get(2).getName(), equalTo("R2-D2"));
    }

    @Step
    public Response getPlanet(String address) {
        Response response = given().get(address).thenReturn();
        return response;
    }
}
