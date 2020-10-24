var app = new Vue({
    el: '#app',
    data: {
        titulo: 'Lista de tareas',        
        nuevaTarea: '',
        limite: 10,
        tareas: [
            {
                title: 'Calificar tareas desarrollo web',
                completed: false
            },
            {
                title: 'Evaluar proyectos progra 2',
                completed: false
            },
            {
                title: 'Dejar tarea Precalculo',
                completed: false
            }
        ]        
    },
    computed: {
      total: function () {
        return this.tareas.length;
      },
      completed: function () {
        return this.tareas.filter(function (todo) {
          return todo.completed == true;
        }).length;
      }
    },
    created: function () {
      this.getTodos();
    },    
    methods: {
        agregar: function(){
            this.tareas.push({title: this.nuevaTarea, completed:false});
            this.nuevaTarea='';
            //alert('hola '+this.nuevaTarea);
        },
        marcar: function(tarea){
            //alert('marcar '+tarea.texto);
            tarea.completed = !tarea.completed;
        },
        eliminar: function(indice){
            //alert('eliminar '+indice);
            this.tareas.splice(indice,1);
        },
				getTodos: function () {
          var self = this;

          fetch('https://jsonplaceholder.typicode.com/todos?_limit=' + this.limite)
          .then(function (response) {
            return response.json();
          })
          .then(function (data) {
            self.tareas = data;
          });
        }

    }
})