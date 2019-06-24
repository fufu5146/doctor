package com.example.docteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DocteurApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocteurApplication.class, args);
    }

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		return "<ul><li><a href='/docteur/1'>Doctor 1</a></li>\n <br> <li><a href='/docteur/2'>Doctor 2</a></li> \n <br><li><a href='/docteur/4'>Doctor 4</a></li> \n<br> <li><a href='/docteur/5'>Doctor 5</a></li> </ul>\n";
	} 
	
    @RequestMapping("/docteur/1")
    @ResponseBody
    public String docteurOne() {
        return "Greetings from <img src='https://upload.wikimedia.org/wikipedia/en/thumb/a/aa/William_Hartnell.jpg/220px-William_Hartnell.jpg'>!";
	}
	@RequestMapping("/docteur/2")
    @ResponseBody
	public String docteurTwo() {
        return "Greetings from <img src='https://upload.wikimedia.org/wikipedia/en/thumb/8/80/Patrick_Troughton_Head.jpg/220px-Patrick_Troughton_Head.jpg'>!";
	}
	@RequestMapping("/docteur/4")
    @ResponseBody
	public String docteurThree() {
        return "Greetings from <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Tom_Baker.jpg/220px-Tom_Baker.jpg'>!";
	}
	@RequestMapping("/docteur/5")
    @ResponseBody
	public String docteurFour() {
        return "Greetings from <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Peter_Davison_2016.jpg/220px-Peter_Davison_2016.jpg'>!";
    }

}