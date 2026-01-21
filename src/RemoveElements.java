public class RemoveElements {
    public int removeElement(double[] nums, double val) {

        int k = 0; //counter for nums larger than val

        for (int i = 0; i < nums.length; i++){
            if(nums[i] >= val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        RemoveElements remover = new RemoveElements();

        double[] nums = {0.3, 1.6, 2.8, 2.3, 3.5, 0.2, 4.5, 2.1};
        double val = 3.1;

        //Print Input
        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
         System.out.println("], val = " + val);

        int k = remover.removeElement(nums, val); //runs the method

        //Print Output
        System.out.print("Output: " + k + ", nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }

            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
