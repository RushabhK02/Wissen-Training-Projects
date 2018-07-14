//-----------------------------------------------
// Model i.e Todo ( id,title,completed)
class Todo {
    constructor(title) {
        Todo.id++;
        this.id = Todo.id;
        this.title = title;
        this.completed = false
    }
}
Todo.id = 0;
//-----------------------------------------------

// Service i.e TodoService

class TodoService {
    constructor() {
        this.todos = []
    }
    addTodo(title) {
        var item = new Todo(title);
        this.todos = this.todos.concat([item]);
        return true;
        // TODO:
    }
    editTodo(id, newTitle) {
        var edit = function (todoVar) {
            if (id === todoVar.id) {
                todoVar.title = newTitle
            }
            return todoVar;
        }
        this.todos = this.todos.map(edit);
        return true;
        // TODO:
    }
    completeTodo(id) {
        var complete = function (todoVar) {
            if (id === todoVar.id) {
                todoVar.completed = !todoVar.completed;
            }
            return todoVar;
        }
        this.todos = this.todos.map(complete);
        return true;
        // TODO:
    }
    deleteTodo(id) {
        // TODO:
        function del(todoVar) {
            return id != todoVar.id;
        }
        this.todos = this.todos.filter(del);

    }
    completeAll() {
        var Allcomplete = function (todoVar) {
            todoVar.completed = true;
            return todoVar;
        }
        this.todos = this.todos.map(Allcomplete);
        return true;
        // TODO:
    }
    clearCompleted() {
        // TODO:
        function clearComplete(todoVar) {
            return !(todoVar.completed === true);
        }
        this.todos = this.todos.filter(clearComplete);
    }
    viewTodos(filter) {
        // filter ==> 'ALL' | 'ACTIVE' | 'COMPLETED'
        if (filter === 'ALL') {
            this.todos.forEach(element => {
                console.log(element);
            });
            return true;
        }
        if (filter === 'ACTIVE') {
            this.todos.forEach(element => {
                if (element.completed === false) {
                    console.log(element);
                }
            });
            return true;
        }
        if (filter === 'COMPLETED') {
            this.todos.forEach(element => {
                if (element.completed === true) {
                    console.log(element);
                }
            });
            return true;
        }
    }

}

//-------------------------------------------

const todosService = new TodoService();


