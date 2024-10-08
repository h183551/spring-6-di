package guru.springframework.spring6di.controllers.MultiOpSysEnvAssignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpEnvControllerTest {

    @Autowired
    OpEnvController opEnvController;

    @Test
    void sayOpSysEnv() {
        System.out.println(opEnvController.sayOpSysEnv());
    }
}