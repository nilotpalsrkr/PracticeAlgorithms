package leetcode.dsa.medium;

public class Q161_One_Edit_Distance {
    Boolean isEditDistance = false;
    int editCount;
    public boolean isOneEditDistance(String s, String t) {
        //if(s.equals(t)) { isEditDistance = false; }
        if((s.length() == 0 || t.length() == 0) && (Math.abs(s.length() - t.length()))== 1) return true;
        if(s.length() == 0 && t.length() == 0) return false;
        isEditDistanceHelper(new StringBuffer(s), t, 0, 0);
        return isEditDistance;
    }

    public void isEditDistanceHelper(StringBuffer s, final String t, Integer sCounter, Integer tCounter) {

        if((sCounter > s.length() || tCounter > t.length()) && !s.toString().equals(t)) {
            isEditDistance =  false;
            return;
        }
        if(editCount > 1) return ;
        try {
            if (s.toString().equals(t) && editCount == 1) {
                isEditDistance = true;
                return;
            } else if (s.charAt(sCounter) != t.charAt(tCounter)) {
                //StringBuffer temp = new StringBuffer(s);
                editCount++;
                if(!isEditDistance)
                tryReplacing(new StringBuffer(s), t, sCounter, tCounter);
                if(!isEditDistance)
                tryDeleting(new StringBuffer(s), t, sCounter, tCounter);
                if(!isEditDistance)
                tryInserting(new StringBuffer(s), t, sCounter, tCounter);
            }
        }catch (StringIndexOutOfBoundsException e) {
            isEditDistance = false;
            if(sCounter == s.length() && !isEditDistance && editCount == 0) {
                editCount++;
                tryInserting(new StringBuffer(s), t, sCounter, tCounter);
            }
            if(sCounter == s.length() -1 && !isEditDistance && editCount == 0) {
                editCount++;
                tryDeleting(new StringBuffer(s), t, sCounter, tCounter);
            }
        }
        if(!isEditDistance)
        isEditDistanceHelper(s, t, ++sCounter, ++tCounter);

    }

    private void tryInserting(StringBuffer s, final String t, int sCounter, int tCounter) {

        try {
            s.insert(sCounter, t.charAt(tCounter));
            isEditDistanceHelper(s, t, ++sCounter, ++tCounter);
        }catch (StringIndexOutOfBoundsException e) {
            --editCount;
        }
    }

    private void tryDeleting(StringBuffer s, String t, int sCounter, int tCounter) {
        //if(sCounter > s.length()-1 || tCounter > t.length() -1 ) return;
        s.deleteCharAt(sCounter);
        isEditDistanceHelper(s, t, ++sCounter, ++tCounter);
    }

    private void tryReplacing(StringBuffer s, String t, int sCounter, int tCounter) {
        if(sCounter > s.length()-1 || tCounter > t.length() -1 ) return;
        s.deleteCharAt(sCounter);
        s.insert(sCounter, t.charAt(tCounter));
        isEditDistanceHelper(s, t, ++sCounter, ++tCounter);
    }
}
