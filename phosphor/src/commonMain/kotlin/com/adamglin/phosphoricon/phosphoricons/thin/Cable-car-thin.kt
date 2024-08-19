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

public val ThinGroup.`Cable-car-thin`: ImageVector
    get() {
        if (`_cable-car-thin` != null) {
            return `_cable-car-thin`!!
        }
        `_cable-car-thin` = Builder(name = "Cable-car-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.94f, 31.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.64f, -3.24f)
                lineToRelative(-224.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 76.0f)
                arcToRelative(4.14f, 4.14f, 0.0f, false, false, 0.7f, -0.06f)
                lineTo(124.0f, 56.78f)
                lineTo(124.0f, 100.0f)
                lineTo(64.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(220.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(132.0f, 100.0f)
                lineTo(132.0f, 55.35f)
                lineTo(240.7f, 35.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.94f, 31.3f)
                close()
                moveTo(100.0f, 164.0f)
                lineTo(100.0f, 108.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(64.0f, 108.0f)
                lineTo(92.0f, 108.0f)
                verticalLineToRelative(56.0f)
                lineTo(44.0f, 164.0f)
                lineTo(44.0f, 128.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 108.0f)
                close()
                moveTo(192.0f, 212.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(44.0f, 172.0f)
                lineTo(212.0f, 172.0f)
                verticalLineToRelative(20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 212.0f)
                close()
                moveTo(212.0f, 128.0f)
                verticalLineToRelative(36.0f)
                lineTo(164.0f, 164.0f)
                lineTo(164.0f, 108.0f)
                horizontalLineToRelative(28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cable-car-thin`!!
    }

private var `_cable-car-thin`: ImageVector? = null
