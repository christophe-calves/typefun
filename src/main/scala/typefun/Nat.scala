package typefun

trait Nat {
  type succ <: Nat
  type add[m <: Nat] <: Nat
  type mul[m <: Nat] <: Nat

  type chain[R, f[_ <: Nat] <: R] <: R
}

trait Z extends Nat {
  final type succ = S[Z]
  final type add[m <: Nat] = m
  final type mul[m <: Nat] = Z

  final type chain[R, f[_ <: Nat] <: R] = f[Z]
}

trait S[n <: Nat] extends Nat {
  final type succ = S[S[n]]
  final type add[m <: Nat] = S[n#add[m]]
  final type mul[m <: Nat] = n#mul[m]#add[m]

  type chain[R, f[_ <: Nat] <: R] = f[S[n]]
}

object Nat {
  type _0 = Z
  type _1 = S[Z]
  type _2 = S[_1]
  type _3 = S[_2]
  type _4 = S[_3]
  type _5 = S[_4]
  type _6 = S[_5]
  type _7 = S[_6]
  type _8 = S[_7]
  type _9 = S[_8]
  type _10 = S[_9]
  type _11 = S[_10]
  type _12 = S[_11]
  type _13 = S[_12]
  type _14 = S[_13]
  type _15 = S[_14]
  type _16 = S[_15]
  type _17 = S[_16]
  type _18 = S[_17]
  type _19 = S[_18]
  type _20 = S[_19]
  type _21 = S[_20]
  type _22 = S[_21]
  type _23 = S[_22]
  type _24 = S[_23]
  type _25 = S[_24]
  type _26 = S[_25]
  type _27 = S[_26]
  type _28 = S[_27]
  type _29 = S[_28]
  type _30 = S[_29]
  type _31 = S[_30]
  type _32 = S[_31]
  type _33 = S[_32]
  type _34 = S[_33]
  type _35 = S[_34]
  type _36 = S[_35]
  type _37 = S[_36]
  type _38 = S[_37]
  type _39 = S[_38]
  type _40 = S[_39]
  type _41 = S[_40]
  type _42 = S[_41]
  type _43 = S[_42]
  type _44 = S[_43]
  type _45 = S[_44]
  type _46 = S[_45]
  type _47 = S[_46]
  type _48 = S[_47]
  type _49 = S[_48]
  type _50 = S[_49]
  type _51 = S[_50]
  type _52 = S[_51]
  type _53 = S[_52]
  type _54 = S[_53]
  type _55 = S[_54]
  type _56 = S[_55]
  type _57 = S[_56]
  type _58 = S[_57]
  type _59 = S[_58]
  type _60 = S[_59]
  type _61 = S[_60]
  type _62 = S[_61]
  type _63 = S[_62]
  type _64 = S[_63]
  type _65 = S[_64]
  type _66 = S[_65]
  type _67 = S[_66]
  type _68 = S[_67]
  type _69 = S[_68]
  type _70 = S[_69]
  type _71 = S[_70]
  type _72 = S[_71]
  type _73 = S[_72]
  type _74 = S[_73]
  type _75 = S[_74]
  type _76 = S[_75]
  type _77 = S[_76]
  type _78 = S[_77]
  type _79 = S[_78]
  type _80 = S[_79]
  type _81 = S[_80]
  type _82 = S[_81]
  type _83 = S[_82]
  type _84 = S[_83]
  type _85 = S[_84]
  type _86 = S[_85]
  type _87 = S[_86]
  type _88 = S[_87]
  type _89 = S[_88]
  type _90 = S[_89]
  type _91 = S[_90]
  type _92 = S[_91]
  type _93 = S[_92]
  type _94 = S[_93]
  type _95 = S[_94]
  type _96 = S[_95]
  type _97 = S[_96]
  type _98 = S[_97]
  type _99 = S[_98]
  type _100 = S[_99]
  type _101 = S[_100]
  type _102 = S[_101]
  type _103 = S[_102]
  type _104 = S[_103]
  type _105 = S[_104]
  type _106 = S[_105]
  type _107 = S[_106]
  type _108 = S[_107]
  type _109 = S[_108]
  type _110 = S[_109]
  type _111 = S[_110]
  type _112 = S[_111]
  type _113 = S[_112]
  type _114 = S[_113]
  type _115 = S[_114]
  type _116 = S[_115]
  type _117 = S[_116]
  type _118 = S[_117]
  type _119 = S[_118]
  type _120 = S[_119]
  type _121 = S[_120]
  type _122 = S[_121]
  type _123 = S[_122]
  type _124 = S[_123]
  type _125 = S[_124]
  type _126 = S[_125]
  type _127 = S[_126]
  type _128 = S[_127]
  type _129 = S[_128]
  type _130 = S[_129]
  type _131 = S[_130]
  type _132 = S[_131]
  type _133 = S[_132]
  type _134 = S[_133]
  type _135 = S[_134]
  type _136 = S[_135]
  type _137 = S[_136]
  type _138 = S[_137]
  type _139 = S[_138]
  type _140 = S[_139]
  type _141 = S[_140]
  type _142 = S[_141]
  type _143 = S[_142]
  type _144 = S[_143]
  type _145 = S[_144]
  type _146 = S[_145]
  type _147 = S[_146]
  type _148 = S[_147]
  type _149 = S[_148]
  type _150 = S[_149]
  type _151 = S[_150]
  type _152 = S[_151]
  type _153 = S[_152]
  type _154 = S[_153]
  type _155 = S[_154]
  type _156 = S[_155]
  type _157 = S[_156]
  type _158 = S[_157]
  type _159 = S[_158]
  type _160 = S[_159]
  type _161 = S[_160]
  type _162 = S[_161]
  type _163 = S[_162]
  type _164 = S[_163]
  type _165 = S[_164]
  type _166 = S[_165]
  type _167 = S[_166]
  type _168 = S[_167]
  type _169 = S[_168]
  type _170 = S[_169]
  type _171 = S[_170]
  type _172 = S[_171]
  type _173 = S[_172]
  type _174 = S[_173]
  type _175 = S[_174]
  type _176 = S[_175]
  type _177 = S[_176]
  type _178 = S[_177]
  type _179 = S[_178]
  type _180 = S[_179]
  type _181 = S[_180]
  type _182 = S[_181]
  type _183 = S[_182]
  type _184 = S[_183]
  type _185 = S[_184]
  type _186 = S[_185]
  type _187 = S[_186]
  type _188 = S[_187]
  type _189 = S[_188]
  type _190 = S[_189]
  type _191 = S[_190]
  type _192 = S[_191]
  type _193 = S[_192]
  type _194 = S[_193]
  type _195 = S[_194]
  type _196 = S[_195]
  type _197 = S[_196]
  type _198 = S[_197]
  type _199 = S[_198]
  type _200 = S[_199]
  type _201 = S[_200]
  type _202 = S[_201]
  type _203 = S[_202]
  type _204 = S[_203]
  type _205 = S[_204]
  type _206 = S[_205]
  type _207 = S[_206]
  type _208 = S[_207]
  type _209 = S[_208]
  type _210 = S[_209]
  type _211 = S[_210]
  type _212 = S[_211]
  type _213 = S[_212]
  type _214 = S[_213]
  type _215 = S[_214]
  type _216 = S[_215]
  type _217 = S[_216]
  type _218 = S[_217]
  type _219 = S[_218]
  type _220 = S[_219]
  type _221 = S[_220]
  type _222 = S[_221]
  type _223 = S[_222]
  type _224 = S[_223]
  type _225 = S[_224]
  type _226 = S[_225]
  type _227 = S[_226]
  type _228 = S[_227]
  type _229 = S[_228]
  type _230 = S[_229]
  type _231 = S[_230]
  type _232 = S[_231]
  type _233 = S[_232]
  type _234 = S[_233]
  type _235 = S[_234]
  type _236 = S[_235]
  type _237 = S[_236]
  type _238 = S[_237]
  type _239 = S[_238]
  type _240 = S[_239]
  type _241 = S[_240]
  type _242 = S[_241]
  type _243 = S[_242]
  type _244 = S[_243]
  type _245 = S[_244]
  type _246 = S[_245]
  type _247 = S[_246]
  type _248 = S[_247]
  type _249 = S[_248]
  type _250 = S[_249]
  type _251 = S[_250]
  type _252 = S[_251]
  type _253 = S[_252]
  type _254 = S[_253]
  type _255 = S[_254]
  type _256 = S[_255]
  type _257 = S[_256]
  type _258 = S[_257]
  type _259 = S[_258]
  type _260 = S[_259]
  type _261 = S[_260]
  type _262 = S[_261]
  type _263 = S[_262]
  type _264 = S[_263]
  type _265 = S[_264]
  type _266 = S[_265]
  type _267 = S[_266]
  type _268 = S[_267]
  type _269 = S[_268]
  type _270 = S[_269]
  type _271 = S[_270]
  type _272 = S[_271]
  type _273 = S[_272]
  type _274 = S[_273]
  type _275 = S[_274]
  type _276 = S[_275]
  type _277 = S[_276]
  type _278 = S[_277]
  type _279 = S[_278]
  type _280 = S[_279]
  type _281 = S[_280]
  type _282 = S[_281]
  type _283 = S[_282]
  type _284 = S[_283]
  type _285 = S[_284]
  type _286 = S[_285]
  type _287 = S[_286]
  type _288 = S[_287]
  type _289 = S[_288]
  type _290 = S[_289]
  type _291 = S[_290]
  type _292 = S[_291]
  type _293 = S[_292]
  type _294 = S[_293]
  type _295 = S[_294]
  type _296 = S[_295]
  type _297 = S[_296]
  type _298 = S[_297]
  type _299 = S[_298]
  type _300 = S[_299]
  type _301 = S[_300]
  type _302 = S[_301]
  type _303 = S[_302]
  type _304 = S[_303]
  type _305 = S[_304]
  type _306 = S[_305]
  type _307 = S[_306]
  type _308 = S[_307]
  type _309 = S[_308]
  type _310 = S[_309]
  type _311 = S[_310]
  type _312 = S[_311]
  type _313 = S[_312]
  type _314 = S[_313]
  type _315 = S[_314]
  type _316 = S[_315]
  type _317 = S[_316]
  type _318 = S[_317]
  type _319 = S[_318]
  type _320 = S[_319]
  type _321 = S[_320]
  type _322 = S[_321]
  type _323 = S[_322]
  type _324 = S[_323]
  type _325 = S[_324]
  type _326 = S[_325]
  type _327 = S[_326]
  type _328 = S[_327]
  type _329 = S[_328]
  type _330 = S[_329]
  type _331 = S[_330]
  type _332 = S[_331]
  type _333 = S[_332]
  type _334 = S[_333]
  type _335 = S[_334]
  type _336 = S[_335]
  type _337 = S[_336]
  type _338 = S[_337]
  type _339 = S[_338]
  type _340 = S[_339]
  type _341 = S[_340]
  type _342 = S[_341]
  type _343 = S[_342]
  type _344 = S[_343]
  type _345 = S[_344]
  type _346 = S[_345]
  type _347 = S[_346]
  type _348 = S[_347]
  type _349 = S[_348]
  type _350 = S[_349]
  type _351 = S[_350]
  type _352 = S[_351]
  type _353 = S[_352]
  type _354 = S[_353]
  type _355 = S[_354]
  type _356 = S[_355]
  type _357 = S[_356]
  type _358 = S[_357]
  type _359 = S[_358]
  type _360 = S[_359]
  type _361 = S[_360]
  type _362 = S[_361]
  type _363 = S[_362]
  type _364 = S[_363]
  type _365 = S[_364]
  type _366 = S[_365]
  type _367 = S[_366]
  type _368 = S[_367]
  type _369 = S[_368]
  type _370 = S[_369]
  type _371 = S[_370]
  type _372 = S[_371]
  type _373 = S[_372]
  type _374 = S[_373]
  type _375 = S[_374]
  type _376 = S[_375]
  type _377 = S[_376]
  type _378 = S[_377]
  type _379 = S[_378]
  type _380 = S[_379]
  type _381 = S[_380]
  type _382 = S[_381]
  type _383 = S[_382]
  type _384 = S[_383]
  type _385 = S[_384]
  type _386 = S[_385]
  type _387 = S[_386]
  type _388 = S[_387]
  type _389 = S[_388]
  type _390 = S[_389]
  type _391 = S[_390]
  type _392 = S[_391]
  type _393 = S[_392]
  type _394 = S[_393]
  type _395 = S[_394]
  type _396 = S[_395]
  type _397 = S[_396]
  type _398 = S[_397]
  type _399 = S[_398]
  type _400 = S[_399]
  type _401 = S[_400]
  type _402 = S[_401]
  type _403 = S[_402]
  type _404 = S[_403]
  type _405 = S[_404]
  type _406 = S[_405]
  type _407 = S[_406]
  type _408 = S[_407]
  type _409 = S[_408]
  type _410 = S[_409]
  type _411 = S[_410]
  type _412 = S[_411]
  type _413 = S[_412]
  type _414 = S[_413]
  type _415 = S[_414]
  type _416 = S[_415]
  type _417 = S[_416]
  type _418 = S[_417]
  type _419 = S[_418]
  type _420 = S[_419]
  type _421 = S[_420]
  type _422 = S[_421]
  type _423 = S[_422]
  type _424 = S[_423]
  type _425 = S[_424]
  type _426 = S[_425]
  type _427 = S[_426]
  type _428 = S[_427]
  type _429 = S[_428]
  type _430 = S[_429]
  type _431 = S[_430]
  type _432 = S[_431]
  type _433 = S[_432]
  type _434 = S[_433]
  type _435 = S[_434]
  type _436 = S[_435]
  type _437 = S[_436]
  type _438 = S[_437]
  type _439 = S[_438]
  type _440 = S[_439]
  type _441 = S[_440]
  type _442 = S[_441]
  type _443 = S[_442]
  type _444 = S[_443]
  type _445 = S[_444]
  type _446 = S[_445]
  type _447 = S[_446]
  type _448 = S[_447]
  type _449 = S[_448]
  type _450 = S[_449]
  type _451 = S[_450]
  type _452 = S[_451]
  type _453 = S[_452]
  type _454 = S[_453]
  type _455 = S[_454]
  type _456 = S[_455]
  type _457 = S[_456]
  type _458 = S[_457]
  type _459 = S[_458]
  type _460 = S[_459]
  type _461 = S[_460]
  type _462 = S[_461]
  type _463 = S[_462]
  type _464 = S[_463]
  type _465 = S[_464]
  type _466 = S[_465]
  type _467 = S[_466]
  type _468 = S[_467]
  type _469 = S[_468]
  type _470 = S[_469]
  type _471 = S[_470]
  type _472 = S[_471]
  type _473 = S[_472]
  type _474 = S[_473]
  type _475 = S[_474]
  type _476 = S[_475]
  type _477 = S[_476]
  type _478 = S[_477]
  type _479 = S[_478]
  type _480 = S[_479]
  type _481 = S[_480]
  type _482 = S[_481]
  type _483 = S[_482]
  type _484 = S[_483]
  type _485 = S[_484]
  type _486 = S[_485]
  type _487 = S[_486]
  type _488 = S[_487]
  type _489 = S[_488]
  type _490 = S[_489]
  type _491 = S[_490]
  type _492 = S[_491]
  type _493 = S[_492]
  type _494 = S[_493]
  type _495 = S[_494]
  type _496 = S[_495]
  type _497 = S[_496]
  type _498 = S[_497]
  type _499 = S[_498]
  type _500 = S[_499]
  type _501 = S[_500]
  type _502 = S[_501]
  type _503 = S[_502]
  type _504 = S[_503]
  type _505 = S[_504]
  type _506 = S[_505]
  type _507 = S[_506]
  type _508 = S[_507]
  type _509 = S[_508]
  type _510 = S[_509]
  type _511 = S[_510]
  type _512 = S[_511]
  type _513 = S[_512]
  type _514 = S[_513]
  type _515 = S[_514]
  type _516 = S[_515]
  type _517 = S[_516]
  type _518 = S[_517]
  type _519 = S[_518]
  type _520 = S[_519]
  type _521 = S[_520]
  type _522 = S[_521]
  type _523 = S[_522]
  type _524 = S[_523]
  type _525 = S[_524]
  type _526 = S[_525]
  type _527 = S[_526]
  type _528 = S[_527]
  type _529 = S[_528]
  type _530 = S[_529]
  type _531 = S[_530]
  type _532 = S[_531]
  type _533 = S[_532]
  type _534 = S[_533]
  type _535 = S[_534]
  type _536 = S[_535]
  type _537 = S[_536]
  type _538 = S[_537]
  type _539 = S[_538]
  type _540 = S[_539]
  type _541 = S[_540]
  type _542 = S[_541]
  type _543 = S[_542]
  type _544 = S[_543]
  type _545 = S[_544]
  type _546 = S[_545]
  type _547 = S[_546]
  type _548 = S[_547]
  type _549 = S[_548]
  type _550 = S[_549]
  type _551 = S[_550]
  type _552 = S[_551]
  type _553 = S[_552]
  type _554 = S[_553]
  type _555 = S[_554]
  type _556 = S[_555]
  type _557 = S[_556]
  type _558 = S[_557]
  type _559 = S[_558]
  type _560 = S[_559]
  type _561 = S[_560]
  type _562 = S[_561]
  type _563 = S[_562]
  type _564 = S[_563]
  type _565 = S[_564]
  type _566 = S[_565]
  type _567 = S[_566]
  type _568 = S[_567]
  type _569 = S[_568]
  type _570 = S[_569]
  type _571 = S[_570]
  type _572 = S[_571]
  type _573 = S[_572]
  type _574 = S[_573]
  type _575 = S[_574]
  type _576 = S[_575]
  type _577 = S[_576]
  type _578 = S[_577]
  type _579 = S[_578]
  type _580 = S[_579]
  type _581 = S[_580]
  type _582 = S[_581]
  type _583 = S[_582]
  type _584 = S[_583]
  type _585 = S[_584]
  type _586 = S[_585]
  type _587 = S[_586]
  type _588 = S[_587]
  type _589 = S[_588]
  type _590 = S[_589]
  type _591 = S[_590]
  type _592 = S[_591]
  type _593 = S[_592]
  type _594 = S[_593]
  type _595 = S[_594]
  type _596 = S[_595]
  type _597 = S[_596]
  type _598 = S[_597]
  type _599 = S[_598]
  type _600 = S[_599]
}