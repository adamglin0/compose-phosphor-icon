package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Wifi-medium-duotone`: ImageVector
    get() {
        if (`_wifi-medium-duotone` != null) {
            return `_wifi-medium-duotone`!!
        }
        `_wifi-medium-duotone` = Builder(name = "Wifi-medium-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.33f, 130.94f)
                lineToRelative(-68.18f, 82.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 0.0f)
                lineTo(53.67f, 130.94f)
                arcToRelative(116.0f, 116.0f, 0.0f, false, true, 148.66f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.89f, 80.91f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.17f, -10.81f)
                arcTo(186.67f, 186.67f, 0.0f, false, false, 128.0f, 32.0f)
                arcTo(186.67f, 186.67f, 0.0f, false, false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f)
                lineToRelative(104.0f, 125.43f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f)
                horizontalLineToRelative(0.0f)
                lineToRelative(104.0f, -125.43f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 247.89f, 80.91f)
                close()
                moveTo(128.0f, 208.0f)
                lineToRelative(-62.87f, -75.8f)
                arcToRelative(107.89f, 107.89f, 0.0f, false, true, 125.74f, 0.0f)
                close()
                moveTo(201.12f, 119.84f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -146.24f, 0.0f)
                lineTo(24.09f, 82.74f)
                arcTo(170.76f, 170.76f, 0.0f, false, true, 128.0f, 48.0f)
                arcTo(170.76f, 170.76f, 0.0f, false, true, 231.91f, 82.74f)
                close()
            }
        }
        .build()
        return `_wifi-medium-duotone`!!
    }

private var `_wifi-medium-duotone`: ImageVector? = null
