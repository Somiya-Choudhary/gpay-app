import js from "@eslint/js";
import globals from "globals";
import pluginReact from "eslint-plugin-react";
import pluginReactHooks from "eslint-plugin-react-hooks";
import prettierPlugin from "eslint-plugin-prettier";
import { defineConfig } from "eslint/config";

export default defineConfig([
  {
    files: ["**/*.{js,jsx}"],
    languageOptions: {
      parserOptions: {
        ecmaVersion: 2025,
        sourceType: "module",
        ecmaFeatures: { jsx: true },
      },
      globals: globals.browser,
    },
    plugins: { js, react: pluginReact, "react-hooks": pluginReactHooks, prettier: prettierPlugin },
    extends: [
      "js/recommended",
      "plugin:react/recommended",
      "plugin:react-hooks/recommended",
      "plugin:prettier/recommended"
    ],
    rules: {
      "react/react-in-jsx-scope": "off",
      "react/prop-types": "off",
      "prettier/prettier": ["error"]
    },
  },
]);
