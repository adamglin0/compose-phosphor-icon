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

public val BoldGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 54.29f, 26.32f, 87.22f, 48.4f, 105.29f)
                curveToRelative(23.71f, 19.39f, 47.44f, 26.0f, 48.44f, 26.29f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.32f, 0.0f)
                curveToRelative(1.0f, -0.28f, 24.73f, -6.9f, 48.44f, -26.29f)
                curveToRelative(22.08f, -18.07f, 48.4f, -51.0f, 48.4f, -105.29f)
                lineTo(228.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(204.0f, 112.0f)
                curveToRelative(0.0f, 1.34f, 0.0f, 2.68f, -0.06f, 4.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(52.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(56.0f)
                lineTo(52.06f, 116.0f)
                curveToRelative(0.0f, -1.32f, -0.06f, -2.66f, -0.06f, -4.0f)
                close()
                moveTo(55.0f, 140.0f)
                horizontalLineToRelative(61.0f)
                verticalLineToRelative(74.29f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, true, -25.09f, -16.14f)
                curveTo(72.22f, 182.61f, 60.2f, 163.13f, 55.0f, 140.0f)
                close()
                moveTo(165.1f, 198.15f)
                arcTo(127.0f, 127.0f, 0.0f, false, true, 140.0f, 214.29f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(61.0f)
                curveTo(195.8f, 163.13f, 183.78f, 182.61f, 165.09f, 198.15f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
