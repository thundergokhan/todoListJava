const app = document.getElementById('app');

const createTodo = () => {
// create todo form
const form = document.createElement('form');
form.setAttribute('id', 'todo-form');

// create todo input
const input = document.createElement('input');
input.setAttribute('type', 'text');
input.setAttribute('id', 'todo-input');
input.setAttribute('placeholder', 'Add a todo');

// append input to form
form.appendChild(input);

// create todo list
const ul = document.createElement('ul');
ul.setAttribute('id', 'todo-list');

// append form and list to app
app.appendChild(form);
app.appendChild(ul);
};

createTodo();

const addTodo = (todo) => {
// create todo li
const li = document.createElement('li');
li.innerHTML = todo;

// create delete button
const deleteButton = document.createElement('button');
deleteButton.innerHTML = '<i class="fas fa-trash-alt"></i>';
deleteButton.setAttribute('class', 'delete-button');

// append li and delete button to ul
ul.appendChild(li);
li.appendChild(deleteButton);
};

const handleSubmit = (e) => {
e.preventDefault();
const todo = todoInput.value;
if (todo) {
addTodo(todo);
todoInput.value = '';
}
};

const deleteTodo = (e) => {
if (e.target.classList.contains('delete-button')) {
e.target.parentElement.remove();
}
};

const handleDelete = (e) => {
deleteTodo(e);
};

const todoForm = document.getElementById('todo-form');
const todoInput = document.getElementById('todo-input');
const ul = document.getElementById('todo-list');

todoForm.addEventListener('submit', handleSubmit);
ul.addEventListener('click', handleDelete);