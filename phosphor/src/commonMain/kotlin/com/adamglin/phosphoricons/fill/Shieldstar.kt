package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Shieldstar: ImageVector
    get() {
        if (_shieldstar != null) {
            return _shieldstar!!
        }
        _shieldstar = Builder(name = "Shieldstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46.0f, 25.27f, 47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f)
                curveToRelative(1.0f, -0.26f, 23.91f, -6.67f, 47.0f, -25.53f)
                curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(171.0f, 127.43f)
                lineTo(140.69f, 139.55f)
                lineTo(158.4f, 163.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, 9.6f)
                lineTo(128.0f, 149.33f)
                lineTo(110.4f, 172.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f)
                lineToRelative(17.74f, -23.65f)
                lineTo(85.0f, 127.43f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 91.0f, 112.57f)
                lineToRelative(29.0f, 11.61f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(28.18f)
                lineToRelative(29.0f, -11.61f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 127.43f)
                close()
            }
        }
        .build()
        return _shieldstar!!
    }

private var _shieldstar: ImageVector? = null
