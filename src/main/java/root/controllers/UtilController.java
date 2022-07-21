package root.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import root.utils.IdGenerator;

@RestController
@RequestMapping("id")
public class UtilController {

    @GetMapping
    public int getId() {
        return IdGenerator.getId();
    }
}
