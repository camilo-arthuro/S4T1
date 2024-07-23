package cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n02.S04T01N02GalanCarlos.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(name = "name", defaultValue = "UNKNOWN") String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }
    @GetMapping("/HelloWorld/{name}")
    public String hello2(@PathVariable String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }

}
