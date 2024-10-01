package cinema;

interface Button {
    void render();
}

class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering dark theme button.");
    }
}

class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering light theme button.");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}

class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }
}
