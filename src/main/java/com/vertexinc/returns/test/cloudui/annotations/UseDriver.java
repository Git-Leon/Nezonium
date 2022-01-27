package com.vertexinc.returns.test.cloudui.annotations;

import com.vertexinc.returns.test.cloudui.util.Browsers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//@Documented - denotes API documentation will be cascaded
//@Inherited - denotes if subclasses will inherit annotations.
@ExtendWith({DriverProvider.class})
public @interface UseDriver {
    Browsers browser(); //default Browsers.CHROME;
//    String screenshotOutputDir();// default ScreenShotOnFail.CHROME_DIR_DEFAULT;
}
