public class WhereInSequence {
    public static int whereInSequence(long[] sequence, int input){

        for(int i = 0; i < sequence.length - 1; i++) {
            if (input == sequence[i]) {
                return i; //index where input is located
            } else if(input < sequence[i]){
                return i - 1; //return position of the closet number lower than the input
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //NotFibonacci notFib = new NotFibonacci();
        long[] sequence = NotFibonacci.notFibonacci(10);
        int input = 140;

        int index = whereInSequence(sequence, input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + index); //index location

    }
}
