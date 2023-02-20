package by.trayan.algorithms.leetcode;

import by.trayan.algorithms.leetcode.binary_search.FirstBadVersion;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class FirstBadVersionTest {

    @Test
    void firstBadVersion() {
        final int limit = 100;
        final FirstBadVersion firstBadVersion = new FirstBadVersion();
        firstBadVersion.setBadVersion(4);
        Assert.isTrue(firstBadVersion.firstBadVersion(limit) == 4, "");

        firstBadVersion.setBadVersion(50);
        Assert.isTrue(firstBadVersion.firstBadVersion(limit) == 50, "");
    }
}