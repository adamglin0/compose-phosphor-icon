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

public val LightGroup.`Traffic-sign-light`: ImageVector
    get() {
        if (`_traffic-sign-light` != null) {
            return `_traffic-sign-light`!!
        }
        `_traffic-sign-light` = Builder(name = "Traffic-sign-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.74f, 117.71f)
                lineTo(138.29f, 14.26f)
                arcToRelative(14.56f, 14.56f, 0.0f, false, false, -20.58f, 0.0f)
                lineTo(14.26f, 117.71f)
                arcToRelative(14.56f, 14.56f, 0.0f, false, false, 0.0f, 20.58f)
                lineTo(117.71f, 241.74f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.56f, 14.56f, 0.0f, false, false, 20.58f, 0.0f)
                lineTo(241.74f, 138.29f)
                arcToRelative(14.56f, 14.56f, 0.0f, false, false, 0.0f, -20.58f)
                close()
                moveTo(233.25f, 129.81f)
                lineTo(129.81f, 233.25f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, -3.62f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(22.75f, 129.81f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, 0.0f, -3.62f)
                lineTo(126.19f, 22.75f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, 3.62f, 0.0f)
                lineTo(233.25f, 126.19f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, true, 0.0f, 3.62f)
                close()
                moveTo(172.25f, 115.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(153.51f, 126.0f)
                lineTo(112.0f, 126.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, -30.0f)
                horizontalLineToRelative(41.51f)
                lineToRelative(-13.75f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
            }
        }
        .build()
        return `_traffic-sign-light`!!
    }

private var `_traffic-sign-light`: ImageVector? = null
