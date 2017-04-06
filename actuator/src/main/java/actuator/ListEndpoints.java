package actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by haoyifen on 2017/3/22  16:00.
 */
@Component
public class ListEndpoints extends AbstractEndpoint<List<Endpoint>> {
    private final List<Endpoint> endpoints;

    @Autowired
    public ListEndpoints(List<Endpoint> endpoints) {
        super("listEndpoints");
        this.endpoints = endpoints;
    }

    @Override
    public List<Endpoint> invoke() {
        return this.endpoints;
    }
}
