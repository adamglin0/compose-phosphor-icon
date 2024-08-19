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

public val BoldGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                curveToRelative(0.0f, 35.71f, -13.09f, 64.69f, -38.91f, 86.15f)
                arcTo(126.28f, 126.28f, 0.0f, false, true, 128.0f, 219.38f)
                arcToRelative(126.14f, 126.14f, 0.0f, false, true, -37.09f, -21.23f)
                curveTo(65.09f, 176.69f, 52.0f, 147.71f, 52.0f, 112.0f)
                lineTo(52.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
