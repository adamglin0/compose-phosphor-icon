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

public val BoldGroup.`Scissors-bold`: ImageVector
    get() {
        if (`_scissors-bold` != null) {
            return `_scissors-bold`!!
        }
        `_scissors-bold` = Builder(name = "Scissors-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.78f, 183.79f)
                lineTo(98.28f, 87.65f)
                arcTo(40.18f, 40.18f, 0.0f, false, false, 100.0f, 76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -15.29f, 31.45f)
                lineToRelative(30.0f, 20.56f)
                lineToRelative(-30.0f, 20.56f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 3.57f, 59.74f)
                horizontalLineToRelative(0.0f)
                arcTo(39.73f, 39.73f, 0.0f, false, false, 100.0f, 180.0f)
                arcToRelative(40.18f, 40.18f, 0.0f, false, false, -1.72f, -11.66f)
                lineTo(136.0f, 142.54f)
                lineToRelative(89.22f, 61.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.56f, -19.81f)
                close()
                moveTo(71.31f, 191.33f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 76.0f, 180.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 71.31f, 191.33f)
                close()
                moveTo(48.69f, 87.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.62f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.69f, 87.3f)
                close()
                moveTo(161.51f, 110.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.13f, -16.68f)
                lineTo(225.22f, 52.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.56f, 19.81f)
                lineToRelative(-60.59f, 41.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.68f, -3.13f)
                close()
            }
        }
        .build()
        return `_scissors-bold`!!
    }

private var `_scissors-bold`: ImageVector? = null
