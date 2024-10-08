package guru.springframework.spring6di.services.MultiOpSysEbvAssignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Uat")
@Service("multiEnvService")
public class OpEnvServiceUat implements OpEnvService{
    @Override
    public String sayOpSysName(){
        return "Uat";
    }
}
