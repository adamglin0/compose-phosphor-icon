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

public val LightGroup.`Suitcase-rolling-light`: ImageVector
    get() {
        if (`_suitcase-rolling-light` != null) {
            return `_suitcase-rolling-light`!!
        }
        `_suitcase-rolling-light` = Builder(name = "Suitcase-rolling-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 88.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(90.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(160.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 82.0f)
                close()
                moveTo(206.0f, 64.0f)
                lineTo(206.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(174.0f, 222.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(162.0f, 222.0f)
                lineTo(94.0f, 222.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(82.0f, 222.0f)
                lineTo(64.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(50.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 64.0f, 50.0f)
                lineTo(90.0f, 50.0f)
                lineTo(90.0f, 24.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 112.0f, 2.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f)
                lineTo(166.0f, 50.0f)
                horizontalLineToRelative(26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 64.0f)
                close()
                moveTo(102.0f, 50.0f)
                horizontalLineToRelative(52.0f)
                lineTo(154.0f, 24.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(112.0f, 14.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, 10.0f)
                close()
                moveTo(194.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(64.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(62.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(192.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return `_suitcase-rolling-light`!!
    }

private var `_suitcase-rolling-light`: ImageVector? = null
