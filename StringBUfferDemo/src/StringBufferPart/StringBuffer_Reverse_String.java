package StringBufferPart;

public class StringBuffer_Reverse_String {

	public static void main(String[] args) {

		String rnm = "yruhdwohC numaM";

		StringBuffer mc = new StringBuffer(rnm);
		System.out.println(mc.reverse());
		

		String num = "Mamun Chowdhury";

		StringBuffer rev = new StringBuffer(num);
		System.out.println(rev.reverse());
		
		
		
		String def = "yruhdwohC numaM";

		StringBuffer sbf = new StringBuffer(def);
		StringBuffer chn = sbf.reverse();
		System.out.println(chn);
	}

}
