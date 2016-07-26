package googleSolution;

/**
 * Created by shast on 7/26/2016.
 */
    public class RedNeck implements Comparable<RedNeck> {
        private String  alias = "Yasya";
        private int     statusIndex = 1;
        private int     richIndex = 2;
        private boolean isDipsomaniac = true;
        private boolean isServe = false;
        private boolean isCriminal = true;

        RedNeck(){};

        public RedNeck(String alias, int statusIndex, int richIndex, boolean dipsomaniac, boolean serve, boolean criminal)
        {
            this.alias = alias;
            this.statusIndex = statusIndex;
            this.richIndex = richIndex;
            isDipsomaniac = dipsomaniac;
            isServe = serve;
            isCriminal = criminal;
        }

        public String getAlias()
        {
            return alias;
        }

        public int getStatusIndex()
        {
            return statusIndex;
        }

        public int getRichIndex()
        {
            return richIndex;
        }

        public boolean isDipsomaniac()
        {
            return isDipsomaniac;
        }

        public boolean isServe()
        {
            return isServe;
        }

        public boolean isCriminal()
        {
            return isCriminal;
        }

        //@Override
        public int compareTo(RedNeck o)
        {
            return o.calculateRating() - this.calculateRating();
        }

        private int calculateRating()
        {
            int thisRating = statusIndex * 5 + richIndex * 3;
            if (isCriminal)
            {
                thisRating = thisRating * 3;
            }
            if (isDipsomaniac)
            {
                thisRating = thisRating / 2;
            }
            if (isServe)
            {
                thisRating = thisRating * 2;
            }

            return thisRating;
        }

        @Override
        public String toString()
        {
            return "RedNeck{" +
                    "alias='" + alias + '\'' +
                    ", rating=" + calculateRating() + '}';
        }

    }

