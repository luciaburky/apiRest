package com.ejapirest.apiRest.controllers;
import com.ejapirest.apiRest.entities.Persona;
import com.ejapirest.apiRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
// permitimos el acceso o no desde distintos origenes
// con el * indicamos q podemos acceder desde varios clientes a la API
@RequestMapping(path = "api/v1/personas")
// con esa URL vamos a acceder a los metodos de persona
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}
