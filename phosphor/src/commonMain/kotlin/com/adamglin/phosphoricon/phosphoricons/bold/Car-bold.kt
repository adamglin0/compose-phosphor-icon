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

public val BoldGroup.`Car-bold`: ImageVector
    get() {
        if (`_car-bold` != null) {
            return `_car-bold`!!
        }
        `_car-bold` = Builder(name = "Car-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 100.0f)
                horizontalLineToRelative(-8.2f)
                lineTo(205.08f, 39.88f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.8f, 28.0f)
                lineTo(69.2f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.92f, 39.88f)
                lineTo(24.2f, 100.0f)
                lineTo(16.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(68.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(88.0f, 180.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 124.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(71.8f, 52.0f)
                lineTo(184.2f, 52.0f)
                lineToRelative(21.33f, 48.0f)
                lineTo(50.47f, 100.0f)
                close()
                moveTo(64.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 180.0f)
                lineTo(64.0f, 180.0f)
                close()
                moveTo(192.0f, 196.0f)
                lineTo(192.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(212.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 124.0f)
                lineTo(212.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_car-bold`!!
    }

private var `_car-bold`: ImageVector? = null
