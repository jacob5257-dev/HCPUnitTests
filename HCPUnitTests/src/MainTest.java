import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        String input = "failure";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("What is your name? Welcome, failure!", outContent.toString());
    }

    @Test
    public void testCountByAnything() {
        String input = "3";
        System.setIn(new ByteArrayInputStream((input.getBytes())));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                Count by how much?\s
                3 6 9 12 15 18 21 24 27 30\s
                33 36 39 42 45 48 51 54 57 60\s
                63 66 69 72 75 78 81 84 87 90\s
                93 96 99 102 105 108 111 114 117 120\s
                123 126 129 132 135 138 141 144 147 150\s
                153 156 159 162 165 168 171 174 177 180\s
                183 186 189 192 195 198 201 204 207 210\s
                213 216 219 222 225 228 231 234 237 240\s
                243 246 249 252 255 258 261 264 267 270\s
                273 276 279 282 285 288 291 294 297 300\s
                303 306 309 312 315 318 321 324 327 330\s
                333 336 339 342 345 348 351 354 357 360\s
                363 366 369 372 375 378 381 384 387 390\s
                393 396 399 402 405 408 411 414 417 420\s
                423 426 429 432 435 438 441 444 447 450\s
                453 456 459 462 465 468 471 474 477 480\s
                """, outContent.toString());
        input = "7";
        System.setIn(new ByteArrayInputStream((input.getBytes())));
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                Count by how much?\s
                3 6 9 12 15 18 21 24 27 30\s
                33 36 39 42 45 48 51 54 57 60\s
                63 66 69 72 75 78 81 84 87 90\s
                93 96 99 102 105 108 111 114 117 120\s
                123 126 129 132 135 138 141 144 147 150\s
                153 156 159 162 165 168 171 174 177 180\s
                183 186 189 192 195 198 201 204 207 210\s
                213 216 219 222 225 228 231 234 237 240\s
                243 246 249 252 255 258 261 264 267 270\s
                273 276 279 282 285 288 291 294 297 300\s
                303 306 309 312 315 318 321 324 327 330\s
                333 336 339 342 345 348 351 354 357 360\s
                363 366 369 372 375 378 381 384 387 390\s
                393 396 399 402 405 408 411 414 417 420\s
                423 426 429 432 435 438 441 444 447 450\s
                453 456 459 462 465 468 471 474 477 480\s
                Count by how much?\s
                7 14 21 28 35 42 49 56 63 70\s
                77 84 91 98 105 112 119 126 133 140\s
                147 154 161 168 175 182 189 196 203 210\s
                217 224 231 238 245 252 259 266 273 280\s
                287 294 301 308 315 322 329 336 343 350\s
                357 364 371 378 385 392 399 406 413 420\s
                427 434 441 448 455 462 469 476 483 490\s
                """, outContent.toString());
        input = "4";
        System.setIn(new ByteArrayInputStream((input.getBytes())));
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                Count by how much?\s
                3 6 9 12 15 18 21 24 27 30\s
                33 36 39 42 45 48 51 54 57 60\s
                63 66 69 72 75 78 81 84 87 90\s
                93 96 99 102 105 108 111 114 117 120\s
                123 126 129 132 135 138 141 144 147 150\s
                153 156 159 162 165 168 171 174 177 180\s
                183 186 189 192 195 198 201 204 207 210\s
                213 216 219 222 225 228 231 234 237 240\s
                243 246 249 252 255 258 261 264 267 270\s
                273 276 279 282 285 288 291 294 297 300\s
                303 306 309 312 315 318 321 324 327 330\s
                333 336 339 342 345 348 351 354 357 360\s
                363 366 369 372 375 378 381 384 387 390\s
                393 396 399 402 405 408 411 414 417 420\s
                423 426 429 432 435 438 441 444 447 450\s
                453 456 459 462 465 468 471 474 477 480\s
                Count by how much?\s
                7 14 21 28 35 42 49 56 63 70\s
                77 84 91 98 105 112 119 126 133 140\s
                147 154 161 168 175 182 189 196 203 210\s
                217 224 231 238 245 252 259 266 273 280\s
                287 294 301 308 315 322 329 336 343 350\s
                357 364 371 378 385 392 399 406 413 420\s
                427 434 441 448 455 462 469 476 483 490\s
                Count by how much?\s
                4 8 12 16 20 24 28 32 36 40\s
                44 48 52 56 60 64 68 72 76 80\s
                84 88 92 96 100 104 108 112 116 120\s
                124 128 132 136 140 144 148 152 156 160\s
                164 168 172 176 180 184 188 192 196 200\s
                204 208 212 216 220 224 228 232 236 240\s
                244 248 252 256 260 264 268 272 276 280\s
                284 288 292 296 300 304 308 312 316 320\s
                324 328 332 336 340 344 348 352 356 360\s
                364 368 372 376 380 384 388 392 396 400\s
                404 408 412 416 420 424 428 432 436 440\s
                444 448 452 456 460 464 468 472 476 480\s
                """, outContent.toString());
    }

    @Test
    public void testCountByFives() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                5 10 15 20 25 30 35 40 45 50\s
                55 60 65 70 75 80 85 90 95 100\s
                105 110 115 120 125 130 135 140 145 150\s
                155 160 165 170 175 180 185 190 195 200\s
                205 210 215 220 225 230 235 240 245 250\s
                255 260 265 270 275 280 285 290 295 300\s
                305 310 315 320 325 330 335 340 345 350\s
                355 360 365 370 375 380 385 390 395 400\s
                405 410 415 420 425 430 435 440 445 450\s
                455 460 465 470 475 480 485 490 495 500\s
                """, outContent.toString());
    }

    @Test
    public void testCountingLoop() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                212 213 214 215 216 217 218 219 220 221 222 223 224 225 226\s
                227 228 229 230 231 232 233 234 235 236 237 238 239 240 241\s
                242 243 244 245 246 247 248 249 250 251 252 253 254 255 256\s
                257 258 259 260 261 262 263 264 265 266 267 268 269 270 271\s
                272 273 274 275 276 277 278 279 280 281 282 283 284 285 286\s
                287 288 289 290 291 292 293 294 295 296 297 298 299 300 301\s
                302 303 304 305 306 307 308 309 310 311 312 313 314 315 316\s
                317 318 319 320 321 322 323 324 325 326 327 328 329 330 331\s
                332 333 334 335 336 337 338 339 340 341 342 343 344 345 346\s
                347 348 349 350 351 352 353 354 355 356 357 358 359 360 361\s
                362 363 364 365 366 367 368 369 370 371 372 373 374 375 376\s
                """, outContent.toString());
    }

    //Test untested!
    @Test
    public void testEOFLoop() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[0]);
        assertEquals("""
                Desert
                Vista
                Thunder
                Deignan
                Synder
                Roque
                Klecka
                Sorenson
                Knox
                Ahwatukee
                Phoenix""", outContent.toString());
    }

    //TODO
    @Test
    public void testReverse() {

    }
}