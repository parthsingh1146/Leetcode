class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentQueue = new ArrayDeque<>();
        for(int stu : students){
            studentQueue.offer(stu);
        }
        Deque<Integer> sandwichStack = new ArrayDeque<>();
        for(int sandwich : sandwiches){
            sandwichStack.addLast(sandwich);
        }

        int compared = 0;
        while(compared < studentQueue.size()){
            if(sandwichStack.peek() == studentQueue.peek()){
                sandwichStack.pop();
                studentQueue.poll();
                compared = 0;
            }
            else{
                int v = studentQueue.poll();
                studentQueue.offer(v);
                compared++;
            }
        }

        return studentQueue.size();
    }
}