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

public val ThinGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(132.0f, 92.0f)
                lineTo(132.0f, 75.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 156.0f, 48.0f)
                curveToRelative(0.0f, -25.84f, -24.73f, -42.63f, -25.78f, -43.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f)
                curveTo(124.73f, 5.37f, 100.0f, 22.16f, 100.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 24.0f, 27.71f)
                lineTo(124.0f, 92.0f)
                lineTo(48.0f, 92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(23.33f)
                arcToRelative(36.85f, 36.85f, 0.0f, false, false, 8.0f, 22.91f)
                lineTo(36.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 158.24f)
                arcToRelative(36.85f, 36.85f, 0.0f, false, false, 8.0f, -22.91f)
                close()
                moveTo(108.0f, 48.0f)
                curveToRelative(0.0f, -17.39f, 14.37f, -30.53f, 20.0f, -35.0f)
                curveToRelative(5.63f, 4.48f, 20.0f, 17.62f, 20.0f, 35.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                close()
                moveTo(200.0f, 212.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(44.0f, 165.73f)
                arcTo(35.16f, 35.16f, 0.0f, false, false, 63.0f, 172.0f)
                arcToRelative(36.13f, 36.13f, 0.0f, false, false, 33.0f, -19.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcTo(36.13f, 36.13f, 0.0f, false, false, 192.0f, 172.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(35.16f, 35.16f, 0.0f, false, false, 19.0f, -6.26f)
                lineTo(212.0f, 200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 212.0f)
                close()
                moveTo(220.0f, 135.33f)
                curveToRelative(0.0f, 15.39f, -12.21f, 28.25f, -27.21f, 28.66f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 164.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.79f, 28.0f)
                curveToRelative(-15.0f, -0.41f, -27.21f, -13.27f, -27.21f, -28.66f)
                lineTo(36.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(208.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
