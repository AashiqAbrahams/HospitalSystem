package me.aashiq.controller.employee;

import me.aashiq.domain.employee.Pharmacist;
import me.aashiq.factory.employee.PharmacistFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PharmacistControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL = "http://localhost:8080/employee/pharmacist";

    @Test
    public void a_create() {

        Pharmacist pharmacist = PharmacistFactory.getPharmacist( "JOnh", "do", " ", " ", " ", null);
        pharmacist.setEmployeeId("Afsd");

        ResponseEntity<Pharmacist> postResponse = restTemplate.postForEntity(baseURL + "/new", pharmacist, Pharmacist.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Pharmacist pharmacist = restTemplate.getForObject(baseURL + "/find/" + "Afsd", Pharmacist.class);

        assertNotNull(pharmacist);

    }

    @Test
    public void c_update() {

        int id = 1;
        Pharmacist pharmacist = restTemplate.getForObject(baseURL + "/find/" + "Afsd", Pharmacist.class);
        pharmacist.setFirstName("Mohammed");

        restTemplate.put(baseURL + "/update/" + "Afsd", pharmacist);

        Pharmacist updatedPharmacist = restTemplate.getForObject(baseURL + "/update/" + "Afsd", Pharmacist.class);

        assertNotNull(updatedPharmacist);

    }

    @Test
    public void e_delete() {

        int id = 1;
        Pharmacist pharmacist = restTemplate.getForObject(baseURL + "/find/" + "Afsd", Pharmacist.class);
        assertNotNull(pharmacist);

        restTemplate.delete(baseURL + "/delete/" + "Afsd");

        try {
            pharmacist = restTemplate.getForObject(baseURL + "/find/" + "Afsd", Pharmacist.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getAll", HttpMethod.GET, entity, String.class);

        assertNotNull(response.getBody());

    }
}