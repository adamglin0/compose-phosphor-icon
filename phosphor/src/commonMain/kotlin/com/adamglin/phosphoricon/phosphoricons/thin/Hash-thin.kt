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

public val ThinGroup.`Hash-thin`: ImageVector
    get() {
        if (`_hash-thin` != null) {
            return `_hash-thin`!!
        }
        `_hash-thin` = Builder(name = "Hash-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 92.0f)
                lineTo(170.61f, 92.0f)
                lineToRelative(9.33f, -51.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.88f, -1.44f)
                lineTo(162.48f, 92.0f)
                lineTo(106.61f, 92.0f)
                lineToRelative(9.33f, -51.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.88f, -1.44f)
                lineTo(98.48f, 92.0f)
                lineTo(48.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(97.0f, 100.0f)
                lineTo(86.84f, 156.0f)
                lineTo(32.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(85.39f, 164.0f)
                lineToRelative(-9.33f, 51.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.22f, 4.65f)
                arcTo(3.65f, 3.65f, 0.0f, false, false, 80.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.94f, -3.29f)
                lineTo(93.52f, 164.0f)
                horizontalLineToRelative(55.87f)
                lineToRelative(-9.33f, 51.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.22f, 4.65f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, false, 0.72f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.94f, -3.29f)
                lineTo(157.52f, 164.0f)
                lineTo(208.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(159.0f, 156.0f)
                lineToRelative(10.19f, -56.0f)
                lineTo(224.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(150.84f, 156.0f)
                lineTo(95.0f, 156.0f)
                lineToRelative(10.19f, -56.0f)
                lineTo(161.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_hash-thin`!!
    }

private var `_hash-thin`: ImageVector? = null
