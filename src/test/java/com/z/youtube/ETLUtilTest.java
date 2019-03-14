package com.z.youtube;

import com.z.youtube.util.ETLUtil;

public class ETLUtilTest {

	public static void main(String[] args) {
		String oriString = "MEvoy_owET8	smpfilms	736	Travel & Places	921	109673	4.25	1181	774	YtX2nwowMtU	A5dp02FXDmM	bGoUu4gAHaI	faDB-ToajhM	srcg9xLjtuE	9aE4eMVeUEw	G5fZky7Nm1k	UEXvMJo3ZAY	sCTbH-VP7mA	WiriPTfpIP8	W-s_e61hkys	cQWtiU6d99w	93LHxjgQ4LE	JEiATJFBWO0	JzjnhpqWIPs	G_qfXiOkYPU	Gd6M-B3FOaQ	Y5pMgbhyb18	7jdAdCmMRkg	yxbLFd6Y38E";
		System.out.println(oriString);
		String etlString = ETLUtil.oriString2ETLString(oriString);
		System.out.println(etlString);
		
	}

}
