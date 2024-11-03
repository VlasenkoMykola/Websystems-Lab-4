package ua.knu.vlasenko.wslab1.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping(
	value = "/products/{productId}",
	produces="application/json"
    )
    public String products(@PathVariable Integer productId) {
	//{ "id": "{productId}", "name": "{productId} name" }
	Map<String, String> reply = new HashMap<String, String>();
	reply.put("id", productId.toString());
	reply.put("name", productId.toString()+ " name");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(reply);
    }

    @GetMapping(
	value = "/my",
	produces="text/plain"
    )
    public String mydebug() {
        return "Hello My Debug";
    }

    @GetMapping(
	value = "/test2",
	produces="text/plain"
    )
    public String test2() {
        return "Second Test Message";
    }
    
}
