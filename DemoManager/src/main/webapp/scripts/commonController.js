'use strict';

var commonModule = angular.module('DOMCommonModule', []);

var commonController = function($scope) {

	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " memberController";
	};

};

commonController.$inject = [ '$scope' ];

commonModule.controller('DOMCommonController', commonController);
