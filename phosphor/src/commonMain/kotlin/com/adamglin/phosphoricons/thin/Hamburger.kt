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

public val ThinGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.07f, 100.0f)
                lineTo(207.93f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -14.55f)
                curveToRelative(-3.39f, -16.0f, -14.56f, -30.68f, -31.46f, -41.23f)
                reflectiveCurveTo(150.11f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveTo(84.49f, 33.76f, 67.73f, 44.22f)
                reflectiveCurveTo(39.66f, 69.41f, 36.27f, 85.45f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.07f, 100.0f)
                close()
                moveTo(44.07f, 87.11f)
                curveTo(50.26f, 58.0f, 86.33f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveToRelative(77.74f, 22.0f, 83.91f, 51.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.82f, 3.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, 1.5f)
                lineTo(48.07f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -1.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.09f, 87.11f)
                close()
                moveTo(230.61f, 156.24f)
                lineTo(188.05f, 171.72f)
                lineTo(149.47f, 156.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(108.0f, 171.69f)
                lineToRelative(-38.51f, -15.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, 0.0f)
                lineToRelative(-44.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 180.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 1.37f, -0.24f)
                lineTo(44.0f, 173.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(212.0f, 171.53f)
                lineToRelative(21.37f, -7.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.74f, -7.52f)
                close()
                moveTo(204.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(80.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(52.0f, 170.07f)
                lineToRelative(15.93f, -5.79f)
                lineToRelative(38.58f, 15.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(148.0f, 164.31f)
                lineToRelative(38.51f, 15.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.86f, 0.0f)
                lineTo(204.0f, 174.44f)
                close()
                moveTo(20.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(232.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(24.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
