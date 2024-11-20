package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 175.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.92f, -3.0f)
                lineToRelative(-19.0f, -33.2f)
                arcTo(123.23f, 123.23f, 0.0f, false, true, 162.0f, 155.46f)
                lineToRelative(5.87f, 35.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, 9.21f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 160.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.69f)
                lineToRelative(-5.77f, -34.58f)
                arcToRelative(133.06f, 133.06f, 0.0f, false, true, -36.68f, 0.0f)
                lineToRelative(-5.77f, 34.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 200.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.32f, -0.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -9.21f)
                lineTo(94.0f, 155.46f)
                arcToRelative(123.23f, 123.23f, 0.0f, false, true, -36.06f, -16.69f)
                lineTo(39.0f, 172.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 25.06f, 164.0f)
                lineToRelative(20.0f, -35.0f)
                arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, -20.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 38.22f, 99.0f)
                curveToRelative(16.6f, 20.54f, 45.64f, 45.0f, 89.78f, 45.0f)
                reflectiveCurveToRelative(73.18f, -24.49f, 89.78f, -45.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 230.22f, 109.0f)
                arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, 20.0f)
                lineToRelative(20.0f, 35.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 175.0f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
