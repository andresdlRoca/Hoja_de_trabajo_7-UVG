/*public class BinaryStringTree {

    private String data;
    private BinaryStringTree left;
    private BinaryStringTree right;

    public BinaryStringTree() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public BinaryStringTree(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static BinaryStringTree createTree( String content ) {
        BinaryStringTree bstree = new BinaryStringTree();
        if( content != null ) {
            //
            // Remove the punctuation from the content
            //
            //content = content.replaceAll("(\\w+)\\p{Punct}(\\s|$)", "$1$2");
            String[] words = content.split( "," );
            bstree = new BinaryStringTree();
            for( int i = 0; i < words.length; i++ ) {
                bstree.addNode( words[i]);
            }
        }
        return bstree;
    }


    // As a convention, if the key to be inserted is less than the key of root
    // node, then key is inserted in
    // left sub-tree; If key is greater, it is inserted in right sub-tree. If it
    // is equal, as a convention, it
    // is inserted in right sub-tree
    public void addNode(String data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (this.data.compareTo(data) < 0) {
                if (this.left != null) {
                    this.left.addNode(data);
                } else {
                    this.left = new BinaryStringTree(data);
                }

            } else {
                if (this.right != null) {
                    this.right.addNode(data);
                } else {
                    this.right = new BinaryStringTree(data);
                }

            }
        }
    }

    public void traversePreOrder() {
        System.out.println(this.data);
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }

    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }


    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.println(this.data);
    }

}*/

import structure5.BinarySearchTree;
import structure5.ComparableAssociation;
/**
 * @author Andres de la Roca 20332
 * Clase que se encarga de manejar los BST, fue extraido del libro de JavaStructures usado en clase.
 * @version 18/04/2021
 * @since 15/04/2021
 */
public class SymTab<S extends Comparable<S>,T>
{

    protected BinarySearchTree<ComparableAssociation<S,T>> table;

    /**
     * Constructor de BST.
     */
    public SymTab()
    // post: constructs empty symbol table
    {
        table = new BinarySearchTree<ComparableAssociation<S,T>>();
    }

    /**
     * Metodo que revisa si un elemento existe dentro del arbol binario.
     * @param symbol Llave del elemento.
     * @return True o false dependiendo si existe el elemento o no.
     */
    public boolean contains(S symbol)
    // pre: symbol is non-null string
    // post: returns true iff string in table
    {
        ComparableAssociation<S,T> a =
                new ComparableAssociation<S,T>(symbol,null);
        return table.contains(a);

    }

    /**
     * Metodo que se encarga de agregar elementos al BST.
     * @param symbol Llave con la que se identificara a los datos.
     * @param value Datos que guardara el arbol binario.
     */
    public void add(S symbol, T value)
    // pre: symbol non-null
    // post: adds/replaces symbol-value pair in table
    {
        ComparableAssociation<S,T> a =
                new ComparableAssociation<S,T>(symbol,value);
        if (table.contains(a)) table.remove(a);
        table.add(a);
    }

    /**
     * Metodo que devuelve el elemento que se ingresa a traves del parametro
     * @param symbol Llave identificadora
     * @return Regresa el elemento que se encuentre con la llave metida en el parametro.
     */
    public T get(S symbol)
    // pre: symbol non null
    // post: returns token associated with symbol
    {
        ComparableAssociation<S,T> a =
                new ComparableAssociation<S,T>(symbol,null);
        if (table.contains(a)) {
            a = table.get(a);
            return a.getValue();
        } else {
            return null;
        }
    }

    /**
     * Metodo que borra algun elemento del arbol.
     * @param symbol Llave identificadora del elemento.
     * @return Devuelve el valor removido o regresa null si no encuentra nada.
     */
    public T remove(S symbol)
    // pre: symbol non null
    // post: removes value associated with symbol and returns it
    // if error returns null
    {
        ComparableAssociation<S,T> a =
                new ComparableAssociation<S,T>(symbol,null);
        if (table.contains(a)) {
            a = table.remove(a);
            return a.getValue();
        } else {
            return null;
        }
    }

}

