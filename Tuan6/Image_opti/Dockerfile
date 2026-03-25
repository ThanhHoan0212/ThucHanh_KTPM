# ===== Stage 1 =====
FROM node:20-alpine AS builder

WORKDIR /app

COPY package*.json ./
RUN npm ci

# ===== Stage 2 =====
FROM node:20-alpine

WORKDIR /app

ENV NODE_ENV=production

COPY package*.json ./
RUN npm ci --omit=dev

COPY src ./src

EXPOSE 3000

CMD ["node", "src/index.js"]