package com.hello.app;

import org.junit.jupiter.api.Test;
import org.openrewrite.test.RecipeSpec;
import org.openrewrite.test.RewriteTest;

import static org.openrewrite.java.Assertions.java;

class HelloCyberLandTest implements RewriteTest {

    @Override
    public void defaults(RecipeSpec spec) {

        spec.recipe(new HelloCyberLand("com.something.A"));
    }

    @Test
    void add_hello_method() {
        rewriteRun(
            java(
                """
                    package com.something;
        
                    class A {
                    }
                """,
                """
                    package com.something;
        
                    class A {
                        public String hello() {
                            return "Hello CyberLand From com.something.A!";
                        }
                    }
                """
            )
        );
    }
}
