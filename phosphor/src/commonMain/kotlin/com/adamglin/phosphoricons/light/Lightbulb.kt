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

public val LightGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 232.0f)
                close()
                moveTo(214.0f, 104.0f)
                arcToRelative(85.56f, 85.56f, 0.0f, false, true, -32.88f, 67.64f)
                arcTo(18.23f, 18.23f, 0.0f, false, false, 174.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -7.0f, -14.23f)
                horizontalLineToRelative(0.0f)
                arcToRelative(85.59f, 85.59f, 0.0f, false, true, -33.0f, -67.24f)
                curveTo(41.74f, 57.91f, 79.39f, 19.12f, 125.93f, 18.0f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 214.0f, 104.0f)
                close()
                moveTo(202.0f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -75.79f, -74.0f)
                curveTo(86.17f, 31.0f, 53.78f, 64.34f, 54.0f, 104.42f)
                arcToRelative(73.67f, 73.67f, 0.0f, false, false, 28.4f, 57.87f)
                arcTo(29.92f, 29.92f, 0.0f, false, true, 94.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(30.18f, 30.18f, 0.0f, false, true, 11.7f, -23.78f)
                arcTo(73.59f, 73.59f, 0.0f, false, false, 202.0f, 104.0f)
                close()
                moveTo(181.92f, 95.0f)
                arcTo(55.58f, 55.58f, 0.0f, false, false, 137.0f, 50.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.0f, 11.84f)
                curveTo(152.38f, 64.84f, 167.13f, 79.6f, 170.08f, 97.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.91f, 5.0f)
                arcToRelative(6.87f, 6.87f, 0.0f, false, false, 1.0f, -0.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 181.92f, 95.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
