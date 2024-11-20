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

public val LightGroup.Grains: ImageVector
    get() {
        if (_grains != null) {
            return _grains!!
        }
        _grains = Builder(name = "Grains", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 58.0f)
                arcToRelative(85.48f, 85.48f, 0.0f, false, false, -32.84f, 6.53f)
                curveTo(161.45f, 34.31f, 132.0f, 19.3f, 130.68f, 18.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                curveToRelative(-1.33f, 0.67f, -30.77f, 15.68f, -44.48f, 45.9f)
                arcTo(85.51f, 85.51f, 0.0f, false, false, 48.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 58.0f)
                close()
                moveTo(122.0f, 217.76f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 144.0f)
                lineTo(54.0f, 126.24f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 122.0f, 200.0f)
                close()
                moveTo(122.0f, 156.25f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -68.0f, -42.0f)
                verticalLineToRelative(-44.0f)
                arcTo(74.11f, 74.11f, 0.0f, false, true, 122.0f, 144.0f)
                close()
                moveTo(91.58f, 69.91f)
                curveToRelative(9.66f, -21.6f, 29.27f, -34.78f, 36.42f, -39.0f)
                curveToRelative(7.16f, 4.25f, 26.76f, 17.43f, 36.41f, 39.0f)
                arcTo(86.5f, 86.5f, 0.0f, false, false, 128.0f, 112.5f)
                arcTo(86.47f, 86.47f, 0.0f, false, false, 91.58f, 69.91f)
                close()
                moveTo(202.0f, 144.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -68.0f, 73.76f)
                lineTo(134.0f, 200.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, 68.0f, -73.76f)
                close()
                moveTo(202.0f, 114.23f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -68.0f, 42.0f)
                lineTo(134.0f, 144.0f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, 68.0f, -73.76f)
                close()
            }
        }
        .build()
        return _grains!!
    }

private var _grains: ImageVector? = null
