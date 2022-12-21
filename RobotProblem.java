class RobotProblem{
    static class Point{
        int x;
        int y;
        char d;
    }

    public static void main(String[] args){

        
        String[] s=args[0].split(",");
        String[] t=args[1].split(",");
        Point S=new Point();
        Point T=new Point();

        S.x=Integer.parseInt(s[0]);
        S.y=Integer.parseInt(s[1]);
        T.x=Integer.parseInt(t[0]);
        T.y=Integer.parseInt(t[1]);
        S.d=s[2].charAt(0);
        T.d=t[2].charAt(0);
        int mf=0;
        int tl=0;

        System.out.print("Source: "+S.x+" "+S.y+" "+S.d+", ");
        System.out.println("Destination: "+T.x+" "+T.y+" "+T.d);
        System.out.println("Steps: ");

        while((S.x!=T.x) || (S.y!=T.y)|| (S.d!=T.d)){
            switch(S.d){
                case 'N':
                    if(S.y<T.y){
                        S.y+=1;
                        System.out.println("Move Forward:  "+S.x+" "+S.y+" "+S.d);
                        mf+=1;
                    }
                    else{
                        S.d='W';
                        System.out.println("Turn Left:  "+S.x+" "+S.y+" "+S.d);
                        tl+=1;
                    }
                    break;
                case 'W':
                    if(S.x > T.x){
                        S.x -= 1;
                        System.out.println("Move Forward:  "+S.x+" "+S.y+" "+S.d);
                        mf+= 1;
                    }
                    else{
                        S.d = 'S';
                        System.out.println("Turn Left:  "+S.x+" "+S.y+" "+S.d);
                        tl+= 1;
                    }
                    break;
                case 'S':
                    if(S.y > T.y){
                        S.y -= 1;
                        System.out.println("Move Forward: "+S.x+" "+S.y+" "+S.d);
                        mf+= 1;
                    }
                    else{
                        S.d = 'E';
                        System.out.println("Turn Left:    "+S.x+" "+S.y+" "+S.d);
                        tl+= 1;
                    }
                    break;
                case 'E':
                    if(S.x < T.x){
                        S.x += 1;
                        System.out.println("Move Forward: "+S.x+" "+S.y+" "+S.d);
                        mf+= 1;
                    }
                    else{
                        S.d = 'N';
                        System.out.println("Turn Left:    "+S.x+" "+S.y+" "+S.d);
                        tl+= 1;
                    }

            }
        }

        int totalsteps = mf + tl;
        System.out.println("Summary:");
        System.out.println("Total Steps  : "+totalsteps);
        System.out.println("Move Forward  : "+mf);
        System.out.println("Turn Left  : "+tl);






    }

}