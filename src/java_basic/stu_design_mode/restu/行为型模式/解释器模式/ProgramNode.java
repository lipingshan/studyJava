package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

public class ProgramNode extends Node {

	private Node commandListNode;
	public void parse(Context context) throws ParseException {
		context.skipToken("program");
		commandListNode=new CommandListNode();
		commandListNode.parse(context);
	}
	public String toString(){
		return "[program "+commandListNode+"]";
	}

}
