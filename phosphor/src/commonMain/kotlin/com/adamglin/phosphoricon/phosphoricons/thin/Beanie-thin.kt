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

public val ThinGroup.`Beanie-thin`: ImageVector
    get() {
        if (`_beanie-thin` != null) {
            return `_beanie-thin`!!
        }
        `_beanie-thin` = Builder(name = "Beanie-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 164.7f)
                lineTo(220.0f, 144.0f)
                arcToRelative(92.15f, 92.15f, 0.0f, false, false, -75.57f, -90.53f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -32.86f, 0.0f)
                arcTo(92.15f, 92.15f, 0.0f, false, false, 36.0f, 144.0f)
                verticalLineToRelative(20.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 164.7f)
                close()
                moveTo(112.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 36.0f)
                close()
                moveTo(128.0f, 60.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, 84.0f, 84.0f)
                verticalLineToRelative(20.0f)
                lineTo(44.0f, 164.0f)
                lineTo(44.0f, 144.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 60.0f)
                close()
                moveTo(124.0f, 172.0f)
                verticalLineToRelative(40.0f)
                lineTo(76.0f, 212.0f)
                lineTo(76.0f, 172.0f)
                close()
                moveTo(132.0f, 172.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                lineTo(132.0f, 212.0f)
                close()
                moveTo(36.0f, 208.0f)
                lineTo(36.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(68.0f, 172.0f)
                verticalLineToRelative(40.0f)
                lineTo(40.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 208.0f)
                close()
                moveTo(220.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(188.0f, 212.0f)
                lineTo(188.0f, 172.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_beanie-thin`!!
    }

private var `_beanie-thin`: ImageVector? = null
