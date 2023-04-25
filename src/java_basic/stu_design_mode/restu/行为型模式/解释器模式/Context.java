package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

import java.util.StringTokenizer;

public class Context {

	private StringTokenizer tokenizer ;
	private String currentToken;
	public Context(String token){
		tokenizer=new StringTokenizer(token);// 以空格作为拆分 https://www.runoob.com/w3cnote/java-stringtokenizer-intro.html
		nextToken();
	}
	public String nextToken() {
		if(tokenizer.hasMoreTokens()){
			currentToken=tokenizer.nextToken();
		}else{
			currentToken=null;
		}
		return currentToken;
	}
	public String getCurrentToken(){
		return currentToken;
	}
	public void skipToken(String token) throws ParseException{
		if(!token.equals(currentToken)){
			throw new ParseException("错误！！！"+"期待"+currentToken+"但是却得到"+token);
		}
		nextToken();
	}
	public int currentNumber() throws ParseException{
		int num=0;
		try{
			num=Integer.parseInt(currentToken);
		}catch(NumberFormatException e){
			throw new ParseException(e.toString());
		}
		return num;
	}
	
}
