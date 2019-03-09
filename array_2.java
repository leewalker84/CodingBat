/* Array-2 */

// countEvens
public int countEvens(int[] nums) {
  int count = 0;
  
  for(int n:nums) {
    if(n % 2 == 0) count++; 
  }
  return count;
}


// bigDiff
public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  
  for(int n:nums) {
    min = Math.min(min, n);
    max = Math.max(max, n);
  }
  
  return max - min;
}


// centeredAverage
public int centeredAverage(int[] nums) {
  int total = 0;

  Arrays.sort(nums);
  
  for(int i = 1; i < nums.length-1; i++) {
    total += nums[i];
  }

  return total / (nums.length-2);
}


// sum13
public int sum13(int[] nums) {
  int sum = 0;
  int len = nums.length;
  
  for(int i = 0; i < len; i++) {
    if(nums[i] == 13) {
      if(len-i >= 1) {// skip number after 13 if it is not the last number in array
        i++;
      }
      continue;
    }
    
    sum += nums[i];
  }
  
  return sum;
}


// sum67
public int sum67(int[] nums) {
  int sum = 0;
  boolean bool = false;
  
  for(int n : nums) {
    if(n == 6) bool = true;
    
    if(!bool) sum += n;
    
    if(bool && n == 7) bool = false;
  }
  
  return sum;
}


// has22
public boolean has22(int[] nums) {
  
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == 2 && nums[i+1] == 2) return true;
  }
  
  return false;
}


// lucky13
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    // exit loop and return value if a 1 or 3 found
    if(nums[i] == 1 || nums[i] == 3) return false;
  }
  return true;
} 


// sum28
public boolean sum28(int[] nums) {
  int sum2 = 0;
  
  for(int n : nums) {
    if(n == 2) sum2 += n;
  }
  
  return sum2 == 8;
}


// more14
public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  
  for(int n : nums) {
    if(n == 1) count1++;
    if(n == 4) count4++;
  }
  
  return count1 > count4;
}


// fizzArray
public int[] fizzArray(int n) {
  int arr[] = new int[n];
  
  for(int i = 0; i < n; i++) {
    arr[i] = i;
  }
  
  return arr;
}



// only14
public boolean only14(int[] nums) {

  for(int n : nums) {
   if(n != 1 && n != 4) return false;
  }
  
  return true;
}


// fizzArray
public String[] fizzArray2(int n) {
  String[] arr = new String[n];
  
  for(int i = 0; i < n; i++) {
    arr[i] = String.valueOf(i);
  }
  
  return arr;
}


// isEverywhere
public boolean isEverywhere(int[] nums, int val) {
  int count = 0;
  for(int n : nums) {
    if(n == val) {
      count = 0;
    } else {
      count++;
    }
    if(count == 2) return false;
  }
  
  return true;
}


// either24
public boolean either24(int[] nums) {
  boolean two = false;
  boolean four = false;
  
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == 2 && nums[i+1] == 2) two = true;
    
    if(nums[i] == 4 && nums[i+1] == 4) four = true;
  }
  
  if((two && four) || (!two & !four)) {
    return false;
  } else {
    return true;
  }
}


// has77
public boolean has77(int[] nums) {
  
  for(int i = 0; i < nums.length-1; i++) {
    
    if(nums[i] == 7 && nums[i+1] == 7) {
      return true;
    }
    
    if(nums.length-1 - i > 1) {
      if(nums[i] == 7 && nums[i+2] == 7) {
        return true;
      }
    }
    
  }
  
  return false;
}


// has12
public boolean has12(int[] nums) {
  
  boolean one = false;
  boolean two = false;
  
  for(int i = 0; i < nums.length; i++) {
    // check for one
    if(nums[i] == 1) one = true;
    // if there is a one previous, check for two
    if(one == true && nums[i] == 2) two = true;
  }
  
  return two;
}


// modThree
public boolean modThree(int[] nums) {
  int even = 0;
  int odd = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      // reset odd count and inc even
      odd = 0;
      even++;
      if(even == 3) return true;
    } else {
      // reset even and inc odd
      even = 0;
      odd++;
      if(odd == 3) return true;
    }
  }
  
  return false;
}


// haveThree
public boolean haveThree(int[] nums) {
  int three = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 3) three ++;
    
    if(three > 3) return false; // more than 3 threes, terminate
    
    // after 1 number has been, check previous num if current num is 3
    if(i > 0 && nums[i] == 3 && nums[i-1] == 3) return false;
  }

  return (three == 3) ? true : false;
}


