package chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

	public ErrorLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}
	
	public void log(int logLevel,String message){
		if(logLevel == ERROR){
			System.out.println("ERROR : "+message);
		}else{
			//give it to next processor
			super.log(logLevel, message);
		}
	}

}
