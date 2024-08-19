package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.31f, 124.76f)
                curveToRelative(-0.35f, -0.79f, -8.82f, -19.58f, -27.65f, -38.41f)
                curveTo(194.57f, 61.26f, 162.88f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(61.43f, 61.26f, 36.34f, 86.35f)
                curveTo(17.51f, 105.18f, 9.0f, 124.0f, 8.69f, 124.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f)
                curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f)
                curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(66.57f, -13.26f, 91.66f, -38.34f)
                curveToRelative(18.83f, -18.83f, 27.3f, -37.61f, 27.65f, -38.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.31f, 124.76f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-30.78f, 0.0f, -57.67f, -11.19f, -79.93f, -33.25f)
                arcTo(133.47f, 133.47f, 0.0f, false, true, 25.0f, 128.0f)
                arcTo(133.33f, 133.33f, 0.0f, false, true, 48.07f, 97.25f)
                curveTo(70.33f, 75.19f, 97.22f, 64.0f, 128.0f, 64.0f)
                reflectiveCurveToRelative(57.67f, 11.19f, 79.93f, 33.25f)
                arcTo(133.46f, 133.46f, 0.0f, false, true, 231.05f, 128.0f)
                curveTo(223.84f, 141.46f, 192.43f, 192.0f, 128.0f, 192.0f)
                close()
                moveTo(128.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
