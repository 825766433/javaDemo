package effectiveJava.dependencyInjection.bookDemo;

import java.util.Objects;

/**
 * @ClassName SpellChecker
 * @Author licongcong
 * @Date 2021/3/12 14:19
 * @Version 1.0
 **/
public class SpellChecker {

    private Lexicon lexicon;
    private User user;

    public SpellChecker(Lexicon lexicon, User user) {
        this.lexicon = lexicon;
        this.user = user;
    }

    public SpellChecker(Lexicon lexicon) {
        this.lexicon = Objects.requireNonNull(lexicon);
    }

    public boolean isValid(String word){
        return lexicon.select();
    }

    public void whoUse(){
        user.use();
    }


}
