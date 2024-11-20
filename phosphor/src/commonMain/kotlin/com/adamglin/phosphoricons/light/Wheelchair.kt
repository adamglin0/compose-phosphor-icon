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

public val LightGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.69f, 190.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.59f, -3.79f)
                lineTo(227.0f, 192.66f)
                lineToRelative(-29.68f, -59.34f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 130.0f)
                horizontalLineTo(110.0f)
                verticalLineTo(102.05f)
                curveToRelative(0.66f, 0.0f, 1.33f, 0.0f, 2.0f, 0.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-0.67f, 0.0f, -1.33f, 0.0f, -2.0f, 0.0f)
                verticalLineTo(77.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 112.0f, 230.0f)
                curveToRelative(32.62f, 0.0f, 62.0f, -22.08f, 69.81f, -52.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.62f, -3.0f)
                curveToRelative(-6.49f, 25.21f, -31.0f, 43.5f, -58.19f, 43.5f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 98.0f, 103.72f)
                verticalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(84.29f)
                lineToRelative(30.34f, 60.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.27f, 3.0f)
                lineToRelative(24.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 253.69f, 190.1f)
                close()
                moveTo(86.0f, 48.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 86.0f, 48.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
