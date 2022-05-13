package etc;

import java.util.Scanner;

public class BaekJoon1157 {

//	�븣�뙆踰� ���냼臾몄옄濡� �맂 �떒�뼱媛� 二쇱뼱吏�硫�,
//	�씠 �떒�뼱�뿉�꽌 媛��옣 留롮씠 �궗�슜�맂 �븣�뙆踰녹씠 臾댁뾿�씤吏� �븣�븘�궡�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�떆�삤.
//	�떒, ��臾몄옄�� �냼臾몄옄瑜� 援щ텇�븯吏� �븡�뒗�떎.

	public static void main(String[] args) {
		int alphNum;

		int[] alphabet = new int[24];
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String upper = str.toUpperCase();
		
		
		for (int i = 0; i < str.length(); i++) {
			alphabet[i] = str.charAt(i);
		}
		for (int j = 0; j < alphabet.length; j++) {
			System.out.print(alphabet[j] + " ");
		}

	}
}
