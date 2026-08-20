bool isValid(char* s) {
    int len = strlen(s);
    char st[len];
    int top = -1;
    for(int i = 0; i < len; i++){
        char ch = s[i];
        if(ch == '(' || ch == '{' || ch == '['){
            st[++top] = ch;
        }else{
            if(top == -1){
                return false;
            }
            if(st[top] == '(' && ch == ')'){
                top--;
            }else if(st[top] == '{' && ch == '}'){
                top--;
            }else if(st[top] == '[' && ch == ']'){
                top--;
            }else{
                return false;
            }
        }
    }
    return top == -1;
}