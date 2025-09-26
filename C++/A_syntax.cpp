
// 2D :: array syntax for DECLARATION
vector<vector<int>> mat (N, vector<int>(M));
vector<vector<int>> mat;

//insert an element in 2D
mat[row_no].insert(mat[row_no].begin()+idx,val);   // --> val is the value (Element like int val = mat[1][2]);

// for sum use accumulate function
accumulate(startIterator, endIterator, initialValue);
accumulate(startIterator, endIterator, initialValue, binaryOperation);


// max value and min value
    int maxval = *max_element(arr.begin(),arr.end());
    int minval = *min_element(arr.begin(),arr.end());
