package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Flag-thin`: ImageVector
    get() {
        if (`_flag-thin` != null) {
            return `_flag-thin`!!
        }
        `_flag-thin` = Builder(name = "Flag-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.39f, 53.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.39f, 3.0f)
                verticalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(177.87f)
                curveToRelative(29.41f, -24.39f, 55.08f, -11.69f, 82.23f, 1.73f)
                curveToRelative(16.5f, 8.17f, 33.33f, 16.5f, 51.13f, 16.5f)
                curveToRelative(13.14f, 0.0f, 26.81f, -4.55f, 41.26f, -17.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, -3.0f)
                verticalLineToRelative(-120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.62f, -3.0f)
                curveToRelative(-30.0f, 26.0f, -56.0f, 13.07f, -83.61f, -0.57f)
                curveTo(109.07f, 38.28f, 79.4f, 23.62f, 45.39f, 53.06f)
                close()
                moveTo(220.0f, 174.17f)
                curveToRelative(-29.41f, 24.4f, -55.08f, 11.7f, -82.23f, -1.73f)
                curveToRelative(-26.82f, -13.27f, -54.5f, -27.0f, -85.77f, -4.66f)
                verticalLineTo(57.92f)
                curveToRelative(29.41f, -24.4f, 55.08f, -11.7f, 82.23f, 1.73f)
                curveToRelative(26.82f, 13.27f, 54.5f, 27.0f, 85.77f, 4.66f)
                close()
            }
        }
        .build()
        return `_flag-thin`!!
    }

private var `_flag-thin`: ImageVector? = null
