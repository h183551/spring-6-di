package guru.springframework.spring6di.controllers.MultiOpSysEnvAssignment;

import guru.springframework.spring6di.services.MultiOpSysEbvAssignment.OpEnvServiceProd;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("Prod")
@SpringBootTest(classes = {OpEnvController.class, OpEnvServiceProd.class})
class OpEnvControllerProdTest {

    @Autowired
    OpEnvController opEnvController;

    @Test
    void sayOpSysEnv() {
        System.out.println(opEnvController.sayOpSysEnv());
    }
}