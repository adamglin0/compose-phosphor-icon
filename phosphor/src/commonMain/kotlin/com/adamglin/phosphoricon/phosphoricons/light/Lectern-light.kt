package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Lectern-light`: ImageVector
    get() {
        if (`_lectern-light` != null) {
            return `_lectern-light`!!
        }
        `_lectern-light` = Builder(name = "Lectern-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.51f, 121.74f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 192.0f, 34.0f)
                lineTo(64.0f, 34.0f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -12.52f, 7.74f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 24.0f, 142.0f)
                horizontalLineToRelative(98.0f)
                verticalLineToRelative(68.0f)
                lineTo(96.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 142.0f)
                horizontalLineToRelative(98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.52f, -20.26f)
                close()
                moveTo(233.69f, 129.05f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.7f, 0.95f)
                lineTo(24.0f, 130.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.79f, -2.89f)
                lineToRelative(40.0f, -80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 64.0f, 46.0f)
                lineTo(192.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 1.11f)
                lineToRelative(40.0f, 80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.69f, 129.05f)
                close()
                moveTo(190.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(184.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 190.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_lectern-light`!!
    }

private var `_lectern-light`: ImageVector? = null
