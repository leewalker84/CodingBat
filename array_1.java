/* array-1 */

// firstLast6
public boolean firstLast6(int[] nums) {
  return nums[0] == 6 || nums[nums.length-1] == 6;
}


// sameFirstLast
public boolean sameFirstLast(int[] nums) {
  return (nums.length >= 1 && nums[0] == nums[nums.length-1]); 
}


// makePi
public int[] makePi() {
  int a[] = {3,1,4};
  
  return a;
}


// commonEnd
public boolean commonEnd(int[] a, int[] b) {
  return (a[0] == b[0]) || (a[a.length-1] == b[b.length-1]);
}


// sum3
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}


// rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int[] temp = new int[3];
  
  temp[0] = nums[1];
  temp[1] = nums[2];
  temp[2] = nums[0];
  
  return temp;
}


// reverse3
public int[] reverse3(int[] nums) {
  int[] temp = new int[3];
  
  temp[0] = nums[2];
  temp[1] = nums[1];
  temp[2] = nums[0];
  
  return temp;
}


// maxEnd3
public int[] maxEnd3(int[] nums) {
  
  int max = Math.max(nums[0], nums[2]);
  
  nums[0] = max;
  nums[1] = max;
  nums[2] = max;
  
  return nums;
}


// sum2
public int sum2(int[] nums) {
  if(nums.length == 0) return 0;
  
  if(nums.length <= 1) return nums[0];
  
  return nums[0] + nums[1];
}


// middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] c = new int[2];
  c[0] = a[1];
  c[1] = b[1];
  
  return c;
}


// makeEnds
public int[] makeEnds(int[] nums) {
  int[] a = new int[2];
  
  a[0] = nums[0];
  a[1] = nums[nums.length-1];
  
  return a;
}


// has23
public boolean has23(int[] nums) {
  return (nums[0] == 2) || (nums[1] == 2) || (nums[0] == 3) || (nums[1] == 3);
}


// no23
public boolean no23(int[] nums) {
  return (nums[0] != 2) && (nums[1] != 2) && (nums[0] != 3) && (nums[1] != 3);
}


// makeLast
public int[] makeLast(int[] nums) {
  int size = nums.length * 2;
  
  int[] arr = new int[size];
  
  arr[size-1] = nums[nums.length-1];
  
  return arr;
}


// double23
public boolean double23(int[] nums) {
  int count2 = 0;
  int count3 = 0;
  
  for(int num: nums) {
    if(num == 2) count2++;
    if(num == 3) count3++;
  }
  
  return (count2 == 2 || count3 == 2);
}


// fix23
public int[] fix23(int[] nums) {
  if(nums[0] == 2) {
    if(nums[1] == 3) {
      nums[1] = 0;
    }
  }
  if(nums[1] == 2) {
    if(nums[2] == 3) {
      nums[2] = 0;
    }
  }
  return nums;
}


// start1
public int start1(int[] a, int[] b) {
  int count = 0;
  
  if(a.length > 0) {
    if(a[0] == 1) count++;
  }
  
  if(b.length > 0) {
    if(b[0] == 1) count++;
  }
  
  return count; 
}


// bigger2
public int[] biggerTwo(int[] a, int[] b) {
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];
  
  if(sumB > sumA) return b;
  
  return a;
}


// makeMiddle
public int[] makeMiddle(int[] nums) {
  int index = nums.length / 2;
  
  int[] arr = new int[2];
  
  arr[0] = nums[index-1];
  arr[1] = nums[index];
  
  return arr;
}


// plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] arr = new int[4];
  
  arr[0] = a[0];
  arr[1] = a[1];
  arr[2] = b[0];
  arr[3] = b[1];
  
  return arr;
}


// swapEnds
public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  
  return nums;
}


// middleThree
public int[] midThree(int[] nums) {
  int index = nums.length / 2;
  int[] arr = new int[3];
  
  arr[0] = nums[index-1];
  arr[1] = nums[index];
  arr[2] = nums[index+1];
  
  return arr;
}


// maxTriple
public int maxTriple(int[] nums) {
  int len = nums.length;
  if(len == 1) return nums[0];
  
  int a = nums[0];
  int b = nums[(len/2)];
  int c = nums[len-1];
  int max = Math.max(a, b);
  max = Math.max(max, c);
  
  return max;
}


// frontPiece
public int[] frontPiece(int[] nums) {
  
  if(nums.length == 0) return nums;
  
  if(nums.length == 1) {
    return nums;
  }
  
  int[] arr = new int[2];
  arr[0] = nums[0];
  arr[1] = nums[1];
    
  return arr;
  
}


// unlucky1
public boolean unlucky1(int[] nums) {
  if(nums.length <= 1) return false;
  
  if((nums[0] == 1 && nums[1] == 3) ||
     (nums[1] == 1 && nums[2] == 3) || 
     (nums[nums.length-2] == 1 && nums[nums.length-1] == 3))
     return true;
  
  return false;
}


// make2
public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  
  if(a.length == 0) {
    arr[0] = b[0];
    arr[1] = b[1];
  }
  
  if(a.length == 1) {
    arr[0] = a[0];
    arr[1] = b[0];
  }
  
  if(a.length >= 2) {
    arr[0] = a[0];
    arr[1] = a[1];
  }
  
  return arr;
}


// front11
public int[] front11(int[] a, int[] b) {
  int size = 0;
  int i = -1;
  int j = -1;
  
  if(a.length > 0) {
    i = a[0];
    size++;
  }
  
  if(b.length > 0) {
    j = b[0];
    size++;
  }
  
  int[]arr = new int[size];
  
  if(i != -1 && j != -1) {
    arr[0] = i;
    arr[1] = j;
  } else if(i != -1) {
    arr[0] = i;
  } else if(j != -1) {
    arr[0] = j;
  }
  return arr;
  
}