/* Stacks
A stack is a LIFO data structure
LAST IN, FIRST OUT
LIFO / FILO
push - add to top
pop - remove from top
peek - check the top
isEmpty - check if the stack is empty, true/false
length - return size of stack
*/

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}


var pringlesTube = new slStack();
console.log(pringlesTube); // slStack { top: null }
pringlesTube.push(new Node(11));
console.log(pringlesTube); // slStack { top: Node {data: 11, next: null} }

class slStack {
    constructor() {
        this.top = null; // this.head, this.end
    }

    // add to top
    push(newNode) {    }

    // remove from top
    pop() {    }

    // aka check top
    peek() {
        return this.top;
    }

    // check if empty
    isEmpty() {
        return this.top === null;
    }

    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() { }
}

// don't forget to instantiate the slStack!
// add a few nodes first

// function hi() {
//     hi();
// }

// hi();