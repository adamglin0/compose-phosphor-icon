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

public val DuotoneGroup.`Cassette-tape-duotone`: ImageVector
    get() {
        if (`_cassette-tape-duotone` != null) {
            return `_cassette-tape-duotone`!!
        }
        `_cassette-tape-duotone` = Builder(name = "Cassette-tape-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 168.0f)
                lineToRelative(24.0f, 32.0f)
                lineTo(64.0f, 200.0f)
                lineToRelative(24.0f, -32.0f)
                close()
                moveTo(176.0f, 88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 88.0f)
                close()
                moveTo(104.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 104.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(80.0f, 192.0f)
                lineToRelative(12.0f, -16.0f)
                horizontalLineToRelative(72.0f)
                lineToRelative(12.0f, 16.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(196.0f, 192.0f)
                lineToRelative(-21.6f, -28.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 160.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.4f, 3.2f)
                lineTo(60.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                lineTo(32.0f, 64.0f)
                lineTo(224.0f, 64.0f)
                lineTo(224.0f, 192.0f)
                close()
                moveTo(176.0f, 80.0f)
                lineTo(80.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(148.3f, 96.0f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(107.7f, 128.0f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, 0.0f, -32.0f)
                close()
                moveTo(64.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 112.0f)
                close()
                moveTo(176.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cassette-tape-duotone`!!
    }

private var `_cassette-tape-duotone`: ImageVector? = null
