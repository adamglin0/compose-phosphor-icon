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

public val LightGroup.`Cassette-tape-light`: ImageVector
    get() {
        if (`_cassette-tape-light` != null) {
            return `_cassette-tape-light`!!
        }
        `_cassette-tape-light` = Builder(name = "Cassette-tape-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(76.0f, 194.0f)
                lineToRelative(15.0f, -20.0f)
                horizontalLineToRelative(74.0f)
                lineToRelative(15.0f, 20.0f)
                close()
                moveTo(226.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(195.0f, 194.0f)
                lineToRelative(-22.2f, -29.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 162.0f)
                lineTo(88.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.8f, 2.4f)
                lineTo(61.0f, 194.0f)
                lineTo(32.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(224.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(176.0f, 82.0f)
                lineTo(80.0f, 82.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                close()
                moveTo(152.0f, 94.0f)
                arcToRelative(29.92f, 29.92f, 0.0f, false, false, 0.0f, 36.0f)
                lineTo(104.0f, 130.0f)
                arcToRelative(29.92f, 29.92f, 0.0f, false, false, 0.0f, -36.0f)
                close()
                moveTo(62.0f, 112.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 62.0f, 112.0f)
                close()
                moveTo(176.0f, 130.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 130.0f)
                close()
            }
        }
        .build()
        return `_cassette-tape-light`!!
    }

private var `_cassette-tape-light`: ImageVector? = null
