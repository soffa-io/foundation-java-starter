package foundation.app.core.handler;

import dev.soffa.foundation.annotation.Feature;
import dev.soffa.foundation.context.OperationContext;
import foundation.app.api.operation.Echo;
import foundation.app.api.schema.EchoInput;
import foundation.app.api.schema.Message;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.inject.Named;

@Named
@Feature(name = "features.echo")
public class DoEcho implements Echo {

    @Override
    public Message handle(EchoInput input, @NonNull OperationContext context) {
        return new Message(input.getMessage());
    }

}
