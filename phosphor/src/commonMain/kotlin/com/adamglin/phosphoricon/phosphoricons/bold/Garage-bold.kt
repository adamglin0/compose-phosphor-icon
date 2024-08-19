package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Garage-bold`: ImageVector
    get() {
        if (`_garage-bold` != null) {
            return `_garage-bold`!!
        }
        `_garage-bold` = Builder(name = "Garage-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 188.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(236.0f, 98.67f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 227.09f, 82.0f)
                lineToRelative(-88.0f, -58.66f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, false, -22.18f, 0.0f)
                lineTo(28.91f, 82.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 98.67f)
                lineTo(20.0f, 188.0f)
                lineTo(16.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 100.81f)
                lineToRelative(84.0f, -56.0f)
                lineToRelative(84.0f, 56.0f)
                lineTo(212.0f, 188.0f)
                lineTo(196.0f, 188.0f)
                lineTo(196.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(68.0f)
                lineTo(44.0f, 188.0f)
                close()
                moveTo(172.0f, 132.0f)
                verticalLineToRelative(16.0f)
                lineTo(140.0f, 148.0f)
                lineTo(140.0f, 132.0f)
                close()
                moveTo(116.0f, 148.0f)
                lineTo(84.0f, 148.0f)
                lineTo(84.0f, 132.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(84.0f, 172.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                lineTo(84.0f, 188.0f)
                close()
                moveTo(140.0f, 172.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                lineTo(140.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_garage-bold`!!
    }

private var `_garage-bold`: ImageVector? = null