// tripleUp
public boolean tripleUp(int[] nums) {
  int count = 0;
  
  for(int i = 0; i < (nums.length-2); i++) {
    if(nums[i+1]-nums[i] == 1 && nums[i+2]-nums[i+1] == 1) return true;
  }
  
  return false;
}


// fizzArray
public int[] fizzArray3(int start, int end) {
  int[] nums = new int[end - start];
  int index = 0;
  
  for(int i = start; i < end; i++) {
    nums[index] = i;
    index++;
  }
  
  return nums;
}


// shiftArray
public int[] shiftLeft(int[] nums) {
  int size = nums.length; // use to stop duplication of nums.length
  if(size == 0) return nums; // return original array if empty
  
  int[] arr = new int[size];
  int temp = nums[0]; // get first item
  
  // add items after the removed item to new array - wont add any if there is only one item
  for(int i = 0; i < size-1; i++) {
    arr[i] = nums[i+1];
  }
  
  // add removed item to end of array - will work if only one item in array
  arr[size-1] = temp;
  
  return arr;
}


// tenRun
public int[] tenRun(int[] nums) {
  int temp = -1;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 10 == 0) {
      temp = nums[i];
    }
    if(temp % 10 == 0) {
      nums[i] = temp;
    }
  }
  return nums;
}


// pre4
public int[] pre4(int[] nums) {
  int index = 0;
  
  // find index of first four
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      index = i;
      break;
    }
  }
  
  int[] arr = new int[index];
  
  // add elements to array
  for(int i = 0; i < arr.length; i++) {
    arr[i] = nums[i];
  }
  
  return arr;
}


// post4
public int[] post4(int[] nums) {
  int index = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      index = i; 
    }
  }
  
  int[] arr = new int[nums.length-index-1];
  
  for(int i = 0; i < arr.length; i++) {
    arr[i] = nums[index+1]; // add 1 to index to not include the 4
    index++;
  }
  
  return arr;
}


// notAlone
public int[] notAlone(int[] nums, int val) {
  int temp = 0;
  
  for(int i = 1; i < nums.length-1; i++) {
    if(nums[i] == val && (nums[i] != nums[i-1]) && (nums[i] != nums[i+1]) ) {
      temp = Math.max(nums[i-1], nums[i+1]);
      nums[i] = temp;
    }
  }
  
  return nums;
}


// zeroFront
public int[] zeroFront(int[] nums) {
  int[] arr = new int[nums.length];
  int j = 0;
  int k = nums.length-1;
  
  // loop through nums array
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 0) { // add zeros to start of array and increment index
      arr[j] = nums[i];
      j++;
    } else { // add non zeros to end of array an decrement index
      arr[k] = nums[i];
      k--;
    }
  }
  
  return arr;
}


// withoutTen
public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length]; // array initalized with zeros by default
  int j = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 10) { // add any non ten ints to new array
      arr[j] = nums[i];
      j++;
    }
  }
  // no zeros need to be added to the end as they are done in initialization  statement
  return arr;
}


// zeroMax
public int[] zeroMax(int[] nums) {
  int temp = 0;
  
  // reverse iteration 
  for(int i = nums.length-1; i >= 0; i--) {
    
    if(nums[i] % 2 != 0) { // store largest odd number
      temp = Math.max(nums[i], temp);
    }
    
    if(nums[i] == 0) { // swap zero for largest odd number to right of zero
      nums[i] = temp;
    }
  }
  
  return nums;
}


// evenOdd
public int[] evenOdd(int[] nums) {
  
  int[] arr = new int[nums.length];
  int even = 0; 
  int odd = nums.length-1;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      arr[even] = nums[i];
      even++;
    } else {
      arr[odd] = nums[i];
      odd--;
    } 
  }
  
  return arr;
}


// fizzBuzz
public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end-start];
  int j = 0; // index for nex array
  
  for(int i = start; i < end; i++) {
    if((i % 3 == 0) && (i % 5 == 0)) {
      arr[j] = "FizzBuzz";
    } else if(i % 3 == 0) {
      arr[j] = "Fizz";
    } else if(i % 5 == 0) {
      arr[j] = "Buzz";
    } else {
      arr[j] = String.valueOf(i);
    }
    j++;
  }
  
  return arr;
}