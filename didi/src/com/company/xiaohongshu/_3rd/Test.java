package com.company.xiaohongshu._3rd;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input_str = sc.nextLine();






            Stack<Character> content = new Stack<>();
            int curr_kh = 0;
            int str_len = input_str.length();
            int i;
            for (i = 0; i < str_len; ++i)
            {
                if (input_str.charAt(i) == '(')
                {
                    curr_kh += 1;
                }
                else if (input_str.charAt(i) == ')')
                {
                    curr_kh -= 1;
                }
                else if (input_str.charAt(i) == '<')
                {
                    if (curr_kh == 0)
                    {
                        if (!content.empty())
                            content.pop();
                    }
                }
                else
                {
                    if (curr_kh == 0)
                    {
                        content.push(input_str.charAt(i));
                    }
                }
            }
            for (i = 0; i < (int)content.size(); ++i)
            {
                System.out.print(content.get(i));
            }

        }
    }




