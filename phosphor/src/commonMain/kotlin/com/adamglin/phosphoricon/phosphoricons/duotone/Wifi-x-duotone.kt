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

public val DuotoneGroup.`Wifi-x-duotone`: ImageVector
    get() {
        if (`_wifi-x-duotone` != null) {
            return `_wifi-x-duotone`!!
        }
        `_wifi-x-duotone` = Builder(name = "Wifi-x-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.39f, 104.34f)
                lineTo(134.15f, 213.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 0.0f)
                lineTo(17.8f, 87.69f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, true, 1.31f, -11.21f)
                arcTo(179.58f, 179.58f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(181.82f, 181.82f, 0.0f, false, true, 33.06f, 3.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 4.17f, 2.21f)
                lineTo(224.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(200.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(188.69f, 80.0f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(200.0f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(211.31f, 80.0f)
                close()
                moveTo(196.6f, 137.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.27f, 1.0f)
                lineTo(128.0f, 208.0f)
                lineTo(24.09f, 82.74f)
                arcTo(170.76f, 170.76f, 0.0f, false, true, 128.0f, 48.0f)
                curveToRelative(2.54f, 0.0f, 5.11f, 0.06f, 7.65f, 0.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.7f, -16.0f)
                curveToRelative(-2.77f, -0.12f, -5.58f, -0.18f, -8.35f, -0.18f)
                arcTo(186.67f, 186.67f, 0.0f, false, false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f)
                lineToRelative(104.0f, 125.43f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f)
                lineToRelative(57.34f, -69.12f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.6f, 137.84f)
                close()
            }
        }
        .build()
        return `_wifi-x-duotone`!!
    }

private var `_wifi-x-duotone`: ImageVector? = null
