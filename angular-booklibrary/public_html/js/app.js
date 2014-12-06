var bookLibrary = angular.module('bookLibrary', ['ngRoute','bookServices']);

/*bookLibrary.controller('BookCtrl', function($scope) {
    $scope.books = [{'name': 'El Principito', 'author': 'Desconocido'},
                    {'name': 'Rebelion en la granga', 'author': 'George Orwell'},
                    {'name': 'Cuentos escritos en el exilio', 'author': 'Juan Bosh'}];
});*/

bookLibrary.controller('BookCtrl', ['$scope', 'Book',
  function($scope, Book) {
    $scope.books = Book.query();    
  }]);

