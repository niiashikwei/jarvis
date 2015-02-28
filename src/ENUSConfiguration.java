/**
 * Created by Thoughtworker on 2/27/15.
 */

public class ENUSConfiguration {
    Configuration configuration;

    public ENUSConfiguration(){
        configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
    }
}
