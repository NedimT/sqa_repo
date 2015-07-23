package basiclearning;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StudentReader {
	public static void main(String args[]){
		//int i = 1; //int[] intArr = new int[3];
		String[] strArray = new String[5];
        Properties props = readStudentProperties("C:\\sqa_space\\sqaLearningMaven\\studentInfo.properties");
        for(String str :strArray){
            System.out.println(props.getProperty(str));
        	str = props.getProperty(str);
        }
        System.out.println(props.getProperty("1"));
        System.out.println(props.getProperty("2"));
              
        
    }
	public static Properties readStudentProperties(String fileName) {
        //"/Users/prashantnagar/SQAClass/input/input.propeties"     
        Properties props = new Properties();
        //Properties needs a reader object
        //BufferedReader needs FileReader
        //FileReader needs File object
        //File object needs the complete file path+name;
        File f = new File(fileName);        
        BufferedReader reader = null;
        try {           
            FileReader fileReader = new FileReader(f);
            reader = new BufferedReader(fileReader);            
            props.load(reader);                 
        } catch (IOException e) {
            e.printStackTrace();        
        } finally {         
            if(reader != null){
                try{
                    reader.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        return props;
    }
}
