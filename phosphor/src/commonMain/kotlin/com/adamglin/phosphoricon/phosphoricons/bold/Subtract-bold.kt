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

public val BoldGroup.`Subtract-bold`: ImageVector
    get() {
        if (`_subtract-bold` != null) {
            return `_subtract-bold`!!
        }
        `_subtract-bold` = Builder(name = "Subtract-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 78.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 78.0f, 178.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 178.0f, 78.0f)
                close()
                moveTo(220.0f, 160.0f)
                arcToRelative(60.75f, 60.75f, 0.0f, false, true, -0.38f, 6.65f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(83.62f, 83.62f, 0.0f, false, false, 4.0f, -19.39f)
                arcTo(59.83f, 59.83f, 0.0f, false, true, 220.0f, 160.0f)
                close()
                moveTo(36.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 36.0f, 96.0f)
                close()
                moveTo(103.28f, 179.66f)
                arcToRelative(83.62f, 83.62f, 0.0f, false, false, 19.39f, -4.0f)
                lineToRelative(44.0f, 44.0f)
                arcTo(60.75f, 60.75f, 0.0f, false, true, 160.0f, 220.0f)
                arcTo(59.83f, 59.83f, 0.0f, false, true, 103.28f, 179.66f)
                close()
                moveTo(191.81f, 210.84f)
                lineTo(145.08f, 164.11f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, false, 19.0f, -19.0f)
                lineToRelative(46.73f, 46.73f)
                arcTo(60.45f, 60.45f, 0.0f, false, true, 191.81f, 210.84f)
                close()
            }
        }
        .build()
        return `_subtract-bold`!!
    }

private var `_subtract-bold`: ImageVector? = null
