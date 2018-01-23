import java.util.Scanner;

public class binary_search{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter:");
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++){
      System.out.println("enter number:");
      list[i] = sc.nextInt();
    }
    System.out.println("enter number to search for:");
    int search = sc.nextInt();
    int min = 0;
    int max = n-1;
    boolean found = false;
    while(min < max && !found){
      int mid = (min + max)/2;
      if(list[mid] > search){
        max = mid - 1;
        System.out.println(list[mid]);
      }else if(list[mid] < search){
        min = mid + 1;
        System.out.println(list[mid]);
      }else{
        found = true;
        System.out.println("found at:" + (mid+1));
      }
    }
    if(!found){
      System.out.println("number not found");
    }
  }
}
