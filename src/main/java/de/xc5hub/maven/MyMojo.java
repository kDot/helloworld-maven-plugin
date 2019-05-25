package de.xc5hub.maven;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Goal which touches a timestamp file.
 */
@Mojo( name = "sayhello" )
public class MyMojo
    extends AbstractMojo
{
    /**
     * Location of the file.
     */
    @Parameter( defaultValue = "Stranger", property = "name", required = true )
    private String name;

    public void execute()
        throws MojoExecutionException
    {
        getLog().info("Hello "+name+" ");
    }
}
