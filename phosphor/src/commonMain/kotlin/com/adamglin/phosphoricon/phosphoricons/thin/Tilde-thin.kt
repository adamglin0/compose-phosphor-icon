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

public val ThinGroup.`Tilde-thin`: ImageVector
    get() {
        if (`_tilde-thin` != null) {
            return `_tilde-thin`!!
        }
        `_tilde-thin` = Builder(name = "Tilde-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.12f, 128.09f)
                curveToRelative(-13.82f, 17.18f, -27.26f, 26.24f, -41.11f, 27.7f)
                arcToRelative(38.9f, 38.9f, 0.0f, false, true, -4.0f, 0.21f)
                curveToRelative(-18.0f, 0.0f, -33.48f, -12.64f, -48.53f, -24.9f)
                curveToRelative(-15.57f, -12.68f, -30.29f, -24.66f, -46.64f, -22.93f)
                curveToRelative(-11.62f, 1.22f, -23.3f, 9.32f, -35.71f, 24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.24f, -5.0f)
                curveTo(50.7f, 110.73f, 64.14f, 101.67f, 78.0f, 100.21f)
                curveToRelative(19.67f, -2.08f, 36.38f, 11.53f, 52.54f, 24.69f)
                curveToRelative(15.57f, 12.68f, 30.29f, 24.66f, 46.64f, 22.93f)
                curveToRelative(11.62f, -1.22f, 23.3f, -9.32f, 35.71f, -24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.24f, 5.0f)
                close()
            }
        }
        .build()
        return `_tilde-thin`!!
    }

private var `_tilde-thin`: ImageVector? = null
