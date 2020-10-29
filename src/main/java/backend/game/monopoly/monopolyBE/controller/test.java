package backend.game.monopoly.monopolyBE.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class test{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String testRoute(){
        log.info("Wawanakwa");
        return "RyanForcedMeToPutSomethingHere";
    }
}