package foundation.app.api.operation;

import dev.soffa.foundation.core.Operation;
import foundation.app.api.schema.EchoInput;
import foundation.app.api.schema.Message;

public interface Echo extends Operation<EchoInput, Message> {
}
