package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.0f, 171.47f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, 0.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -2.0f)
                lineToRelative(-21.15f, -37.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, false, true, -41.91f, 19.53f)
                lineTo(164.0f, 191.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, 4.6f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, -0.67f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.34f)
                lineToRelative(-6.41f, -38.5f)
                arcToRelative(128.17f, 128.17f, 0.0f, false, true, -43.28f, 0.0f)
                lineTo(100.0f, 192.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 196.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, -0.67f, -0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, -4.6f)
                lineToRelative(6.48f, -38.83f)
                arcTo(120.0f, 120.0f, 0.0f, false, true, 56.62f, 133.0f)
                lineTo(35.47f, 170.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 172.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, -0.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.53f, 166.0f)
                lineToRelative(21.68f, -37.94f)
                arcToRelative(148.24f, 148.24f, 0.0f, false, true, -21.32f, -21.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.22f, -5.0f)
                curveTo(52.25f, 122.71f, 82.29f, 148.0f, 128.0f, 148.0f)
                reflectiveCurveToRelative(75.75f, -25.29f, 92.89f, -46.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.22f, 5.0f)
                arcToRelative(148.24f, 148.24f, 0.0f, false, true, -21.32f, 21.56f)
                lineTo(227.47f, 166.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.0f, 171.47f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
