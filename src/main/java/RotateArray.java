public class RotateArray {
    public static void main(String[] args) {
        int[] array=new int []{1,2,3,4,5,6,7,8,9};
        int[] rotate = rotate(array, 3);
        for (int i:rotate) {
            System.out.println(i);
        }
    }
    public static int[] rotate(int[] nums, int position){
        int rotatedArray[]= new int[nums.length];

        for(int i=0;i<nums.length-position ; i++ ){
            rotatedArray[i]=nums[position+i];
        }

        int j=0;
        for(int i=0;i<position;i++) {
            rotatedArray[nums.length -(position-i)] = nums[j];
            j++;
        }
        return rotatedArray;
    }
}
