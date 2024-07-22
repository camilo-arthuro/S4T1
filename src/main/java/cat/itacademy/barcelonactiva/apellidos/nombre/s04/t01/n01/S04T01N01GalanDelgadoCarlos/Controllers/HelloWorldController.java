package cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n01.S04T01N01GalanDelgadoCarlos.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(name= "name", defaultValue = "UNKNOWN") String name){
        return "Hi " + name + ". You are running a maven project";
    }
    @GetMapping("/HelloWorld/{name}")
    public String hello2(@PathVariable String name){
        return "Hi " + name + ". You are running a maven project";
    }
}
