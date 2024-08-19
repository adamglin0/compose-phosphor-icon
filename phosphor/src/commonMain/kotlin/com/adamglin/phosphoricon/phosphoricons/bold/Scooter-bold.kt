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

public val BoldGroup.`Scooter-bold`: ImageVector
    get() {
        if (`_scooter-bold` != null) {
            return `_scooter-bold`!!
        }
        `_scooter-bold` = Builder(name = "Scooter-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 132.0f)
                lineToRelative(-0.68f, 0.0f)
                lineTo(179.38f, 36.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 28.0f)
                lineTo(136.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(23.35f)
                lineToRelative(14.83f, 44.49f)
                lineTo(114.59f, 164.0f)
                lineTo(83.2f, 164.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -2.55f, 24.0f)
                lineTo(120.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -4.06f)
                lineToRelative(54.0f, -61.13f)
                lineToRelative(5.6f, 16.81f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 212.0f, 132.0f)
                close()
                moveTo(44.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 188.0f)
                close()
                moveTo(212.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_scooter-bold`!!
    }

private var `_scooter-bold`: ImageVector? = null
