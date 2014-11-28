'use strict';

var careerModule = angular.module('DOMCareerModule', []);

var careerController = function($scope) {

	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " careerController";
	};

};
careerController.$inject = [ '$scope' ];

careerModule.controller('DOMCareerController', careerController);
