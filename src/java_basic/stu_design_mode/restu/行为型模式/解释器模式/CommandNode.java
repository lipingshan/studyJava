package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

public class CommandNode extends Node {

	private Node node;
	public void parse(Context context) throws ParseException {
		if(context.getCurrentToken().equals("repeat")){
			node = new RepeatCommandNode();
			node.parse(context);
		}else{
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}
	
	public String toString(){
		return node.toString();
	}

}
