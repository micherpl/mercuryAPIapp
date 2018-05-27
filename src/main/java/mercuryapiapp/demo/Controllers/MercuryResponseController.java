package mercuryapiapp.demo.Controllers;

<<<<<<< Updated upstream
public class MercuryResponseController {

=======
import com.google.gson.Gson;
import mercuryapiapp.demo.Models.MercuryResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import sun.net.www.http.HttpClient;

@RestController
public class MercuryResponseController {

    @Value("${api-Key}")
    private String apiKey;
    @Value("${mercury-url}")
    private String mercuryUrl;

    @RequestMapping(value = "/dupa", method = RequestMethod.GET)
    public void getResponceMercuryWebside(@RequestParam("url") String url){

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("x-api-key", apiKey);

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<MercuryResponse> respEntity = restTemplate.exchange(mercuryUrl+url, HttpMethod.GET, entity, MercuryResponse.class);
        MercuryResponse mercuryResponse = respEntity.getBody();
        System.out.println(mercuryResponse.toString());
    }

>>>>>>> Stashed changes
}
