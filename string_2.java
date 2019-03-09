/* String-2 */

// doubleChar
public String doubleChar(String str) {
  String temp = "";
  String result = "";
  
  for(int i = 0; i < str.length(); i++) {
    temp = str.substring(i, i+1);

    result += temp + temp;
  }
  
  return result;
}


// countHi
public int countHi(String str) {
  int count = 0;
  
  for(int i = 0; i < (str.length()-1); i++) {
    if(str.substring(i, i+2).equals("hi")) count++;
  }
  
  return count;
}


// catDog
public boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  
  for(int i = 0; i < str.length()-2; i++) {
    if(str.substring(i, i+3).equals("cat"))cat++;
    if(str.substring(i, i+3).equals("dog"))dog++;
  }
  
  return cat == dog;
}


// countCode
public int countCode(String str) {
  int count = 0;
  
  for(int i = 0; i < str.length()-3; i++) {
    if(str.substring(i,i+2).equals("co")) {
      if(str.substring(i+3,i+4).equals("e")) count++;
    }
  }
  
  return count;
}


// endOther
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();

  return a.endsWith(b) || b.endsWith(a);
}


// xyzThere
public boolean xyzThere(String str) {
  
  for(int i = 0; i < str.length()-2; i++) {
    if(str.substring(i, i+3).equals("xyz")) {
      if(i > 0 && str.substring(i-1, i).equals(".")) { 
        // skip iteration if period precedes xyz
        continue;
      }
      return true;
    }
  }
  
  return false;
}


// bobThere
public boolean bobThere(String str) {
  for(int i = 0; i < str.length()-2; i++) {
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
  }
  return false;
}


// xyBalance
public boolean xyBalance(String str) {
  boolean bool = true;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x') bool = false;
    if(str.charAt(i) == 'y') bool = true;
  }
  
  return bool;
}


// mixString
public String mixString(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  int count = 0;
  String c, d, e, temp;
  c = ""; 
  d = "";
  e = "";
  temp = "";
  
  if(lenA >= lenB) { // split a into two parts
    c = a.substring(0, lenB);
    d = b;
    e = a.substring(lenB);
    count = lenB;
  } else { // split b into two parts
    c = a;
    d = b.substring(0, lenA);
    e = b.substring(lenA);
    count = lenA;
  }
  
  for(int i = 0; i < count; i++) {
    temp += c.substring(i,i+1) + d.substring(i,i+1);
  }
  return temp + e;
}


// repeatEnd
public String repeatEnd(String str, int n) {
  String temp = str.substring(str.length()-n);
  String s = "";
  
  for(int i = 0; i < n; i++) {
    s += temp;
  }
  
  return s;
}


// repeatFront
public String repeatFront(String str, int n) {
  String s = "";
  
  for(int i = n; i > 0; i--) {
    s += str.substring(0, i);
  }
  
  return s;
}


// repeatSeparator
public String repeatSeparator(String word, String sep, int count) {
  String s = "";
  
  for(int i = 0; i < count; i++) {
    s += word;
    
    if(count - i > 1) {
      s += sep;
    }
    
  }
  
  return s;
}


// prefixAgain
public boolean prefixAgain(String str, int n) {
  String temp = str.substring(0, n);
  
  if(str.indexOf(temp, n) != -1) {
    return true;
  }
  
  return false;
}


// xyzMiddle
public boolean xyzMiddle(String str) {
  int len = str.length();
  int ends = (len - 3) / 2;
  int indexXYZ = -1;
  
  if(len < 3) return false;
    
    for(int i = ends; i < (len-ends); i++) {
      if(str.substring(i,i+3).equals("xyz")) {
        indexXYZ = i;
        break;
      }
    }

  
  return (ends <= indexXYZ) && ends <= (len - (indexXYZ+3));
  //return false;
}


// getSandwich
public String getSandwich(String str) {
  int first = str.indexOf("bread");
  int last = str.lastIndexOf("bread");
  
  if(first == -1 || last == -1 || first == last) return "";
  
  return str.substring(first+5, last);
}


// sameStarChar
public boolean sameStarChar(String str) {
  boolean bool = true;
  
  for(int i = 1; i < str.length()-1; i++) {
    if(str.substring(i, i+1).equals("*")) {
      if(!str.substring(i-1, i).equals(str.substring(i+1, i+2))) {
        return false;
      }
    }
  }
  
  return bool;
}


// oneTwo
public String oneTwo(String str) {
  String newStr = "";
  
  for(int i = 0; i < str.length()-2; i+=3) {
      newStr += str.substring(i+1, i+3) + str.substring(i, i+1);
  }

  return newStr;
}


// zipZap
public String zipZap(String str) {
  String s = "";
  
  for(int i = 0; i < str.length(); i++) {
    if(i > 0 && str.charAt(i-1)=='z' && str.charAt(i+1)=='p') {
      continue;
    }
    s += str.charAt(i);
  }
  
  return s;
}


// starOut
public String starOut(String str) {
  String s = "";
  
  if(str.length() == 1) {
    if(str.charAt(0) != '*') return str;
  }
  
  for(int i = 0; i < str.length(); i++) {
    
    if(i == 0  && (str.charAt(i) == '*' || str.charAt(i+1) == '*')) continue;
    
    if(i == str.length()-1 && (str.charAt(i-1) =='*' || str.charAt(i)=='*')) continue;
    
    if(i != 0  && i != str.length()-1) {
     if(str.charAt(i-1) =='*' || str.charAt(i)=='*' || str.charAt(i+1) =='*') {
       continue;
     }
    }
    
    s+=str.charAt(i);
  }
  
  return s;
}
