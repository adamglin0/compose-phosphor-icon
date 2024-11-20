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

public val ThinGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.16f, 24.73f, 82.12f, 45.47f, 99.1f)
                curveToRelative(22.4f, 18.32f, 44.55f, 24.5f, 45.48f, 24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 0.0f)
                curveToRelative(0.93f, -0.26f, 23.08f, -6.44f, 45.48f, -24.76f)
                curveToRelative(20.74f, -17.0f, 45.47f, -47.94f, 45.47f, -99.1f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 56.0f)
                verticalLineToRelative(56.0f)
                quadToRelative(0.0f, 6.12f, -0.49f, 12.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 56.0f)
                close()
                moveTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(72.0f)
                lineTo(44.49f, 124.0f)
                quadTo(44.0f, 118.12f, 44.0f, 112.0f)
                close()
                moveTo(45.38f, 132.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(94.44f)
                arcToRelative(135.16f, 135.16f, 0.0f, false, true, -37.71f, -21.73f)
                curveTo(63.27f, 185.78f, 49.56f, 161.38f, 45.38f, 132.0f)
                close()
                moveTo(169.71f, 204.71f)
                arcTo(134.9f, 134.9f, 0.0f, false, true, 132.0f, 226.44f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(78.62f)
                curveTo(206.44f, 161.38f, 192.73f, 185.78f, 169.71f, 204.71f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
