public class HangingMan {
    private int numWrongGuesses = 0;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
                            public HangingMan(){
                                numWrongGuesses = 0;
                            }
                            public boolean isntDead(){
                                if (numWrongGuesses < 6){
                                    return true;
                                } else return false;
                            }
                            public void dieSomeMore(){
                                numWrongGuesses += 1;
                            }
                            public void show(){
                                System.out.println(HangmanImage[numWrongGuesses]);
                            }
}
