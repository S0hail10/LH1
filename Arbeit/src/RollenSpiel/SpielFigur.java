
    package RollenSpiel;



    public abstract class SpielFigur {



        private String name;



        private int staerkePunkte;









        public SpielFigur(String name, int staerkePunkte) {



            this.name =name;



            this.staerkePunkte =staerkePunkte;



        }





        public String getName() {



            return name;



        }



        public void setName(String name) {



            this.name = name;



        }



        public int getStaerkePunkte() {



            return staerkePunkte;



        }



        public void setStaerkePunkte(int staerkePunkte) {



            this.staerkePunkte = staerkePunkte;



        }







        public void essen(){



            staerkePunkte += 10;



        }



        public void laufen() throws KeineKraftException {



            if(getStaerkePunkte()<1){



                throw new KeineKraftException("laufen",getName()) ;



            }else staerkePunkte --;



        }



        public void klettern() throws KeineKraftException {







            if(getStaerkePunkte()<2){



                throw new KeineKraftException("klettern",getName()) ;



            }else staerkePunkte -=2;



        }



        public void kaempfen() throws KeineKraftException {



            if(getStaerkePunkte()<3){



                throw new KeineKraftException("Kaempfen",getName()) ;



            }else  staerkePunkte -=3;



        }



        @Override



        public String toString() {



            return "\n\t"+



                    "Name: " + name + "\n\t"+



                    "StaerkePunkte= " + staerkePunkte + "\n\t";







        }







    }