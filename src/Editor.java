public class Editor {
    private String texto;

    public void escreverTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
     // Cria um memento contendo o estado atual do editor
    public EditorMemento salvar() {
        return new EditorMemento(texto);
    }

    // Restaura o estado do editor com base em um memento
    public void restaurar(EditorMemento memento) {
        texto = memento.getTextoSalvo();
    }
}
