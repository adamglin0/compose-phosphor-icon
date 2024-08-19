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

public val ThinGroup.`Cassette-tape-thin`: ImageVector
    get() {
        if (`_cassette-tape-thin` != null) {
            return `_cassette-tape-thin`!!
        }
        `_cassette-tape-thin` = Builder(name = "Cassette-tape-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(72.0f, 196.0f)
                lineToRelative(18.0f, -24.0f)
                horizontalLineToRelative(76.0f)
                lineToRelative(18.0f, 24.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(194.0f, 196.0f)
                lineToRelative(-22.8f, -30.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 164.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.2f, 1.6f)
                lineTo(62.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(176.0f, 84.0f)
                lineTo(80.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(60.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 112.0f)
                close()
                moveTo(99.57f, 132.0f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, 0.0f, -40.0f)
                horizontalLineToRelative(56.86f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, 0.0f, 40.0f)
                close()
                moveTo(176.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_cassette-tape-thin`!!
    }

private var `_cassette-tape-thin`: ImageVector? = null
