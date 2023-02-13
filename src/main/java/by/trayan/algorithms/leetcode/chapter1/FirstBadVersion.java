package by.trayan.algorithms.leetcode.chapter1;

public class FirstBadVersion {

    private int badVersion;

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid))
                start = mid + 1;
            else end = mid;
        }
        return start;
    }

    private boolean isBadVersion(int versionPosition) {
        return versionPosition >= badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }
}
