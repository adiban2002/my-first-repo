import java.util.Scanner;
class MergeSort
{
  void merge(int arr[],int left,int mid,int right)
  {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int L[] = new int[n1];
    int R[] = new int[n2];
    for(int i = 0 ; i < n1 ; i++)
      L[i] = arr[left+i];
    for(int j = 0 ; j < n2 ; j++)
      R[j] = arr[mid+1+j];
    int i=0,j=0,k=left;
    while(i < n1 && j < n2)
    {
      if(L[i] <= R[j])
      {
        arr[k] = L[i];
        i++;
      }
      else
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while(i < n1)
    {
       arr[k] = L[i];
       i++;
       k++;
    }
    while(j < n2)
    {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
  void merge_sort(int arr[],int left,int right)
  {
    if(left < right)
    {
      int mid = left + (right - left) / 2;
      merge_sort(arr,left,mid);
      merge_sort(arr,mid + 1,right);
      merge(arr,left,mid,right);
    }
  }
  void display_array(int arr[],int n)
  {
    for(int i=0 ; i < n ; i++)
    {
      System.out.println(arr[i]);
      System.out.println("\n");
    }
  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in the original array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the original array:");
    for(int i=0;i<n;i++)
    {
       arr[i] = scanner.nextInt();
    }
    System.out.println("Original array:");
    MergeSort obj = new MergeSort();
    obj.display_array(arr,n);
    obj.merge_sort(arr,0, n-1);
    System.out.println("Sorted array:");
    obj.display_array(arr,n);
    scanner.close();
  }
}
Enter the number of elements in the original array:
10
Enter the elements of the original array:
6
8
10
12
4
7
19
18
15
5
Original array:
6
8
10
12
4
7
19
18
15
5
Sorted array:
4
5
6
7
8
10
12
15
18
19


