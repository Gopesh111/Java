class Palindrome
{
    public static void main(String[] args)
    {
        System.out.print(pal("aa"));
    }
    static boolean pal(String s)
    {
        String t=s;
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);  
        }
        return t.equals(reversed);
    }
}
