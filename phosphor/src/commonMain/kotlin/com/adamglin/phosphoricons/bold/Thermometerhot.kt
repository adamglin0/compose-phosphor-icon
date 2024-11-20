package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 56.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 56.0f, 56.0f)
                verticalLineToRelative(94.69f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 104.0f, 0.0f)
                close()
                moveTo(108.0f, 228.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -30.91f, -65.39f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 154.78f)
                lineTo(80.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(98.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.77f, 7.68f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 108.0f, 228.0f)
                close()
                moveTo(132.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.78f)
                lineTo(96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(120.0f, 167.22f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f)
                close()
                moveTo(173.94f, 83.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -16.6f)
                curveToRelative(16.82f, -11.0f, 30.32f, -5.2f, 39.26f, -1.39f)
                curveToRelative(8.09f, 3.46f, 10.93f, 4.37f, 16.74f, 0.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.1f, 20.11f)
                curveTo(239.28f, 90.38f, 232.64f, 92.0f, 226.71f, 92.0f)
                curveToRelative(-7.79f, 0.0f, -14.34f, -2.8f, -19.42f, -5.0f)
                curveToRelative(-8.09f, -3.46f, -10.93f, -4.37f, -16.74f, -0.58f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 173.94f, 83.0f)
                close()
                moveTo(250.05f, 109.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.5f, 16.6f)
                curveToRelative(-7.27f, 4.73f, -13.91f, 6.35f, -19.84f, 6.35f)
                curveToRelative(-7.79f, 0.0f, -14.34f, -2.8f, -19.42f, -5.0f)
                curveToRelative(-8.09f, -3.46f, -10.93f, -4.37f, -16.74f, -0.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.1f, -20.11f)
                curveToRelative(16.82f, -11.0f, 30.32f, -5.2f, 39.26f, -1.39f)
                curveToRelative(8.09f, 3.46f, 10.93f, 4.37f, 16.74f, 0.58f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 250.05f, 109.05f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
