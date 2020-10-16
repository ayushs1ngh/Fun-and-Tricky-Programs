import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AlternateCapitaliseTests{
    @Test
    public void lowerCaseLettersAreCapitalisedCorrectly(){
        assertArrayEquals(new String[]{"GiThUb", "gItHuB"}, AlternateCapitalise.capitalise("github"));
    }
    
    @Test
    public void upperCaseLettersAreCapitalisedCorrectly(){
        assertArrayEquals(new String[]{"CaPiTaLiSe", "cApItAlIsE"}, AlternateCapitalise.capitalise("CAPITALISE"));
    }
    
    @Test
    public void mixedCaseLettersAreCapitalisedCorrectly(){
        assertArrayEquals(new String[]{"ThIsIsAtEsT", "tHiSiSaTeSt"}, AlternateCapitalise.capitalise("ThisIsATest"));
    }
}