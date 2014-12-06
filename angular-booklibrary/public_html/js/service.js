//var bookService = angular.module('bookService', ['ngResource']);

// Service that provides book operations
/*bookService.factory('bookService', function ($resource) {
    return $resource('rest/book/:id');
});*/

/**
 * Ejemplo de uso
 * var bookLibrary = angular.module('bookLibrary', ['bookService']);
 * bookLibrary.controller('BookCtrl', ['$scope', 'Book', function($scope, Book) {
  $scope.books = Book.query();
  
}]);
 */

/* Services */

var bookServices = angular.module('bookServices', ['ngResource']);

bookServices.factory('Book', ['$resource',
  function($resource){
    return $resource('books/:bookId.json', {}, {
      query: {method:'GET', params:{bookId:'books'}, isArray:true}
    });
  }]);
