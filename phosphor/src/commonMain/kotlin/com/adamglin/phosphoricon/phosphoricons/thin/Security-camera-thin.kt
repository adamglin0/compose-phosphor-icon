package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Security-camera-thin`: ImageVector
    get() {
        if (`_security-camera-thin` != null) {
            return `_security-camera-thin`!!
        }
        `_security-camera-thin` = Builder(name = "Security-camera-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(195.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineToRelative(-21.18f, -21.17f)
                lineToRelative(53.18f, -53.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-56.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(5.76f, 161.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 172.0f)
                horizontalLineTo(51.0f)
                lineToRelative(36.48f, 36.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(61.18f, -61.18f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.48f, 3.52f)
                horizontalLineTo(244.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 140.0f)
                close()
                moveTo(157.17f, 21.17f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(15.51f, 15.52f)
                lineTo(51.0f, 164.0f)
                horizontalLineTo(14.82f)
                close()
                moveTo(98.83f, 202.83f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(58.34f, 168.0f)
                lineTo(184.0f, 42.34f)
                lineToRelative(34.83f, 34.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                close()
            }
        }
        .build()
        return `_security-camera-thin`!!
    }

private var `_security-camera-thin`: ImageVector? = null
