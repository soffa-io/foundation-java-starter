package foundation.app.gateways.inbound;

import dev.soffa.foundation.context.Context;
import dev.soffa.foundation.core.Operation;
import dev.soffa.foundation.spring.service.OperationDispatcher;
import foundation.app.api.resource.EchoResource;
import lombok.AllArgsConstructor;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EchoController implements EchoResource {

    private OperationDispatcher dispatcher;

    @Override
    public <I, O, T extends Operation<I, O>> O invoke(Class<T> operationClass, I input, @NonNull Context ctx) {
        return dispatcher.dispatch(operationClass, input, ctx);
    }

    @Override
    public <I, O, T extends Operation<I, O>> O invoke(Class<T> operationClass, I input) {
        return dispatcher.dispatch(operationClass, input);
    }
}
