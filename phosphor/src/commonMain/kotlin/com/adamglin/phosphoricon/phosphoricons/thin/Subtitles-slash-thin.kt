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

public val ThinGroup.`Subtitles-slash-thin`: ImageVector
    get() {
        if (`_subtitles-slash-thin` != null) {
            return `_subtitles-slash-thin`!!
        }
        `_subtitles-slash-thin` = Builder(name = "Subtitles-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(72.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(56.0f, 140.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 136.0f)
                close()
                moveTo(211.0f, 213.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.92f, 5.38f)
                lineTo(191.69f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 52.0f)
                lineTo(53.5f, 52.0f)
                lineTo(45.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f)
                close()
                moveTo(184.41f, 196.0f)
                lineToRelative(-21.82f, -24.0f)
                lineTo(56.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(99.32f)
                lineTo(133.5f, 140.0f)
                lineTo(104.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(22.23f)
                lineTo(60.78f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                close()
                moveTo(200.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(178.52f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                close()
                moveTo(224.0f, 52.0f)
                lineTo(105.79f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(228.0f, 194.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
            }
        }
        .build()
        return `_subtitles-slash-thin`!!
    }

private var `_subtitles-slash-thin`: ImageVector? = null
