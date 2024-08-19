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

public val ThinGroup.Shieldwarning: ImageVector
    get() {
        if (_shieldwarning != null) {
            return _shieldwarning!!
        }
        _shieldwarning = Builder(name = "Shieldwarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 136.0f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
                moveTo(220.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.16f, -24.73f, 82.12f, -45.47f, 99.1f)
                curveToRelative(-22.4f, 18.32f, -44.55f, 24.5f, -45.48f, 24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, 0.0f)
                curveToRelative(-0.93f, -0.26f, -23.08f, -6.44f, -45.48f, -24.76f)
                curveTo(60.73f, 194.12f, 36.0f, 163.16f, 36.0f, 112.0f)
                lineTo(36.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 44.0f)
                lineTo(208.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
                moveTo(212.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 38.44f, 14.23f, 69.63f, 42.29f, 92.71f)
                arcTo(132.23f, 132.23f, 0.0f, false, false, 128.0f, 227.82f)
                arcToRelative(132.45f, 132.45f, 0.0f, false, false, 41.71f, -23.11f)
                curveTo(197.77f, 181.63f, 212.0f, 150.44f, 212.0f, 112.0f)
                close()
            }
        }
        .build()
        return _shieldwarning!!
    }

private var _shieldwarning: ImageVector? = null
