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

public val LightGroup.Shieldstar: ImageVector
    get() {
        if (_shieldstar != null) {
            return _shieldstar!!
        }
        _shieldstar = Builder(name = "Shieldstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.57f, 117.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.34f, 7.8f)
                lineTo(137.5f, 138.66f)
                lineToRelative(19.3f, 25.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.6f, 7.2f)
                lineTo(128.0f, 146.0f)
                lineToRelative(-19.2f, 25.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                lineToRelative(19.3f, -25.74f)
                lineTo(85.77f, 125.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.46f, -11.14f)
                lineTo(122.0f, 127.14f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(31.14f)
                lineToRelative(31.77f, -12.71f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 173.57f, 117.77f)
                close()
                moveTo(222.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.94f, -25.12f, 83.4f, -46.2f, 100.64f)
                curveToRelative(-22.73f, 18.6f, -45.27f, 24.89f, -46.22f, 25.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.16f, 0.0f)
                curveToRelative(-1.0f, -0.26f, -23.49f, -6.55f, -46.22f, -25.15f)
                curveTo(59.12f, 195.4f, 34.0f, 163.94f, 34.0f, 112.0f)
                lineTo(34.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 42.0f)
                lineTo(208.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f)
                close()
                moveTo(210.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 37.75f, 13.94f, 68.39f, 41.44f, 91.06f)
                arcTo(130.94f, 130.94f, 0.0f, false, false, 128.0f, 225.72f)
                arcToRelative(131.17f, 131.17f, 0.0f, false, false, 40.56f, -22.66f)
                curveTo(196.06f, 180.39f, 210.0f, 149.75f, 210.0f, 112.0f)
                close()
            }
        }
        .build()
        return _shieldstar!!
    }

private var _shieldstar: ImageVector? = null
