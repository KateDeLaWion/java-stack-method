import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();


        System.out.println(".push() or .add() ------- to  build the stack:  ");
        games.push("bottom");
        games.push("middle");
        games.push("higherMiddle");
        games.push("evenHigherMiddle");
        games.push("Top");
        games.push("higherTop");

//        System.out.println(".push() or .add ------- to  build the stack:  ");
//        games.add("bottom");
//        games.add("middle");
//        games.add("higherMiddle");
//        games.add("evenHigherMiddle");
//        games.add("highestTop");

        System.out.println("                   New Stack is :  " + games);

        System.out.println(".pop() --- to pop out,so changed original stack,  the very top (right end) value as:   " + games.pop());
        System.out.println("       So, the resultant stack, after pop, as: " + games);

        System.out.println(".peek() --- look at the top item, not changing the original stack, to give : " + games.peek());
        System.out.println("                               So, the resultant stack unchanged as: " + games);

        System.out.println("Print by System.out.println(stackName); --- to print the items in a stack [bottom.....top] as :   " + games);

        System.out.println(".size() --- to print the # of items in a stack :  " + games.size());

        System.out.println(".get(index#), more than .peek(), --- look at item by ANY index#, not changing the original stack. with left end as index# 0.");
        System.out.println("                                          For example .get(0) gives out:  " + games.get(0));
        System.out.println("                                      Another example .get(1) gives out:  " + games.get(1));
        System.out.println("                                   So, the resultant stack unchanged as: " + games);

        System.out.println(".contains() --- give true or false, therefore, .contains(\"bottom\") ?   " + games.contains("bottom"));

        System.out.println(".search(), more than .contains(), --- give position# of an item from the top item as #1 (the right end). So in a stack of  " + games);
        System.out.println("                                   .search(\"middle\") ---  give  " + games.search("middle"));
        System.out.println("                                   .search() however --- give -1 if that item is not found in the stack, therefore, .search(\"car\") ------- give :  " + games.search("car"));

        System.out.println(".empty() ------- give true of false, not changing the original stack, whether stack is empty ?   " + games.empty());
        System.out.println(".isEmpty() ------- give true of false, not changing the original stack, whether stack is empty ?   " + games.isEmpty());
        System.out.println("                 So, the resultant stack is unchanged as :  " + games);

        System.out.println(".set(index#, value) ------ At index#, spit out the old value and replace the old value by a new value");
        System.out.println("                    .set(1,\"content\") give out the replaced old value :  " + games.set(1,"content"));
        System.out.println("                    So, changed the stack to  :  " + games);

        System.out.println(".toArray() ------- reproduce, not changing the original stack, an array out of this stack as :" + games.toArray());
        System.out.println("                   .get() similarly, print games.toArray()[2] , left end as index 0 , will give :  " + games.toArray()[2]);
        System.out.println("                   .toArray() is important in Queue because Queue has no .get(index#), .toArray() is need to produce index#");

        System.out.println(".clear()-----clear all elements in a stack but does not delete the stack. Now the stack is cleared:");
        games.clear();
        System.out.println(games);



    }
}
