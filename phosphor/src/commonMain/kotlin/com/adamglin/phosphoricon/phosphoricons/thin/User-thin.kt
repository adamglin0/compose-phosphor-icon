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

public val ThinGroup.`User-thin`: ImageVector
    get() {
        if (`_user-thin` != null) {
            return `_user-thin`!!
        }
        `_user-thin` = Builder(name = "User-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.46f, 214.0f)
                curveToRelative(-16.52f, -28.56f, -43.0f, -48.06f, -73.68f, -55.09f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -51.56f, 0.0f)
                curveToRelative(-30.64f, 7.0f, -57.16f, 26.53f, -73.68f, 55.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.92f, 4.0f)
                curveTo(55.0f, 184.19f, 89.62f, 164.0f, 128.0f, 164.0f)
                reflectiveCurveToRelative(73.0f, 20.19f, 92.54f, 54.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.46f, 2.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 2.0f, -0.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 227.46f, 214.0f)
                close()
                moveTo(68.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 68.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_user-thin`!!
    }

private var `_user-thin`: ImageVector? = null
