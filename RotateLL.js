class Node{
  constructor(data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList{
  constructor(){
    this.head = null;
  }
  addData(data){
    if(this.head===null){
      let node = new Node(data);
      this.head = node;
    }
    else{
      let temp = this.head;
      while(temp.next){
        temp = temp.next;
      }temp.next = new Node(data);
    }
  }
  print(){
    let temp = this.head;
    while(temp){
      console.log(temp.data);
      temp = temp.next;
    }
  }
rotateLL(k){
    let size,tail;
    let temp = this.head;
    size=0;
    
	while(temp.next){
	temp = temp.next;
	size++;
	}
	
	size = size+1;
    tail = temp;
    temp = null;
    
//2nd step  :  find the node from which LL will start acc to N,

    let N = k % size;     //2%3 = 2   i.e we find the node from which LL will be start 
	
	let prev;
	temp = this.head ;
	for(let i=1; i<=size-N; i++){
    /* i <= size-N is point to understand ;
      if N = 2 means 2 elements from last of LL           to be move forward ;
      if 3 then last 3 , 1 than last 1;
      */
		prev = temp;
		temp = temp.next; 
	}	
		prev.next = null;
		tail.next = this.head;
		this.head = temp;
	//return head;
  this.print();
  }
}

let ll = new LinkedList();
ll.addData(1);
ll.addData(2);
ll.addData(3);
ll.addData(4);

ll.rotateLL(3);
