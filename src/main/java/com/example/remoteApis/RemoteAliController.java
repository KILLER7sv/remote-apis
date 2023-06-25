package com.example.remoteApis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteAliController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=d731ebfef4a01365656d87394fd7df68";
        Object responseObject = restTemplate.getForObject(url , Object.class); // we have to enter the class of the return type
        return responseObject;
    }

    @GetMapping("/getCustomDetails")
    public MovieResponse getCustomDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=d731ebfef4a01365656d87394fd7df68";
        MovieResponse responseObject = restTemplate.getForObject(url , MovieResponse.class);
        // just enter the class and it will automatically fetch the params we need
        return responseObject;
    }
}
