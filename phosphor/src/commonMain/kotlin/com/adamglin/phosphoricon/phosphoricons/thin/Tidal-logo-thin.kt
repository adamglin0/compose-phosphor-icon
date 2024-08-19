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

public val ThinGroup.`Tidal-logo-thin`: ImageVector
    get() {
        if (`_tidal-logo-thin` != null) {
            return `_tidal-logo-thin`!!
        }
        `_tidal-logo-thin` = Builder(name = "Tidal-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.83f, 93.17f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(168.0f, 90.34f)
                lineTo(130.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(88.0f, 90.34f)
                lineTo(50.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineTo(88.0f, 101.66f)
                lineTo(122.34f, 136.0f)
                lineTo(85.17f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineTo(133.66f, 136.0f)
                lineTo(168.0f, 101.66f)
                lineToRelative(37.17f, 37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 250.83f, 93.17f)
                close()
                moveTo(48.0f, 130.34f)
                lineTo(13.66f, 96.0f)
                lineTo(48.0f, 61.66f)
                lineTo(82.34f, 96.0f)
                close()
                moveTo(128.0f, 210.34f)
                lineTo(93.66f, 176.0f)
                lineTo(128.0f, 141.66f)
                lineTo(162.34f, 176.0f)
                close()
                moveTo(128.0f, 130.34f)
                lineTo(93.66f, 96.0f)
                lineTo(128.0f, 61.66f)
                lineTo(162.34f, 96.0f)
                close()
                moveTo(208.0f, 130.34f)
                lineTo(173.66f, 96.0f)
                lineTo(208.0f, 61.66f)
                lineTo(242.34f, 96.0f)
                close()
            }
        }
        .build()
        return `_tidal-logo-thin`!!
    }

private var `_tidal-logo-thin`: ImageVector? = null
