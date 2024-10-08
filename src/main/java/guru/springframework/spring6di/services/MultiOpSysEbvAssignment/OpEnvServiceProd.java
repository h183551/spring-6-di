package guru.springframework.spring6di.services.MultiOpSysEbvAssignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service("multiEnvService")
public class OpEnvServiceProd implements OpEnvService{
    @Override
    public String sayOpSysName(){
        return "Prod";
    }
}