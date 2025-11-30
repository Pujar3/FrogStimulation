public class CodeWordChecker implements StringChecker
{
    private int minLen;
    private int maxLen;
    private String notA;
    public CodeWordChecker(int min, int max, String notAllowed) {
        minLen = min;
        maxLen = max;
        notA = notAllowed;
    }

    public CodeWordChecker(String notAllowed)
    {
        minLen = 6;
        maxLen = 20;
        notA = notAllowed;
    }

    public boolean isValid(String str) {
        if (str.length() >= minLen && str.length() <= maxLen)
        {
            if (str.indexOf(notA) > -1){
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}
