package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.36f, 35.07f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.26f, 3.0f)
                lineToRelative(-0.29f, 0.3f)
                lineTo(187.42f, 59.58f)
                arcToRelative(109.16f, 109.16f, 0.0f, false, false, -118.84f, 0.0f)
                lineTo(50.19f, 38.41f)
                lineToRelative(-0.29f, -0.3f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 48.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 51.83f, 45.76f, 94.0f, 102.0f, 94.0f)
                reflectiveCurveToRelative(102.0f, -42.17f, 102.0f, -94.0f)
                lineTo(230.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 221.36f, 35.07f)
                close()
                moveTo(218.0f, 136.0f)
                curveToRelative(0.0f, 43.38f, -37.16f, 79.0f, -84.0f, 81.81f)
                lineTo(134.0f, 194.48f)
                lineToRelative(14.24f, -14.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.49f)
                lineTo(128.0f, 183.51f)
                lineToRelative(-11.76f, -11.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.49f)
                lineTo(122.0f, 194.48f)
                verticalLineToRelative(23.33f)
                curveTo(75.16f, 215.0f, 38.0f, 179.38f, 38.0f, 136.0f)
                lineTo(38.0f, 48.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 1.23f, -1.85f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.82f, -0.17f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.26f, 0.5f)
                lineToRelative(21.76f, 25.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.11f, 0.88f)
                arcTo(91.52f, 91.52f, 0.0f, false, true, 90.0f, 61.68f)
                lineTo(90.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(102.0f, 57.51f)
                arcToRelative(97.85f, 97.85f, 0.0f, false, true, 20.0f, -3.32f)
                lineTo(122.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(134.0f, 54.19f)
                arcToRelative(97.85f, 97.85f, 0.0f, false, true, 20.0f, 3.32f)
                lineTo(154.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(166.0f, 61.68f)
                arcToRelative(91.52f, 91.52f, 0.0f, false, true, 18.82f, 10.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.11f, -0.88f)
                lineToRelative(21.76f, -25.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 48.0f)
                close()
                moveTo(94.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 140.0f)
                close()
                moveTo(182.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 140.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
