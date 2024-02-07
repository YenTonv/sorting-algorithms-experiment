
###Why did you pick the second metric you chose as a team (Number of Operations or Time of Execution)? 

We chose the time of execution (in microseconds) instead of the number of operation’s executions because of its simplicity. To count seconds in each operation is more universal among sorting methods, thus require less time to write code.

###Do your findings meet theoretical expectations? 

Among all types of arrays, the ordered array takes the least time as expected.. The reversed order takes the longest time compares to other arrays. The increasing size of array is directly proportional to the increasing time of executions as expected; however, according to the data, for size of arrays from 4 to 32, the types of arrays do not have an impact on the time of executions.

##Selection sort

###Why did you choose the implementations that you did for the sorting algorithms? 

Selection sort runs through the array to find the smallest number, then swap with the current position it is in. This can be done by a nested loop. The tricky part is we need to remember the position we are currently in, so when we swap it with the smallest number recently found, it goes to the right place. 

###Why did you reject other implementations that you researched?
We believe this is the fastest implementation without extra unnecessary work. 

![Random](RandomSelectionSort.png)


##Bucket sort

###Why did you choose the implementations that you did for the sorting algorithms? 

Bucket sort used a specific formula to calculate the value of each numbers and put them in buckets. Then within each bucket, the numbers are sorted one more time using sort collection so that in the end, these number are taken out in order and put in an array. We used the formula studied in the class to calculate the value of each number. 

###Why did you reject other implementations that you researched?
When researching other implementations of bucket sort, the often-different part is the formula being used to calculate the value of each number in the array. Using the formula learned in the class, we believe that it do a better job to differentiate the buckets that the numbers go in. 

##Bubble sort

###Why did you choose the implementations that you did for the sorting algorithms? 

Bubble sort compares two number next to each other and can be done using a nested loop. The function will run until it can’t find a number that is larger than the number next to it in line. The output of this project is nanoseconds which are later used to compare between type of arrays run by bubble sort.

###Why did you reject other implementations that you researched?

Researching other implementations, there are not a lot of different way of writing bubble sort. We think it is due to the already simplicity of the current codes. The tricky part about bubble sort is to make sure to implement a stopping point if the array is sorted. Otherwise, the function will keep running until it reaches the length of the array and this will cost unnecessary time. 

