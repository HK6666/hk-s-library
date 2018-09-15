package test;
//quicksort思想，重要的是记得要两个函数，一个负责找到中值，一个负责递归

public class qcsort {
	public static int getMiddle(int[]list,int low,int high)
	{
		int middle=list[low];
		while(low<high)
		{
			while(low<high&&list[high]>middle)
			{
			   high--;
			}
			list[low] = list[high];   //比中轴小的记录移到低端
			while (low < high && list[low] < middle) {
				low++;
			}
			list[high] = list[low];   //比中轴大的记录移到高端
		}

		list[low] = middle;              //中轴记录到尾
		return low;
		
	}
	public static void _quicksort(int[]list,int low,int high)
	{
		if(low<high)
		{
			int middle = getMiddle(list, low, high);
			_quicksort(list, low, middle-1);
			_quicksort(list, middle+1, high);
		}
	}
	public static void quicktest(int[]list)
	{
		_quicksort(list, 0, list.length-1);
	}
	public static void main(String[] args) {

    int[] list={34,3,53,23,7,14,10};
    quicktest(list);
    for(int i =0;i<list.length;i++)
    {
    	System.out.print(list[i]+",");
    }

	}

}
