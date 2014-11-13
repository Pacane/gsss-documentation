# GSS++

Unleash the power of GssResource and CSS3 in your GWT application

## Border Radius

**@param TOP_RIGHT** size of the top right corner

**@param BOTTOM_RIGHT** size of the bottom right corner

**@param BOTTOM_LEFT** size of the bottom left corner

**@param TOP_LEFT** size of the top left corner

**@param SIZE** size of all corners

### borderradius(TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT, TOP_LEFT)

```
@mixin borderradius(5px, 0, 10px, 0);
```

### rounded(SIZE)

```
@mixin rounded(12px);
```

## Box Shadow

**@param HORIZONTAL** position of the horizontal shadow

**@param VERTICAL** position of the vertical shadow

**@param BLUR** distance of the blur

**@param SPREAD** shadow size

**@param COLOR** shadow color

### boxshadow(HORIZONTAL, VERTICAL, BLUR, SPREAD, COLOR)

```
@mixin boxshadow(1px, 1px, 5px, 2px, rgba(0, 0, 0, 0.3));
```

### boxshadow_inset(HORIZONTAL, VERTICAL, BLUR, SPREAD, COLOR)

```
@mixin boxshadow(0, 1px, 2px, 2px, rgba(200, 100, 50, 0.2));
```

### boxshadow_none()

```
@mixin boxshadow_none();
```

## Box Sizing

### boxsizing()

```
@mixin boxsizing();
```

## Drop Shadow

**@param HORIZONTAL** position of the horizontal shadow

**@param VERTICAL** position of the vertical shadow

**@param BLUR** distance of the blur

**@param ALPHA** shadow opacity (0 to 1)

### dropshadow(HORIZONTAL, VERTICAL, BLUR, ALPHA)

```
@mixin dropshadow(5px, 5px, 10px, 0.3);
```

## Inner Shadow

**@param HORIZONTAL** position of the horizontal shadow

**@param VERTICAL** position of the vertical shadow

**@param BLUR** distance of the blur

**@param ALPHA** shadow opacity (0 to 1)

### innershadow(HORIZONTAL, VERTICAL, BLUR, ALPHA)

```
@mixin innershadow(0, 5px, 2px, 0.5);
```

## Opacity

**@param ALPHA** shadow opacity (0 to 1)

### opacity(ALPHA)

```
@mixin alpha(0.5);
```

## Transform

**@param DEGREES** angle of the rotation

**@param RATIO_HORIZONTAL** horizontal ratio (x) where 1 = no changes and 2 = twice the size

**@param RATIO_VERTICAL** vertical ratio (y) where 1 = no changes and 2 = twice the size

**@param HORIZONTAL** horizontal change (x) in pixels

**@param VERTICAL** vertical change (x) in pixels

### Flip

#### flip_horizontal()

```
@mixin flip_horizontal();
```

#### flip_vertical()

```
@mixin flip_vertical();
```

### Rotate

#### rotate(DEGREE)

```
@mixin rotate(45deg);
```

#### rotate_180_cw()

```
@mixin rotate_180_cw();
```

#### rotate_180_ccw()

```
@mixin rotate_180_ccw();
```

### Scale

#### scale(RATIO_HORIZONTAL, RATIO_VERTICAL)

```
@mixin scale(1.5, 1);
```

### Translate

#### translate(HORIZONTAL, VERTICAL)

```
@mixin translate(10px, 20px);
```

## Transition

**@param PROPERTY** name of the CSS property affected

**@param DURATION** time of the transition effect

**@param EFFECT** speed curve of the transition effect

**@param DELAY** time before the transition effect starts

### transition(PROPERTY, DURATION)

```
@mixin transition(margin-left, 200);
```

### transition_effect(PROPERTY, DURATION, EFFECT)

```
@mixin transition(all, 500, ease);
```

### transition_delay(PROPERTY, DURATION, EFFECT, DELAY)

```
@mixin transition(width, 250, ease, 100);
```
