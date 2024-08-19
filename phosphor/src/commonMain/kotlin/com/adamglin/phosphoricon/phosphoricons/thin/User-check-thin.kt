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

public val ThinGroup.`User-check-thin`: ImageVector
    get() {
        if (`_user-check-thin` != null) {
            return `_user-check-thin`!!
        }
        `_user-check-thin` = Builder(name = "User-check-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.17f, 158.84f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.34f, 0.0f)
                curveToRelative(-23.76f, 5.46f, -45.18f, 18.69f, -61.89f, 38.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.12f, 5.14f)
                curveTo(48.0f, 177.7f, 76.71f, 164.0f, 108.0f, 164.0f)
                reflectiveCurveToRelative(60.0f, 13.7f, 80.94f, 38.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, -5.14f)
                curveTo(178.35f, 177.53f, 156.93f, 164.3f, 133.17f, 158.84f)
                close()
                moveTo(52.0f, 100.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 52.0f, 100.0f)
                close()
                moveTo(250.83f, 130.83f)
                lineTo(218.83f, 162.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(216.0f, 154.34f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return `_user-check-thin`!!
    }

private var `_user-check-thin`: ImageVector? = null
