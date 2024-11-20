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

public val ThinGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.49f, 67.71f)
                lineTo(138.77f, 80.0f)
                lineToRelative(30.72f, 12.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 100.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.49f, -0.29f)
                lineTo(128.0f, 84.31f)
                lineTo(89.49f, 99.71f)
                arcTo(3.91f, 3.91f, 0.0f, false, true, 88.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, -7.72f)
                lineTo(117.23f, 80.0f)
                lineTo(86.51f, 67.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -7.43f)
                lineTo(128.0f, 75.69f)
                lineToRelative(38.51f, -15.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 7.43f)
                close()
                moveTo(220.0f, 79.71f)
                curveToRelative(0.07f, 71.08f, -23.16f, 130.07f, -45.65f, 146.05f)
                arcToRelative(11.74f, 11.74f, 0.0f, false, true, -11.93f, 1.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, -6.9f, -10.0f)
                curveTo(154.35f, 200.93f, 149.33f, 164.0f, 128.0f, 164.0f)
                reflectiveCurveToRelative(-26.35f, 36.94f, -27.52f, 52.82f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, true, -12.0f, 11.19f)
                arcToRelative(11.77f, 11.77f, 0.0f, false, true, -6.83f, -2.2f)
                curveToRelative(-22.49f, -16.0f, -45.72f, -75.0f, -45.65f, -146.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 88.0f, 28.0f)
                horizontalLineToRelative(80.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 220.0f, 79.75f)
                close()
                moveTo(212.0f, 79.71f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 36.0f)
                lineTo(88.0f, 36.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 44.0f, 79.76f)
                curveToRelative(-0.07f, 67.58f, 21.9f, 125.0f, 42.29f, 139.51f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, 3.89f, 0.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.32f, -3.37f)
                curveTo(95.36f, 177.39f, 108.0f, 156.0f, 128.0f, 156.0f)
                reflectiveCurveToRelative(32.64f, 21.4f, 35.5f, 60.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.32f, 3.37f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, 3.89f, -0.33f)
                curveTo(190.1f, 204.8f, 212.07f, 147.34f, 212.0f, 79.76f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
