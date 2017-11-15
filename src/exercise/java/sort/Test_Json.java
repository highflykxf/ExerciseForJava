package exercise.java.sort;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
public class Test_Json {
    /**
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
    	BufferedReader jsonreader=null;
    	String arraystring="[";
    	try{
    		FileInputStream fileinputstream=new FileInputStream("datasegment.json");
        	InputStreamReader inputstreamreader=new InputStreamReader(fileinputstream,"UTF-8");
        	jsonreader=new BufferedReader(inputstreamreader);
        	String tempString=null;
        	while((tempString=jsonreader.readLine())!=null){
        		arraystring+=tempString;
        		arraystring+=",";
            	//System.out.println(tempString);
            	//JSONObject jobj=JSON.parseObject(tempString);
            	//System.out.println(jobj.get("id"));
            	//System.out.println(jobj.get("content"));
            	//System.out.println(jobj.get("u"));
            	//System.out.println(jobj.get("t"));
            	//System.out.println(jobj.get("pt"));
        	}
        	arraystring+="]";
        	jsonreader.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}finally{
    		if(jsonreader!=null){
    			try{
    				jsonreader.close();
    			}catch(IOException e){
    				e.printStackTrace();
    			}
    		}
    	}
    	System.out.println(arraystring);
    	JSONArray arr=JSONArray.parseArray(arraystring);
    	int size=arr.size();
    	System.out.println(size);
    	for(int i=0;i<size;i++){
    		JSONObject jsonObject=arr.getJSONObject(i);
    		System.out.println(jsonObject.get("id"));
    		System.out.println(jsonObject.get("content"));

    	}
    }
}




//Program_1
//Person person = new Person();
//person.setAge(32);
//person.setName("wangyunpeng");
//String json = FastJSONHelper.serialize(person);
//System.out.println(json);
//
//person = FastJSONHelper.deserialize(json, Person.class);
//System.out.println(String.format("Name:%s,Age:%s",person.getName(),person.getAge()));

//Program_2
/*
ArrayList<Person> list = new ArrayList<Person>();
Person person1 = new Person();
person1.setAge(32);
person1.setName("wangyunpeng");
list.add(person1);
Person person2 = new Person();
person2.setAge(17);
person2.setName("shyx");
list.add(person2);
String json = FastJSONHelper.serialize(list);
System.out.println(json);

Person[] persons = FastJSONHelper.deserialize(json, Person[].class);
for (Person person : persons) {
  System.out.println(String.format("Name:%s,Age:%s", person.getName(),person.getAge()));
}
*/

//Program_3
/*
ArrayList<Person> list = new ArrayList<Person>();
Person person1 = new Person();
person1.setAge(32);
person1.setName("wangyunpeng");
list.add(person1);
Person person2 = new Person();
person2.setAge(17);
person2.setName("shyx");
list.add(person2);
String json = FastJSONHelper.serialize(list);
System.out.println(json);

List<Person> personList = FastJSONHelper.deserializeList(json, Person.class);
for (Person person : personList) {
  System.out.println(String.format("Name:%s,Age:%s", person.getName(),person.getAge()));
}
*/

//Program_4
/*
List<String> list = new ArrayList<String>();
list.add("wyp");
list.add("shyx");
String json = FastJSONHelper.serialize(list);
System.out.println(json);
list = FastJSONHelper.deserializeList(json, String.class);
for (String string : list) {
  System.out.println(string);
}
*/

//Program_5
/*
HashMap<String, Object> map = new HashMap<String, Object>();
map.put("key1", "value1");
map.put("key2", "value2");

HashMap<String, Object> map2 = new HashMap<String, Object>();
map2.put("key1", 1);
map2.put("key2", 2);

HashMap<String, Object> map3 = new HashMap<String, Object>();
Person person1 = new Person();
person1.setAge(32);
person1.setName("wangyunpeng");
map3.put("wyp", person1);
Person person2 = new Person();
person2.setAge(17);
person2.setName("shenyunxiao");
map3.put("shyx", person2);

List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
list.add(map);
list.add(map2);
list.add(map3);

String json = FastJSONHelper.serialize(list);
System.out.println(json);

list = FastJSONHelper.deserializeAny(json,
       new TypeReference<List<HashMap<String, Object>>>() {
       });
for (HashMap<String, Object> item : list) {
   for (Map.Entry<String, Object> entry : item.entrySet()) {
       String key = entry.getKey();
       Object value = entry.getValue();
       if (value instanceof JSONObject) {
           JSONObject jObj = (JSONObject) value;
           String json2 = FastJSONHelper.serialize(jObj);
           Person other = FastJSONHelper.deserialize(json2, Person.class);
           System.out.println(String.format(
                   "Key:%s,Value:[Name:%s,Age:%s]", key,
                   other.getName(), other.getAge()));
       } else {
           System.out.println(String.format("Key:%s,Value:%s", key,
                   value));
       }
   }
}
*/
//Program_6
/*
Person jack=new Person("jack",21);
String json=JSON.toJSONString(jack);
System.out.println(json);
jack=FastJSONHelper.deserialize(json, Person.class);
System.out.println(jack.getName());
*/