package eu.apps4net.genericJavaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eu.apps4net.genericJavaApp.configurations.Language;
import eu.apps4net.genericJavaApp.services.SettingService;

@SpringBootApplication
public class GenericJavaApp {
    private static SettingService settingService;

    public GenericJavaApp(SettingService settingService) {
        GenericJavaApp.settingService = settingService;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(GenericJavaApp.class, args);

        Language.setActionsLanguage(settingService.getDefaultActionsLanguage());

        System.out.println("Run app on http://localhost:9999");

    }

}
