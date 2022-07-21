package controllers;

import org.junit.jupiter.api.Test;
import root.utils.IdGenerator;

class UtilControllerTest {

    @Test
    void getId() {
        System.out.println(IdGenerator.getId());
        System.out.println(IdGenerator.getId());
    }
}