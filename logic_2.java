/* logic-2 */

// makeBricks
public boolean makeBricks(int small, int big, int goal) {
  int sum = 0;
  int sum1 = 0;
  
  if(small >= goal) return true;
  
  for(int i = 0; i < big; i++) {
    sum += 5;
    
    if(sum == goal) return true;
    sum1 = sum;
    
    for(int j = 0; j < small; j++) {
      sum1++;
      if(sum1 == goal) return true;
    }

  }

  return false;
  
}


// loneSum
public int loneSum(int a, int b, int c) {
  
  if(a == b && b == c) return 0;
  
  if(b == c) return a;
  
  if(a == c) return b;
  
  if(a == b) return c;

  return a + b + c;
}


// luckySum
public int luckySum(int a, int b, int c) {
  int sum = 0;
  int[] nums = new int[] {a,b,c};
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 13) return sum;
    sum += nums[i];
  }
  
  return sum;
}


// noTeenSum
public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n) {
  
  if(n >= 13 && n <= 19) {
    if(n != 15 && n != 16) {
      return 0;
    } 
  } 
  
  return n;
}
////////////////////////////////////////////////////////


// roundSum
public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
  int digit = Math.abs(num) % 10;
  
  if(digit < 5) {
    return num - digit;
  } else {
    return num + (10 - digit);
  }
}
////////////////////////////////////////////////////////


// closeFar
public boolean closeFar(int a, int b, int c) {
  int ab = Math.abs(a - b);
  int ac = Math.abs(a - c); 
  int bc = Math.abs(b - c); 
  
  return (ab <= 1 || ac <= 1) && ((ab >= 2 && bc >= 2) || (ac >= 2 && bc >= 2)); 
}


// blackJack
public int blackjack(int a, int b) {
  if(a > 21 && b > 21) return 0;
  if(a > 21) return b;
  if(b > 21) return a;
  
  int a21 = 21 - a; // 2
  int b21 = 21 - b; // 0
  
  if(a < b) return b;
  
  return a;
  
}


// evenlySpaced
public boolean evenlySpaced(int a, int b, int c) {
  int[] nums = new int[] {a,b,c};
  
  Arrays.sort(nums);
  
  return (nums[1] - nums[0])==(nums[2] - nums[1]);
}
