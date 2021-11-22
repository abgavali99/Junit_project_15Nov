package junits;

import java.lang.annotation.*;
import java.lang.annotation.Target;

//import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("Sanity")
@Test
@DisplayName("Negative TestCase")

public @interface CustomAnnotation {
	

}
