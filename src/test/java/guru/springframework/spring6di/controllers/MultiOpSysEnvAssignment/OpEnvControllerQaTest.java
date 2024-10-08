package guru.springframework.spring6di.controllers.MultiOpSysEnvAssignment;

import guru.springframework.spring6di.services.MultiOpSysEbvAssignment.OpEnvServiceDev;
import guru.springframework.spring6di.services.MultiOpSysEbvAssignment.OpEnvServiceQa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("Qa")
@SpringBootTest(classes = {OpEnvController.class, OpEnvServiceQa.class})
class OpEnvControllerQaTest {

    @Autowired
    OpEnvController opEnvController;

    @Test
    void sayOpSysEnv() {
        System.out.println(opEnvController.sayOpSysEnv());
    }
}