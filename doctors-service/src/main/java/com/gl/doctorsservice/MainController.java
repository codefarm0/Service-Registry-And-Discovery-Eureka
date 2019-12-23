package com.gl.doctorsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {

    @Value("${spring.application.name:no name}")
    private String appName;

    @Value("${server.port:no port}")
    private String port;

    @GetMapping("/doctors")
    public String doctors(){
        return "List of doctors";
    }

    @GetMapping("/location")
    public String getDoctorServiceLocation(){
        return appName + " : " + port;
    }
}
