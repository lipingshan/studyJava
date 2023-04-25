package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

public class ParseException extends Exception {

	private static final long serialVersionUID = 3996163326179443976L;

	public ParseException(String word){
		super(word);
	}

}
