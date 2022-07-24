//add at -> first Node, last Node, any particular index
//rempve at -> first Node, last Node, any particular index

class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class Linkedlist {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  //add Node at first
  addAtFirst(data) {
    let node = new Node(data);
    node.next = this.head;
    this.head = node;
    this.size++;
  }

//add Node at last
  addAtLast(data) {
    let temp = this.head;
    while (temp.next) { // why here temp.next ?
      temp = temp.next;
    }
    let node = new Node(data);
    temp.next = node;  // why here temp.next?
    this.size++
  }

// add Node at particular index
  addatIndex(data, index) {
    if (this.head === null || index === 1) {
      this.addAtFirst(data);
      return;
    }
    else if (index === this.size + 1) {
      this.addAtLast(data);
      return;
    }
    else if (index > this.size + 1) { return }
    else {
      let previous;
      let current = this.head
      for (let i = 1; i < index; i++) {
        previous = current;
        current = current.next;
      }
      let node = new Node(data);
      previous.next = node;
      node.next = current;
      this.size++;
    }
  }

  //remove the 1st Node
  removeFirstNode() {
    this.head = this.head.next;
    this.size--;
  }

  //remove last node
  removeLastNode() {
    let previous, current;
    current = this.head;
    while (current.next) {
      previous = current;
      current = current.next;
    } previous.next = null;
      this.size--;
  }

  //remove node from any index
  removeAtIndex(index){
     if(index === 1){
       this.removeFirstNode();
       return;
     }
    else if(index === this.size){
      this.removeLastNode();
      return;
    }
      else if(index > this.size){
        return;
      }
    else{
      let previous,current ;
      current = this.head;
      for(let i=1; i<index; i++) {
        previous = current;
        current = current.next;
      }previous.next = current.next;
       this.size--;
    }
  }
  
  display() {
    let temp = this.head;
    while (temp) {
      console.log(temp.next);
      temp = temp.next;
    }
    console.log("Size = ",this.size);
  }
  
}
let ll = new Linkedlist();
ll.addAtFirst(20);
ll.display();
ll.addAtFirst(10);
ll.display();
ll.addAtLast(50);
ll.addatIndex(30,3);
ll.addatIndex(40,4)
ll.removeFirstNode();
ll.removeLastNode();
ll.removeAtIndex(9);
ll.display();
