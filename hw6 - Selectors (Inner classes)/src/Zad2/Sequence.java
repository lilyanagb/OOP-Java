package Zad2;
    public class Sequence {
        private Object[] obs;
        private int next = 0;

        public Sequence(int size) {
            obs = new Object[size];
        }

        public void add(Object x) {
            if (next < obs.length) {
                obs[next] = x;
                next++;
            }
        }

        private class SSelectorForward implements SelectorForward {
            private int i = 0;
            public boolean end() {
                return i == next;
            }
            public Object current() {
                return obs[i];
            }
            public void next() {
                if(i < next) i++;
            }
        }

        public SelectorForward getSelectorForward() {
            return new SSelectorForward();
        }

        private class SSelectorBackward implements SelectorBackward {
            private int i = next - 1;
            public boolean begin() {
                return i == -1;
            }
            public Object current() {
                return obs[i];
            }
            public void previous() {
                if(i >= 0) i--;
            }
        }

        public SelectorBackward getSelectorBackward() {
            return new SSelectorBackward();
    }
    }
