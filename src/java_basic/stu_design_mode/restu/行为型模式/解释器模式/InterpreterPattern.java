package java_basic.stu_design_mode.restu.行为型模式.解释器模式;

import java.io.*;


public class InterpreterPattern {

	public static void main(String[] args) {
		
		try {

			BufferedReader  reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src"+"/java_basic/stu_design_mode/restu/行为型模式/解释器模式/program.txt"));
			String line=null;
			while((line=reader.readLine())!=null){
				System.out.println("源程序为："+line);
				System.out.println("自顶向下解析为：");
				Node node=new ProgramNode();
				node.parse(new Context(line));
				System.out.println(node);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
