package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Car-profile-light`: ImageVector
    get() {
        if (`_car-profile-light` != null) {
            return `_car-profile-light`!!
        }
        `_car-profile-light` = Builder(name = "Car-profile-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 114.0f)
                lineTo(210.49f, 114.0f)
                lineToRelative(-43.9f, -43.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                lineTo(44.28f, 66.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -11.65f, 6.23f)
                lineTo(3.0f, 116.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(34.6f, 182.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                horizontalLineToRelative(69.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                lineTo(240.0f, 182.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(254.0f, 128.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 240.0f, 114.0f)
                close()
                moveTo(42.62f, 78.89f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 44.28f, 78.0f)
                lineTo(156.69f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineTo(193.52f, 114.0f)
                lineTo(19.21f, 114.0f)
                close()
                moveTo(64.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 64.0f, 194.0f)
                close()
                moveTo(192.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 194.0f)
                close()
                moveTo(242.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(221.4f, 170.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(93.4f, 170.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(16.0f, 170.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(14.0f, 126.0f)
                lineTo(240.0f, 126.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_car-profile-light`!!
    }

private var `_car-profile-light`: ImageVector? = null
