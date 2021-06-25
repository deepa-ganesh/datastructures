package geeksforgeeks;

/**
 * Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.
 *
 * Input:
 * str = 1abc23
 * Output: 24
 * Explanation: 1 and 23 are numbers in the
 * string which is added to get the sum as
 * 24.
 */
public class SumOfNumbersInString {
    public static void main(String[] args) {
        System.out.println(findSum("auprmwlbjbaokxysmkcxhcjzfsaumezjhhpujwuxhudvwyafowisjvysrdhhkukmcvuunabsiszottjrpqbpfnbquuaqzuadfays6325rccrrhcpahsjvsxmjitdjskvrebczelywmjxtanetflioykjhwbrvdhwjeokeuofsryphsouzmnfuvmthakrkrthfrrgqjapbvgi365hgzegolaourbbnnixwtffsmmhxwdswwvuiiawmflayqbreffqeogfbwficuwjhzhpjsjlddnlwklamcejrmqwriuijyreencjjlr2426ahhlufhbjfsibviofdlfmnukilbpirqwwrfrnuhkufhsvileyuauuejneaeqdjacagujsxfcfoyltvmhplnjuipzmeofoondumtp6761aokkxsgysafduaamaamkmpuupbajgzpxsmcsqjlrvqxgxgsybavfxzqmzikmkctbtwaccqepmrgdkrzimpral"));
    }

    public static long findSum(String str) {
        long sum = 0;
        String temp = "0";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            } else {
                sum += Long.parseLong(temp);
                temp = "0";
            }
        }

        sum += Long.parseLong(temp);

        return sum;
    }
}
