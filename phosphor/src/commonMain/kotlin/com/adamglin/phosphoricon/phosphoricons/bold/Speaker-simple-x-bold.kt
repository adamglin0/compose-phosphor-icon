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

public val BoldGroup.`Speaker-simple-x-bold`: ImageVector
    get() {
        if (`_speaker-simple-x-bold` != null) {
            return `_speaker-simple-x-bold`!!
        }
        `_speaker-simple-x-bold` = Builder(name = "Speaker-simple-x-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.27f, 21.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.64f, 1.31f)
                lineTo(83.88f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(83.88f, 180.0f)
                lineToRelative(68.75f, 53.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 224.0f)
                lineTo(172.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 165.27f, 21.22f)
                close()
                moveTo(148.0f, 199.47f)
                lineTo(95.37f, 158.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 100.0f)
                lineTo(88.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.37f, -2.53f)
                lineTo(148.0f, 56.54f)
                close()
                moveTo(256.49f, 143.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(224.0f, 145.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(207.0f, 128.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(224.0f, 111.0f)
                lineToRelative(15.51f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(241.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_speaker-simple-x-bold`!!
    }

private var `_speaker-simple-x-bold`: ImageVector? = null
