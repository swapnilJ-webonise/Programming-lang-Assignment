class printStr{
  void printString(String str){
     	System.out.println("You passed a word\t" + str);
  }

}

class PrintSomething{
  	public static void main(String args[]){
      printStr print_str;
	print_str = new printStr();
		String[] words = new String[] {"Pune","Webonise","Jejurkar","lab","swapnil"};
		for(int i = 0 ; i < 5 ; i++)
    {
			if(words[i].length() >= 6)
      {
				System.out.println("\nWord is Bigger");
        print_str.printString(words[i]);
			}
			else
      {
				System.out.println("\nWord is Smaller");
        print_str.printString(words[i]);		
			}
		}	
	}
}


