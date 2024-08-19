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

public val ThinGroup.Moneywavy: ImageVector
    get() {
        if (_moneywavy != null) {
            return _moneywavy!!
        }
        _moneywavy = Builder(name = "Moneywavy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.12f, 63.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.88f, -0.2f)
                curveToRelative(-44.37f, 21.68f, -75.77f, 11.64f, -109.0f, 1.0f)
                reflectiveCurveToRelative(-67.71f, -21.67f, -115.0f, 1.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 69.21f)
                verticalLineToRelative(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.76f, 3.6f)
                curveToRelative(44.37f, -21.68f, 75.77f, -11.64f, 109.0f, -1.0f)
                curveToRelative(18.86f, 6.0f, 38.08f, 12.19f, 59.8f, 12.19f)
                curveToRelative(16.61f, 0.0f, 34.69f, -3.6f, 55.18f, -13.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.24f, -3.6f)
                verticalLineToRelative(-120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 242.12f, 63.39f)
                close()
                moveTo(236.0f, 184.27f)
                curveToRelative(-43.19f, 20.27f, -74.1f, 10.38f, -106.78f, -0.08f)
                curveToRelative(-18.86f, -6.0f, -38.08f, -12.18f, -59.8f, -12.18f)
                curveToRelative(-15.0f, 0.0f, -31.28f, 3.0f, -49.42f, 10.94f)
                lineTo(20.0f, 71.73f)
                curveToRelative(43.19f, -20.27f, 74.1f, -10.38f, 106.78f, 0.08f)
                curveTo(158.7f, 82.0f, 191.67f, 92.57f, 236.0f, 73.05f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(52.0f, 96.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(204.0f, 160.0f)
                lineTo(204.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _moneywavy!!
    }

private var _moneywavy: ImageVector? = null
