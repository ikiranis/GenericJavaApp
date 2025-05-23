package eu.apps4net.genericJavaApp.services;

import org.springframework.stereotype.Service;

import eu.apps4net.genericJavaApp.configurations.Language;
import eu.apps4net.genericJavaApp.models.LanguageDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageService {

    public List<LanguageDTO> getTranslations(String language) throws Exception {
        List<LanguageDTO> translations = new ArrayList<>();

        Language.getTranslations(language).forEach((key, value) -> {
            translations.add(new LanguageDTO(key, value));
        });

        return translations;
    }
}
