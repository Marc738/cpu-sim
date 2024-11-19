# Codebeispiele für Entwurfsmuster
### Erbauer (Builder)
Trennung der Erstellung eines komplexen Objekts von seiner Repräsentation, sodass derselbe Erstellungsprozess unterschiedliche Darstellungen erzeugen kann.
```
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + ", " + sauce + ", and " + topping;
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setDough("Thin Crust")
                .setSauce("Tomato")
                .setTopping("Cheese")
                .build();
        System.out.println(pizza);
    }
}
```

### Kompositum (Composite)
Ermöglicht es, Objekte zu strukturieren, die aus Teilen bestehen, und diese so zu behandeln, als wären sie einzelne Objekte.
```
interface Component {
    void showDetails();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Leaf: " + name);
    }
}

class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void showDetails() {
        System.out.println("Composite: " + name);
        for (Component child : children) {
            child.showDetails();
        }
    }
}

public class CompositeExample {
    public static void main(String[] args) {
        Composite root = new Composite("Root");
        Composite subTree = new Composite("SubTree");

        root.add(new Leaf("Leaf1"));
        root.add(subTree);
        subTree.add(new Leaf("Leaf2"));

        root.showDetails();
    }
}
```

### Dekorierer (Decorator)
Dynamisches Hinzufügen von Funktionalitäten zu einem Objekt, ohne seine Struktur zu ändern.
```
interface Coffee {
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 2.0;
    }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
    }
}
```

### Beobachter (Observer)
Ermöglicht es, dass mehrere Objekte (Beobachter) benachrichtigt werden, wenn sich der Zustand eines anderen Objekts (Subjekt) ändert.
```
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer o1 = new ConcreteObserver("Observer1");
        Observer o2 = new ConcreteObserver("Observer2");

        subject.addObserver(o1);
        subject.addObserver(o2);

        subject.notifyObservers("Hello Observers!");
    }
}
```

### Strategie (Strategy)
Ermöglicht das Austauschbare Einsetzen von Algorithmen zur Laufzeit, ohne die Clients zu beeinflussen.
```
interface Strategy {
    int execute(int a, int b);
}

class AddStrategy implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

class MultiplyStrategy implements Strategy {
    public int execute(int a, int b) {
        return a * b;
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new AddStrategy());
        System.out.println("Addition: " + context.executeStrategy(3, 4));

        context.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + context.executeStrategy(3, 4));
    }
}
```