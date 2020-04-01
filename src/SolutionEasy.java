public class SolutionEasy {

    /**
     *给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * 任何数与其自身异或都为 0，时间复杂度O(n),空间复杂度O(1)
     * @param nums
     * @return
     */
    public  int singleNumber(int[] nums) {
        int value = nums[0];
        for(int i = 1; i<nums.length;i++){
            value ^= nums[i];
        }
        return value;
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在众数
     * 用到的算法是：摩尔投票算法
     * 算法在局部变量中定义一个序列元素(value)和一个计数器(count)，
     *
     * 初始化的情况下计数器为0.
     * 算法依次扫描序列中的元素，当处理元素x的时候，如果计数器为0，那么将x赋值给value，然后将计数器count设置为1，如果计数器不为0，那么将序列元素value和x比较，如果相等，那么计数器加1，如果不等，那么计数器减1。
     * 最后存储的序列元素(value)，就是这个序列中最多的元素。
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int value = 0;
        for(int x:nums) {
            if(count == 0){
                value = x;
                count = 1;
            } else if(value == x){
                count++;
            } else {
                count--;
            }
        }
        return value;
    }

    /**
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     *
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    /**
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
     * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     *
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        int i = 0;
        for(int j=0; j<J.length(); j++) {
            for(int s=0; s<S.length(); s++) {
                if(J.charAt(j) == S.charAt(s)) i++;
            }
        }
        return i;
    }


    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     *
     * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
     *
     *
     *
     *  
     *
     * 示例 1:
     *
     * 输入: head = [4,5,1,9], node = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
     * 示例 2:
     *
     * 输入: head = [4,5,1,9], node = 1
     * 输出: [4,5,9]
     * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
     *  
     *
     * 说明:
     *
     * 链表至少包含两个节点。
     * 链表中所有节点的值都是唯一的。
     * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
     * 不要从你的函数中返回任何结果。
     *
     解法
     思路

     这道题的题意和“从链表中删除节点”不同，这道题的输入只有待删除节点的引用，然后让你从链表中删除节点，所以采用的思路也有点儿不同。
     一般从链表中删除节点的思路是将上一个节点的 next 引用指向待删除节点的下一个节点，如下图所示：


     但是现在我们无法获得待删除节点的上一个节点的引用，因此不能采用这种方式。我们采用的方法是这样的：将待删除节点的值赋值为下一个节点的值，
     然后将待删除节点的引用指向待删除节点的下下个节点


     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
