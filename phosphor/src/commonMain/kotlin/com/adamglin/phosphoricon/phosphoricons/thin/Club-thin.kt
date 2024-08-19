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

public val ThinGroup.`Club-thin`: ImageVector
    get() {
        if (`_club-thin` != null) {
            return `_club-thin`!!
        }
        `_club-thin` = Builder(name = "Club-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 92.0f)
                arcToRelative(52.88f, 52.88f, 0.0f, false, false, -8.26f, 0.65f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -95.48f, 0.0f)
                arcTo(52.88f, 52.88f, 0.0f, false, false, 72.0f, 92.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 31.38f, 93.48f)
                lineTo(92.17f, 222.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 228.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.83f, -5.15f)
                lineToRelative(-11.21f, -37.37f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 184.0f, 92.0f)
                close()
                moveTo(184.0f, 188.0f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, true, -36.73f, -19.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.17f, 3.36f)
                lineTo(154.62f, 220.0f)
                lineTo(101.38f, 220.0f)
                lineToRelative(14.52f, -48.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.17f, -3.36f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -21.91f, -65.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, -6.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 73.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, 6.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 184.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_club-thin`!!
    }

private var `_club-thin`: ImageVector? = null
