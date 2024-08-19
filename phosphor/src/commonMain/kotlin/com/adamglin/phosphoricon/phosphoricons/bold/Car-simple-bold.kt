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

public val BoldGroup.`Car-simple-bold`: ImageVector
    get() {
        if (`_car-simple-bold` != null) {
            return `_car-simple-bold`!!
        }
        `_car-simple-bold` = Builder(name = "Car-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 100.0f)
                horizontalLineToRelative(-8.2f)
                lineTo(205.08f, 39.88f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.8f, 28.0f)
                horizontalLineTo(69.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.92f, 39.88f)
                lineTo(24.2f, 100.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(188.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(71.8f, 52.0f)
                horizontalLineTo(184.2f)
                lineToRelative(21.33f, 48.0f)
                horizontalLineTo(50.47f)
                close()
                moveTo(212.0f, 196.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(124.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return `_car-simple-bold`!!
    }

private var `_car-simple-bold`: ImageVector? = null
