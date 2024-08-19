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

public val BoldGroup.`Lightbulb-filament-bold`: ImageVector
    get() {
        if (`_lightbulb-filament-bold` != null) {
            return `_lightbulb-filament-bold`!!
        }
        `_lightbulb-filament-bold` = Builder(name = "Lightbulb-filament-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f)
                close()
                moveTo(220.0f, 104.0f)
                arcToRelative(92.47f, 92.47f, 0.0f, false, true, -37.0f, 73.73f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, false, -3.0f, 6.27f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-0.23f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, false, -3.25f, -6.2f)
                arcToRelative(91.36f, 91.36f, 0.0f, false, true, -36.75f, -73.0f)
                curveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 104.0f)
                close()
                moveTo(196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -69.65f, -68.0f)
                curveTo(89.56f, 36.89f, 59.8f, 67.56f, 60.0f, 104.39f)
                arcToRelative(67.52f, 67.52f, 0.0f, false, false, 27.18f, 54.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.14f, 32.14f, 0.0f, false, true, 99.77f, 180.0f)
                lineTo(116.0f, 180.0f)
                lineTo(116.0f, 149.0f)
                lineTo(87.51f, 120.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 127.0f)
                lineToRelative(23.51f, -23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 149.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(16.25f)
                arcToRelative(31.89f, 31.89f, 0.0f, false, true, 12.41f, -21.49f)
                arcTo(67.45f, 67.45f, 0.0f, false, false, 196.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_lightbulb-filament-bold`!!
    }

private var `_lightbulb-filament-bold`: ImageVector? = null
