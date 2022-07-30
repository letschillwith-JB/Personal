function runProgram(input) {
	let stack = [];
	let p = 1;
	for(let i=0; i<input.length; i++)
	{
	    if(input[i] === "(" || input[i] === "[" || input[i] === "{") 
	    {
	        stack.push(input[i]);
	    }
	    else if(input[i] === ")" || input[i] === "]" || input[i] === "}")
	    {
	        if(stack.length>0)
	        {
	            if(input[i] === ")" && stack[stack.length-1] === "(" ||
	               input[i] === "]" && stack[stack.length-1] === "[" ||
	               input[i] === "}" && stack[stack.length-1] === "{"   )
	               {
                    stack.pop();
	               }
	            else
	            {
	            p=0;
	            break;
	            }    
	        }
	        else{
	            //exceptional case only when "],},)" came without any opening bracket
	            p=0;   
	        }
	    }
	}
	if(stack.length>0 || p===0)
	{
	    console.log("unbalanced")
	}
	else
	{
	    console.log("balanced");
	}
}
