package io.turntabl.leaderboardservice.model;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfileTest {


    @Test
    void profileSetLanguageLevels(){
        Profile profile = new Profile();
        LanguageLevel languageLevel = new LanguageLevel();
        languageLevel.setName("George");
        languageLevel.setRank(399);
        assertEquals(profile,profile.setLanguageLevels(List.of(languageLevel)));

    }

}
