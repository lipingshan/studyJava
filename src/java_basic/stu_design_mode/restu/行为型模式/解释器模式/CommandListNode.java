package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

import java.util.ArrayList;

public class CommandListNode extends Node {

	private ArrayList list=new ArrayList();
	
	public void parse(Context context) throws ParseException {
		while(true){
			if(context.getCurrentToken()==null){
				throw new ParseException("错误！！！"+"当前字符为空");
			}else if(context.getCurrentToken().equals("end")){
				context.skipToken("end");
				break;
			}else{
				Node commandNode=new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}
	
	public String toString(){
		return list.toString();
	}

}
