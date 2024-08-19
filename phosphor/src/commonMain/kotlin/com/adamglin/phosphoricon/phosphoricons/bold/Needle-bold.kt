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

public val BoldGroup.`Needle-bold`: ImageVector
    get() {
        if (`_needle-bold` != null) {
            return `_needle-bold`!!
        }
        `_needle-bold` = Builder(name = "Needle-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.11f, 40.89f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -62.22f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -3.34f, 6.45f)
                curveTo(118.4f, 113.0f, 55.31f, 183.7f, 31.55f, 207.48f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(23.75f, -23.73f, 94.49f, -86.88f, 136.18f, -94.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.45f, -3.34f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -62.22f)
                close()
                moveTo(198.11f, 86.14f)
                lineTo(176.69f, 107.57f)
                curveToRelative(-14.85f, 3.31f, -32.4f, 11.41f, -52.47f, 24.18f)
                curveToRelative(12.77f, -20.07f, 20.87f, -37.62f, 24.18f, -52.47f)
                lineToRelative(21.43f, -21.42f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 28.28f)
                close()
            }
        }
        .build()
        return `_needle-bold`!!
    }

private var `_needle-bold`: ImageVector? = null
