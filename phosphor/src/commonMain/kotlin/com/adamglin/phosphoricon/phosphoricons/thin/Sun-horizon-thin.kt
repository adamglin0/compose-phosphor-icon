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

public val ThinGroup.`Sun-horizon-thin`: ImageVector
    get() {
        if (`_sun-horizon-thin` != null) {
            return `_sun-horizon-thin`!!
        }
        `_sun-horizon-thin` = Builder(name = "Sun-horizon-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 156.0f)
                lineTo(194.94f, 156.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 60.0f, 144.0f)
                arcToRelative(68.73f, 68.73f, 0.0f, false, false, 1.06f, 12.0f)
                lineTo(16.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(240.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(68.0f, 144.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 118.79f, 12.0f)
                lineTo(69.21f, 156.0f)
                arcTo(60.16f, 60.16f, 0.0f, false, true, 68.0f, 144.0f)
                close()
                moveTo(212.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(208.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 200.0f)
                close()
                moveTo(76.42f, 41.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.16f, -3.58f)
                lineToRelative(8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.16f, 3.58f)
                close()
                moveTo(20.42f, 94.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.37f, -1.79f)
                lineToRelative(16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 7.16f)
                lineToRelative(-16.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.42f, 94.21f)
                close()
                moveTo(212.42f, 105.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.79f, -5.37f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.58f, 7.16f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.37f, -1.79f)
                close()
                moveTo(164.42f, 54.21f)
                lineTo(172.42f, 38.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.16f, -3.58f)
                close()
            }
        }
        .build()
        return `_sun-horizon-thin`!!
    }

private var `_sun-horizon-thin`: ImageVector? = null
