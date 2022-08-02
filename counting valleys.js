/*Description
An avid hiker keeps meticulous records of their hikes. During the last hike that took exactlystepssteps, for every step it was noted if it was an uphill,U, or a downhill,Dstep. Hikes always start and end at sea level, and each step up or down represents a1unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.

A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.

Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Print the number of valleys walked through

Sample Input 1 
8
UDDDUDUU

Sample Output 1
1
*/
// Beautiful question 
/* i had taken 2 pointers :-
   p --> tells Initialization of hike
   p1--> tells completion of hike 
*/

function runProgram(input) {
    input = input.trim().split("\n");
    let n = +input[0];
    let str = input[1];
	let c1=0;
	let c2=0;
	let p1=0;
	for(let i=0; i<n; i++) {
	    let p = 0;
	    if(c1 === 0)p = 1;
	    if(p === 1 && p1 === 1)c2++,p1 = 0; //p1 pointer remains record of hike initialization, if hiker come to 0(sea level) means 1 down valley hike completed. 
	    
	    if(str[i] === "U"){
	        c1++;
	    }
	    else if(str[i] === "D"){
	        c1--;
	    }
	    if(p === 1 && c1 <= 0)p1=1; //this condition says that hike for down valley has started
	}    
	console.log(c2);
}
