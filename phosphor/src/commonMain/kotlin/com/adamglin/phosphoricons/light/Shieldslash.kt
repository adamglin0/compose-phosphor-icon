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

public val LightGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.63f, 7.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.94f, 25.12f, 83.4f, 46.2f, 100.64f)
                curveToRelative(22.73f, 18.6f, 45.27f, 24.89f, 46.22f, 25.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.16f, 0.0f)
                curveToRelative(1.36f, -0.37f, 31.91f, -8.95f, 57.67f, -35.7f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(128.0f, 225.72f)
                arcToRelative(130.83f, 130.83f, 0.0f, false, true, -40.56f, -22.66f)
                curveTo(59.94f, 180.39f, 46.0f, 149.75f, 46.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.6f)
                lineTo(179.16f, 193.19f)
                arcTo(130.68f, 130.68f, 0.0f, false, true, 128.0f, 225.72f)
                close()
                moveTo(222.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 20.29f, -3.83f, 39.05f, -11.38f, 55.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.47f, 3.53f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, true, -2.47f, -0.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -7.93f)
                curveTo(206.53f, 147.67f, 210.0f, 130.57f, 210.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(98.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                horizontalLineTo(208.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
