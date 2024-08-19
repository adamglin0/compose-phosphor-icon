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

public val LightGroup.Testtube: ImageVector
    get() {
        if (_testtube != null) {
            return _testtube!!
        }
        _testtube = Builder(name = "Testtube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 87.76f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(38.53f, 157.0f)
                arcTo(42.77f, 42.77f, 0.0f, true, false, 99.0f, 217.47f)
                lineTo(211.24f, 105.24f)
                lineToRelative(22.66f, -7.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, -9.93f)
                close()
                moveTo(90.53f, 209.0f)
                arcTo(30.77f, 30.77f, 0.0f, true, true, 47.0f, 165.47f)
                lineToRelative(29.13f, -29.12f)
                curveToRelative(8.84f, -3.14f, 22.84f, -4.56f, 41.08f, 5.0f)
                curveToRelative(12.28f, 6.41f, 23.13f, 8.66f, 32.27f, 8.71f)
                close()
                moveTo(206.1f, 94.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.34f, 1.45f)
                lineToRelative(-39.9f, 39.89f)
                curveToRelative(-8.84f, 3.14f, -22.84f, 4.56f, -41.08f, -5.0f)
                curveTo(110.5f, 124.27f, 99.65f, 122.0f, 90.51f, 122.0f)
                lineTo(172.0f, 40.49f)
                lineToRelative(48.89f, 48.89f)
                close()
            }
        }
        .build()
        return _testtube!!
    }

private var _testtube: ImageVector? = null
