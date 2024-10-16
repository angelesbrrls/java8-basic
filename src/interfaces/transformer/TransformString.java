package interfaces.transformer;

public class TransformString {
	
	public static void main(String[] args) {
		
		String text = "Hell@ Functional Interface";
		
		StringTransformer upper = (textTransform) -> textTransform.toUpperCase();
		
		StringTransformer revertText = (textTransform) -> new StringBuilder(textTransform).reverse().toString();
		
		StringTransformer replaceText = (textTransform) -> text.replaceAll("\\s+", "");
		
		System.out.println(applyTransform(text, upper));
		System.out.println(applyTransform(text, revertText));
		System.out.println(applyTransform(text, replaceText));
		System.out.println(text);
	}
	
	
	static String applyTransform(String input, StringTransformer transformer) {
		return transformer.transformer(input);
	}

}
