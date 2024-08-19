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

public val DuotoneGroup.`Wifi-slash-duotone`: ImageVector
    get() {
        if (`_wifi-slash-duotone` != null) {
            return `_wifi-slash-duotone`!!
        }
        `_wifi-slash-duotone` = Builder(name = "Wifi-slash-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(238.2f, 87.69f)
                lineToRelative(-104.0f, 125.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 0.0f)
                lineTo(17.8f, 87.69f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, true, 1.31f, -11.21f)
                arcToRelative(180.75f, 180.75f, 0.0f, false, true, 217.78f, 0.0f)
                arcTo(7.79f, 7.79f, 0.0f, false, true, 238.2f, 87.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineToRelative(4.55f, 5.0f)
                arcTo(187.93f, 187.93f, 0.0f, false, false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f)
                lineToRelative(104.0f, 125.43f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.31f, -5.77f)
                lineToRelative(28.1f, -33.88f)
                lineToRelative(33.67f, 37.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 208.0f)
                lineTo(24.09f, 82.74f)
                arcTo(171.5f, 171.5f, 0.0f, false, true, 57.91f, 62.79f)
                lineToRelative(99.63f, 109.6f)
                close()
                moveTo(244.35f, 92.8f)
                lineToRelative(-49.42f, 59.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.32f, -10.21f)
                lineToRelative(49.3f, -59.43f)
                arcTo(170.76f, 170.76f, 0.0f, false, false, 128.0f, 48.0f)
                arcToRelative(175.15f, 175.15f, 0.0f, false, false, -32.39f, 3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.0f, -15.72f)
                arcTo(190.62f, 190.62f, 0.0f, false, true, 128.0f, 32.0f)
                arcTo(186.67f, 186.67f, 0.0f, false, true, 241.72f, 70.1f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, 6.17f, 10.81f)
                arcTo(15.65f, 15.65f, 0.0f, false, true, 244.35f, 92.8f)
                close()
            }
        }
        .build()
        return `_wifi-slash-duotone`!!
    }

private var `_wifi-slash-duotone`: ImageVector? = null
