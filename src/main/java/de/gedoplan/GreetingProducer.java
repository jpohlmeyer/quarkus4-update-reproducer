package de.gedoplan;

import io.quarkus.arc.DefaultBean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class GreetingProducer {

    @Produces
    @DefaultBean
    @ApplicationScoped
    Greeter plainGreeter() {
        return name -> "Hello " + name;
    }
}
