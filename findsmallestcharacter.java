public class findsmallestcharacter {
    public static void main(String[] args) {
        findsmallestcharacter sol = new findsmallestcharacter();
        
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        
        System.out.println(sol.nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        char result = letters[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                result = letters[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}