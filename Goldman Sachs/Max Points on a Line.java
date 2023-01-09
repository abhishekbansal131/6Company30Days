class Solution {
      public int maxPoints(int[][] arr) {
          int n = arr.length;
          if(n<=2) return n; // if there are 2 or less than 2 coordinates, then it is obvious t
          // that both are on the same line
          int max = 2; //We can have minimum 2 points for a line
          for(int i=0; i<n; i++){
              for(int j=i+1; j<n; j++){
                  // We have taken 2 coordinates let say [1,1] as i and [2,2] as j
                  int total =2; //total now we have 2 coordinates
                  for(int k=0; k<n; k++){
                      // if this k point is not equal to both above points
                      if(k!=i  && k!=j){
                          // find slope of i and j & i and k
                          // i(a1, b1)
                          // j(c1, d1)
                          // k(e1, f1)
                          // slope (i,j) = (d1-b1)/(c1-a1)
                          // slope (i,k) = (f1-b1)/(e1-a1)
                          // (d1-b1)/(c1-a1) = (f1-b1)/(e1-a1)
                          // (d1-b1)*(e1-a1) = (f1-b1)*(c1-a1)
                          // in this question---->
                          // ith point = (arr[i][0], arr[i][1])
                          // jth point = (arr[j][0], arr[j][1])
                          // kth point = (arr[k][0], arr[k][1])    
                          int slope1 = (arr[j][1] - arr[i][1])*(arr[k][0] - arr[i][0]);
                          int slope2 = (arr[k][1] - arr[i][1])*(arr[j][0] - arr[i][0]);
                          if(slope1 == slope2) total++;
                      }
                  }
                  max = Math.max(max,total);
              }
          }  
          return max;
      }
}