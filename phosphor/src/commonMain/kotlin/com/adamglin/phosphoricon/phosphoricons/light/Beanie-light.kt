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

public val LightGroup.`Beanie-light`: ImageVector
    get() {
        if (`_beanie-light` != null) {
            return `_beanie-light`!!
        }
        `_beanie-light` = Builder(name = "Beanie-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 163.37f)
                lineTo(222.0f, 144.0f)
                arcToRelative(94.17f, 94.17f, 0.0f, false, false, -73.7f, -91.79f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -40.6f, 0.0f)
                arcTo(94.17f, 94.17f, 0.0f, false, false, 34.0f, 144.0f)
                verticalLineToRelative(19.37f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 176.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 222.0f, 163.37f)
                close()
                moveTo(114.0f, 36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 114.0f, 36.0f)
                close()
                moveTo(128.0f, 62.0f)
                arcToRelative(82.1f, 82.1f, 0.0f, false, true, 82.0f, 82.0f)
                verticalLineToRelative(18.0f)
                lineTo(46.0f, 162.0f)
                lineTo(46.0f, 144.0f)
                arcTo(82.1f, 82.1f, 0.0f, false, true, 128.0f, 62.0f)
                close()
                moveTo(122.0f, 174.0f)
                verticalLineToRelative(36.0f)
                lineTo(78.0f, 210.0f)
                lineTo(78.0f, 174.0f)
                close()
                moveTo(134.0f, 174.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(36.0f)
                lineTo(134.0f, 210.0f)
                close()
                moveTo(38.0f, 208.0f)
                lineTo(38.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(66.0f, 174.0f)
                verticalLineToRelative(36.0f)
                lineTo(40.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 208.0f)
                close()
                moveTo(218.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(190.0f, 210.0f)
                lineTo(190.0f, 174.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_beanie-light`!!
    }

private var `_beanie-light`: ImageVector? = null
