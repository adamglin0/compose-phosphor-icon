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

public val ThinGroup.`Solar-roof-thin`: ImageVector
    get() {
        if (`_solar-roof-thin` != null) {
            return `_solar-roof-thin`!!
        }
        `_solar-roof-thin` = Builder(name = "Solar-roof-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.58f, 126.21f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(232.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 128.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.58f, 126.21f)
                close()
                moveTo(98.47f, 124.0f)
                lineToRelative(-16.0f, -32.0f)
                horizontalLineToRelative(39.06f)
                lineToRelative(16.0f, 32.0f)
                close()
                moveTo(101.53f, 52.0f)
                lineTo(117.53f, 84.0f)
                lineTo(78.47f, 84.0f)
                lineToRelative(-16.0f, -32.0f)
                close()
                moveTo(149.53f, 52.0f)
                lineTo(165.53f, 84.0f)
                lineTo(126.47f, 84.0f)
                lineToRelative(-16.0f, -32.0f)
                close()
                moveTo(146.47f, 124.0f)
                lineTo(130.47f, 92.0f)
                horizontalLineToRelative(39.06f)
                lineToRelative(16.0f, 32.0f)
                close()
                moveTo(194.47f, 124.0f)
                lineTo(178.47f, 92.0f)
                horizontalLineToRelative(39.06f)
                lineToRelative(16.0f, 32.0f)
                close()
                moveTo(213.53f, 84.0f)
                lineTo(174.47f, 84.0f)
                lineToRelative(-16.0f, -32.0f)
                horizontalLineToRelative(39.06f)
                close()
                moveTo(20.0f, 184.0f)
                lineTo(20.0f, 128.94f)
                lineToRelative(36.0f, -72.0f)
                lineToRelative(36.0f, 72.0f)
                lineTo(92.0f, 188.0f)
                lineTo(24.0f, 188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 184.0f)
                close()
                moveTo(232.0f, 188.0f)
                lineTo(100.0f, 188.0f)
                lineTo(100.0f, 132.0f)
                lineTo(236.0f, 132.0f)
                verticalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 232.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_solar-roof-thin`!!
    }

private var `_solar-roof-thin`: ImageVector? = null
