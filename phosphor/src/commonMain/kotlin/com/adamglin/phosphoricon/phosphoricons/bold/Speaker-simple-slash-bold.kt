package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Speaker-simple-slash-bold`: ImageVector
    get() {
        if (`_speaker-simple-slash-bold` != null) {
            return `_speaker-simple-slash-bold`!!
        }
        `_speaker-simple-slash-bold` = Builder(name = "Speaker-simple-slash-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(224.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(224.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f)
                lineTo(172.0f, 185.44f)
                lineTo(172.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.37f, 9.47f)
                lineTo(83.88f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 76.0f)
                lineTo(72.51f, 76.0f)
                lineTo(47.12f, 48.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.88f, 31.93f)
                close()
                moveTo(148.0f, 159.0f)
                lineTo(94.33f, 100.0f)
                lineTo(44.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.37f, 2.53f)
                lineTo(148.0f, 199.46f)
                close()
                moveTo(133.85f, 67.5f)
                lineTo(148.0f, 56.5f)
                verticalLineToRelative(38.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.37f, -9.47f)
                lineTo(119.12f, 48.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.73f, 18.94f)
                close()
                moveTo(200.0f, 150.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(34.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 150.94f)
                close()
            }
        }
        .build()
        return `_speaker-simple-slash-bold`!!
    }

private var `_speaker-simple-slash-bold`: ImageVector? = null
