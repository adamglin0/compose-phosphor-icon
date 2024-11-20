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

public val ThinGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.94f, 152.67f)
                arcToRelative(53.51f, 53.51f, 0.0f, false, true, -43.28f, 43.27f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, true, -0.66f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.66f, -7.94f)
                curveToRelative(18.18f, -3.06f, 33.63f, -18.51f, 36.72f, -36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, 1.34f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f)
                curveToRelative(0.0f, -27.0f, 10.71f, -54.75f, 31.84f, -82.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -0.44f)
                lineToRelative(28.55f, 27.7f)
                lineToRelative(24.15f, -66.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.31f, -1.71f)
                curveTo(162.22f, 38.69f, 212.0f, 86.24f, 212.0f, 144.0f)
                close()
                moveTo(204.0f, 144.0f)
                curveToRelative(0.0f, -50.82f, -41.73f, -93.91f, -63.94f, -113.23f)
                lineToRelative(-24.3f, 66.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.55f, 1.5f)
                lineTo(79.5f, 70.0f)
                curveTo(61.25f, 95.07f, 52.0f, 119.93f, 52.0f, 144.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
