/* Warmup-1 */

// sleepIn
public boolean sleepIn(boolean weekday, boolean vacation) {
  if(vacation || !weekday) return true;
  
  return false;// sleep
}


// monkeyTrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return (aSmile && bSmile) || (!aSmile && !bSmile);
}


// sumDouble
public int sumDouble(int a, int b) {
  if(a == b) {
    return (a + b) * 2;
  }
  return a + b;
}


// diff21
public int diff21(int n) {
  int diff =  Math.abs(n - 21);
  
  if(n > 21) {
    return diff * 2;
  }
  
  return diff;
  
}


// parrotTrouble 
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour <  7 || hour > 20));
}


// makes10
public boolean makes10(int a, int b) {
  return (a == 10 || b == 10 || a + b == 10);
}


// nearHundread
public boolean nearHundred(int n) {
  return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
}


// posNeg
public boolean posNeg(int a, int b, boolean negative) {
  if(negative) {
    return a < 0 && b < 0;
  }
  
  return (a >= 0 && b < 0) || (a < 0 && b >= 0);
}


// notString
public String notString(String str) {
  
  if(str.length() >= 3) {
    String temp = str.substring(0,3);
    if(temp.equals("not")) return str;
  }
  
  return "not " + str;
}


// missingChar
public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String end = str.substring(n+1); // no need to include end index as default will go to the end
  
  return front + end;
}


// frontBack
public String frontBack(String str) {
  if(str.length() <= 1) return str;
  
  String front = str.substring(0,1);
  String middle = str.substring(1, str.length()-1);
  String end = str.substring(str.length()-1);
  
  return end + middle + front;
}


// frontThree
public String front3(String str) {
  String temp;
  
  if(str.length() < 3) {
    temp = str;
  } else {
    temp = str.substring(0,3);
  }
  
  return temp + temp + temp;
}


// backAround
public String backAround(String str) {
  String temp = str.substring(str.length()-1);
  
  return temp + str + temp;
}


// public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}


// front22
public String front22(String str) {
  String front = "";
  
  if(str.length() < 2) {
    front = str;
  } else {
    front = str.substring(0,2);
  }
  
  return front + str + front;
}


// startHi
public boolean startHi(String str) {
  if(str.length() >= 2) {
    return str.substring(0,2).equals("hi");
  }
  
  return false;
}


// icyHot
public boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
}


// in1020
public boolean in1020(int a, int b) {
  return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
}


// hasTeen
public boolean hasTeen(int a, int b, int c) {
  return isTeen(a) || isTeen(b) || isTeen(c);
}


// loneTeen
public boolean loneTeen(int a, int b) {
  return (isTeen(a) && !isTeen(b) ) || (isTeen(b) && !isTeen(a));
}

public boolean isTeen(int a) {
  return (a >= 13 && a <= 19);
}
//////////////////////////////////////////////////////////////////////


// delDel
public String delDel(String str) {
  
  if(str.length() > 3 && str.indexOf("del", 1) == 1) {
      String front = str.substring(0,1);
      String end = str.substring(4);
      return front + end;
  }
  
  return str;
}


// mixStart
public boolean mixStart(String str) {
  return (str.length() >= 3 && str.substring(1,3).equals("ix"));
}


// startOz
public String startOz(String str) {
  if(str.length() == 0) {
    return str;
  } else if (str.length() == 1) {
    
    if(str.equals("o")) {
      return str;
    } else {
      return "";
    }
    
  } else {
    String o = "";
    String z = "";
    String end = str.substring(2);
    
    if(str.substring(0,1).equals("o")) {
      o = "o";
    }
    if(str.substring(1,2).equals("z")) {
      z = "z";
    }
    
    return o + z;
  }
}


// intMax
public int intMax(int a, int b, int c) {
  int max = Math.max(a, b);
  
  max = Math.max(max, c);
  
  return max;
}


// close10
public int close10(int a, int b) {
  int c = Math.abs(a - 10);
  int d = Math.abs(b - 10);
  
  if(c < d) return a;
  
  if(c > d) return b;
  
  return 0;
  
}


// in3050
public boolean in3050(int a, int b) {
  return ( (a >= 30 && a <= 40) && (b >= 30 && b <= 40) ) ||
         ( (a >= 40 && a <= 50) && (b >= 40 && b <= 50) );
}


// max1020
public int max1020(int a, int b) {
  int c = 0;
  int d = 0;
  
  if(inRange(a, 10, 20)) {
    c = a;
  }
  
  if(inRange(b, 10, 20)) {
    d = b;
  }
  
  return Math.max(c, d);
}

public boolean inRange(int num, int low, int high) {
  return num >= low && num <= high;
}


// stringE
public boolean stringE(String str) {
  int count = 0;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'e') {
      count++;
    }
  }
  
  return (count >= 1 && count <=3);
}


// lastDigit
public boolean lastDigit(int a, int b) {
  return (a % 10 == b % 10);
}


// endUp
public String endUp(String str) {
  if(str.length() < 3) return str.toUpperCase();
  
  String front = str.substring(0, str.length()-3);
  String end = str.substring(str.length()-3);
  
  return front + end.toUpperCase();
}


// everyNth
public String everyNth(String str, int n) {
  String temp = "";
  
  for(int i = 0; i < str.length(); i+=n) {
    temp += str.substring(i, i+1);
  }
  
  return temp;
}






