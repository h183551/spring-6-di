package guru.springframework.spring6di.services.MultiOpSysEbvAssignment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Dev", "default"})
@Service("multiEnvService")
public class OpEnvServiceDev implements OpEnvService {
    @Override
    public String sayOpSysName(){
        return "Dev";
    }
}
