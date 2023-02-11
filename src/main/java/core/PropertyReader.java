package core;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("config.properties")
public class PropertyReader extends BaseClass{

    @Property("NAME_FOR_REGISTRATION")
    public static String name;

    @Property("PASSWORD_FOR_REGISTRATION")
    public static String passwordForRegistration;

    @Property("EMAIL_FOR_REGISTRATION")
    public static String emailForRegistration;

    @Property("EMAIL_FOR_INCORRECT_REGISTRATION")
    public static String badEmail;

    @Property("INCORRECT_PASSWORD_FOR_REGISTRATION")
    public static String badPassword;

    @Property("EMAIL_FOR_LOGIN")
    public static String myEmail;

    @Property("CORRECT_PASSWORD_FOR_LOGIN")
    public static String myPassword;

    public PropertyReader(){
        PropertyLoader.newInstance().populate(this);
    }

}

