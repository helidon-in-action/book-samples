import com.manning.helidoninaction.ch03config.JsonConverter;

module helidon.in.action.ch03config {
    requires io.helidon.microprofile.server;
    requires microprofile.config.api;
    requires jakarta.cdi;
    requires jakarta.inject;
    requires jakarta.json;
    requires jakarta.ws.rs;
    provides org.eclipse.microprofile.config.spi.Converter
            with JsonConverter;
}