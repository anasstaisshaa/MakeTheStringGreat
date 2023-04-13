class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            if ((Character.isLowerCase(sb.charAt(i)) && Character.isUpperCase(sb.charAt(i+1)) &&
                    Character.toString(sb.charAt(i)).equalsIgnoreCase(Character.toString(sb.charAt(i+1)))) ||
                    (Character.isLowerCase(sb.charAt(i+1)) && Character.isUpperCase(sb.charAt(i)) &&
                            Character.toString(sb.charAt(i+1)).equalsIgnoreCase(Character.toString(sb.charAt(i))))) {
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                i = -1;
            }
        }
        return sb.toString();
    }
}