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

public val LightGroup.`Ice-cream-light`: ImageVector
    get() {
        if (`_ice-cream-light` != null) {
            return `_ice-cream-light`!!
        }
        `_ice-cream-light` = Builder(name = "Ice-cream-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 98.83f)
                lineTo(206.0f, 96.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 50.0f, 96.0f)
                verticalLineToRelative(2.83f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 56.0f, 142.0f)
                horizontalLineToRelative(4.45f)
                lineTo(115.84f, 239.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.32f, 0.0f)
                lineTo(195.55f, 142.0f)
                lineTo(200.0f, 142.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 6.0f, -43.17f)
                close()
                moveTo(129.74f, 233.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.48f, 0.0f)
                lineToRelative(-52.0f, -91.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 215.06f)
                close()
                moveTo(136.0f, 142.0f)
                lineToRelative(22.89f, 40.06f)
                lineToRelative(-12.0f, 20.91f)
                lineToRelative(-34.84f, -61.0f)
                close()
                moveTo(165.8f, 170.0f)
                lineTo(149.8f, 142.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(200.0f, 130.0f)
                lineTo(56.0f, 130.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(62.0f, 96.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 132.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_ice-cream-light`!!
    }

private var `_ice-cream-light`: ImageVector? = null
