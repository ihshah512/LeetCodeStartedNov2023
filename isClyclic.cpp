#include <list>
#include <iostream>

using namespace std;
 struct ListNode
{

    int val;
    ListNode *next;

    ListNode(int val)
    {
        this->val = val;
        this->next = nullptr;
    }


public:
    //ListNode *head;
void traverse(ListNode *head)
{
    while (head != nullptr)
    {
        cout << head->val << endl;
        head = head->next;

}
    
}

bool isCyclicList(ListNode *head)
{
    ListNode *slow = head;
    ListNode *fast = head;

    while (fast != nullptr && fast->next != nullptr)
    {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast)
        {
            return true;
        }
    }
return false;
}

int middleVal(ListNode *head)
{
    ListNode *slow = head;
    ListNode *fast = head->next;

    while (slow != nullptr && fast != nullptr)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow->val;
}
// ListNode *start;
int returnKthVal(ListNode *head, int k)
{
    int i = 0;
    ListNode *dummy = head;
    //get the size of the LinkList first
    while (dummy != nullptr)
    {
        i++;
        dummy=dummy->next;
    }

    int valOfIntrest = i - k;
    int j = 0;
   // ListNode *start;
    while (j != valOfIntrest)
    {
head = head->next;
        j++;
        
    }
    
    return head->val;
}



};

int main()
{

    ListNode *one = new ListNode(1000);
    ListNode *two = new ListNode(2000);
    ListNode *three = new ListNode(3000);
    ListNode *four = new ListNode(4000);
    ListNode *five = new ListNode(5000);

    ListNode *head = one;
    one->next = two;
    two->next = three;
    three->next = four;
    four->next = five;
    five->next = nullptr;
    ListNode *obj;
    int kth = 3;
cout << obj->returnKthVal(head, kth) << endl;
    
    // obj->traverse(head);
    //ListNode::traverse(head);
    //std::cout.setf(std::ios::boolalpha);
   /// bool re = obj->isCyclicList(head);
    //cout << (re ? "true" : "false") << endl;
   // cout << obj->middleVal(head);
    
}