package TextFormatting;

abstract class TextDecorator implements Texttype {
    protected Texttype textComponent;

    public TextDecorator(Texttype textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return textComponent.getText();
    }

    @Override
    public String getDescription() {
        return textComponent.getDescription();
    }
}

