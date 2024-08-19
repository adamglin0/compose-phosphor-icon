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

public val LightGroup.`Checkerboard-light`: ImageVector
    get() {
        if (`_checkerboard-light` != null) {
            return `_checkerboard-light`!!
        }
        `_checkerboard-light` = Builder(name = "Checkerboard-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(194.48f, 122.0f)
                lineTo(134.0f, 61.52f)
                lineTo(134.0f, 46.0f)
                horizontalLineToRelative(15.52f)
                lineTo(210.0f, 106.48f)
                lineTo(210.0f, 122.0f)
                close()
                moveTo(134.0f, 78.48f)
                lineTo(177.52f, 122.0f)
                lineTo(134.0f, 122.0f)
                close()
                moveTo(210.0f, 48.0f)
                lineTo(210.0f, 89.52f)
                lineTo(166.48f, 46.0f)
                lineTo(208.0f, 46.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 48.0f)
                close()
                moveTo(48.0f, 46.0f)
                horizontalLineToRelative(74.0f)
                verticalLineToRelative(76.0f)
                lineTo(46.0f, 122.0f)
                lineTo(46.0f, 48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f)
                close()
                moveTo(106.48f, 210.0f)
                lineTo(46.0f, 149.52f)
                lineTo(46.0f, 134.0f)
                lineTo(61.52f, 134.0f)
                lineTo(122.0f, 194.48f)
                lineTo(122.0f, 210.0f)
                close()
                moveTo(122.0f, 177.52f)
                lineTo(78.48f, 134.0f)
                lineTo(122.0f, 134.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 166.48f)
                lineTo(89.52f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 192.0f)
                horizontalLineToRelative(0.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
            }
        }
        .build()
        return `_checkerboard-light`!!
    }

private var `_checkerboard-light`: ImageVector? = null
