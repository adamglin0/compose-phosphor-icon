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

public val LightGroup.`Hand-palm-light`: ImageVector
    get() {
        if (`_hand-palm-light` != null) {
            return `_hand-palm-light`!!
        }
        `_hand-palm-light` = Builder(name = "Hand-palm-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 90.0f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, -14.0f, 4.11f)
                lineTo(174.0f, 60.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -40.59f, -21.51f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 44.0f)
                lineTo(82.0f, 54.11f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 42.0f, 76.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 116.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 188.0f, 90.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -148.0f, 0.0f)
                lineTo(54.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 44.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 60.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(70.39f)
                arcTo(46.07f, 46.07f, 0.0f, false, false, 122.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(174.0f, 116.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_hand-palm-light`!!
    }

private var `_hand-palm-light`: ImageVector? = null
