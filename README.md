# webhook-chatbot-backend

📌 Description

This project is a backend simulation of a WhatsApp chatbot built using Spring Boot.
It processes incoming messages via a webhook endpoint and returns automated responses.

⚙️ Features

REST API endpoint (/webhook)

Handles POST requests

Processes JSON input

Returns predefined responses (Hi → Hello, Bye → Goodbye)

Logs incoming messages

🛠 Tech Stack

Java

Spring Boot

Maven

🔄 API Flow

Client → /webhook → Controller → Service → Response

📥 Sample Request
{

  "message": "Hi"

}

📤 Sample Response

Hello
