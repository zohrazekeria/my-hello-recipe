# my-hello-recipe
Example for writing a Java refactoring recipe.

 This simple hello recipe can be used as follows

         <plugin>
            <groupId>org.openrewrite.maven</groupId>
            <artifactId>rewrite-maven-plugin</artifactId>
            <version>4.37.0</version>
            <configuration>
              <activeRecipes>
                <recipe> com.hello.app.HelloCyberLand</recipe>
              </activeRecipes>
            </configuration>
            <dependencies>
              <dependency>
                <groupId>com.hello.app</groupId>
                <artifactId>Hello</artifactId>
                <version>1.0.0-SNAPSHOT</version>
              </dependency>
            </dependencies>
          </plugin>
For more Information visit: https://docs.openrewrite.org/authoring-recipes/writing-a-java-refactoring-recipe
