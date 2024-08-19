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

public val BoldGroup.`Bandaids-bold`: ImageVector
    get() {
        if (`_bandaids-bold` != null) {
            return `_bandaids-bold`!!
        }
        `_bandaids-bold` = Builder(name = "Bandaids-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.23f, 128.0f)
                lineToRelative(24.88f, -24.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.22f, -62.22f)
                lineTo(128.0f, 65.77f)
                lineTo(103.11f, 40.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.22f, 62.22f)
                lineTo(65.77f, 128.0f)
                lineTo(40.89f, 152.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.22f, 62.22f)
                lineTo(128.0f, 190.23f)
                lineToRelative(24.89f, 24.88f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.22f, -62.22f)
                close()
                moveTo(169.86f, 57.86f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 28.28f)
                lineTo(173.25f, 111.0f)
                lineTo(145.0f, 82.75f)
                close()
                moveTo(156.28f, 128.0f)
                lineTo(128.0f, 156.28f)
                lineTo(99.72f, 128.0f)
                lineTo(128.0f, 99.72f)
                close()
                moveTo(57.86f, 86.14f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 86.14f, 57.86f)
                lineTo(111.0f, 82.75f)
                lineTo(82.75f, 111.0f)
                close()
                moveTo(86.14f, 198.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.28f, -28.28f)
                lineTo(82.75f, 145.0f)
                lineTo(111.0f, 173.25f)
                close()
                moveTo(198.14f, 198.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                lineTo(145.0f, 173.25f)
                lineTo(173.25f, 145.0f)
                lineToRelative(24.89f, 24.89f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 28.28f)
                close()
            }
        }
        .build()
        return `_bandaids-bold`!!
    }

private var `_bandaids-bold`: ImageVector? = null
