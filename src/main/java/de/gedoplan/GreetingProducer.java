package de.gedoplan;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.Reserve;

@ApplicationScoped
public class GreetingProducer {

    @Produces
    @Reserve
    @ApplicationScoped
    @Priority(0)
    Greeter plainGreeter() {
        return name -> "Hello " + name;
    }
}
