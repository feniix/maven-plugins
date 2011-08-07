package net.feniixhq.maven.plugins

import org.codehaus.gmaven.mojo.GroovyMojo

import org.jfrog.maven.annomojo.annotations.MojoGoal
import org.jfrog.maven.annomojo.annotations.MojoParameter
import org.jfrog.maven.annomojo.annotations.MojoPhase

/*
 * Says "Hi" to the user... er well not really :-P.
 * 
 */
@MojoGoal("sayhi")
@MojoPhase("validate")
public class GreetingMojo
    extends GroovyMojo
{

    void execute() {
        log.info("Hello groovy!")
    }

}

