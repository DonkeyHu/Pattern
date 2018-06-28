package com.study.stratege;
/**
 * 模拟公司针对不同客户报价
 * 一般的写法
 * 想一想,如果每个具体实现的业务逻辑很复杂的话，确实难以维护，违反了开闭原则
 * @author DonkeyHu
 *
 */
public class TestStratege {
	public double getPrice(String type,double standardPrice) {
		if(type.equals("NewCustomFewBuy")) {
			System.out.println("原价出售");
			return standardPrice;
		}else if(type.equals("NewCustomManyBuy")) {
			System.out.println("打九折");
			return standardPrice*0.9;
		}else if(type.equals("OldCustomFewBuy")) {
			System.out.println("打九折");
			return standardPrice*0.9;
		}else if(type.equals("OldCustomManyBuy")) {
			System.out.println("老客户,打八折");
			return standardPrice*0.8;
		}
		return standardPrice;
	}
}
