/* recursion-1 */
/*
Always find the base case first - 
  what it needs to evaluate too, for it to stop the recursive call
*/

// factorial
public int factorial(int n) {
  if(n == 1) return 1; // base case
  
  return n * (factorial(n-1));
}


// bunnyEars
public int bunnyEars(int bunnies) {
  if(bunnies == 0) return 0;
  
  return bunnies + 1 + (bunnies - 1);
}


// finonacci
public int fibonacci(int n) {
  int result;
  if(n <= 1) return n;
  
  // x = n-1 + n-2
  return fibonacci(n-1) + fibonacci(n-2);
}


// bunnyears2
public int bunnyEars2(int bunnies) {
  if(bunnies == 0) return 0;
  int result = 0;
  
  if(bunnies % 2 == 0) {
    result = 3 + bunnyEars2(bunnies-1);
  } else {
    result = 2 + bunnyEars2(bunnies-1);
  }
  
  return result;
}


// triangle
public int triangle(int rows) {
  if(rows <= 1) return rows;
  return rows + triangle(rows-1);
}


// sumDigits
public int sumDigits(int n) {
  if(n % 10 == n) return n;
  
  return (n % 10) + sumDigits(n / 10);
}