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

public val BoldGroup.`Hourglass-low-bold`: ImageVector
    get() {
        if (`_hourglass-low-bold` != null) {
            return `_hourglass-low-bold`!!
        }
        `_hourglass-low-bold` = Builder(name = "Hourglass-low-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 75.64f)
                verticalLineTo(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 40.0f)
                verticalLineTo(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 8.0f, 16.0f)
                lineToRelative(48.0f, 36.0f)
                lineTo(60.0f, 164.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -8.0f, 16.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(180.36f)
                arcToRelative(20.13f, 20.13f, 0.0f, false, false, -7.94f, -16.0f)
                lineTo(147.9f, 128.0f)
                lineToRelative(48.16f, -36.4f)
                arcTo(20.13f, 20.13f, 0.0f, false, false, 204.0f, 75.64f)
                close()
                moveTo(166.31f, 172.0f)
                horizontalLineToRelative(-77.0f)
                lineTo(128.0f, 143.0f)
                close()
                moveTo(76.0f, 212.0f)
                verticalLineTo(196.0f)
                horizontalLineTo(180.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(180.0f, 73.65f)
                lineTo(128.0f, 113.0f)
                lineTo(76.0f, 74.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(180.0f)
                close()
            }
        }
        .build()
        return `_hourglass-low-bold`!!
    }

private var `_hourglass-low-bold`: ImageVector? = null
