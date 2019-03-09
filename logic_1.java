/* logic-1 */

// cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  if((isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60) ) {
    return true;
  } else {
    return false;
  }
}


// dateFashion
public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2) {
    return 0;
  } else if(you >= 8 || date >= 8) {
    return 2;
  } else {
    return 1;
  }
}


// squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  return (isSummer && (temp >= 60 && temp <= 100) ||
          !isSummer && (temp >= 60 && temp <= 90) );
}


// caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday) {
    speed = speed - 5;
  }
  
  if(speed <= 60) {
    return 0;
  } else if(speed >= 61 && speed <= 80) {
    return 1;
  } else {
    return 2;
  }
}


// sortaSum
public int sortaSum(int a, int b) {
  int sum = a + b;
  
  if(sum >= 10 && sum <= 19) {
    return 20;
  } else {
    return sum;
  }
}


// alarmClock
public String alarmClock(int day, boolean vacation) {
  if(vacation) {
    if(day == 0 || day == 6) {
      return "off";
    }
    return "10:00";
  }
  
  if(day == 0 || day == 6) {
      return "10:00";
  }
  return "7:00";
  
}


// love6
public boolean love6(int a, int b) {
  if(a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
    return true;
  }  
    
  return false;
}


// in1to10
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode) {
    return (n <= 1 || n >= 10);
  }
  return (n >= 1 && n <= 10);
}


// special11
public boolean specialEleven(int n) {
  int num = n % 11;
  
  return (num <= 1);
}


// more20
public boolean more20(int n) {
  int num = n % 20;
  
  return num > 0 && num <= 2;
}


// old35
public boolean old35(int n) {
  boolean three = (n % 3 == 0);
  boolean five = (n % 5 == 0);
  
  if(three && five) {
    return false;
  } else {
    return three || five;
  }
  
}


// less20
public boolean less20(int n) {
  return (n % 20 == 19) || (n % 20 == 18);
}


// near10
public boolean nearTen(int num) {
  return num % 10 <= 2 || num % 10 >= 8;
}


// teenSum
public int teenSum(int a, int b) {
  if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) ) {
    return 19;
  }
  return a + b;
}


// answerCell
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep || (isMorning && !isMom)) {
    return false;
  } 
  return true;
}


// teaParty
public int teaParty(int tea, int candy) {
  if(tea < 5 || candy < 5) {
    return 0;
  } else if(tea / 2 >= candy || candy / 2 >= tea) {
      return 2;
  }
  return 1;
}


// fizzString
public String fizzString(String str) {
  
  boolean fizz = str.substring(0,1).equals("f");
  boolean buzz = str.substring(str.length()-1).equals("b");
  
  if(!fizz && !buzz) return str;
  
  String s = "";
  
  if(fizz) s += "Fizz";

  if(buzz) s += "Buzz";

  return s;
}


// fizzString2
public String fizzString2(int n) {
  boolean fizz = n % 3 == 0;
  boolean buzz = n % 5 == 0;
  
  
  if(fizz && buzz) {
    return "FizzBuzz!";
  } else if(fizz) {
    return "Fizz!";
  }  else if(buzz) {
    return "Buzz!";
  }
  
  return n + "!";
}


// twoAsOne
public boolean twoAsOne(int a, int b, int c) {
  return (a + b == c) || (a + c == b) || (c + b == a);
}


// inOrder
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk) {
    return c > b;
  }
  
  return (b > a) && (c > b);
}


// inorderEqual
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk) {
    return (b >= a && c >= b);
  }
  
  return (b > a && c > b);
}


// lastDigit
public boolean lastDigit(int a, int b, int c) {
  int d,e,f;
  d = a % 10;
  e = b % 10;
  f = c % 10; 
  return (d == e) || (d == f) || (e == f);
}


// lessBy10
public boolean lessBy10(int a, int b, int c) {
  int d,e,f;
  d = Math.abs(a-b);
  e = Math.abs(b-c);
  f = Math.abs(a-c);
  
  return (d >= 10) || (e >= 10) || (f >= 10);
}


// withoutDoubles
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  
  if(noDoubles) {
    if(die1 == die2) {
      if(die1 == 6) {
        die1 = 1;
      } else {
        die1++;
      }
    }
  }
  return die1 + die2;
  
}


// maxMod
public int maxMod5(int a, int b) {
  if(a == b) return 0;
  
  if(a%5 == b%5) return Math.min(a,b);
  
  return Math.max(a,b);
}


// redTicket
public int redTicket(int a, int b, int c) {
  if(a == 2 && b == 2 && c == 2) return 10;
  
  if(a == b && b == c) return 5;
  
  if(a != b && a != c) return 1;
  
  return 0;
}


// greenTicket
public int greenTicket(int a, int b, int c) {
  if(a != b && b != c && a != c) return 0;
  if(a == b && b ==c) return 20;
  
  return 10;
}


// blueTicket
public int blueTicket(int a, int b, int c) {
  int ab = a + b;
  int bc = b + c;
  int ac = a + c;
  
  if(ab == 10 || bc == 10 || ac == 10) return 10;
  
  if(ab - bc >= 10 || ab - ac >= 10) return 5;
  
  return 0;
}


// shareDigit
public boolean shareDigit(int a, int b) {
  int al = a / 10; 
  int ar = a % 10;
  int bl = b / 10;
  int br = b % 10;
  
  return (al == bl || al == br || ar == bl || ar == br);
}


// sumLimit
public int sumLimit(int a, int b) {
  int sum = a + b;
  
  int aLen = String.valueOf(a).length();
  int sumLen = String.valueOf(sum).length();
  
  if(aLen == sumLen) return sum;
  
  return a;
}