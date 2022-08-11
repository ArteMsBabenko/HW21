package Lesson21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		List<String> annotationValuesList = getAnnotationValues(Product.class);
		
		for(String string : annotationValuesList) {
			System.out.println(string);
		}
		
		writeObjectToFile(annotationValuesList, new File("ProdcutAnnotation.obj"));
		writeListItemsToFile(annotationValuesList, new File("ProdcutAnnotation.txt"));
		
	}
	
	public static List<String> getAnnotationValues(Class<?> customClass) {
		
		List<String> annotationValues = new ArrayList<String>();
		
		Field[] classFields = customClass.getDeclaredFields();
		
		for(int i =0; i<classFields.length; i++) {
			Field field = classFields[i];
			
			if(field.getAnnotation(ProductAnnotation.class) instanceof ProductAnnotation) {
				annotationValues.add(field.getType().getSimpleName() + " " + field.getName() + "--->" + field.getAnnotation(ProductAnnotation.class));
			}
		}
		return annotationValues;
	}
	
	public static void writeObjectToFile(Object object, File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}
	
	public static void writeListItemsToFile(List<String> list, File file) throws IOException {
		Files.write(file.toPath(), list);
	}

}
