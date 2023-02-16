package by.trayan.algorithms.interview;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class IsPangramTest {

    @Test
    void isPangram() {
        final String pangram = "pack my box with five dozen liquor jugs";
        final String notPangram = "Test not pangram";

        Assert.isTrue(IsPangram.isPangram(pangram), "");
        Assert.isTrue(!IsPangram.isPangram(notPangram), "");
    }
}