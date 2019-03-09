/* warup-2 */

// stringTimes
public String stringTimes(String str, int n) {
  String s = "";
  
  for(int i = 0; i < n; i++ ) {
    s += str;
  }
  
  return s;
}


// frontTimes
public String frontTimes(String str, int n) {
  String result = "";
  int len = 3;
  
  if(str.length() < 3) {
    len = str.length();
  }
  
  for(int i = 0; i < n; i++) {
    result += str.substring(0, len);
  }
  
  return result;
}


// countXX
int countXX(String str) {
  int count = 0;
  
  for(int i = 0; i < str.length()-1; i++) {
    if(str.substring(i, i+2).equals("xx")) {
      count++;
    }
  }
  
  return count;
}


// doubleX
boolean doubleX(String str) {
  
  for(int i = 0; i < str.length()-1; i++) {
    if(str.substring(i,i+1).equals("x")) {
      if(str.substring(i+1,i+2).equals("x")) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  return false;
}


// stringBits
public String stringBits(String str) {
  String s = "";
  
  for(int i = 0; i < str.length(); i+=2) {
    s += str.charAt(i);
  }
  
  return s;
}


// stringSplosion
public String stringSplosion(String str) {
  String s = "";
  
  for(int i = 0; i < str.length(); i++) {
    s += str.substring(0, i+1);
  }
  
  return s;
}


// last2
public int last2(String str) {
  int count = 0;
  
  if(str.length() < 2) return count;
  
  String end = str.substring(str.length()-2);
  
  for(int i = 0; i < str.length()-2; i++) {
    if(str.substring(i, i+2).equals(end)) {
      count++;
    }
  }
  
  return count;
}


// arrayCount9
public int arrayCount9(int[] nums) {
  int count = 0;
  
  for(int n: nums) {
    if(n == 9) count++;
  }
  
  return count;
}


// arrayFront9
public boolean arrayFront9(int[] nums) {
  
  for(int i = 0; i < nums.length; i++) {
    if(i==4) break;
    
    if(nums[i] == 9) return true;
  }
  
  return false;
}


// array123
public boolean array123(int[] nums) {
  
  for(int i = 0; i < nums.length-2; i++) {
    if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3 ) {
      return true;
    }
  }
  
  return false;
}


// stringMatch
public int stringMatch(String a, String b) {
  int count = 0;
  int len = Math.min(a.length(), b.length());
  
  for(int i = 0; i < (len-1); i++) {
    if( a.substring(i, i+2).equals(b.substring(i, i+2)) ){
      count++;
    }
  }
  
  return count;
}


// stringX
public String stringX(String str) {
  String s = "";
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) != 'x') {
      s += str.charAt(i);
    }
    
    if(str.charAt(i) == 'x' && i == 0) {
      s += str.charAt(i);
    }
    
    if(str.charAt(i) == 'x' && i == str.length()-1 && str.length() != 1) {
      s += str.charAt(i);
    }
  } 
  
  return s;
}


// altPairs
public String altPairs(String str) {
  String temp = "";
  
  for(int i = 0; i < str.length(); i+=4) {
    if(str.length() - i >= 2) {
      temp += str.substring(i, i+2);
    } else {
      temp += str.substring(i, i+1);
    }
    
  }
  
  return temp;
}


// stringYak
public String stringYak(String str) {
  String s = "";
  
  for(int i=0; i<str.length(); i++) {

    if((str.length() - i > 2)  && (str.charAt(i) == 'y') && (str.charAt(i+2) == 'k') ) {
      i+=2;
    } else {
      s += str.substring(i, i+1);
      // s += str.charAt(i);
    }
    
  }
  return s;
}


// array667
public int array667(int[] nums) {
  int count = 0;
  
  for(int i = 0; i < (nums.length-1); i++) {
    if(nums[i] == 6 && (nums[i+1] == 6) || (nums[i+1] == 7) ){
      count++;
    }
  }
  
  return count;
}


// noTriples
public boolean noTriples(int[] nums) {
  for(int i = 0; (i < nums.length-2); i++) {
    if( (nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2]) ) {
      return false;
    }
  }
  return true;
}


// has271
/*
 no need to check that the first value is a two
 because it is a pattern that flows 5 after the first number
 
 use math abs value, because the diff can be above or above or below the 1
*/
public boolean has271(int[] nums) {
  for(int i = 0; i < (nums.length-2); i++) {
    if(nums[i+1] == (nums[i]+5) ) {
      if(Math.abs(nums[i+2] - (nums[i] -1) ) <= 2 ) {
        return true;
      }
    }
  }
  
  return false;
}


