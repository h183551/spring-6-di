package guru.springframework.spring6di.controllers.MultiOpSysEnvAssignment;

import guru.springframework.spring6di.services.MultiOpSysEbvAssignment.OpEnvServiceUat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("Uat")
@SpringBootTest(classes = {OpEnvController.class, OpEnvServiceUat.class})
class OpEnvControllerUatTest {

    @Autowired
    OpEnvController opEnvController;

    @Test
    void sayOpSysEnv() {
        System.out.println(opEnvController.sayOpSysEnv());
    }
}