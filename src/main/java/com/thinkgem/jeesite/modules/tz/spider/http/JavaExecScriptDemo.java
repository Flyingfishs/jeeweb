package com.thinkgem.jeesite.modules.tz.spider.http;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
 
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
 
public class JavaExecScriptDemo {
   
  public static void main(String[] args) {
	String s = "var SmlsjzDateObj={cats:['基金净值','累计净值'],hisNavCats:[],latestJzInfo:['','',''],jzdw:[1],navList1:['2014,10,6,1.0,1.0','2015,2,31,1.01,1.01','2015,3,1,1.3683,1.3683','2015,3,2,1.3704,1.3704','2015,3,3,1.3581,1.3581','2015,3,7,1.4347,1.4347'],navStrListTenDay:[],navStrListOneMonth:[],navStrListThreeMonth:[],navStrListSixMonth:[],navStrListOneYear:[],navStrListJnylDay:[],jlbdStrList:[]};var SmlsjzDateObj_P11704=SmlsjzDateObj;";
    Object[] data = jsObjFunc(s);
    for(int i=0;i<data.length;i++){
    	System.out.println(i+"  "+data[i]);
    }
    
    //System.out.println(Arrays.toString(getArray()));
    //System.out.println(jsCalculate("a=1+2+3+(2*2)"));
    //jsFunction();
    //jsVariables();
  }
  
  /**
   * 运行JS对象中的函数
   * 
   * @return
   */
  public static Object[] jsObjFunc(String script) {
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine scriptEngine = sem.getEngineByName("js");
    try {
    	 scriptEngine.eval(script);
         Object object2 = scriptEngine.eval("SmlsjzDateObj.navList");
         if(null==object2){
        	 return null;
         }
         
         Class<? extends Object> clazz = object2.getClass();
         Field denseField = clazz.getDeclaredField("dense");
         denseField.setAccessible(true);
         return (Object[]) denseField.get(object2);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  
 
  /**
   * 运行JS对象中的函数
   * 
   * @return
   */
  public static Object jsObjFunc() {
    String script =
        "var obj={run:function(){return 'run method : return:\"abc'+this.next('test')+'\"';},next:function(str){return ' 我来至next function '+str+')'}}";
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine scriptEngine = sem.getEngineByName("js");
    try {
      scriptEngine.eval(script);
      Object object = scriptEngine.get("obj");
      Invocable inv2 = (Invocable) scriptEngine;
      return (String) inv2.invokeMethod(object, "run");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
 
  /**
   * 获取js对象数字类型属性
   * 
   * @return
   */
  public static Object[] getArray() {
    ScriptEngineManager sem = new ScriptEngineManager();
    String script = "var obj={array:['test',true,1,1.0,2.11111]}";
 
    ScriptEngine scriptEngine = sem.getEngineByName("js");
    try {
      scriptEngine.eval(script);
      Object object2 = scriptEngine.eval("obj.array");
      Class<? extends Object> clazz = object2.getClass();
      Field denseField = clazz.getDeclaredField("dense");
      denseField.setAccessible(true);
      return (Object[]) denseField.get(object2);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
 
  /**
   * JS计算
   * 
   * @param script
   * @return
   */
  public static Object jsCalculate(String script) {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("javascript");
    try {
      return (Object) engine.eval(script);
    } catch (ScriptException ex) {
      ex.printStackTrace();
    }
    return null;
  }
 
  /**
   * 运行JS基本函数
   */
  public static void jsFunction() {
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("javascript");
    try {
      String script = "function say(name){ return 'hello,'+name; }";
      se.eval(script);
      Invocable inv2 = (Invocable) se;
      String res = (String) inv2.invokeFunction("say", "test");
      System.out.println(res);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 
  /**
   * JS中变量使用
   */
  public static void jsVariables() {
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine engine = sem.getEngineByName("javascript");
    File file = new File("/data/js.txt");
    engine.put("file", file);
    try {
      engine.eval("println('path:'+file.getAbsoluteFile())");
    } catch (ScriptException e) {
      e.printStackTrace();
    }
 
  }
}