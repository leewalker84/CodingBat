/* string-1 */

// helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}


// makeAbba
public String makeAbba(String a, String b) {
  return a + b + b + a;
}


// makeTags
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}


// makeOutWord
public String makeOutWord(String out, String word) {
  String front = out.substring(0,2);
  String end = out.substring(2);
  
  return front + word + end;
  
}


// extraEnd
public String extraEnd(String str) {
  String x = str.substring(str.length()-2);
  
  return x + x + x;
}


// firstTwo
public String firstTwo(String str) {
  if(str.length() <= 2) return str;
  
  return str.substring(0,2);
}


// firstHalf
public String firstHalf(String str) {
  int index = str.length() / 2;
  
  return str.substring(0, index);
}


// withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}


// comboString
public String comboString(String a, String b) {
  if(a.length() > b.length()) {
    return b + a + b;
  } else {
    return a + b + a;
  }
}


// nonStart
public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}


// leftTwo
public String left2(String str) {
  //if(str.length() == 2) return str;
  
  return str.substring(2) + str.substring(0,2);
}


// rightTwo
public String right2(String str) {
  int size = str.length();
  
 // if(size < 2) return str;
  return str.substring(size-2) + str.substring(0, size-2);
}


// theEnd
public String theEnd(String str, boolean front) {
  if(front) {
    return str.substring(0,1);
  } else {
    return str.substring(str.length()-1);
  }
}


// withoutEnd2
public String withouEnd2(String str) {
  if(str.length() <= 2) return "";
  
  return str.substring(1, str.length()-1);
}


// middleTwo
public String middleTwo(String str) {
  int index = str.length() / 2;
  
  return str.substring(index-1, index+1);
}


// endsLy
public boolean endsLy(String str) {
  if(str.length() >= 2 && str.substring(str.length()-2).equals("ly")) return true;
  
  return false;
}


// nTwice
public String nTwice(String str, int n) {
  String a = str.substring(0, n);
  String b = str.substring(str.length()-n);
  
  return a+b;
}


// twoChar
public String twoChar(String str, int index) {
  if((str.length() - index)  < 2 || index < 0) {
    return str.substring(0,2);
  }
  
  return str.substring(index, index+2);
}


// middleThree
public String middleThree(String str) {
  int index = str.length() / 2;
  
  return str.substring(index-1, index + 2);
}


// hasBad
public boolean hasBad(String str) {
  int index = str.indexOf("bad", 0);
  
  return (str.length() >= 3 && index == 0 || index == 1);

}


// atFirst
public String atFirst(String str) {
  int len = str.length();
  
  if(len == 0) {
    return "@@";
  } 
  if(len == 1) {
    return str.substring(0,1) + "@";
  } 
  return str.substring(0,2);
}


// lastChars
public String lastChars(String a, String b) {
  // replace empty string with @
  if(a.length() == 0){
    a = "@";
  }
  
  if(b.length() == 0){
    b = "@";
  }
  
  return a.substring(0,1) + b.substring(b.length()-1);
}


// conCat
public String conCat(String a, String b) {
  String s = a + b;
  
  if(a.length() == 0 || b.length() == 0) return s;
  
  if(a.substring(a.length()-1).equals(b.substring(0, 1))){
    return a + b.substring(1);
  }
  
  return s;
}


// lastTwo
public String lastTwo(String str) {
  String a,b,c;
  
  // no need to swap chars
  if(str.length() < 2) {
    return str;
  }
  
  // get last two chars
  a = str.substring(str.length()-2, str.length()-1);
  b = str.substring(str.length()-1);
  // get first part of string - if it is only 2 chars it skips them, see "-2"
  c = str.substring(0, str.length()-2);
  return c + b + a;
  
}


// seeColor
public String lastTwo(String str) {
  String a,b,c;
  
  // no need to swap chars
  if(str.length() < 2) {
    return str;
  }
  
  // get last two chars
  a = str.substring(str.length()-2, str.length()-1);
  b = str.substring(str.length()-1);
  // get first part of string - if it is only 2 chars it skips them, see "-2"
  c = str.substring(0, str.length()-2);
  return c + b + a;
  
}


// frontAgain
public boolean frontAgain(String str) {
  if(str.length() >= 2) {
    return str.substring(0,2).equals(str.substring(str.length()-2));
  }
  
  return false;
}


// miniCat
public String minCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if(aLen == bLen) return a + b;
  
  if(aLen > bLen) return a.substring(aLen-bLen) + b;
  
  return a + b.substring(bLen-aLen); // if(aLen < bLen) 
}


// extraFront
public String extraFront(String str) {

  if(str.length()<=2) return str + str + str;
  
  String s = str.substring(0,2);
  return s + s + s;
}



// without2
public String without2(String str) {
  
  int len = str.length();
  
  if(len < 2) return str;
  
  boolean bool = str.substring(0,2).equals(str.substring(len-2));
  
  if(bool) {
    return str.substring(2);
  }
  
  return str;
}


// deFront
public String deFront(String str) {    
  String temp = "";
  
  if(str.length() == 0 ) return str;
  
  if(str.startsWith("a")) temp += "a";
  
  if(str.length() > 1 && str.substring(1,2).equals("b")) temp += "b";
  
  return temp + str.substring(2);
}


// startWord
public String startWord(String str, String word) {
  int sLen = str.length();
  int wLen = word.length();
  
  if (str.length() == 0) return "";

  String first = str.substring(1, sLen);
  String second = word.substring(1, wLen);

  if (first.startsWith(second)) return str.substring(0, wLen);

  return "";
  
}


// withoutX
public String withoutX(String str) {
    
    if(str.startsWith("x") && str.endsWith("x") && str.length() > 1) {
      return str.substring(1, str.length()-1);
    } 
    
    if(str.startsWith("x")) {
      return str.substring(1);
    } 
    
    if(str.endsWith("x")) {
      return str.substring(0, str.length()-1);
    } 
    
    return str;
}


// withoutX2
public String withoutX2(String str) {
  int len = str.length();
  
  if(len >= 2) {
    // check for both x
    if(str.startsWith("xx")) return str.substring(2);
    // check for second x
    if(str.substring(1,2).equals("x")) return str.substring(0,1) + str.substring(2);
  }
  // check for single x
  if(str.startsWith("x")) return str.substring(1);
  
  return str;
}




































